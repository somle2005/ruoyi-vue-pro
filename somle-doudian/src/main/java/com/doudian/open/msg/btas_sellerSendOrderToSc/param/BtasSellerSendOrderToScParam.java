package com.doudian.open.msg.btas_sellerSendOrderToSc.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BtasSellerSendOrderToScParam {


	@SerializedName("order_code")
	@OpField(required = false , desc = "btas订单码", example= "0654497435")
	private String orderCode;

	@SerializedName("product_info")
	@OpField(required = false , desc = "送检商品信息", example= "")
	private ProductInfo productInfo;

	@SerializedName("qc_deliver_info")
	@OpField(required = false , desc = "送检到质检机构物流信息", example= "")
	private QcDeliverInfo qcDeliverInfo;

	@SerializedName("sc_info")
	@OpField(required = false , desc = "质检机构信息", example= "")
	private ScInfo scInfo;

	@SerializedName("third_cid")
	@OpField(required = false , desc = "三级类目ID", example= "31631")
	private String thirdCid;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderCode(String orderCode){
		this.orderCode = orderCode;
	}

	
	public String getOrderCode(){
		return this.orderCode;
	}

	
	public void setProductInfo(ProductInfo productInfo){
		this.productInfo = productInfo;
	}

	
	public ProductInfo getProductInfo(){
		return this.productInfo;
	}

	
	public void setQcDeliverInfo(QcDeliverInfo qcDeliverInfo){
		this.qcDeliverInfo = qcDeliverInfo;
	}

	
	public QcDeliverInfo getQcDeliverInfo(){
		return this.qcDeliverInfo;
	}

	
	public void setScInfo(ScInfo scInfo){
		this.scInfo = scInfo;
	}

	
	public ScInfo getScInfo(){
		return this.scInfo;
	}

	
	public void setThirdCid(String thirdCid){
		this.thirdCid = thirdCid;
	}

	
	public String getThirdCid(){
		return this.thirdCid;
	}

}