package com.doudian.open.api.order_PackageProcessSuccess.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderPackageProcessSuccessParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "子订单id", example= "123456")
	private String orderId;

	@SerializedName("combo_id")
	@OpField(required = true , desc = "skuid", example= "123")
	private Long comboId;

	@SerializedName("cert_list")
	@OpField(required = true , desc = "卡券信息列表", example= "")
	private List<CertListItem> certList;

	@SerializedName("op")
	@OpField(required = false , desc = "风控相关信息", example= "")
	private Op op;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setComboId(Long comboId){
		this.comboId = comboId;
	}

	
	public Long getComboId(){
		return this.comboId;
	}

	
	public void setCertList(List<CertListItem> certList){
		this.certList = certList;
	}

	
	public List<CertListItem> getCertList(){
		return this.certList;
	}

	
	public void setOp(Op op){
		this.op = op;
	}

	
	public Op getOp(){
		return this.op;
	}

}