package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderInfoListItem {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单号", example= "123")
	private String orderId;

	@SerializedName("product_type")
	@OpField(required = false , desc = "产品类型，可不传", example= "byte_pt")
	private String productType;

	@SerializedName("express_list")
	@OpField(required = false , desc = "物流商集合，不传默认：yuantong、zhongtong、yunda、shunfeng、jd、jtexpress、shentong", example= "['zhongtong','yundan','shunfeng']")
	private List<String> expressList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setProductType(String productType){
		this.productType = productType;
	}

	
	public String getProductType(){
		return this.productType;
	}

	
	public void setExpressList(List<String> expressList){
		this.expressList = expressList;
	}

	
	public List<String> getExpressList(){
		return this.expressList;
	}

}