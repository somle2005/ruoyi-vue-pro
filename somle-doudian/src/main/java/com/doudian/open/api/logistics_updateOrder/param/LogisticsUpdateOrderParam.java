package com.doudian.open.api.logistics_updateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsUpdateOrderParam {


	@SerializedName("sender_info")
	@OpField(required = false , desc = "寄件人信息", example= "")
	private SenderInfo senderInfo;

	@SerializedName("receiver_info")
	@OpField(required = false , desc = "收件人信息", example= "")
	private ReceiverInfo receiverInfo;

	@SerializedName("logistics_code")
	@OpField(required = true , desc = "物流服务商编码", example= "jtexpress")
	private String logisticsCode;

	@SerializedName("track_no")
	@OpField(required = true , desc = "运单号", example= "jt271927012")
	private String trackNo;

	@SerializedName("items")
	@OpField(required = false , desc = "商品明细列表", example= "")
	private List<ItemsItem> items;

	@SerializedName("remark")
	@OpField(required = false , desc = "备注", example= "1")
	private String remark;

	@SerializedName("extra")
	@OpField(required = false , desc = "备用扩展字段", example= "1")
	private String extra;

	@SerializedName("user_id")
	@OpField(required = false , desc = "实际使用取号服务店铺user_id", example= "1")
	private Long userId;

	@SerializedName("volume")
	@OpField(required = false , desc = "总体积 货物的总体积或长，宽，高 ；整数 单位cm", example= "1,2,3")
	private String volume;

	@SerializedName("weight")
	@OpField(required = false , desc = "/总重量 ；整数 用于与快递商有计抛信任协议的商家）单位克", example= "20")
	private Long weight;

	@SerializedName("warehouse")
	@OpField(required = false , desc = "仓、门店、总对总发货", example= "")
	private Warehouse warehouse;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSenderInfo(SenderInfo senderInfo){
		this.senderInfo = senderInfo;
	}

	
	public SenderInfo getSenderInfo(){
		return this.senderInfo;
	}

	
	public void setReceiverInfo(ReceiverInfo receiverInfo){
		this.receiverInfo = receiverInfo;
	}

	
	public ReceiverInfo getReceiverInfo(){
		return this.receiverInfo;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	
	public List<ItemsItem> getItems(){
		return this.items;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

	
	public void setUserId(Long userId){
		this.userId = userId;
	}

	
	public Long getUserId(){
		return this.userId;
	}

	
	public void setVolume(String volume){
		this.volume = volume;
	}

	
	public String getVolume(){
		return this.volume;
	}

	
	public void setWeight(Long weight){
		this.weight = weight;
	}

	
	public Long getWeight(){
		return this.weight;
	}

	
	public void setWarehouse(Warehouse warehouse){
		this.warehouse = warehouse;
	}

	
	public Warehouse getWarehouse(){
		return this.warehouse;
	}

}