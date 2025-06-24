package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SupplierInfo {


	@SerializedName("auxiliary_material_url")
	@OpField(desc = "辅材 URL", example = "https://school.jinritemai.com/doudian/web/article/aHzjDcVtqzd8?from=shop_article")
	private String auxiliaryMaterialUrl;

	@SerializedName("supplier_charge_desc")
	@OpField(desc = "收费说明", example = "因安装环境可能产生的辅材、配件等额外费用需要消费者线下支付，当前报价标准由平台提供")
	private String supplierChargeDesc;

	@SerializedName("supplier_shop_id")
	@OpField(desc = "服务商 ShopId", example = "98643")
	private String supplierShopId;

	@SerializedName("supplier_tel")
	@OpField(desc = "电话", example = "4000000056")
	private String supplierTel;

	@SerializedName("supplier_name")
	@OpField(desc = "名称", example = "周一科技有限公司")
	private String supplierName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuxiliaryMaterialUrl(String auxiliaryMaterialUrl){
		this.auxiliaryMaterialUrl = auxiliaryMaterialUrl;
	}

	
	public String getAuxiliaryMaterialUrl(){
		return this.auxiliaryMaterialUrl;
	}

	
	public void setSupplierChargeDesc(String supplierChargeDesc){
		this.supplierChargeDesc = supplierChargeDesc;
	}

	
	public String getSupplierChargeDesc(){
		return this.supplierChargeDesc;
	}

	
	public void setSupplierShopId(String supplierShopId){
		this.supplierShopId = supplierShopId;
	}

	
	public String getSupplierShopId(){
		return this.supplierShopId;
	}

	
	public void setSupplierTel(String supplierTel){
		this.supplierTel = supplierTel;
	}

	
	public String getSupplierTel(){
		return this.supplierTel;
	}

	
	public void setSupplierName(String supplierName){
		this.supplierName = supplierName;
	}

	
	public String getSupplierName(){
		return this.supplierName;
	}

}