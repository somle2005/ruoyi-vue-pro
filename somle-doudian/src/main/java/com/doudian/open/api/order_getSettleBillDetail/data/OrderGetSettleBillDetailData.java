package com.doudian.open.api.order_getSettleBillDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderGetSettleBillDetailData {


	@SerializedName("code")
	@OpField(desc = "返回code   100000为成功，其他为失败", example = "100000")
	private String code;

	@SerializedName("code_msg")
	@OpField(desc = "返回信息描述，成功时返回SUCCESS，其他状态下会有失败描述", example = "SUCCESS")
	private String codeMsg;

	@SerializedName("data")
	@OpField(desc = "账单明细列表", example = "-")
	private List<DataItem> data;

	@SerializedName("total_cnt")
	@OpField(desc = "总数", example = "0")
	private Long totalCnt;

	@SerializedName("page")
	@OpField(desc = "页数", example = "0")
	private Long page;

	@SerializedName("size")
	@OpField(desc = "每页数量", example = "0")
	private Long size;


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

	
	public void setTotalCnt(Long totalCnt){
		this.totalCnt = totalCnt;
	}

	
	public Long getTotalCnt(){
		return this.totalCnt;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

}