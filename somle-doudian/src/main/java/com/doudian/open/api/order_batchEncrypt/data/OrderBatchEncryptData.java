package com.doudian.open.api.order_batchEncrypt.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderBatchEncryptData {


	@SerializedName("encrypt_infos")
	@OpField(desc = "加密之后的数据", example = "-")
	private List<EncryptInfosItem> encryptInfos;

	@SerializedName("custom_err")
	@OpField(desc = "业务错误", example = "-")
	private CustomErr customErr;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEncryptInfos(List<EncryptInfosItem> encryptInfos){
		this.encryptInfos = encryptInfos;
	}

	
	public List<EncryptInfosItem> getEncryptInfos(){
		return this.encryptInfos;
	}

	
	public void setCustomErr(CustomErr customErr){
		this.customErr = customErr;
	}

	
	public CustomErr getCustomErr(){
		return this.customErr;
	}

}