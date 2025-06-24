package com.doudian.open.api.order_batchSensitive.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderBatchSensitiveData {


	@SerializedName("decrypt_infos")
	@OpField(desc = "脱敏信息列表", example = "-")
	private List<DecryptInfosItem> decryptInfos;

	@SerializedName("custom_err")
	@OpField(desc = "业务错误", example = "-")
	private CustomErr customErr;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDecryptInfos(List<DecryptInfosItem> decryptInfos){
		this.decryptInfos = decryptInfos;
	}

	
	public List<DecryptInfosItem> getDecryptInfos(){
		return this.decryptInfos;
	}

	
	public void setCustomErr(CustomErr customErr){
		this.customErr = customErr;
	}

	
	public CustomErr getCustomErr(){
		return this.customErr;
	}

}