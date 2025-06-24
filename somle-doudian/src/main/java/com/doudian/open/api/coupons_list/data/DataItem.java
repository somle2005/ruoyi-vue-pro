package com.doudian.open.api.coupons_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("order_id")
	@OpField(desc = "平台订单id", example = "6917586388057718374")
	private String orderId;

	@SerializedName("verrify_order_ids")
	@OpField(desc = "三方商家的订单Id，如果有多个，使用;分割", example = "123123123123;789789789789")
	private String verrifyOrderIds;

	@SerializedName("cert_id")
	@OpField(desc = "卡券id", example = "71937153151279783203")
	private String certId;

	@SerializedName("out_cert_id")
	@OpField(desc = "外部卡券id", example = "123")
	private String outCertId;

	@SerializedName("cert_no")
	@OpField(desc = "卡号券码", example = "71936748123123166654548")
	private String certNo;

	@SerializedName("valid_start")
	@OpField(desc = "有效开始时间", example = "1673452800")
	private Long validStart;

	@SerializedName("valid_end")
	@OpField(desc = "有效结束时间", example = "1674921599")
	private Long validEnd;

	@SerializedName("grant_time")
	@OpField(desc = "发券时间，0则用当前时间", example = "1674914207")
	private Long grantTime;

	@SerializedName("status")
	@OpField(desc = "状态：1未激活 2未使用 3已过期", example = "1")
	private Long status;

	@SerializedName("total_num")
	@OpField(desc = "可核销次数", example = "2")
	private Long totalNum;

	@SerializedName("verify_num")
	@OpField(desc = "已核销次数", example = "1")
	private Long verifyNum;

	@SerializedName("available_num")
	@OpField(desc = "剩余可用次数", example = "1")
	private Long availableNum;


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

	
	public void setVerrifyOrderIds(String verrifyOrderIds){
		this.verrifyOrderIds = verrifyOrderIds;
	}

	
	public String getVerrifyOrderIds(){
		return this.verrifyOrderIds;
	}

	
	public void setCertId(String certId){
		this.certId = certId;
	}

	
	public String getCertId(){
		return this.certId;
	}

	
	public void setOutCertId(String outCertId){
		this.outCertId = outCertId;
	}

	
	public String getOutCertId(){
		return this.outCertId;
	}

	
	public void setCertNo(String certNo){
		this.certNo = certNo;
	}

	
	public String getCertNo(){
		return this.certNo;
	}

	
	public void setValidStart(Long validStart){
		this.validStart = validStart;
	}

	
	public Long getValidStart(){
		return this.validStart;
	}

	
	public void setValidEnd(Long validEnd){
		this.validEnd = validEnd;
	}

	
	public Long getValidEnd(){
		return this.validEnd;
	}

	
	public void setGrantTime(Long grantTime){
		this.grantTime = grantTime;
	}

	
	public Long getGrantTime(){
		return this.grantTime;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setTotalNum(Long totalNum){
		this.totalNum = totalNum;
	}

	
	public Long getTotalNum(){
		return this.totalNum;
	}

	
	public void setVerifyNum(Long verifyNum){
		this.verifyNum = verifyNum;
	}

	
	public Long getVerifyNum(){
		return this.verifyNum;
	}

	
	public void setAvailableNum(Long availableNum){
		this.availableNum = availableNum;
	}

	
	public Long getAvailableNum(){
		return this.availableNum;
	}

}