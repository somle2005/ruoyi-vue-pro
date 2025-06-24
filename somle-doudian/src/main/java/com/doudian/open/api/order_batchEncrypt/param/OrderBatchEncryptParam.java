package com.doudian.open.api.order_batchEncrypt.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderBatchEncryptParam {


	@SerializedName("batch_encrypt_list")
	@OpField(required = true , desc = "待加密列表", example= "")
	private List<BatchEncryptListItem> batchEncryptList;

	@SerializedName("sensitive_scene")
	@OpField(required = false , desc = "加密场景：OrderCode代表订单 AftersaleCode代表售后单", example= "OrderCode")
	private String sensitiveScene;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBatchEncryptList(List<BatchEncryptListItem> batchEncryptList){
		this.batchEncryptList = batchEncryptList;
	}

	
	public List<BatchEncryptListItem> getBatchEncryptList(){
		return this.batchEncryptList;
	}

	
	public void setSensitiveScene(String sensitiveScene){
		this.sensitiveScene = sensitiveScene;
	}

	
	public String getSensitiveScene(){
		return this.sensitiveScene;
	}

}