package com.doudian.open.api.afterSale_applyLogisticsIntercept.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class InterceptResultsItem {


	@SerializedName("company_code")
	@OpField(desc = "物流公司编码", example = "powertestexpress")
	private String companyCode;

	@SerializedName("company_name")
	@OpField(desc = "物流公司名称", example = "物流测试快递")
	private String companyName;

	@SerializedName("tracking_no")
	@OpField(desc = "物流单号", example = "3213123123")
	private String trackingNo;

	@SerializedName("value_amount")
	@OpField(desc = "包裹价值（分）", example = "400")
	private Long valueAmount;

	@SerializedName("can_intercept")
	@OpField(desc = "是否可拦截（拦截详情时返回）", example = "false")
	private Boolean canIntercept;

	@SerializedName("is_success")
	@OpField(desc = "是否拦截成功（发起拦截时返回）", example = "false")
	private Boolean isSuccess;

	@SerializedName("unavailable_reason_code")
	@OpField(desc = "不可拦截原因编码", example = "-10006")
	private Long unavailableReasonCode;

	@SerializedName("unavailable_reason")
	@OpField(desc = "不可拦截原因文案", example = "服务器开了小差，请稍后重试")
	private String unavailableReason;

	@SerializedName("intercept_cost")
	@OpField(desc = "拦截费用（分），（拦截详情时返回，不可拦截时无意义）", example = "400")
	private Long interceptCost;

	@SerializedName("cur_product")
	@OpField(desc = "当前售后商品信息", example = "")
	private CurProduct curProduct;

	@SerializedName("other_products")
	@OpField(desc = "其它商品列表", example = "")
	private List<OtherProductsItem> otherProducts;

	@SerializedName("other_product_amount")
	@OpField(desc = "其他商品件数", example = "1")
	private Long otherProductAmount;

	@SerializedName("settlement_mode")
	@OpField(desc = "结算方式 0是线上结算 1是线下结算", example = "0")
	private Integer settlementMode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	
	public String getCompanyName(){
		return this.companyName;
	}

	
	public void setTrackingNo(String trackingNo){
		this.trackingNo = trackingNo;
	}

	
	public String getTrackingNo(){
		return this.trackingNo;
	}

	
	public void setValueAmount(Long valueAmount){
		this.valueAmount = valueAmount;
	}

	
	public Long getValueAmount(){
		return this.valueAmount;
	}

	
	public void setCanIntercept(Boolean canIntercept){
		this.canIntercept = canIntercept;
	}

	
	public Boolean getCanIntercept(){
		return this.canIntercept;
	}

	
	public void setIsSuccess(Boolean isSuccess){
		this.isSuccess = isSuccess;
	}

	
	public Boolean getIsSuccess(){
		return this.isSuccess;
	}

	
	public void setUnavailableReasonCode(Long unavailableReasonCode){
		this.unavailableReasonCode = unavailableReasonCode;
	}

	
	public Long getUnavailableReasonCode(){
		return this.unavailableReasonCode;
	}

	
	public void setUnavailableReason(String unavailableReason){
		this.unavailableReason = unavailableReason;
	}

	
	public String getUnavailableReason(){
		return this.unavailableReason;
	}

	
	public void setInterceptCost(Long interceptCost){
		this.interceptCost = interceptCost;
	}

	
	public Long getInterceptCost(){
		return this.interceptCost;
	}

	
	public void setCurProduct(CurProduct curProduct){
		this.curProduct = curProduct;
	}

	
	public CurProduct getCurProduct(){
		return this.curProduct;
	}

	
	public void setOtherProducts(List<OtherProductsItem> otherProducts){
		this.otherProducts = otherProducts;
	}

	
	public List<OtherProductsItem> getOtherProducts(){
		return this.otherProducts;
	}

	
	public void setOtherProductAmount(Long otherProductAmount){
		this.otherProductAmount = otherProductAmount;
	}

	
	public Long getOtherProductAmount(){
		return this.otherProductAmount;
	}

	
	public void setSettlementMode(Integer settlementMode){
		this.settlementMode = settlementMode;
	}

	
	public Integer getSettlementMode(){
		return this.settlementMode;
	}

}