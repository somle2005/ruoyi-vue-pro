package com.doudian.open.api.address_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AddressListData {


	@SerializedName("total")
	@OpField(desc = "地址总数", example = "10")
	private Long total;

	@SerializedName("page_size")
	@OpField(desc = "页码", example = "1")
	private Long pageSize;

	@SerializedName("page_no")
	@OpField(desc = "每页数量", example = "10")
	private Long pageNo;

	@SerializedName("address_list")
	@OpField(desc = "地址列表", example = "")
	private List<AddressListItem> addressList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

	
	public void setPageNo(Long pageNo){
		this.pageNo = pageNo;
	}

	
	public Long getPageNo(){
		return this.pageNo;
	}

	
	public void setAddressList(List<AddressListItem> addressList){
		this.addressList = addressList;
	}

	
	public List<AddressListItem> getAddressList(){
		return this.addressList;
	}

}