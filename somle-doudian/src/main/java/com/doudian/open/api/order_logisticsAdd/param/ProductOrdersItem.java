package com.doudian.open.api.order_logisticsAdd.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductOrdersItem {


	@SerializedName("serial_no_list")
	@OpField(required = false , desc = "需要的SN/69/IMEI码列表。", example= "")
	private List<SerialNoListItem> serialNoList;

	@SerializedName("product_order_id")
	@OpField(required = false , desc = "商品单单号", example= "4782813149182887526")
	private String productOrderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSerialNoList(List<SerialNoListItem> serialNoList){
		this.serialNoList = serialNoList;
	}

	
	public List<SerialNoListItem> getSerialNoList(){
		return this.serialNoList;
	}

	
	public void setProductOrderId(String productOrderId){
		this.productOrderId = productOrderId;
	}

	
	public String getProductOrderId(){
		return this.productOrderId;
	}

}