package com.doudian.open.api.order_getSettleBillDetailV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderGetSettleBillDetailV2Data {


	@SerializedName("code")
	@OpField(desc = "返回code 100000为成功，其他为失败", example = "100000")
	private String code;

	@SerializedName("code_msg")
	@OpField(desc = "返回信息描述，失败状态下会有失败描述", example = "查询失败")
	private String codeMsg;

	@SerializedName("data")
	@OpField(desc = "订单流水明细列表", example = "")
	private List<DataItem> data;

	@SerializedName("size")
	@OpField(desc = "请求的size", example = "100")
	private Long size;

	@SerializedName("next_start_index")
	@OpField(desc = "下一次查询start_index", example = "12345678")
	private String nextStartIndex;

	@SerializedName("next_start_time")
	@OpField(desc = "下一次查询start_time", example = "2021-05-18 03:00:00")
	private String nextStartTime;

	@SerializedName("data_size")
	@OpField(desc = "结果data的大小", example = "100")
	private Long dataSize;

	@SerializedName("is_end")
	@OpField(desc = "判断查询是否结束。0 未结束, 1 结束。未结束时，需要把next_start_index作为下一次请求的start_index,next_start_time作为下一次请求的start_time。", example = "0")
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

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
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

	
	public void setDataSize(Long dataSize){
		this.dataSize = dataSize;
	}

	
	public Long getDataSize(){
		return this.dataSize;
	}

	
	public void setIsEnd(Integer isEnd){
		this.isEnd = isEnd;
	}

	
	public Integer getIsEnd(){
		return this.isEnd;
	}

}