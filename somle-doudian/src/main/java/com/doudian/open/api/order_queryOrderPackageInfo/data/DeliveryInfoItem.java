package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DeliveryInfoItem {


	@SerializedName("deliver_id")
	@OpField(desc = "包裹单id，抖店平台生成", example = "7338402565379522860")
	private String deliverId;

	@SerializedName("deliver_type")
	@OpField(desc = "包裹类型（仓包、发货包裹、补发包裹等等）", example = "0")
	private Long deliverType;

	@SerializedName("track_no")
	@OpField(desc = "快递运单号", example = "75530132493095")
	private String trackNo;

	@SerializedName("create_time")
	@OpField(desc = "创建时间unix时间戳", example = "1708633805")
	private Long createTime;

	@SerializedName("company_info")
	@OpField(desc = "快递物流公司信息", example = "")
	private CompanyInfo companyInfo;

	@SerializedName("track_info")
	@OpField(desc = "轨迹节点信息", example = "")
	private List<TrackInfoItem> trackInfo;


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

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setCompanyInfo(CompanyInfo companyInfo){
		this.companyInfo = companyInfo;
	}

	
	public CompanyInfo getCompanyInfo(){
		return this.companyInfo;
	}

	
	public void setTrackInfo(List<TrackInfoItem> trackInfo){
		this.trackInfo = trackInfo;
	}

	
	public List<TrackInfoItem> getTrackInfo(){
		return this.trackInfo;
	}

}