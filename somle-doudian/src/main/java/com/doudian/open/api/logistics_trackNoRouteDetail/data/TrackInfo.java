package com.doudian.open.api.logistics_trackNoRouteDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TrackInfo {


	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "234234234")
	private String trackNo;

	@SerializedName("express")
	@OpField(desc = "物流商编码", example = "shentong")
	private String express;


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

}