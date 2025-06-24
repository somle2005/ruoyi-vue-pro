package com.doudian.open.api.order_insurance.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PolicyInfoListItem {


	@SerializedName("ins_policy_no")
	@OpField(desc = "保单号", example = "10202009171446081711854084111")
	private String insPolicyNo;

	@SerializedName("approximate_return_fee")
	@OpField(desc = "预计退保费用，单位分", example = "1200")
	private Long approximateReturnFee;

	@SerializedName("total_premium")
	@OpField(desc = "总保费，单位分", example = "60")
	private Long totalPremium;

	@SerializedName("user_premium")
	@OpField(desc = "用户支付的保费，单位分", example = "0")
	private Long userPremium;

	@SerializedName("merchant_premium")
	@OpField(desc = "商家支付的保费，单位分", example = "60")
	private Long merchantPremium;

	@SerializedName("platform_premium")
	@OpField(desc = "平台承担的保费，单位分", example = "0")
	private Long platformPremium;

	@SerializedName("status")
	@OpField(desc = "保单状态 0: 初始化 1: 待生效 2: 保障中 3: 赔付完成 4: 保单失效 5: 已经取消 31:理赔成功待赔付", example = "2")
	private Integer status;

	@SerializedName("appeal_status")
	@OpField(desc = "申述状态 0: 初始化 1: 申诉处理中 2: 申诉成功 3: 申诉失败", example = "0")
	private Integer appealStatus;

	@SerializedName("claim_status")
	@OpField(desc = "理赔状态 0: 初始化 1: 理赔中 2: 理赔成功 3: 理赔失败", example = "0")
	private Integer claimStatus;

	@SerializedName("company_name")
	@OpField(desc = "保险公司名称", example = "中国人民财产保险股份有限公司")
	private String companyName;

	@SerializedName("is_allow_appeal")
	@OpField(desc = "只有在保单状态为赔付失败的时候并允许申诉 true，其他情况 false", example = "false")
	private Boolean isAllowAppeal;

	@SerializedName("goods_info_list")
	@OpField(desc = "商品列表", example = "")
	private List<GoodsInfoListItem> goodsInfoList;

	@SerializedName("fail_reason")
	@OpField(desc = "理赔或申述失败原因", example = "失败原因")
	private String failReason;

	@SerializedName("insurance_hotline")
	@OpField(desc = "保险客服电话", example = "400-188-1949转1")
	private String insuranceHotline;

	@SerializedName("premium_status")
	@OpField(desc = "保费状态 1：待扣减 2：已扣减 3：已退还 4：已垫付 5：已关闭", example = "2")
	private Integer premiumStatus;

	@SerializedName("ins_ensured_time_begin")
	@OpField(desc = "出保时间，status<=1&status=5的情况下ins_ensured_time_begin、ins_ensured_time_end没有意义（返回的是默认时间1754-08-31 06:49:25）忽略即可，status其他情况下都会返回正确的时间。", example = "2020-09-17 14:48:08")
	private String insEnsuredTimeBegin;

	@SerializedName("ins_ensured_time_end")
	@OpField(desc = "保险过期时间，status<=1&status=5的情况下ins_ensured_time_begin、ins_ensured_time_end没有意义（返回的是默认时间1754-08-31 06:49:25）忽略即可，status其他情况下都会返回正确的时间。", example = "2020-12-16 14:48:08")
	private String insEnsuredTimeEnd;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setInsPolicyNo(String insPolicyNo){
		this.insPolicyNo = insPolicyNo;
	}

	
	public String getInsPolicyNo(){
		return this.insPolicyNo;
	}

	
	public void setApproximateReturnFee(Long approximateReturnFee){
		this.approximateReturnFee = approximateReturnFee;
	}

	
	public Long getApproximateReturnFee(){
		return this.approximateReturnFee;
	}

	
	public void setTotalPremium(Long totalPremium){
		this.totalPremium = totalPremium;
	}

	
	public Long getTotalPremium(){
		return this.totalPremium;
	}

	
	public void setUserPremium(Long userPremium){
		this.userPremium = userPremium;
	}

	
	public Long getUserPremium(){
		return this.userPremium;
	}

	
	public void setMerchantPremium(Long merchantPremium){
		this.merchantPremium = merchantPremium;
	}

	
	public Long getMerchantPremium(){
		return this.merchantPremium;
	}

	
	public void setPlatformPremium(Long platformPremium){
		this.platformPremium = platformPremium;
	}

	
	public Long getPlatformPremium(){
		return this.platformPremium;
	}

	
	public void setStatus(Integer status){
		this.status = status;
	}

	
	public Integer getStatus(){
		return this.status;
	}

	
	public void setAppealStatus(Integer appealStatus){
		this.appealStatus = appealStatus;
	}

	
	public Integer getAppealStatus(){
		return this.appealStatus;
	}

	
	public void setClaimStatus(Integer claimStatus){
		this.claimStatus = claimStatus;
	}

	
	public Integer getClaimStatus(){
		return this.claimStatus;
	}

	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	
	public String getCompanyName(){
		return this.companyName;
	}

	
	public void setIsAllowAppeal(Boolean isAllowAppeal){
		this.isAllowAppeal = isAllowAppeal;
	}

	
	public Boolean getIsAllowAppeal(){
		return this.isAllowAppeal;
	}

	
	public void setGoodsInfoList(List<GoodsInfoListItem> goodsInfoList){
		this.goodsInfoList = goodsInfoList;
	}

	
	public List<GoodsInfoListItem> getGoodsInfoList(){
		return this.goodsInfoList;
	}

	
	public void setFailReason(String failReason){
		this.failReason = failReason;
	}

	
	public String getFailReason(){
		return this.failReason;
	}

	
	public void setInsuranceHotline(String insuranceHotline){
		this.insuranceHotline = insuranceHotline;
	}

	
	public String getInsuranceHotline(){
		return this.insuranceHotline;
	}

	
	public void setPremiumStatus(Integer premiumStatus){
		this.premiumStatus = premiumStatus;
	}

	
	public Integer getPremiumStatus(){
		return this.premiumStatus;
	}

	
	public void setInsEnsuredTimeBegin(String insEnsuredTimeBegin){
		this.insEnsuredTimeBegin = insEnsuredTimeBegin;
	}

	
	public String getInsEnsuredTimeBegin(){
		return this.insEnsuredTimeBegin;
	}

	
	public void setInsEnsuredTimeEnd(String insEnsuredTimeEnd){
		this.insEnsuredTimeEnd = insEnsuredTimeEnd;
	}

	
	public String getInsEnsuredTimeEnd(){
		return this.insEnsuredTimeEnd;
	}

}