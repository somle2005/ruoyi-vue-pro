package com.doudian.open.api.logistics_createSFOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsCreateSFOrderData {


	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "474351860506696200")
	private String orderId;

	@SerializedName("pack_id")
	@OpField(desc = "包裹id", example = "1")
	private String packId;

	@SerializedName("origin_code")
	@OpField(desc = "原寄地区域代码，可用于顺丰 电子运单标签打印", example = "010")
	private String originCode;

	@SerializedName("dest_code")
	@OpField(desc = "目的地区域代码，可用于顺丰 电子运单标签打印", example = "010")
	private String destCode;

	@SerializedName("filter_result")
	@OpField(desc = "筛单结果： 1：人工确认 2：可收派 3：不可以收派", example = "2")
	private Integer filterResult;

	@SerializedName("remark")
	@OpField(desc = "如果filter_result=3时为必填， 不可以收派的原因代码： 1：收方超范围 2：派方超范围 3：其它原因 高峰管控提示信息 【数字】：【高峰管控提示信息】", example = "1：春运延时")
	private String remark;

	@SerializedName("waybill_no_info_list")
	@OpField(desc = "顺丰运单号", example = "-")
	private List<WaybillNoInfoListItem> waybillNoInfoList;

	@SerializedName("route_label_info")
	@OpField(desc = "路由标签", example = "-")
	private RouteLabelInfo routeLabelInfo;

	@SerializedName("order_channel")
	@OpField(desc = "2;具体请看文档映射表", example = "2")
	private String orderChannel;


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

	
	public void setPackId(String packId){
		this.packId = packId;
	}

	
	public String getPackId(){
		return this.packId;
	}

	
	public void setOriginCode(String originCode){
		this.originCode = originCode;
	}

	
	public String getOriginCode(){
		return this.originCode;
	}

	
	public void setDestCode(String destCode){
		this.destCode = destCode;
	}

	
	public String getDestCode(){
		return this.destCode;
	}

	
	public void setFilterResult(Integer filterResult){
		this.filterResult = filterResult;
	}

	
	public Integer getFilterResult(){
		return this.filterResult;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setWaybillNoInfoList(List<WaybillNoInfoListItem> waybillNoInfoList){
		this.waybillNoInfoList = waybillNoInfoList;
	}

	
	public List<WaybillNoInfoListItem> getWaybillNoInfoList(){
		return this.waybillNoInfoList;
	}

	
	public void setRouteLabelInfo(RouteLabelInfo routeLabelInfo){
		this.routeLabelInfo = routeLabelInfo;
	}

	
	public RouteLabelInfo getRouteLabelInfo(){
		return this.routeLabelInfo;
	}

	
	public void setOrderChannel(String orderChannel){
		this.orderChannel = orderChannel;
	}

	
	public String getOrderChannel(){
		return this.orderChannel;
	}

}