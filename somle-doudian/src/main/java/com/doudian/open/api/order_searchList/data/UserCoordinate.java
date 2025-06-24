package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UserCoordinate {


	@SerializedName("user_coordinate_longitude")
	@OpField(desc = "买家收货地址经度信息，高德坐标系；", example = "117.250076")
	private String userCoordinateLongitude;

	@SerializedName("user_coordinate_latitude")
	@OpField(desc = "买家收货地址纬度信息，高德坐标系；", example = "31.707203")
	private String userCoordinateLatitude;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUserCoordinateLongitude(String userCoordinateLongitude){
		this.userCoordinateLongitude = userCoordinateLongitude;
	}

	
	public String getUserCoordinateLongitude(){
		return this.userCoordinateLongitude;
	}

	
	public void setUserCoordinateLatitude(String userCoordinateLatitude){
		this.userCoordinateLatitude = userCoordinateLatitude;
	}

	
	public String getUserCoordinateLatitude(){
		return this.userCoordinateLatitude;
	}

}