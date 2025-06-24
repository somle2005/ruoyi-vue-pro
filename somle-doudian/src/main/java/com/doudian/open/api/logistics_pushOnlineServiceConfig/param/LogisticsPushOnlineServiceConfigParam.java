package com.doudian.open.api.logistics_pushOnlineServiceConfig.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsPushOnlineServiceConfigParam {


	@SerializedName("service_type")
	@OpField(required = false , desc = "服务类型。0-增值服务；1-产品类型", example= "1")
	private String serviceType;

	@SerializedName("desc")
	@OpField(required = false , desc = "服务描述", example= "该服务提供了更快更优的派送体验")
	private String desc;

	@SerializedName("is_auto_open")
	@OpField(required = false , desc = "是否自动开通。0-否；1-是", example= "1")
	private Integer isAutoOpen;

	@SerializedName("operator_name")
	@OpField(required = false , desc = "操作人名称", example= "李四")
	private String operatorName;

	@SerializedName("operator_id")
	@OpField(required = false , desc = "操作人ID", example= "123")
	private String operatorId;

	@SerializedName("name")
	@OpField(required = false , desc = "服务名称（也是面单打印的名称）", example= "航空件")
	private String name;

	@SerializedName("code")
	@OpField(required = false , desc = "服务code", example= "XXX")
	private String code;

	@SerializedName("route_list")
	@OpField(required = false , desc = "线路限制", example= "")
	private List<RouteListItem> routeList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setServiceType(String serviceType){
		this.serviceType = serviceType;
	}

	
	public String getServiceType(){
		return this.serviceType;
	}

	
	public void setDesc(String desc){
		this.desc = desc;
	}

	
	public String getDesc(){
		return this.desc;
	}

	
	public void setIsAutoOpen(Integer isAutoOpen){
		this.isAutoOpen = isAutoOpen;
	}

	
	public Integer getIsAutoOpen(){
		return this.isAutoOpen;
	}

	
	public void setOperatorName(String operatorName){
		this.operatorName = operatorName;
	}

	
	public String getOperatorName(){
		return this.operatorName;
	}

	
	public void setOperatorId(String operatorId){
		this.operatorId = operatorId;
	}

	
	public String getOperatorId(){
		return this.operatorId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setRouteList(List<RouteListItem> routeList){
		this.routeList = routeList;
	}

	
	public List<RouteListItem> getRouteList(){
		return this.routeList;
	}

}