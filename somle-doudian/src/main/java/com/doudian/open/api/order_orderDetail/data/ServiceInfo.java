package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ServiceInfo {


	@SerializedName("service_finish_time")
	@OpField(desc = "完成时间", example = "1707190091")
	private Long serviceFinishTime;

	@SerializedName("sign_in_time")
	@OpField(desc = "上门签到时间", example = "1707190091")
	private Long signInTime;

	@SerializedName("appointment_slice_time")
	@OpField(desc = "上门安装预约时间", example = "")
	private AppointmentSliceTime appointmentSliceTime;

	@SerializedName("service_status_desc")
	@OpField(desc = "服务单状态描述", example = "安装服务已完成")
	private String serviceStatusDesc;

	@SerializedName("service_status")
	@OpField(desc = "服务单状态", example = "5")
	private Long serviceStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setServiceFinishTime(Long serviceFinishTime){
		this.serviceFinishTime = serviceFinishTime;
	}

	
	public Long getServiceFinishTime(){
		return this.serviceFinishTime;
	}

	
	public void setSignInTime(Long signInTime){
		this.signInTime = signInTime;
	}

	
	public Long getSignInTime(){
		return this.signInTime;
	}

	
	public void setAppointmentSliceTime(AppointmentSliceTime appointmentSliceTime){
		this.appointmentSliceTime = appointmentSliceTime;
	}

	
	public AppointmentSliceTime getAppointmentSliceTime(){
		return this.appointmentSliceTime;
	}

	
	public void setServiceStatusDesc(String serviceStatusDesc){
		this.serviceStatusDesc = serviceStatusDesc;
	}

	
	public String getServiceStatusDesc(){
		return this.serviceStatusDesc;
	}

	
	public void setServiceStatus(Long serviceStatus){
		this.serviceStatus = serviceStatus;
	}

	
	public Long getServiceStatus(){
		return this.serviceStatus;
	}

}