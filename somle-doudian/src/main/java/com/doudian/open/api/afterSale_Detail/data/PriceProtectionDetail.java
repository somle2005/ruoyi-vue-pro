package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PriceProtectionDetail {


	@SerializedName("title")
	@OpField(desc = "价保文案标题", example = "大促价保计算明细")
	private String title;

	@SerializedName("price_protection_formulas")
	@OpField(desc = "价保计算公式", example = "实退差价=原订单商品总价（非实付价）-当前商品预计总价-已退差价-支付优惠回收金额")
	private String priceProtectionFormulas;

	@SerializedName("standard_price")
	@OpField(desc = "基准价", example = "")
	private StandardPrice standardPrice;

	@SerializedName("check_price")
	@OpField(desc = "核准价", example = "")
	private CheckPrice checkPrice;

	@SerializedName("refund_detail")
	@OpField(desc = "退款明细", example = "")
	private RefundDetail refundDetail;

	@SerializedName("refund_bearer_list")
	@OpField(desc = "钱款承担方", example = "")
	private List<RefundBearerListItem> refundBearerList;

	@SerializedName("platform_to_merchant_refund_status")
	@OpField(desc = "平台价保补贴商家金额进度状态，1表示成功", example = "1")
	private Long platformToMerchantRefundStatus;

	@SerializedName("platform_recycle_amount")
	@OpField(desc = "平台价保回收金额", example = "123")
	private Long platformRecycleAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTitle(String title){
		this.title = title;
	}

	
	public String getTitle(){
		return this.title;
	}

	
	public void setPriceProtectionFormulas(String priceProtectionFormulas){
		this.priceProtectionFormulas = priceProtectionFormulas;
	}

	
	public String getPriceProtectionFormulas(){
		return this.priceProtectionFormulas;
	}

	
	public void setStandardPrice(StandardPrice standardPrice){
		this.standardPrice = standardPrice;
	}

	
	public StandardPrice getStandardPrice(){
		return this.standardPrice;
	}

	
	public void setCheckPrice(CheckPrice checkPrice){
		this.checkPrice = checkPrice;
	}

	
	public CheckPrice getCheckPrice(){
		return this.checkPrice;
	}

	
	public void setRefundDetail(RefundDetail refundDetail){
		this.refundDetail = refundDetail;
	}

	
	public RefundDetail getRefundDetail(){
		return this.refundDetail;
	}

	
	public void setRefundBearerList(List<RefundBearerListItem> refundBearerList){
		this.refundBearerList = refundBearerList;
	}

	
	public List<RefundBearerListItem> getRefundBearerList(){
		return this.refundBearerList;
	}

	
	public void setPlatformToMerchantRefundStatus(Long platformToMerchantRefundStatus){
		this.platformToMerchantRefundStatus = platformToMerchantRefundStatus;
	}

	
	public Long getPlatformToMerchantRefundStatus(){
		return this.platformToMerchantRefundStatus;
	}

	
	public void setPlatformRecycleAmount(Long platformRecycleAmount){
		this.platformRecycleAmount = platformRecycleAmount;
	}

	
	public Long getPlatformRecycleAmount(){
		return this.platformRecycleAmount;
	}

}