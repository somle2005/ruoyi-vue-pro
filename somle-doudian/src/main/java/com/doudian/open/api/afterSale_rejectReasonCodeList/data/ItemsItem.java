package com.doudian.open.api.afterSale_rejectReasonCodeList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ItemsItem {


	@SerializedName("reject_reason_code")
	@OpField(desc = "售后审核拒绝原因枚举编码", example = "1")
	private Long rejectReasonCode;

	@SerializedName("reason")
	@OpField(desc = "售后审核拒绝原因文案", example = "多拍/错拍/不想要")
	private String reason;

	@SerializedName("evidence_description")
	@OpField(desc = "凭证描述文案", example = "请提供发货物流进度截图")
	private String evidenceDescription;

	@SerializedName("evidence_need")
	@OpField(desc = "是否需要上传凭证，Y必填，N非必填", example = "Y")
	private String evidenceNeed;

	@SerializedName("image")
	@OpField(desc = "凭证示例图片链接", example = "/obj/ecom-aftersale-image-example/vsfguUuWBsXzjgyexWJRoBUMVORQBnmvMQHBRFom.png")
	private String image;

	@SerializedName("order_type")
	@OpField(desc = "订单类型，即订单信息中order_type   枚举：0-普通实物订单 1-全款预售订单  2-虚拟商品订单 3-快闪店订单 4-电子券  5-三方核销 6-服务市场 -1-通用,不考虑订单类型", example = "1")
	private Long orderType;

	@SerializedName("pkg")
	@OpField(desc = "是否收到货，0未收到 1收到 -1通用,不考虑是否收到货", example = "1")
	private Long pkg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRejectReasonCode(Long rejectReasonCode){
		this.rejectReasonCode = rejectReasonCode;
	}

	
	public Long getRejectReasonCode(){
		return this.rejectReasonCode;
	}

	
	public void setReason(String reason){
		this.reason = reason;
	}

	
	public String getReason(){
		return this.reason;
	}

	
	public void setEvidenceDescription(String evidenceDescription){
		this.evidenceDescription = evidenceDescription;
	}

	
	public String getEvidenceDescription(){
		return this.evidenceDescription;
	}

	
	public void setEvidenceNeed(String evidenceNeed){
		this.evidenceNeed = evidenceNeed;
	}

	
	public String getEvidenceNeed(){
		return this.evidenceNeed;
	}

	
	public void setImage(String image){
		this.image = image;
	}

	
	public String getImage(){
		return this.image;
	}

	
	public void setOrderType(Long orderType){
		this.orderType = orderType;
	}

	
	public Long getOrderType(){
		return this.orderType;
	}

	
	public void setPkg(Long pkg){
		this.pkg = pkg;
	}

	
	public Long getPkg(){
		return this.pkg;
	}

}