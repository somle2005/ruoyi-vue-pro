package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DataItem {


	@SerializedName("product_property")
	@OpField(desc = "商品类目属性信息", example = "")
	private List<ProductPropertyItem> productProperty;

	@SerializedName("freight_id")
	@OpField(desc = "运费模版", example = "0")
	private Long freightId;

	@SerializedName("is_second_hand_digital")
	@OpField(desc = "是否二手数码(成色机)", example = "false")
	private Boolean isSecondHandDigital;

	@SerializedName("need_check_out")
	@OpField(desc = "是否需要核销", example = "false")
	private Boolean needCheckOut;

	@SerializedName("audit_reject_suggestion")
	@OpField(desc = "驳回修改建议", example = "")
	private AuditRejectSuggestion auditRejectSuggestion;

	@SerializedName("have_audit_reject_suggest")
	@OpField(desc = "是否有驳回修改建议", example = "是否有驳回修改建议")
	private Boolean haveAuditRejectSuggest;

	@SerializedName("rectify_info_list")
	@OpField(desc = "自动整改信息", example = "")
	private List<RectifyInfoListItem> rectifyInfoList;

	@SerializedName("spec_prices")
	@OpField(desc = "sku信息", example = "")
	private List<SpecPricesItem> specPrices;

	@SerializedName("name_suffix")
	@OpField(desc = "标题后缀", example = "略")
	private String nameSuffix;

	@SerializedName("name_prefix")
	@OpField(desc = "标题前缀", example = "略")
	private String namePrefix;

	@SerializedName("title_limit")
	@OpField(desc = "标题长度限制，长度计算逻辑：汉字算两个字符，汉字以外的其他字符都算一个字符。", example = "")
	private TitleLimit titleLimit;

	@SerializedName("sell_num")
	@OpField(desc = "销量", example = "999")
	private Long sellNum;

	@SerializedName("can_not_combine_reason")
	@OpField(desc = "不可搭配的原因，可搭配时为空", example = "已参加搭配")
	private String canNotCombineReason;

	@SerializedName("can_combine")
	@OpField(desc = "是否可搭配，只有入参传入can_combine为true才有值", example = "false")
	private Boolean canCombine;

	@SerializedName("shop_category")
	@OpField(desc = "店铺装修分类", example = "")
	private ShopCategory shopCategory;

	@SerializedName("product_id")
	@OpField(desc = "商品ID，抖店系统生成，店铺下唯一", example = "3472490447010721067")
	private Long productId;

	@SerializedName("status")
	@OpField(desc = "商品在店铺中状态: 0-在线；1-下线；2-删除；详见商品状态机：https://op.jinritemai.com/docs/question-docs/92/2070", example = "0")
	private Long status;

	@SerializedName("check_status")
	@OpField(desc = "商品审核状态: 1-未提交；2-待审核；3-审核通过；4-审核未通过；5-封禁；7-审核通过待上架；详见商品状态机：https://op.jinritemai.com/docs/question-docs/92/2070", example = "2")
	private Long checkStatus;

	@SerializedName("market_price")
	@OpField(desc = "【已废弃】划线价，单位分", example = "200")
	private Long marketPrice;

	@SerializedName("discount_price")
	@OpField(desc = "【已废弃】售价，单位分", example = "100")
	private Long discountPrice;

	@SerializedName("img")
	@OpField(desc = "商品图片url，返回商品主图的第一张图 (主要用来辅助页面展示)", example = "https://p3-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153427046487984750183_661ff1f563801d97f382e0ac114a09e6_sx_805824_www933-933")
	private String img;

	@SerializedName("name")
	@OpField(desc = "商品标题。 标题不规范会引起商品下架，影响您的正常销售，详见商品发布规范：https://school.jinritemai.com/doudian/web/article/101800?from=shop_article", example = "夏季男生白色短袖")
	private String name;

	@SerializedName("pay_type")
	@OpField(desc = "【已废弃】支持的支付方式：0货到付款 1在线支付 2两者都支持", example = "1")
	private Long payType;

	@SerializedName("product_type")
	@OpField(desc = "商品类型；0-普通；1-新客商品；3-虚拟；6-玉石闪购；7-云闪购 ；127-其他类型；", example = "0")
	private Long productType;

	@SerializedName("spec_id")
	@OpField(desc = "商品规格，新增商品是全局唯一，注意：有部分历史存量商品可能存在规格复用", example = "1737144307943485")
	private Long specId;

	@SerializedName("cos_ratio")
	@OpField(desc = "【已废弃】佣金比例", example = "0")
	private Long cosRatio;

	@SerializedName("create_time")
	@OpField(desc = "商品创建时间，unix时间戳，单位：秒；", example = "1619160933")
	private Long createTime;

	@SerializedName("update_time")
	@OpField(desc = "商品更新时间，unix时间戳，单位：秒；", example = "1619161933")
	private Long updateTime;

	@SerializedName("out_product_id")
	@OpField(desc = "【即将废弃】外部商家编码，商家自定义字段。推荐使用，outer_product_id字段", example = "1617004369")
	private Long outProductId;

	@SerializedName("description")
	@OpField(desc = "商品详情，最大支持50张图片，单张详情图宽高比不超2000*2000px，大小5M内，仅支持jpg/jpeg/png格式；注意：商品详情不规范，会引起商品下架，影响您的正常销售：https://school.jinritemai.com/doudian/web/article/101800?from=shop_article", example = "<p><img src=https://p3-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153427046487984750183_661ff1f563801d97f382e0ac114a09e6_sx_805824_www933-933 style=max-width:100%;/><img src=https://p3-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153426724709337920183_dd825b6f3c1bc43ec26faea488447709_sx_1059417_www1080-933 style=max-width:100%;/><img src=https://p3-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153465487927217040183_d963cc36ef6e66c0cba70e4cb2188f88_sx_436442_www1920-1080 style=max-width:100%;/></p>")
	private String description;

	@SerializedName("mobile")
	@OpField(desc = "【已废弃】手机号", example = "022234455561233")
	private String mobile;

	@SerializedName("extra")
	@OpField(desc = "额外信息，如资质", example = "{category_detail:{first_cid:20117,second_cid:22139,third_cid:28901,fourth_cid:31800,first_cname:本地生活服务,second_cname:餐饮美食卡券,third_cname:甜品/冰淇淋/咖啡/冷饮,fourth_cname:咖啡,is_leaf:true},class_quality:,is_publish:1,quality_opId:7132044312682119463,quality_report:}")
	private String extra;

	@SerializedName("recommend_remark")
	@OpField(desc = "【已废弃】商家推荐语", example = "【已废弃】")
	private String recommendRemark;

	@SerializedName("category_detail")
	@OpField(desc = "类目详情；商品类目id可使用【/shop/getShopCategory】查询", example = "")
	private CategoryDetail categoryDetail;

	@SerializedName("outer_product_id")
	@OpField(desc = "外部商家编码，商家自定义字段，支持最多 255个字符", example = "dy001")
	private String outerProductId;

	@SerializedName("is_package_product")
	@OpField(desc = "是否是组合商品，true-是，false-不是；", example = "true")
	private Boolean isPackageProduct;

	@SerializedName("package_product_list")
	@OpField(desc = "商品关联的组合主商品ID；当is_package_product=true，返回的是组套商品的product_id； 当is_package_product=false，返回当前商品的product_id；补充返回规则：参与的组套商品，下线会展示，目前组合商品支持下线的商品作为子品进行组套，删除会展示，但重新上架组套商品时，会被从列表中删除。", example = "[3472490447010721067]")
	private List<Long> packageProductList;

	@SerializedName("sub_product_list")
	@OpField(desc = "当is_package_product=true，返回的是组套商品的子品product_id； 当is_package_product=false，不返回；补充返回规则：参与的组套商品product_id，下线会展示，目前组合商品支持下线的商品作为子品进行组套，删除会展示，但重新上架组套商品时，会被从列表中删除。", example = "[3472490447010721067]")
	private List<Long> subProductList;

	@SerializedName("channel_main_product")
	@OpField(desc = "小时达子品绑定的主品信息", example = "")
	private ChannelMainProduct channelMainProduct;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductProperty(List<ProductPropertyItem> productProperty){
		this.productProperty = productProperty;
	}

	
	public List<ProductPropertyItem> getProductProperty(){
		return this.productProperty;
	}

	
	public void setFreightId(Long freightId){
		this.freightId = freightId;
	}

	
	public Long getFreightId(){
		return this.freightId;
	}

	
	public void setIsSecondHandDigital(Boolean isSecondHandDigital){
		this.isSecondHandDigital = isSecondHandDigital;
	}

	
	public Boolean getIsSecondHandDigital(){
		return this.isSecondHandDigital;
	}

	
	public void setNeedCheckOut(Boolean needCheckOut){
		this.needCheckOut = needCheckOut;
	}

	
	public Boolean getNeedCheckOut(){
		return this.needCheckOut;
	}

	
	public void setAuditRejectSuggestion(AuditRejectSuggestion auditRejectSuggestion){
		this.auditRejectSuggestion = auditRejectSuggestion;
	}

	
	public AuditRejectSuggestion getAuditRejectSuggestion(){
		return this.auditRejectSuggestion;
	}

	
	public void setHaveAuditRejectSuggest(Boolean haveAuditRejectSuggest){
		this.haveAuditRejectSuggest = haveAuditRejectSuggest;
	}

	
	public Boolean getHaveAuditRejectSuggest(){
		return this.haveAuditRejectSuggest;
	}

	
	public void setRectifyInfoList(List<RectifyInfoListItem> rectifyInfoList){
		this.rectifyInfoList = rectifyInfoList;
	}

	
	public List<RectifyInfoListItem> getRectifyInfoList(){
		return this.rectifyInfoList;
	}

	
	public void setSpecPrices(List<SpecPricesItem> specPrices){
		this.specPrices = specPrices;
	}

	
	public List<SpecPricesItem> getSpecPrices(){
		return this.specPrices;
	}

	
	public void setNameSuffix(String nameSuffix){
		this.nameSuffix = nameSuffix;
	}

	
	public String getNameSuffix(){
		return this.nameSuffix;
	}

	
	public void setNamePrefix(String namePrefix){
		this.namePrefix = namePrefix;
	}

	
	public String getNamePrefix(){
		return this.namePrefix;
	}

	
	public void setTitleLimit(TitleLimit titleLimit){
		this.titleLimit = titleLimit;
	}

	
	public TitleLimit getTitleLimit(){
		return this.titleLimit;
	}

	
	public void setSellNum(Long sellNum){
		this.sellNum = sellNum;
	}

	
	public Long getSellNum(){
		return this.sellNum;
	}

	
	public void setCanNotCombineReason(String canNotCombineReason){
		this.canNotCombineReason = canNotCombineReason;
	}

	
	public String getCanNotCombineReason(){
		return this.canNotCombineReason;
	}

	
	public void setCanCombine(Boolean canCombine){
		this.canCombine = canCombine;
	}

	
	public Boolean getCanCombine(){
		return this.canCombine;
	}

	
	public void setShopCategory(ShopCategory shopCategory){
		this.shopCategory = shopCategory;
	}

	
	public ShopCategory getShopCategory(){
		return this.shopCategory;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setCheckStatus(Long checkStatus){
		this.checkStatus = checkStatus;
	}

	
	public Long getCheckStatus(){
		return this.checkStatus;
	}

	
	public void setMarketPrice(Long marketPrice){
		this.marketPrice = marketPrice;
	}

	
	public Long getMarketPrice(){
		return this.marketPrice;
	}

	
	public void setDiscountPrice(Long discountPrice){
		this.discountPrice = discountPrice;
	}

	
	public Long getDiscountPrice(){
		return this.discountPrice;
	}

	
	public void setImg(String img){
		this.img = img;
	}

	
	public String getImg(){
		return this.img;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setPayType(Long payType){
		this.payType = payType;
	}

	
	public Long getPayType(){
		return this.payType;
	}

	
	public void setProductType(Long productType){
		this.productType = productType;
	}

	
	public Long getProductType(){
		return this.productType;
	}

	
	public void setSpecId(Long specId){
		this.specId = specId;
	}

	
	public Long getSpecId(){
		return this.specId;
	}

	
	public void setCosRatio(Long cosRatio){
		this.cosRatio = cosRatio;
	}

	
	public Long getCosRatio(){
		return this.cosRatio;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setOutProductId(Long outProductId){
		this.outProductId = outProductId;
	}

	
	public Long getOutProductId(){
		return this.outProductId;
	}

	
	public void setDescription(String description){
		this.description = description;
	}

	
	public String getDescription(){
		return this.description;
	}

	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	
	public String getMobile(){
		return this.mobile;
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

	
	public void setRecommendRemark(String recommendRemark){
		this.recommendRemark = recommendRemark;
	}

	
	public String getRecommendRemark(){
		return this.recommendRemark;
	}

	
	public void setCategoryDetail(CategoryDetail categoryDetail){
		this.categoryDetail = categoryDetail;
	}

	
	public CategoryDetail getCategoryDetail(){
		return this.categoryDetail;
	}

	
	public void setOuterProductId(String outerProductId){
		this.outerProductId = outerProductId;
	}

	
	public String getOuterProductId(){
		return this.outerProductId;
	}

	
	public void setIsPackageProduct(Boolean isPackageProduct){
		this.isPackageProduct = isPackageProduct;
	}

	
	public Boolean getIsPackageProduct(){
		return this.isPackageProduct;
	}

	
	public void setPackageProductList(List<Long> packageProductList){
		this.packageProductList = packageProductList;
	}

	
	public List<Long> getPackageProductList(){
		return this.packageProductList;
	}

	
	public void setSubProductList(List<Long> subProductList){
		this.subProductList = subProductList;
	}

	
	public List<Long> getSubProductList(){
		return this.subProductList;
	}

	
	public void setChannelMainProduct(ChannelMainProduct channelMainProduct){
		this.channelMainProduct = channelMainProduct;
	}

	
	public ChannelMainProduct getChannelMainProduct(){
		return this.channelMainProduct;
	}

}