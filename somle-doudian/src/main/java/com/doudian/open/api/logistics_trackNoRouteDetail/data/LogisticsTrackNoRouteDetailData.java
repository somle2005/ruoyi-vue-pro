package com.doudian.open.api.logistics_trackNoRouteDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsTrackNoRouteDetailData {


	@SerializedName("route__node_list")
	@OpField(desc = "轨迹信息", example = "")
	private List<RouteNodeListItem> routeNodeList;

	@SerializedName("track_info")
	@OpField(desc = "运单信息", example = "")
	private TrackInfo trackInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRouteNodeList(List<RouteNodeListItem> routeNodeList){
		this.routeNodeList = routeNodeList;
	}

	
	public List<RouteNodeListItem> getRouteNodeList(){
		return this.routeNodeList;
	}

	
	public void setTrackInfo(TrackInfo trackInfo){
		this.trackInfo = trackInfo;
	}

	
	public TrackInfo getTrackInfo(){
		return this.trackInfo;
	}

}