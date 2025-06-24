package com.doudian.open.api.order_batchBindSerialNumber.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderBatchBindSerialNumberData {


	@SerializedName("total_fail_bind_cnt")
	@OpField(desc = "绑定失败的数量;", example = "1")
	private Long totalFailBindCnt;

	@SerializedName("success_bind_list")
	@OpField(desc = "成功绑定的列表;", example = "")
	private List<SuccessBindListItem> successBindList;

	@SerializedName("fail_bind_list")
	@OpField(desc = "绑定失败的列表;", example = "")
	private List<FailBindListItem> failBindList;

	@SerializedName("total_request_bind_cnt")
	@OpField(desc = "请求绑定的数量;", example = "10")
	private Long totalRequestBindCnt;

	@SerializedName("total_success_bind_cnt")
	@OpField(desc = "成功绑定的数量;", example = "5")
	private Long totalSuccessBindCnt;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTotalFailBindCnt(Long totalFailBindCnt){
		this.totalFailBindCnt = totalFailBindCnt;
	}

	
	public Long getTotalFailBindCnt(){
		return this.totalFailBindCnt;
	}

	
	public void setSuccessBindList(List<SuccessBindListItem> successBindList){
		this.successBindList = successBindList;
	}

	
	public List<SuccessBindListItem> getSuccessBindList(){
		return this.successBindList;
	}

	
	public void setFailBindList(List<FailBindListItem> failBindList){
		this.failBindList = failBindList;
	}

	
	public List<FailBindListItem> getFailBindList(){
		return this.failBindList;
	}

	
	public void setTotalRequestBindCnt(Long totalRequestBindCnt){
		this.totalRequestBindCnt = totalRequestBindCnt;
	}

	
	public Long getTotalRequestBindCnt(){
		return this.totalRequestBindCnt;
	}

	
	public void setTotalSuccessBindCnt(Long totalSuccessBindCnt){
		this.totalSuccessBindCnt = totalSuccessBindCnt;
	}

	
	public Long getTotalSuccessBindCnt(){
		return this.totalSuccessBindCnt;
	}

}