package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WorkerInfo {


	@SerializedName("worker_tel")
	@OpField(desc = "手机号", example = "13023432217")
	private String workerTel;

	@SerializedName("worker_name")
	@OpField(desc = "姓名", example = "王师傅")
	private String workerName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWorkerTel(String workerTel){
		this.workerTel = workerTel;
	}

	
	public String getWorkerTel(){
		return this.workerTel;
	}

	
	public void setWorkerName(String workerName){
		this.workerName = workerName;
	}

	
	public String getWorkerName(){
		return this.workerName;
	}

}