package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class ReferencePriceRule {


	@SerializedName("is_support")
	@OpField(desc = "true表示可填写参考价，false表示不可填写参考价", example = "true")
	private Boolean isSupport;

	@SerializedName("is_required")
	@OpField(desc = "true表示必填参考价，false表示不必填参考价", example = "true")
	private Boolean isRequired;

	@SerializedName("certificate_types")
	@OpField(desc = "参考价凭证类型枚举值与对应的显示名称，比如{     1 : 厂商建议零售价,     2 : 吊牌价,     3 : 定价,     4 : 官网零售价 }", example = "{     1 : 厂商建议零售价,     2 : 吊牌价,     3 : 定价,     4 : 官网零售价 }")
	private Map<Long,String> certificateTypes;

	@SerializedName("lower_sku_price_times")
	@OpField(desc = "参考价最高高于最低SKU价格的倍数，比如最低SKU价格为1，此值为10，则参考价不可高于10", example = "10")
	private Long lowerSkuPriceTimes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsSupport(Boolean isSupport){
		this.isSupport = isSupport;
	}

	
	public Boolean getIsSupport(){
		return this.isSupport;
	}

	
	public void setIsRequired(Boolean isRequired){
		this.isRequired = isRequired;
	}

	
	public Boolean getIsRequired(){
		return this.isRequired;
	}

	
	public void setCertificateTypes(Map<Long,String> certificateTypes){
		this.certificateTypes = certificateTypes;
	}

	
	public Map<Long,String> getCertificateTypes(){
		return this.certificateTypes;
	}

	
	public void setLowerSkuPriceTimes(Long lowerSkuPriceTimes){
		this.lowerSkuPriceTimes = lowerSkuPriceTimes;
	}

	
	public Long getLowerSkuPriceTimes(){
		return this.lowerSkuPriceTimes;
	}

}