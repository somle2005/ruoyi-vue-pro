package com.doudian.open.api.address_listStrategyBindProducts.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductListItem {


	@SerializedName("product_id")
	@OpField(desc = "商品id", example = "3709228738131656945")
	private String productId;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "时尚短袖T恤黑白两色背面艺术图案上衣夏季半袖小众宽松印花")
	private String productName;

	@SerializedName("image")
	@OpField(desc = "商品图片", example = "https://p3-aio.ecombdimg.com/obj/ecom-shop-material/bMLccs_m_3313dab415e12933e72fd231f4b71515_sx_1750121_www1200-1200")
	private String image;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setImage(String image){
		this.image = image;
	}

	
	public String getImage(){
		return this.image;
	}

}