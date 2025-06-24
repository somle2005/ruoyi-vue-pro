package com.doudian.open.api.order_queryOrderLogistics.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DeliveryInfoItem {


	@SerializedName("deliver_id")
	@OpField(desc = "deliverId", example = "1")
	private String deliverId;

	@SerializedName("deliver_type")
	@OpField(desc = "仓包、发货包裹、补发包裹等等", example = "1")
	private Long deliverType;

	@SerializedName("send_to")
	@OpField(desc = "发货至, 1用户,2BIC,3商户, 默认1", example = "1")
	private Long sendTo;

	@SerializedName("transit_merge_type")
	@OpField(desc = "新疆中转B段合单类型", example = "1")
	private String transitMergeType;

	@SerializedName("track_info")
	@OpField(desc = "快递轨迹信息", example = "")
	private List<TrackInfoItem> trackInfo;

	@SerializedName("reverse_express_info")
	@OpField(desc = "当前段拒收退回的包裹信息", example = "")
	private ReverseExpressInfo reverseExpressInfo;

	@SerializedName("track_no")
	@OpField(desc = "快递单号", example = "1")
	private String trackNo;

	@SerializedName("send_from")
	@OpField(desc = "发货来源 1用户,2BIC,3商户, 默认3", example = "1")
	private Long sendFrom;

	@SerializedName("company_info")
	@OpField(desc = "快递公司信息", example = "")
	private CompanyInfo companyInfo;

	@SerializedName("pre_deliver_info")
	@OpField(desc = "上一段的包裹信息", example = "")
	private PreDeliverInfo preDeliverInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDeliverId(String deliverId){
		this.deliverId = deliverId;
	}

	
	public String getDeliverId(){
		return this.deliverId;
	}

	
	public void setDeliverType(Long deliverType){
		this.deliverType = deliverType;
	}

	
	public Long getDeliverType(){
		return this.deliverType;
	}

	
	public void setSendTo(Long sendTo){
		this.sendTo = sendTo;
	}

	
	public Long getSendTo(){
		return this.sendTo;
	}

	
	public void setTransitMergeType(String transitMergeType){
		this.transitMergeType = transitMergeType;
	}

	
	public String getTransitMergeType(){
		return this.transitMergeType;
	}

	
	public void setTrackInfo(List<TrackInfoItem> trackInfo){
		this.trackInfo = trackInfo;
	}

	
	public List<TrackInfoItem> getTrackInfo(){
		return this.trackInfo;
	}

	
	public void setReverseExpressInfo(ReverseExpressInfo reverseExpressInfo){
		this.reverseExpressInfo = reverseExpressInfo;
	}

	
	public ReverseExpressInfo getReverseExpressInfo(){
		return this.reverseExpressInfo;
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setSendFrom(Long sendFrom){
		this.sendFrom = sendFrom;
	}

	
	public Long getSendFrom(){
		return this.sendFrom;
	}

	
	public void setCompanyInfo(CompanyInfo companyInfo){
		this.companyInfo = companyInfo;
	}

	
	public CompanyInfo getCompanyInfo(){
		return this.companyInfo;
	}

	
	public void setPreDeliverInfo(PreDeliverInfo preDeliverInfo){
		this.preDeliverInfo = preDeliverInfo;
	}

	
	public PreDeliverInfo getPreDeliverInfo(){
		return this.preDeliverInfo;
	}

}