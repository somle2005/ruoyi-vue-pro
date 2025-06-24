package com.doudian.open.api.product_salesInherit_submitList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductSalesInheritSubmitListData {


	@SerializedName("sales_extend_record_list")
	@OpField(desc = "销量继承记录列表", example = "")
	private List<SalesExtendRecordListItem> salesExtendRecordList;

	@SerializedName("total")
	@OpField(desc = "总条数", example = "200")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSalesExtendRecordList(List<SalesExtendRecordListItem> salesExtendRecordList){
		this.salesExtendRecordList = salesExtendRecordList;
	}

	
	public List<SalesExtendRecordListItem> getSalesExtendRecordList(){
		return this.salesExtendRecordList;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}