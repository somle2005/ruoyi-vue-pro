package com.doudian.open.api.order_serviceDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderServiceDetailData {


	@SerializedName("detail")
	@OpField(desc = "详情", example = "")
	private Detail detail;

	@SerializedName("logs")
	@OpField(desc = "日志", example = "")
	private List<LogsItem> logs;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDetail(Detail detail){
		this.detail = detail;
	}

	
	public Detail getDetail(){
		return this.detail;
	}

	
	public void setLogs(List<LogsItem> logs){
		this.logs = logs;
	}

	
	public List<LogsItem> getLogs(){
		return this.logs;
	}

}