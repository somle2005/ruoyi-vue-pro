package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderItem {


	@SerializedName("merge_delivery")
	@OpField(desc = "1. 是合包发货  0：不是合包发货", example = "1")
	private Long mergeDelivery;

	@SerializedName("is_transit")
	@OpField(desc = "1. 是中转服务  0：不是中转服务", example = "1")
	private Long isTransit;

	@SerializedName("is_remote_service")
	@OpField(desc = "1. 是偏远服务  0：不是偏远服务", example = "1")
	private Long isRemoteService;

	@SerializedName("tracking_no")
	@OpField(desc = "物流单号", example = "SF12345678910")
	private String trackingNo;

	@SerializedName("company_name")
	@OpField(desc = "物流公司名称", example = "顺丰")
	private String companyName;

	@SerializedName("company_code")
	@OpField(desc = "物流公司编码", example = "shunfeng")
	private String companyCode;

	@SerializedName("logistics_time")
	@OpField(desc = "物流状态到达时间", example = "1637586290")
	private Long logisticsTime;

	@SerializedName("logistics_state")
	@OpField(desc = "正向物流状态", example = "6")
	private Long logisticsState;

	@SerializedName("value_added_services")
	@OpField(desc = "增值服务标签", example = "")
	private List<ValueAddedServicesItem> valueAddedServices;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMergeDelivery(Long mergeDelivery){
		this.mergeDelivery = mergeDelivery;
	}

	
	public Long getMergeDelivery(){
		return this.mergeDelivery;
	}

	
	public void setIsTransit(Long isTransit){
		this.isTransit = isTransit;
	}

	
	public Long getIsTransit(){
		return this.isTransit;
	}

	
	public void setIsRemoteService(Long isRemoteService){
		this.isRemoteService = isRemoteService;
	}

	
	public Long getIsRemoteService(){
		return this.isRemoteService;
	}

	
	public void setTrackingNo(String trackingNo){
		this.trackingNo = trackingNo;
	}

	
	public String getTrackingNo(){
		return this.trackingNo;
	}

	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	
	public String getCompanyName(){
		return this.companyName;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setLogisticsTime(Long logisticsTime){
		this.logisticsTime = logisticsTime;
	}

	
	public Long getLogisticsTime(){
		return this.logisticsTime;
	}

	
	public void setLogisticsState(Long logisticsState){
		this.logisticsState = logisticsState;
	}

	
	public Long getLogisticsState(){
		return this.logisticsState;
	}

	
	public void setValueAddedServices(List<ValueAddedServicesItem> valueAddedServices){
		this.valueAddedServices = valueAddedServices;
	}

	
	public List<ValueAddedServicesItem> getValueAddedServices(){
		return this.valueAddedServices;
	}

}