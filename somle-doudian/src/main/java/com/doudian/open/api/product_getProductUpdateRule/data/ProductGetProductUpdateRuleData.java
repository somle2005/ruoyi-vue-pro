package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetProductUpdateRuleData {


	@SerializedName("fulfillment_rule")
	@OpField(desc = "履约规则", example = "")
	private FulfillmentRule fulfillmentRule;

	@SerializedName("recommend_name_rule")
	@OpField(desc = "商品标题推荐规则", example = "")
	private RecommendNameRule recommendNameRule;

	@SerializedName("after_sale_rule")
	@OpField(desc = "售后服务规则", example = "")
	private AfterSaleRule afterSaleRule;

	@SerializedName("reference_price_rule")
	@OpField(desc = "参考价相关规则", example = "")
	private ReferencePriceRule referencePriceRule;

	@SerializedName("spu_control_rule")
	@OpField(desc = "spu管控规则", example = "")
	private SpuControlRule spuControlRule;

	@SerializedName("product_spec_rule")
	@OpField(desc = "商品规格约束", example = "")
	private ProductSpecRule productSpecRule;

	@SerializedName("component_template_rule")
	@OpField(desc = "商品尺码模板配置规则", example = "")
	private ComponentTemplateRule componentTemplateRule;

	@SerializedName("main_image_three_to_four_rule")
	@OpField(desc = "商品主图3:4配置规则", example = "")
	private MainImageThreeToFourRule mainImageThreeToFourRule;

	@SerializedName("gold_price_rule")
	@OpField(desc = "金价信息，计价金类目下sku价格可以按照公式进行计算（价格=克重*每克价格+加工费），本字段提供相关信息", example = "")
	private GoldPriceRule goldPriceRule;

	@SerializedName("extra_rule")
	@OpField(desc = "其他规则", example = "")
	private ExtraRule extraRule;

	@SerializedName("trade_rule")
	@OpField(desc = "交易相关的规则", example = "")
	private TradeRule tradeRule;

	@SerializedName("sku_rule")
	@OpField(desc = "sku规则", example = "")
	private SkuRule skuRule;

	@SerializedName("qualification_rule")
	@OpField(desc = "资质规则，类目属性影响资质必填和资质属性必填", example = "")
	private List<QualificationRuleItem> qualificationRule;

	@SerializedName("pick_up_method_rule")
	@OpField(desc = "提取方式规则", example = "")
	private PickUpMethodRule pickUpMethodRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFulfillmentRule(FulfillmentRule fulfillmentRule){
		this.fulfillmentRule = fulfillmentRule;
	}

	
	public FulfillmentRule getFulfillmentRule(){
		return this.fulfillmentRule;
	}

	
	public void setRecommendNameRule(RecommendNameRule recommendNameRule){
		this.recommendNameRule = recommendNameRule;
	}

	
	public RecommendNameRule getRecommendNameRule(){
		return this.recommendNameRule;
	}

	
	public void setAfterSaleRule(AfterSaleRule afterSaleRule){
		this.afterSaleRule = afterSaleRule;
	}

	
	public AfterSaleRule getAfterSaleRule(){
		return this.afterSaleRule;
	}

	
	public void setReferencePriceRule(ReferencePriceRule referencePriceRule){
		this.referencePriceRule = referencePriceRule;
	}

	
	public ReferencePriceRule getReferencePriceRule(){
		return this.referencePriceRule;
	}

	
	public void setSpuControlRule(SpuControlRule spuControlRule){
		this.spuControlRule = spuControlRule;
	}

	
	public SpuControlRule getSpuControlRule(){
		return this.spuControlRule;
	}

	
	public void setProductSpecRule(ProductSpecRule productSpecRule){
		this.productSpecRule = productSpecRule;
	}

	
	public ProductSpecRule getProductSpecRule(){
		return this.productSpecRule;
	}

	
	public void setComponentTemplateRule(ComponentTemplateRule componentTemplateRule){
		this.componentTemplateRule = componentTemplateRule;
	}

	
	public ComponentTemplateRule getComponentTemplateRule(){
		return this.componentTemplateRule;
	}

	
	public void setMainImageThreeToFourRule(MainImageThreeToFourRule mainImageThreeToFourRule){
		this.mainImageThreeToFourRule = mainImageThreeToFourRule;
	}

	
	public MainImageThreeToFourRule getMainImageThreeToFourRule(){
		return this.mainImageThreeToFourRule;
	}

	
	public void setGoldPriceRule(GoldPriceRule goldPriceRule){
		this.goldPriceRule = goldPriceRule;
	}

	
	public GoldPriceRule getGoldPriceRule(){
		return this.goldPriceRule;
	}

	
	public void setExtraRule(ExtraRule extraRule){
		this.extraRule = extraRule;
	}

	
	public ExtraRule getExtraRule(){
		return this.extraRule;
	}

	
	public void setTradeRule(TradeRule tradeRule){
		this.tradeRule = tradeRule;
	}

	
	public TradeRule getTradeRule(){
		return this.tradeRule;
	}

	
	public void setSkuRule(SkuRule skuRule){
		this.skuRule = skuRule;
	}

	
	public SkuRule getSkuRule(){
		return this.skuRule;
	}

	
	public void setQualificationRule(List<QualificationRuleItem> qualificationRule){
		this.qualificationRule = qualificationRule;
	}

	
	public List<QualificationRuleItem> getQualificationRule(){
		return this.qualificationRule;
	}

	
	public void setPickUpMethodRule(PickUpMethodRule pickUpMethodRule){
		this.pickUpMethodRule = pickUpMethodRule;
	}

	
	public PickUpMethodRule getPickUpMethodRule(){
		return this.pickUpMethodRule;
	}

}