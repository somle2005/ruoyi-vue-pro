package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductListV2Data {


	@SerializedName("data")
	@OpField(desc = "商品数据", example = "")
	private List<DataItem> data;

	@SerializedName("total")
	@OpField(desc = "本次查询返回的商品总数", example = "10000")
	private Long total;

	@SerializedName("page")
	@OpField(desc = "当前页码", example = "10")
	private Long page;

	@SerializedName("size")
	@OpField(desc = "页数（每页数量）", example = "100")
	private Long size;

	@SerializedName("cursor_id")
	@OpField(desc = "使用游标时，每次查询会返回该值，作为下次查询的入参使用。", example = "WzE2ODI1Nzc4MjksMTc2NDMxMDczMDU3MDg0M10=")
	private String cursorId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(List<DataItem> data){
		this.data = data;
	}

	
	public List<DataItem> getData(){
		return this.data;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
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

	
	public void setCursorId(String cursorId){
		this.cursorId = cursorId;
	}

	
	public String getCursorId(){
		return this.cursorId;
	}

}