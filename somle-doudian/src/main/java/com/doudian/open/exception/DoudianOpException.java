package com.doudian.open.exception;

import com.doudian.open.core.DoudianOpRequest;

public class DoudianOpException  extends RuntimeException{

    public enum Code {

        //系统错误
        UNRECOGNIZED_EXCEPTION(-999, "未预知异常"),
        HTTP_RESPONSE_STATUS_CODE_NOT_2XX(10001, "HTTP请求返回状态码非200"),
        INIT_REQUEST_PARAM_ERROR(10002, "初始化Request失败"),
        CALC_MD5_ERROR(10003, "计算md5失败"),
        URL_ENCODE_ERROR(10004, "对url进行encode失败"),
        HTTP_REQUEST_ERROR(10005, "发送http请求失败"),
        JSON_ERROR(10006, "json序列化（反序列化）失败"),
        CALC_HMAC_ERROR(10007, "计算hmac失败"),
        REFLECT_METHOD_NOT_EXIST(10008, "反射调用-方法不存在"),
        UNSUPPORTED_HTTP_METHOD(10009, "不支持的http方法"),
        APP_SECRET_NOT_FOUND(10010, "未找到appKey对应的appSecret，请检查是否在AddAppKeyAndAppSecret方法中添加appKey和appSecret对"),

        //业务错误
        PARAMETER_REQUIRED_CHECK_ERROR(20001, "必填参数校验失败"),
        MSG_CHECK_SIGN_ERROR(20002, "消息网关校验签名异常"),
        PARAMETER_CHECK_ERROR(20003, "参数校验失败"),
        //素材网关错误
        MATERIAL_GATEWAY_RESP_EMPTY_ERROR(30001, "返回body为空"),
        MATERIAL_GATEWAY_ERROR(30002, "获取上传地址错误"),

        ;
        int code;
        String message;
        Code(int code, String message){
            this.code = code;
            this.message = message;
        }
    }

    private Code code;

    public Code getCode() {
        return code;
    }

    public DoudianOpException(Code code) {
        super(code.message);
        this.code = code;
    }

    public DoudianOpException(Code code, String info) {
        super(String.format("code.message: %s, info: %s", code.message, info));
        this.code = code;
    }

    public DoudianOpException(Exception e){
        super(e);
        this.code = Code.UNRECOGNIZED_EXCEPTION;
    }

    public DoudianOpException(Code code, Exception e) {
        super(e);
        this.code = code;
    }

}
