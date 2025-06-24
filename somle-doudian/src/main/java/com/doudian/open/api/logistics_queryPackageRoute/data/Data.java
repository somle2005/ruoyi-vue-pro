package com.doudian.open.api.logistics_queryPackageRoute.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class Data {


	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "SF1345778775768")
	private String trackNo;

	@SerializedName("express")
	@OpField(desc = "快递商", example = "shunfeng")
	private String express;

	@SerializedName("track_routes")
	@OpField(desc = "轨迹", example = "")
	private List<TrackRoutesItem> trackRoutes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setExpress(String express){
		this.express = express;
	}

	
	public String getExpress(){
		return this.express;
	}

	
	public void setTrackRoutes(List<TrackRoutesItem> trackRoutes){
		this.trackRoutes = trackRoutes;
	}

	
	public List<TrackRoutesItem> getTrackRoutes(){
		return this.trackRoutes;
	}

}