package com.doudian.open.api.order_policy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PolicyInfo {


	@SerializedName("ins_policy_no")
	@OpField(desc = "保单号", example = "10202009171446081711854084111")
	private String insPolicyNo;

	@SerializedName("amount")
	@OpField(desc = "预计退保费用，单位分", example = "1200")
	private Long amount;

	@SerializedName("premium")
	@OpField(desc = "总保费，单位分", example = "60")
	private Long premium;

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
	@OpField(desc = "保单状态 0: 初始化 1: 待生效 2: 保障中 3: 赔付完成 4: 保单失效 5: 已经取消", example = "2")
	private Integer status;

	@SerializedName("claim_status")
	@OpField(desc = "理赔状态 0: 初始化 1: 理赔中 2: 理赔成功 3: 理赔失败  绿植险该字段没用", example = "0")
	private Integer claimStatus;

	@SerializedName("appeal_status")
	@OpField(desc = "申述状态 0: 初始化 1: 申诉处理中 2: 申诉成功 3: 申诉失败  绿植险该字段没用", example = "0")
	private Integer appealStatus;

	@SerializedName("goods_info_list")
	@OpField(desc = "商品列表", example = "")
	private List<GoodsInfoListItem> goodsInfoList;

	@SerializedName("ins_ensured_time_begin")
	@OpField(desc = "出保时间", example = "2020-09-17 14:48:08")
	private String insEnsuredTimeBegin;

	@SerializedName("ins_ensured_time_end")
	@OpField(desc = "保险过期时间", example = "2020-12-16 14:48:08")
	private String insEnsuredTimeEnd;

	@SerializedName("is_allow_appeal")
	@OpField(desc = "只有在保单状态为赔付失败的时候并允许申诉 true，其他情况 false", example = "false")
	private Boolean isAllowAppeal;

	@SerializedName("refused_msg")
	@OpField(desc = "理赔或申述失败原因", example = "失败原因")
	private String refusedMsg;

	@SerializedName("ins_hotline")
	@OpField(desc = "保险客服电话", example = "400-188-1949转1")
	private String insHotline;

	@SerializedName("payer_type")
	@OpField(desc = "投保人  2:商家  3:平台", example = "2")
	private Integer payerType;


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

	
	public void setAmount(Long amount){
		this.amount = amount;
	}

	
	public Long getAmount(){
		return this.amount;
	}

	
	public void setPremium(Long premium){
		this.premium = premium;
	}

	
	public Long getPremium(){
		return this.premium;
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

	
	public void setClaimStatus(Integer claimStatus){
		this.claimStatus = claimStatus;
	}

	
	public Integer getClaimStatus(){
		return this.claimStatus;
	}

	
	public void setAppealStatus(Integer appealStatus){
		this.appealStatus = appealStatus;
	}

	
	public Integer getAppealStatus(){
		return this.appealStatus;
	}

	
	public void setGoodsInfoList(List<GoodsInfoListItem> goodsInfoList){
		this.goodsInfoList = goodsInfoList;
	}

	
	public List<GoodsInfoListItem> getGoodsInfoList(){
		return this.goodsInfoList;
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

	
	public void setIsAllowAppeal(Boolean isAllowAppeal){
		this.isAllowAppeal = isAllowAppeal;
	}

	
	public Boolean getIsAllowAppeal(){
		return this.isAllowAppeal;
	}

	
	public void setRefusedMsg(String refusedMsg){
		this.refusedMsg = refusedMsg;
	}

	
	public String getRefusedMsg(){
		return this.refusedMsg;
	}

	
	public void setInsHotline(String insHotline){
		this.insHotline = insHotline;
	}

	
	public String getInsHotline(){
		return this.insHotline;
	}

	
	public void setPayerType(Integer payerType){
		this.payerType = payerType;
	}

	
	public Integer getPayerType(){
		return this.payerType;
	}

}