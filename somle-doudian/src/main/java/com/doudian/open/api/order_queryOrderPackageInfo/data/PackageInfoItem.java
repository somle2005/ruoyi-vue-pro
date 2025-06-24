package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PackageInfoItem {


	@SerializedName("track_state")
	@OpField(desc = "当前轨迹状态code；枚举值详见：https://op.jinritemai.com/docs/question-docs/94/1642", example = "1")
	private String trackState;

	@SerializedName("is_complement_deliver")
	@OpField(desc = "是否补发包裹:正向补发包裹", example = "true")
	private Boolean isComplementDeliver;

	@SerializedName("send_type")
	@OpField(desc = "发货类型 1手动，2csv,3电子面单，4erp，5线下发货", example = "1")
	private Long sendType;

	@SerializedName("product_info")
	@OpField(desc = "商品信息", example = "")
	private List<ProductInfoItem> productInfo;

	@SerializedName("delivery_info")
	@OpField(desc = "物流信息", example = "")
	private List<DeliveryInfoItem> deliveryInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTrackState(String trackState){
		this.trackState = trackState;
	}

	
	public String getTrackState(){
		return this.trackState;
	}

	
	public void setIsComplementDeliver(Boolean isComplementDeliver){
		this.isComplementDeliver = isComplementDeliver;
	}

	
	public Boolean getIsComplementDeliver(){
		return this.isComplementDeliver;
	}

	
	public void setSendType(Long sendType){
		this.sendType = sendType;
	}

	
	public Long getSendType(){
		return this.sendType;
	}

	
	public void setProductInfo(List<ProductInfoItem> productInfo){
		this.productInfo = productInfo;
	}

	
	public List<ProductInfoItem> getProductInfo(){
		return this.productInfo;
	}

	
	public void setDeliveryInfo(List<DeliveryInfoItem> deliveryInfo){
		this.deliveryInfo = deliveryInfo;
	}

	
	public List<DeliveryInfoItem> getDeliveryInfo(){
		return this.deliveryInfo;
	}

}