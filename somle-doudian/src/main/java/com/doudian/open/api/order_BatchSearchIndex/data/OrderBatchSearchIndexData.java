package com.doudian.open.api.order_BatchSearchIndex.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderBatchSearchIndexData {


	@SerializedName("plain_to_encrypt_index_list")
	@OpField(desc = "明文转化为索引穿列表", example = "")
	private List<PlainToEncryptIndexListItem> plainToEncryptIndexList;

	@SerializedName("custom_err")
	@OpField(desc = "业务错误", example = "")
	private CustomErr customErr;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlainToEncryptIndexList(List<PlainToEncryptIndexListItem> plainToEncryptIndexList){
		this.plainToEncryptIndexList = plainToEncryptIndexList;
	}

	
	public List<PlainToEncryptIndexListItem> getPlainToEncryptIndexList(){
		return this.plainToEncryptIndexList;
	}

	
	public void setCustomErr(CustomErr customErr){
		this.customErr = customErr;
	}

	
	public CustomErr getCustomErr(){
		return this.customErr;
	}

}