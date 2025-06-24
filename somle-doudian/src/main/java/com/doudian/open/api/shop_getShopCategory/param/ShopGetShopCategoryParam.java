package com.doudian.open.api.shop_getShopCategory.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopGetShopCategoryParam {


	@SerializedName("cid")
	@OpField(required = true , desc = "父类目id，根据父id可以获取子类目。首次请求传值为0 可以获取所有一级类目。循环调用接口获取最小层级类目id，根据响应参数判断is_leaf=true或false。is_leaf=true表示是叶子节点，获取最小层级类目id，is_leaf=false表示不是子节点，请求参数cid=上一次响应参数id，直到获取最小层级类目id。", example= "0")
	private Long cid;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCid(Long cid){
		this.cid = cid;
	}

	
	public Long getCid(){
		return this.cid;
	}

}