package com.doudian.open.api.order_getShopAccountItem.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderGetShopAccountItemData {


	@SerializedName("code")
	@OpField(desc = "返回code 100000为成功，其他为失败", example = "10000")
	private String code;

	@SerializedName("code_msg")
	@OpField(desc = "返回描述", example = "SUCCESS")
	private String codeMsg;

	@SerializedName("data")
	@OpField(desc = "资金流水明细", example = "")
	private List<DataItem> data;

	@SerializedName("next_start_index")
	@OpField(desc = "下一次请求参数start_index 的值", example = "d746da31eee45e65d07b20f87d6844bbf72041350acc66af1711408070b62428")
	private String nextStartIndex;

	@SerializedName("next_start_time")
	@OpField(desc = "下一次请求参数start_time的值", example = "2021-10-01 06:00:00")
	private String nextStartTime;

	@SerializedName("size")
	@OpField(desc = "查询数量，请求参数size传了值得话为请求参数传的值，未传的话，值为100", example = "100")
	private Integer size;

	@SerializedName("data_size")
	@OpField(desc = "返回结果data的数量", example = "100")
	private Integer dataSize;

	@SerializedName("is_end")
	@OpField(desc = "判断查询是否结束。0 未结束, 1 结束。未结束时，需要把next_start_index作为下一次请求的start_index,next_start_time作为下一次请求的start_time。", example = "1")
	private Integer isEnd;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setCodeMsg(String codeMsg){
		this.codeMsg = codeMsg;
	}

	
	public String getCodeMsg(){
		return this.codeMsg;
	}

	
	public void setData(List<DataItem> data){
		this.data = data;
	}

	
	public List<DataItem> getData(){
		return this.data;
	}

	
	public void setNextStartIndex(String nextStartIndex){
		this.nextStartIndex = nextStartIndex;
	}

	
	public String getNextStartIndex(){
		return this.nextStartIndex;
	}

	
	public void setNextStartTime(String nextStartTime){
		this.nextStartTime = nextStartTime;
	}

	
	public String getNextStartTime(){
		return this.nextStartTime;
	}

	
	public void setSize(Integer size){
		this.size = size;
	}

	
	public Integer getSize(){
		return this.size;
	}

	
	public void setDataSize(Integer dataSize){
		this.dataSize = dataSize;
	}

	
	public Integer getDataSize(){
		return this.dataSize;
	}

	
	public void setIsEnd(Integer isEnd){
		this.isEnd = isEnd;
	}

	
	public Integer getIsEnd(){
		return this.isEnd;
	}

}