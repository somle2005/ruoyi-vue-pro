package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RelationOrder {


	@SerializedName("write_off_no")
	@OpField(desc = "核销券码", example = "xxxx")
	private String writeOffNo;

	@SerializedName("relation_order_id")
	@OpField(desc = "关联店铺单订单id", example = "1234567")
	private String relationOrderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWriteOffNo(String writeOffNo){
		this.writeOffNo = writeOffNo;
	}

	
	public String getWriteOffNo(){
		return this.writeOffNo;
	}

	
	public void setRelationOrderId(String relationOrderId){
		this.relationOrderId = relationOrderId;
	}

	
	public String getRelationOrderId(){
		return this.relationOrderId;
	}

}