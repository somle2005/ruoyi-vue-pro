package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DCarShopBizData {


	@SerializedName("poi_id")
	@OpField(desc = "选择的门店ID", example = "<nil>")
	private String poiId;

	@SerializedName("poi_name")
	@OpField(desc = "选择的门店名称", example = "<nil>")
	private String poiName;

	@SerializedName("poi_addr")
	@OpField(desc = "选择的门店地址", example = "<nil>")
	private String poiAddr;

	@SerializedName("poi_tel")
	@OpField(desc = "选择的门店电话", example = "<nil>")
	private String poiTel;

	@SerializedName("coupon_right")
	@OpField(desc = "权益信息", example = "")
	private List<CouponRightItem> couponRight;

	@SerializedName("poi_pname")
	@OpField(desc = "选择的门店所在省", example = "<nil>")
	private String poiPname;

	@SerializedName("poi_city_name")
	@OpField(desc = "选择的门店所在市", example = "<nil>")
	private String poiCityName;

	@SerializedName("poi_adname")
	@OpField(desc = "选择的门店所在区县", example = "<nil>")
	private String poiAdname;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPoiId(String poiId){
		this.poiId = poiId;
	}

	
	public String getPoiId(){
		return this.poiId;
	}

	
	public void setPoiName(String poiName){
		this.poiName = poiName;
	}

	
	public String getPoiName(){
		return this.poiName;
	}

	
	public void setPoiAddr(String poiAddr){
		this.poiAddr = poiAddr;
	}

	
	public String getPoiAddr(){
		return this.poiAddr;
	}

	
	public void setPoiTel(String poiTel){
		this.poiTel = poiTel;
	}

	
	public String getPoiTel(){
		return this.poiTel;
	}

	
	public void setCouponRight(List<CouponRightItem> couponRight){
		this.couponRight = couponRight;
	}

	
	public List<CouponRightItem> getCouponRight(){
		return this.couponRight;
	}

	
	public void setPoiPname(String poiPname){
		this.poiPname = poiPname;
	}

	
	public String getPoiPname(){
		return this.poiPname;
	}

	
	public void setPoiCityName(String poiCityName){
		this.poiCityName = poiCityName;
	}

	
	public String getPoiCityName(){
		return this.poiCityName;
	}

	
	public void setPoiAdname(String poiAdname){
		this.poiAdname = poiAdname;
	}

	
	public String getPoiAdname(){
		return this.poiAdname;
	}

}