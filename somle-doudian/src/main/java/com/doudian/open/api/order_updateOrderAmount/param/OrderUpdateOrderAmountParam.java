package com.doudian.open.api.order_updateOrderAmount.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderUpdateOrderAmountParam {


	@SerializedName("pid")
	@OpField(required = true , desc = "", example= "")
	private String pid;

	@SerializedName("update_detail")
	@OpField(required = false , desc = "", example= "")
	private List<UpdateDetailItem> updateDetail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPid(String pid){
		this.pid = pid;
	}

	
	public String getPid(){
		return this.pid;
	}

	
	public void setUpdateDetail(List<UpdateDetailItem> updateDetail){
		this.updateDetail = updateDetail;
	}

	
	public List<UpdateDetailItem> getUpdateDetail(){
		return this.updateDetail;
	}

}