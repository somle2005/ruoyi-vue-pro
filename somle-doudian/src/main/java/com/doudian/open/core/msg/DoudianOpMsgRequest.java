package com.doudian.open.core.msg;

import com.doudian.open.core.DoudianOpConfig;
import com.doudian.open.core.GlobalConfig;
import com.doudian.open.exception.DoudianOpException;
import com.doudian.open.gson.JsonArray;
import com.doudian.open.gson.JsonElement;
import com.doudian.open.gson.JsonObject;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.utils.SignUtil;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public abstract class DoudianOpMsgRequest<P> {

    private final MsgParam msgParam = MsgParam.build();

    private DoudianOpConfig config = GlobalConfig.getGlobalConfig();

    public void setConfig(DoudianOpConfig config) {
        this.config = config;
    }

    public MsgParam getParam() {
        return msgParam;
    }

    private <T> T newObject(Class<?> clazz) {
        try {
            return (T)clazz.newInstance();
        }catch (Exception e){
            throw new DoudianOpException(e);
        }
    }

    private Class<?> getSuperClassParameterClasses(Class<?> clazz) {
        try {
            return (Class<?>) ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Exception e) {
            throw new DoudianOpException(e);
        }
    }

    public List<DoudianOpMsgParamRecord<P>> getRequestBody() {
        if (msgParam == null || msgParam.getRequestBody() == null || msgParam.getRequestBody().length() == 0) {
            return new ArrayList<>();
        }
        JsonArray jsonArray = JsonUtil.fromJsonAsJsonArray(msgParam.getRequestBody());
        if (jsonArray == null || jsonArray.size() == 0) {
            return new ArrayList<>();
        }
        Class<?> paramClass = getSuperClassParameterClasses(this.getClass());
        List<DoudianOpMsgParamRecord<P>> ret = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            if (!element.isJsonObject()) {
                continue;
            }
            JsonObject jsonObject = element.getAsJsonObject();
            JsonElement dataElement = jsonObject.get("data");
            P paramObject = null;
            if (dataElement != null){
                paramObject = (P) JsonUtil.fromJson(dataElement.getAsString(), paramClass);
            }
            DoudianOpMsgParamRecord<P> record = new DoudianOpMsgParamRecord<>();
            JsonElement tag = jsonObject.get("tag");
            if (tag != null) {
                record.setTag(tag.getAsString());
            }
            JsonElement msgId = jsonObject.get("msg_id");
            if (msgId != null) {
                record.setMsgId(msgId.getAsString());
            }
            record.setData(paramObject);
            ret.add(record);
        }
        return ret;
    }

    public boolean checkSign() {
        if (msgParam.getEventSign() == null || msgParam.getEventSign().length() == 0) {
            throw new DoudianOpException(DoudianOpException.Code.MSG_CHECK_SIGN_ERROR, "param参数eventSign字段为空，请从http请求头里获取该字段并设置");
        }
        //signParam := "yourAppId" + string(body) + "yourSecret"
        String signPattern = config.getAppKey() + msgParam.getRequestBody() + config.getAppSecret();
        return SignUtil.stringToMD5(signPattern).equals(msgParam.getEventSign());
    }
}
