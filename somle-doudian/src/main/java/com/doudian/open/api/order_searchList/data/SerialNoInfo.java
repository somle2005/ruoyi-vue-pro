package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class SerialNoInfo {


	@SerializedName("serial_no_list")
	@OpField(desc = "绑定/发货操作回传/快递回传的序列号信息。", example = "")
	private List<SerialNoListItem_5> serialNoList;

	@SerializedName("all_lp_shop_code")
	@OpField(desc = "物流公司及商家编码，key是物流公司code,value是商家编码;", example = "[shunfeng:1156]")
	private Map<String,String> allLpShopCode;

	@SerializedName("all_lp_task_code")
	@OpField(desc = "所有的物流公司及微派code,key是物流公司code,value是微派code;", example = "[shunfeng:1222]")
	private Map<String,String> allLpTaskCode;

	@SerializedName("available_lp")
	@OpField(desc = "可用的物流公司列表，国补订单发货时使用的物流公司code应该在该物流公司列表内。", example = "[shunfeng]")
	private List<String> availableLp;

	@SerializedName("sku_bind_69_codes")
	@OpField(desc = "商品发布时绑定在该sku上的69码。", example = "[1234]")
	private List<String> skuBind69Codes;

	@SerializedName("need_photo")
	@OpField(desc = "true-需要，false-不需要。", example = "true")
	private Boolean needPhoto;

	@SerializedName("shipping_need_check_codes")
	@OpField(desc = "发货需要回传的SN/69/IMEI码信息；SN-SN码，IMEI-IMEI码，69 - 69码;", example = "[SN,69,IMEI]")
	private List<String> shippingNeedCheckCodes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSerialNoList(List<SerialNoListItem_5> serialNoList){
		this.serialNoList = serialNoList;
	}

	
	public List<SerialNoListItem_5> getSerialNoList(){
		return this.serialNoList;
	}

	
	public void setAllLpShopCode(Map<String,String> allLpShopCode){
		this.allLpShopCode = allLpShopCode;
	}

	
	public Map<String,String> getAllLpShopCode(){
		return this.allLpShopCode;
	}

	
	public void setAllLpTaskCode(Map<String,String> allLpTaskCode){
		this.allLpTaskCode = allLpTaskCode;
	}

	
	public Map<String,String> getAllLpTaskCode(){
		return this.allLpTaskCode;
	}

	
	public void setAvailableLp(List<String> availableLp){
		this.availableLp = availableLp;
	}

	
	public List<String> getAvailableLp(){
		return this.availableLp;
	}

	
	public void setSkuBind69Codes(List<String> skuBind69Codes){
		this.skuBind69Codes = skuBind69Codes;
	}

	
	public List<String> getSkuBind69Codes(){
		return this.skuBind69Codes;
	}

	
	public void setNeedPhoto(Boolean needPhoto){
		this.needPhoto = needPhoto;
	}

	
	public Boolean getNeedPhoto(){
		return this.needPhoto;
	}

	
	public void setShippingNeedCheckCodes(List<String> shippingNeedCheckCodes){
		this.shippingNeedCheckCodes = shippingNeedCheckCodes;
	}

	
	public List<String> getShippingNeedCheckCodes(){
		return this.shippingNeedCheckCodes;
	}

}