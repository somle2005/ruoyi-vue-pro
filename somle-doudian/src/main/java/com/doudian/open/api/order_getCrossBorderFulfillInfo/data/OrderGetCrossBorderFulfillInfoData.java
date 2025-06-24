package com.doudian.open.api.order_getCrossBorderFulfillInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderGetCrossBorderFulfillInfoData {


	@SerializedName("shop_order_id")
	@OpField(desc = "主订单号", example = "4790307922954771917")
	private String shopOrderId;

	@SerializedName("company")
	@OpField(desc = "物流公司名称", example = "顺丰")
	private String company;

	@SerializedName("company_code")
	@OpField(desc = "物流公司Code", example = "shunfeng")
	private String companyCode;

	@SerializedName("sku_order_ids")
	@OpField(desc = "商品单id列表", example = "[4790307922954771917]")
	private List<String> skuOrderIds;

	@SerializedName("logistics_code")
	@OpField(desc = "物流单号", example = "SF12345")
	private String logisticsCode;

	@SerializedName("way_bill_url")
	@OpField(desc = "电子面单链接", example = "https://sf6-ttcdn-tos.pstatp.com/obj/temai/xxx")
	private String wayBillUrl;

	@SerializedName("mark")
	@OpField(desc = "大头笔", example = "1")
	private String mark;

	@SerializedName("product_num")
	@OpField(desc = "商品件数", example = "1")
	private Long productNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setCompany(String company){
		this.company = company;
	}

	
	public String getCompany(){
		return this.company;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setSkuOrderIds(List<String> skuOrderIds){
		this.skuOrderIds = skuOrderIds;
	}

	
	public List<String> getSkuOrderIds(){
		return this.skuOrderIds;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setWayBillUrl(String wayBillUrl){
		this.wayBillUrl = wayBillUrl;
	}

	
	public String getWayBillUrl(){
		return this.wayBillUrl;
	}

	
	public void setMark(String mark){
		this.mark = mark;
	}

	
	public String getMark(){
		return this.mark;
	}

	
	public void setProductNum(Long productNum){
		this.productNum = productNum;
	}

	
	public Long getProductNum(){
		return this.productNum;
	}

}