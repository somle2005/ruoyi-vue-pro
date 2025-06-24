package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class HomeInstallationServiceInfo {


	@SerializedName("worker_info")
	@OpField(desc = "安装工人信息", example = "")
	private WorkerInfo workerInfo;

	@SerializedName("supplier_info")
	@OpField(desc = "服务商信息", example = "")
	private SupplierInfo supplierInfo;

	@SerializedName("service_info")
	@OpField(desc = "服务单信息", example = "")
	private ServiceInfo serviceInfo;

	@SerializedName("latest_status")
	@OpField(desc = "安装服务是否有效 0-取消 1-生效", example = "1")
	private Long latestStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWorkerInfo(WorkerInfo workerInfo){
		this.workerInfo = workerInfo;
	}

	
	public WorkerInfo getWorkerInfo(){
		return this.workerInfo;
	}

	
	public void setSupplierInfo(SupplierInfo supplierInfo){
		this.supplierInfo = supplierInfo;
	}

	
	public SupplierInfo getSupplierInfo(){
		return this.supplierInfo;
	}

	
	public void setServiceInfo(ServiceInfo serviceInfo){
		this.serviceInfo = serviceInfo;
	}

	
	public ServiceInfo getServiceInfo(){
		return this.serviceInfo;
	}

	
	public void setLatestStatus(Long latestStatus){
		this.latestStatus = latestStatus;
	}

	
	public Long getLatestStatus(){
		return this.latestStatus;
	}

}