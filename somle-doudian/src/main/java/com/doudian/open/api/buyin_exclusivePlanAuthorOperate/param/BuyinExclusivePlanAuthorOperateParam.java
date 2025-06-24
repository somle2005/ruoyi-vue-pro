package com.doudian.open.api.buyin_exclusivePlanAuthorOperate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BuyinExclusivePlanAuthorOperateParam {


	@SerializedName("op_type")
	@OpField(required = true , desc = "操作类型 0: 添加达人; 1: 开启达人； 2：关闭达人； 3: 删除达人", example= "0")
	private Integer opType;

	@SerializedName("author_buyin_id")
	@OpField(required = true , desc = "达人百应ID", example= "2324324234")
	private Long authorBuyinId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOpType(Integer opType){
		this.opType = opType;
	}

	
	public Integer getOpType(){
		return this.opType;
	}

	
	public void setAuthorBuyinId(Long authorBuyinId){
		this.authorBuyinId = authorBuyinId;
	}

	
	public Long getAuthorBuyinId(){
		return this.authorBuyinId;
	}

}