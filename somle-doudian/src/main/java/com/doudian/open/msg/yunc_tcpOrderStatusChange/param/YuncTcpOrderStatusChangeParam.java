package com.doudian.open.msg.yunc_tcpOrderStatusChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class YuncTcpOrderStatusChangeParam {


	@SerializedName("logistics_track_no")
	@OpField(required = false , desc = "备用运单号", example= "11111")
	private String logisticsTrackNo;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID", example= "90419")
	private Long shopId;

	@SerializedName("shipment_error")
	@OpField(required = false , desc = "异常状态", example= "1001")
	private Long shipmentError;

	@SerializedName("rider_phone")
	@OpField(required = false , desc = "骑手联系方式", example= "13557632333")
	private String riderPhone;

	@SerializedName("order_details")
	@OpField(required = false , desc = "合单订单需要告知抖音电商交易父子订单号列表；", example= "")
	private List<OrderDetailsItem> orderDetails;

	@SerializedName("out_order_no")
	@OpField(required = false , desc = "erp单号", example= "22222")
	private String outOrderNo;

	@SerializedName("rider_code")
	@OpField(required = false , desc = "骑手编码", example= "33333")
	private String riderCode;

	@SerializedName("service_provider")
	@OpField(required = false , desc = "运力服务商", example= "shenzhenshishun")
	private String serviceProvider;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "13579")
	private Long storeId;

	@SerializedName("shipment_status")
	@OpField(required = false , desc = "运单状态", example= "1")
	private Long shipmentStatus;

	@SerializedName("platform_order_no")
	@OpField(required = false , desc = "交易单号", example= "44444")
	private String platformOrderNo;

	@SerializedName("to_aoi_name")
	@OpField(required = false , desc = "接驳商圈名称", example= "xxx")
	private String toAoiName;

	@SerializedName("rider_name")
	@OpField(required = false , desc = "骑手名称", example= "张三")
	private String riderName;

	@SerializedName("occurred_time")
	@OpField(required = false , desc = "事件发生时间，更新时间", example= "2023-03-23 14:44:20")
	private String occurredTime;

	@SerializedName("track_no")
	@OpField(required = false , desc = "运单号", example= "55555")
	private String trackNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLogisticsTrackNo(String logisticsTrackNo){
		this.logisticsTrackNo = logisticsTrackNo;
	}

	
	public String getLogisticsTrackNo(){
		return this.logisticsTrackNo;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setShipmentError(Long shipmentError){
		this.shipmentError = shipmentError;
	}

	
	public Long getShipmentError(){
		return this.shipmentError;
	}

	
	public void setRiderPhone(String riderPhone){
		this.riderPhone = riderPhone;
	}

	
	public String getRiderPhone(){
		return this.riderPhone;
	}

	
	public void setOrderDetails(List<OrderDetailsItem> orderDetails){
		this.orderDetails = orderDetails;
	}

	
	public List<OrderDetailsItem> getOrderDetails(){
		return this.orderDetails;
	}

	
	public void setOutOrderNo(String outOrderNo){
		this.outOrderNo = outOrderNo;
	}

	
	public String getOutOrderNo(){
		return this.outOrderNo;
	}

	
	public void setRiderCode(String riderCode){
		this.riderCode = riderCode;
	}

	
	public String getRiderCode(){
		return this.riderCode;
	}

	
	public void setServiceProvider(String serviceProvider){
		this.serviceProvider = serviceProvider;
	}

	
	public String getServiceProvider(){
		return this.serviceProvider;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setShipmentStatus(Long shipmentStatus){
		this.shipmentStatus = shipmentStatus;
	}

	
	public Long getShipmentStatus(){
		return this.shipmentStatus;
	}

	
	public void setPlatformOrderNo(String platformOrderNo){
		this.platformOrderNo = platformOrderNo;
	}

	
	public String getPlatformOrderNo(){
		return this.platformOrderNo;
	}

	
	public void setToAoiName(String toAoiName){
		this.toAoiName = toAoiName;
	}

	
	public String getToAoiName(){
		return this.toAoiName;
	}

	
	public void setRiderName(String riderName){
		this.riderName = riderName;
	}

	
	public String getRiderName(){
		return this.riderName;
	}

	
	public void setOccurredTime(String occurredTime){
		this.occurredTime = occurredTime;
	}

	
	public String getOccurredTime(){
		return this.occurredTime;
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

}