package com.doudian.open.api.product_listV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LookupOption {


	@SerializedName("need_name_affix")
	@OpField(required = false , desc = "是否需要获取标题前后缀", example= "true")
	private Boolean needNameAffix;

	@SerializedName("need_title_limit")
	@OpField(required = false , desc = "是否需要获取商品标题长度限制规则", example= "true")
	private Boolean needTitleLimit;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setNeedNameAffix(Boolean needNameAffix){
		this.needNameAffix = needNameAffix;
	}

	
	public Boolean getNeedNameAffix(){
		return this.needNameAffix;
	}

	
	public void setNeedTitleLimit(Boolean needTitleLimit){
		this.needTitleLimit = needTitleLimit;
	}

	
	public Boolean getNeedTitleLimit(){
		return this.needTitleLimit;
	}

}