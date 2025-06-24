package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductDetailData {


	@SerializedName("product_id")
	@OpField(desc = "商品ID，抖店系统生成，店铺下唯一；长度19位。", example = "3539925204033339668")
	private Long productId;

	@SerializedName("product_id_str")
	@OpField(desc = "商品ID（字符串类型），抖店系统生成，店铺下唯一；长度19位。", example = "3539925204033339668")
	private String productIdStr;

	@SerializedName("out_product_id")
	@OpField(desc = "【即将废弃】外部商家编码，商家自定义字段。推荐使用，outer_product_id字段", example = "133321")
	private Long outProductId;

	@SerializedName("outer_product_id")
	@OpField(desc = "外部商家编码，商家自定义字段，支持最多 255个字符", example = "dy001")
	private String outerProductId;

	@SerializedName("open_user_id")
	@OpField(desc = "【已废弃】open应用id", example = "")
	private Long openUserId;

	@SerializedName("name")
	@OpField(desc = "商品标题，规则：至少输入8个字（16个字符）以上~输入30个字（60个字符）以内。；标题不规范会引起商品下架，影响您的正常销售，详见商品发布规范：https://school.jinritemai.com/doudian/web/article/101800?from=shop_article", example = "夏季男生白色短袖")
	private String name;

	@SerializedName("description")
	@OpField(desc = "商品详情，最大支持50张图片，单张详情图宽高比不超2000*2000px，大小5M内，仅支持jpg/jpeg/png格式，返回HTML格式；注意：商品详情不规范，会引起商品下架，影响您的正常销售：https://school.jinritemai.com/doudian/web/article/101800?from=shop_article", example = "<p><img src=https://p3-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153427046487984750183_661ff1f563801d97f382e0ac114a09e6_sx_805824_www933-933 style=max-width:100%;/><img src=https://p3-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153426724709337920183_dd825b6f3c1bc43ec26faea488447709_sx_1059417_www1080-933 style=max-width:100%;/><img src=https://p3-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153465487927217040183_d963cc36ef6e66c0cba70e4cb2188f88_sx_436442_www1920-1080 style=max-width:100%;/></p>")
	private String description;

	@SerializedName("delivery_method")
	@OpField(desc = "承诺发货时间，单位是天; 不传则默认为2天，当presell_type为0或2均只支持传入2；当presell_type为1时支持可选值为: 2、3、5、7、10、15；", example = "7")
	private Integer deliveryMethod;

	@SerializedName("cdf_category")
	@OpField(desc = "海南免税，海关限购分类编码，仅海淘商品有值返回。", example = "")
	private String cdfCategory;

	@SerializedName("status")
	@OpField(desc = "商品在店铺中状态: 0-在线；1-下线；2-删除；详见商品状态机：https://op.jinritemai.com/docs/question-docs/92/2070", example = "1")
	private Long status;

	@SerializedName("spec_id")
	@OpField(desc = "商品规格，新增商品是全局唯一，注意：有部分历史存量商品可能存在规格复用", example = "1737144307943485")
	private Long specId;

	@SerializedName("check_status")
	@OpField(desc = "商品审核状态: 1-未提交；2-待审核；3-审核通过；4-审核未通过；5-封禁；7-审核通过待上架；详见商品状态机：https://op.jinritemai.com/docs/question-docs/92/2070", example = "1")
	private Long checkStatus;

	@SerializedName("mobile")
	@OpField(desc = "【已废弃】手机号", example = "15677775555")
	private String mobile;

	@SerializedName("brand_id")
	@OpField(desc = "【已废弃】品牌id，推荐使用standard_brand_id字段，通过【/brand/list】获取，无品牌id商品返回默认值：596120136；", example = "596120136")
	private Long brandId;

	@SerializedName("is_sub_product")
	@OpField(desc = "是否是组合商品的子商品；true-是，false-不是；", example = "true")
	private Boolean isSubProduct;

	@SerializedName("draft_status")
	@OpField(desc = "草稿状态；0-无草稿,1-未提审,2-待审核,3-审核通过,4-审核未通过。详见：https://op.jinritemai.com/docs/question-docs/92/2070", example = "2")
	private Long draftStatus;

	@SerializedName("category_detail")
	@OpField(desc = "类目详情；商品类目id可使用【/shop/getShopCategory】查询", example = "")
	private CategoryDetail categoryDetail;

	@SerializedName("pay_type")
	@OpField(desc = "【已废弃】支持的支付方式：0货到付款 1在线支付 2两者都支持", example = "1")
	private Long payType;

	@SerializedName("recommend_remark")
	@OpField(desc = "【已废弃】商家推荐语", example = "真的很好啊")
	private String recommendRemark;

	@SerializedName("extra")
	@OpField(desc = "额外信息，如资质", example = "{category_detail:{first_cid:20117,second_cid:22139,third_cid:28901,fourth_cid:31800,first_cname:本地生活服务,second_cname:餐饮美食卡券,third_cname:甜品/冰淇淋/咖啡/冷饮,fourth_cname:咖啡,is_leaf:true},class_quality:,is_publish:1,quality_opId:7132044312682119463,quality_report:}")
	private String extra;

	@SerializedName("is_create")
	@OpField(desc = "【已废弃】无业务意义", example = "【已废弃】")
	private Long isCreate;

	@SerializedName("create_time")
	@OpField(desc = "商品创建时间，时间格式：yyyy-mm-dd hh:mm:ss", example = "2022-07-04 13:29:47")
	private String createTime;

	@SerializedName("update_time")
	@OpField(desc = "商品更新时间，时间格式：yyyy-mm-dd hh:mm:ss", example = "2022-07-08T16:29:01+08:00")
	private String updateTime;

	@SerializedName("pic")
	@OpField(desc = "商品主图；最多支持5张图片；仅支持png，jpg，jpeg格式，宽高比例为1:1（至少600*600px），大小5M内", example = "[https://p9-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153427046487984750183_661ff1f563801d97f382e0ac114a09e6_sx_805824_www933-933,     https://p6-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153429136760998540183_e3d0578bd8b499ff9dee11a0fd040070_sx_889253_www3072-3072,     https://p9-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153465665006472060183_1d037ea9f83818829d3a502df6135ae4_sx_280269_www1080-1080]")
	private List<String> pic;

	@SerializedName("product_format")
	@OpField(desc = "【即将废弃】推荐使用product_format_new；属性名称|属性值 之间用|分隔, 多组之间用^分开", example = "{货号:8888}")
	private String productFormat;

	@SerializedName("spec_pics")
	@OpField(desc = "规格图片", example = "")
	private List<SpecPicsItem> specPics;

	@SerializedName("spec_prices")
	@OpField(desc = "商品sku详情", example = "")
	private List<SpecPricesItem> specPrices;

	@SerializedName("specs")
	@OpField(desc = "规格信息，规格项和规格值", example = "")
	private List<SpecsItem> specs;

	@SerializedName("img")
	@OpField(desc = "头图，主图第一张", example = "https://p9-aio.ecombdimg.com/obj/ecom-shop-material/v1_xPfNJOkX_71153427046487984750183_661ff1f563801d97f382e0ac114a09e6_sx_805824_www933-933")
	private String img;

	@SerializedName("presell_type")
	@OpField(desc = "预售类型，1-全款预售，0-非预售，2-阶梯库存", example = "1")
	private Long presellType;

	@SerializedName("maximum_per_order")
	@OpField(desc = "单用户下单限购件数", example = "5")
	private Long maximumPerOrder;

	@SerializedName("limit_per_buyer")
	@OpField(desc = "单用户累计限购件数", example = "5")
	private Long limitPerBuyer;

	@SerializedName("minimum_per_order")
	@OpField(desc = "用户每次下单至少购买的件数", example = "1")
	private Long minimumPerOrder;

	@SerializedName("quality_list")
	@OpField(desc = "资质信息", example = "")
	private List<QualityListItem> qualityList;

	@SerializedName("logistics_info")
	@OpField(desc = "跨境物流信息（仅海淘商品返回）", example = "")
	private LogisticsInfo logisticsInfo;

	@SerializedName("after_sale_service")
	@OpField(desc = "售后服务", example = "{supply_7day_return:2}")
	private String afterSaleService;

	@SerializedName("price_has_tax")
	@OpField(desc = "商品价格是否含税", example = "0")
	private Long priceHasTax;

	@SerializedName("appoint_delivery_day")
	@OpField(desc = "可预约发货天数", example = "2")
	private Long appointDeliveryDay;

	@SerializedName("product_format_new")
	@OpField(desc = "类目属性", example = "{1088:[{Value:0,Name:小33学二年级,PropertyId:1088,PropertyName:适用学龄段,diy_type:1}],1319:[{Value:0,Name:1,PropertyId:1319,PropertyName:适用地区,diy_type:0}],1618:[{Value:0,Name:9787218122861,PropertyId:1618,PropertyName:ISBN编号,diy_type:0}],1831:[{Value:0,Name:小学英语看图说话写话二年级,PropertyId:1831,PropertyName:书名,diy_type:0}],2000:[{Value:34762,Name:无,PropertyId:2000,PropertyName:作者地区,diy_type:0}],2229:[{Value:0,Name:1,PropertyId:2229,PropertyName:编者,diy_type:0}],3271:[{Value:0,Name:1,PropertyId:3271,PropertyName:出版时间,diy_type:0}],449:[{Value:0,Name:1,PropertyId:449,PropertyName:作者,diy_type:0}],501:[{Value:7310,Name:否,PropertyId:501,PropertyName:是否是套装,diy_type:0}],855:[{Value:0,Name:陕西人民教育出版社,PropertyId:855,PropertyName:出版社名称,diy_type:0}]}")
	private String productFormatNew;

	@SerializedName("standard_brand_id")
	@OpField(desc = "品牌库brand id，原brand_id代表商标关系id", example = "121354")
	private Long standardBrandId;

	@SerializedName("market_price")
	@OpField(desc = "划线价 单位分", example = "12000")
	private Long marketPrice;

	@SerializedName("discount_price")
	@OpField(desc = "售卖价 单位分", example = "12000")
	private Long discountPrice;

	@SerializedName("car_vin_code")
	@OpField(desc = "汽车vin码", example = "VIN11111111111111")
	private String carVinCode;

	@SerializedName("need_recharge_mode")
	@OpField(desc = "生活娱乐充值模式", example = "false")
	private Boolean needRechargeMode;

	@SerializedName("account_template_id")
	@OpField(desc = "多账号充值账号模板", example = "1")
	private String accountTemplateId;

	@SerializedName("presell_config_level")
	@OpField(desc = "发货模式：presell_type = 0 现货；presell_type = 2 阶梯；presell_type = 1 && presell_config_level = 0 全款预售；presell_type = 1 && presell_config_level = 1 sku预售；presell_type = 1 && presell_config_level = 2 现货+预售；presell_type = 1 && presell_config_level = 3 新预售", example = "2")
	private Long presellConfigLevel;

	@SerializedName("delivery_delay_day")
	@OpField(desc = "现货模式的发货天数；阶梯模式现货部分的发货天数，9999=当日发、1=次日发", example = "2")
	private Long deliveryDelayDay;

	@SerializedName("presell_delay")
	@OpField(desc = "阶梯模式阶梯部分的发货天数；商品全款预售模式，预售天数", example = "4")
	private Long presellDelay;

	@SerializedName("poi_resource")
	@OpField(desc = "卡券信息", example = "")
	private PoiResource poiResource;

	@SerializedName("delay_rule")
	@OpField(desc = "特殊日期延迟发货规则", example = "")
	private DelayRule delayRule;

	@SerializedName("long_pic_url")
	@OpField(desc = "3:4长图url(仅素材中心url有效)", example = "https://aaa")
	private String longPicUrl;

	@SerializedName("sell_channel")
	@OpField(desc = "售卖方式;0:全渠道手售卖,1:仅指定直播间售卖", example = "[0]")
	private List<Long> sellChannel;

	@SerializedName("freight_id")
	@OpField(desc = "运费模版ID", example = "123")
	private Long freightId;

	@SerializedName("material_video_id")
	@OpField(desc = "主图视频ID", example = "Vaaxxaa")
	private String materialVideoId;

	@SerializedName("pickup_method")
	@OpField(desc = "提取方式新字段，推荐使用。0: 普通商品-使用物流发货, 1: 虚拟商品-无需物流与电子交易凭证, 2: 虚拟商品-使用电子交易凭证,  3: 虚拟商品-充值直连", example = "0")
	private String pickupMethod;

	@SerializedName("size_info_template_id")
	@OpField(desc = "尺码模板ID", example = "7102988069296423000")
	private Long sizeInfoTemplateId;

	@SerializedName("white_back_ground_pic_url")
	@OpField(desc = "白底图url(仅素材中心url有效)", example = "https://aaa")
	private String whiteBackGroundPicUrl;

	@SerializedName("sale_channel_type")
	@OpField(desc = "销售渠道类型，包括纯电商（onlineOnly）、专柜同款（sameAsOffline），云零售商家（https://fxg.jinritemai.com/ffa/merchant-growth/cloud-retail）可以设置", example = "sameAsOffline")
	private String saleChannelType;

	@SerializedName("store_id")
	@OpField(desc = "门店ID", example = "103121")
	private Long storeId;

	@SerializedName("main_product_id")
	@OpField(desc = "主商品ID", example = "3121213")
	private Long mainProductId;

	@SerializedName("sale_limit_id")
	@OpField(desc = "限售模板ID", example = "123")
	private Long saleLimitId;

	@SerializedName("name_prefix")
	@OpField(desc = "系统推荐的标题前缀", example = "钛钢木质耳饰")
	private String namePrefix;

	@SerializedName("product_type")
	@OpField(desc = "商品类型，0-普通，3-虚拟，6玉石闪购，7云闪购", example = "0")
	private Long productType;

	@SerializedName("presell_delivery_type")
	@OpField(desc = "预售发货方式配置 0-预售结束后xx天发货; 1-支付完成后xx天发货", example = "0")
	private Long presellDeliveryType;

	@SerializedName("start_sale_type")
	@OpField(desc = "审核通过后上架售卖时间配置：0-立即上架售卖 1-放入仓库", example = "0")
	private Long startSaleType;

	@SerializedName("reduce_type")
	@OpField(desc = "库存扣减方式，1-拍下减库存 2-付款减库存", example = "1")
	private Long reduceType;

	@SerializedName("presell_end_time")
	@OpField(desc = "预售结束时间，格式2020-02-21 18:54:27，最多支持设置距离当前30天", example = "2020-02-21 18:54:27")
	private String presellEndTime;

	@SerializedName("weight_value")
	@OpField(desc = "重量数值", example = "0")
	private Double weightValue;

	@SerializedName("weight_unit")
	@OpField(desc = "重量单位，0-kg, 1-g", example = "0")
	private Long weightUnit;

	@SerializedName("reference_price_certificate")
	@OpField(desc = "参考价凭证", example = "")
	private ReferencePriceCertificate referencePriceCertificate;

	@SerializedName("reference_price")
	@OpField(desc = "参考价，单位分", example = "12300")
	private Long referencePrice;

	@SerializedName("quality_inspection_info")
	@OpField(desc = "前置质检相关（特定二手商家、特定二手类目使用）", example = "")
	private QualityInspectionInfo qualityInspectionInfo;

	@SerializedName("unit_price_info")
	@OpField(desc = "单位价格信息", example = "")
	private UnitPriceInfo unitPriceInfo;

	@SerializedName("main_image_three_to_four")
	@OpField(desc = "商品主图3:4；最多支持5张图片；宽高比例为3:4", example = "[https://p9-aio.ecombdimg.com/obj/ecom-shop-material/rgKVRhPW_m_a9223a677dc42718d1203bd2165e3bf5_sx_89532_www570-760,https://p3-aio.ecombdimg.com/obj/ecom-shop-material/rgKVRhPW_m_cd15cfb47c3091dea24d2f84d17e2cad_sx_975664_www750-1000,https://p6-aio.ecombdimg.com/obj/ecom-shop-material/rgKVRhPW_m_ed6f9c9914a5a6ff444a25afc71313c3_sx_63512_www570-760]")
	private String mainImageThreeToFour;

	@SerializedName("is_c2b_switch_on")
	@OpField(desc = "是否支持c2b小程序（特定c2b定制商家使用）", example = "false")
	private Boolean isC2bSwitchOn;

	@SerializedName("micro_app_id")
	@OpField(desc = "支持c2b定制时的小程序id（特定c2b定制商家使用）", example = "abcde")
	private String microAppId;

	@SerializedName("is_auto_charge")
	@OpField(desc = "是否是自动充值商品", example = "false")
	private Boolean isAutoCharge;

	@SerializedName("spu_id")
	@OpField(desc = "spu_id 大于0代表有挂载spu", example = "1234")
	private Long spuId;

	@SerializedName("short_product_name")
	@OpField(desc = "导购短标题，短标题可用于物流打单及商品搜索场景，若未填写，则系统将智能生成最优短标题在商详购买页面展示，说明详见：https://school.jinritemai.com/doudian/web/article/aHUW2MCvHqF3?from=shop_article", example = "好吃牛肉干")
	private String shortProductName;

	@SerializedName("after_sale_service_v2")
	@OpField(desc = "售后服务新结构", example = "")
	private AfterSaleServiceV2 afterSaleServiceV2;

	@SerializedName("format_update_time")
	@OpField(desc = "更新时间，和update_time一样，只是格式不同", example = "2021-11-23 10:17:48")
	private String formatUpdateTime;

	@SerializedName("sell_num")
	@OpField(desc = "商品销量", example = "123")
	private Long sellNum;

	@SerializedName("product_audit_info")
	@OpField(desc = "商品审核结果", example = "")
	private ProductAuditInfo productAuditInfo;

	@SerializedName("main_pic_3_4")
	@OpField(desc = "商品主图3:4；最多支持5张图片；宽高比例为3:4", example = "[https://p9-aio.ecombdimg.com/obj/ecom-shop-material/rgKVRhPW_m_a9223a677dc42718d1203bd2165e3bf5_sx_89532_www570-760,https://p3-aio.ecombdimg.com/obj/ecom-shop-material/rgKVRhPW_m_cd15cfb47c3091dea24d2f84d17e2cad_sx_975664_www750-1000,https://p6-aio.ecombdimg.com/obj/ecom-shop-material/rgKVRhPW_m_ed6f9c9914a5a6ff444a25afc71313c3_sx_63512_www570-760]")
	private List<String> mainPic34;

	@SerializedName("shop_category")
	@OpField(desc = "店铺装修分类", example = "")
	private ShopCategory shopCategory;

	@SerializedName("name_suffix")
	@OpField(desc = "标题后缀", example = "36.9度")
	private String nameSuffix;

	@SerializedName("use_brand_name")
	@OpField(desc = "是否勾选使用品牌名", example = "false")
	private Boolean useBrandName;

	@SerializedName("new_step_product")
	@OpField(desc = "新现货+预售商品标识，true-新现货+预售商品", example = "true")
	private Boolean newStepProduct;

	@SerializedName("is_charity_product")
	@OpField(desc = "是否公益商品", example = "false")
	private Boolean isCharityProduct;

	@SerializedName("charity_id")
	@OpField(desc = "公益项目id", example = "123")
	private String charityId;

	@SerializedName("is_evaluate_opened")
	@OpField(desc = "测评模块是否打开", example = "false")
	private String isEvaluateOpened;

	@SerializedName("custom_property")
	@OpField(desc = "定制属性", example = "")
	private CustomProperty customProperty;

	@SerializedName("default_process_time")
	@OpField(desc = "商品默认处理时长", example = "")
	private DefaultProcessTime defaultProcessTime;

	@SerializedName("is_second_hand_digital")
	@OpField(desc = "是否二手数码(成色机)", example = "false")
	private Boolean isSecondHandDigital;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setProductIdStr(String productIdStr){
		this.productIdStr = productIdStr;
	}

	
	public String getProductIdStr(){
		return this.productIdStr;
	}

	
	public void setOutProductId(Long outProductId){
		this.outProductId = outProductId;
	}

	
	public Long getOutProductId(){
		return this.outProductId;
	}

	
	public void setOuterProductId(String outerProductId){
		this.outerProductId = outerProductId;
	}

	
	public String getOuterProductId(){
		return this.outerProductId;
	}

	
	public void setOpenUserId(Long openUserId){
		this.openUserId = openUserId;
	}

	
	public Long getOpenUserId(){
		return this.openUserId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setDescription(String description){
		this.description = description;
	}

	
	public String getDescription(){
		return this.description;
	}

	
	public void setDeliveryMethod(Integer deliveryMethod){
		this.deliveryMethod = deliveryMethod;
	}

	
	public Integer getDeliveryMethod(){
		return this.deliveryMethod;
	}

	
	public void setCdfCategory(String cdfCategory){
		this.cdfCategory = cdfCategory;
	}

	
	public String getCdfCategory(){
		return this.cdfCategory;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setSpecId(Long specId){
		this.specId = specId;
	}

	
	public Long getSpecId(){
		return this.specId;
	}

	
	public void setCheckStatus(Long checkStatus){
		this.checkStatus = checkStatus;
	}

	
	public Long getCheckStatus(){
		return this.checkStatus;
	}

	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	
	public String getMobile(){
		return this.mobile;
	}

	
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}

	
	public Long getBrandId(){
		return this.brandId;
	}

	
	public void setIsSubProduct(Boolean isSubProduct){
		this.isSubProduct = isSubProduct;
	}

	
	public Boolean getIsSubProduct(){
		return this.isSubProduct;
	}

	
	public void setDraftStatus(Long draftStatus){
		this.draftStatus = draftStatus;
	}

	
	public Long getDraftStatus(){
		return this.draftStatus;
	}

	
	public void setCategoryDetail(CategoryDetail categoryDetail){
		this.categoryDetail = categoryDetail;
	}

	
	public CategoryDetail getCategoryDetail(){
		return this.categoryDetail;
	}

	
	public void setPayType(Long payType){
		this.payType = payType;
	}

	
	public Long getPayType(){
		return this.payType;
	}

	
	public void setRecommendRemark(String recommendRemark){
		this.recommendRemark = recommendRemark;
	}

	
	public String getRecommendRemark(){
		return this.recommendRemark;
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

	
	public void setIsCreate(Long isCreate){
		this.isCreate = isCreate;
	}

	
	public Long getIsCreate(){
		return this.isCreate;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

	
	public void setPic(List<String> pic){
		this.pic = pic;
	}

	
	public List<String> getPic(){
		return this.pic;
	}

	
	public void setProductFormat(String productFormat){
		this.productFormat = productFormat;
	}

	
	public String getProductFormat(){
		return this.productFormat;
	}

	
	public void setSpecPics(List<SpecPicsItem> specPics){
		this.specPics = specPics;
	}

	
	public List<SpecPicsItem> getSpecPics(){
		return this.specPics;
	}

	
	public void setSpecPrices(List<SpecPricesItem> specPrices){
		this.specPrices = specPrices;
	}

	
	public List<SpecPricesItem> getSpecPrices(){
		return this.specPrices;
	}

	
	public void setSpecs(List<SpecsItem> specs){
		this.specs = specs;
	}

	
	public List<SpecsItem> getSpecs(){
		return this.specs;
	}

	
	public void setImg(String img){
		this.img = img;
	}

	
	public String getImg(){
		return this.img;
	}

	
	public void setPresellType(Long presellType){
		this.presellType = presellType;
	}

	
	public Long getPresellType(){
		return this.presellType;
	}

	
	public void setMaximumPerOrder(Long maximumPerOrder){
		this.maximumPerOrder = maximumPerOrder;
	}

	
	public Long getMaximumPerOrder(){
		return this.maximumPerOrder;
	}

	
	public void setLimitPerBuyer(Long limitPerBuyer){
		this.limitPerBuyer = limitPerBuyer;
	}

	
	public Long getLimitPerBuyer(){
		return this.limitPerBuyer;
	}

	
	public void setMinimumPerOrder(Long minimumPerOrder){
		this.minimumPerOrder = minimumPerOrder;
	}

	
	public Long getMinimumPerOrder(){
		return this.minimumPerOrder;
	}

	
	public void setQualityList(List<QualityListItem> qualityList){
		this.qualityList = qualityList;
	}

	
	public List<QualityListItem> getQualityList(){
		return this.qualityList;
	}

	
	public void setLogisticsInfo(LogisticsInfo logisticsInfo){
		this.logisticsInfo = logisticsInfo;
	}

	
	public LogisticsInfo getLogisticsInfo(){
		return this.logisticsInfo;
	}

	
	public void setAfterSaleService(String afterSaleService){
		this.afterSaleService = afterSaleService;
	}

	
	public String getAfterSaleService(){
		return this.afterSaleService;
	}

	
	public void setPriceHasTax(Long priceHasTax){
		this.priceHasTax = priceHasTax;
	}

	
	public Long getPriceHasTax(){
		return this.priceHasTax;
	}

	
	public void setAppointDeliveryDay(Long appointDeliveryDay){
		this.appointDeliveryDay = appointDeliveryDay;
	}

	
	public Long getAppointDeliveryDay(){
		return this.appointDeliveryDay;
	}

	
	public void setProductFormatNew(String productFormatNew){
		this.productFormatNew = productFormatNew;
	}

	
	public String getProductFormatNew(){
		return this.productFormatNew;
	}

	
	public void setStandardBrandId(Long standardBrandId){
		this.standardBrandId = standardBrandId;
	}

	
	public Long getStandardBrandId(){
		return this.standardBrandId;
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

	
	public void setCarVinCode(String carVinCode){
		this.carVinCode = carVinCode;
	}

	
	public String getCarVinCode(){
		return this.carVinCode;
	}

	
	public void setNeedRechargeMode(Boolean needRechargeMode){
		this.needRechargeMode = needRechargeMode;
	}

	
	public Boolean getNeedRechargeMode(){
		return this.needRechargeMode;
	}

	
	public void setAccountTemplateId(String accountTemplateId){
		this.accountTemplateId = accountTemplateId;
	}

	
	public String getAccountTemplateId(){
		return this.accountTemplateId;
	}

	
	public void setPresellConfigLevel(Long presellConfigLevel){
		this.presellConfigLevel = presellConfigLevel;
	}

	
	public Long getPresellConfigLevel(){
		return this.presellConfigLevel;
	}

	
	public void setDeliveryDelayDay(Long deliveryDelayDay){
		this.deliveryDelayDay = deliveryDelayDay;
	}

	
	public Long getDeliveryDelayDay(){
		return this.deliveryDelayDay;
	}

	
	public void setPresellDelay(Long presellDelay){
		this.presellDelay = presellDelay;
	}

	
	public Long getPresellDelay(){
		return this.presellDelay;
	}

	
	public void setPoiResource(PoiResource poiResource){
		this.poiResource = poiResource;
	}

	
	public PoiResource getPoiResource(){
		return this.poiResource;
	}

	
	public void setDelayRule(DelayRule delayRule){
		this.delayRule = delayRule;
	}

	
	public DelayRule getDelayRule(){
		return this.delayRule;
	}

	
	public void setLongPicUrl(String longPicUrl){
		this.longPicUrl = longPicUrl;
	}

	
	public String getLongPicUrl(){
		return this.longPicUrl;
	}

	
	public void setSellChannel(List<Long> sellChannel){
		this.sellChannel = sellChannel;
	}

	
	public List<Long> getSellChannel(){
		return this.sellChannel;
	}

	
	public void setFreightId(Long freightId){
		this.freightId = freightId;
	}

	
	public Long getFreightId(){
		return this.freightId;
	}

	
	public void setMaterialVideoId(String materialVideoId){
		this.materialVideoId = materialVideoId;
	}

	
	public String getMaterialVideoId(){
		return this.materialVideoId;
	}

	
	public void setPickupMethod(String pickupMethod){
		this.pickupMethod = pickupMethod;
	}

	
	public String getPickupMethod(){
		return this.pickupMethod;
	}

	
	public void setSizeInfoTemplateId(Long sizeInfoTemplateId){
		this.sizeInfoTemplateId = sizeInfoTemplateId;
	}

	
	public Long getSizeInfoTemplateId(){
		return this.sizeInfoTemplateId;
	}

	
	public void setWhiteBackGroundPicUrl(String whiteBackGroundPicUrl){
		this.whiteBackGroundPicUrl = whiteBackGroundPicUrl;
	}

	
	public String getWhiteBackGroundPicUrl(){
		return this.whiteBackGroundPicUrl;
	}

	
	public void setSaleChannelType(String saleChannelType){
		this.saleChannelType = saleChannelType;
	}

	
	public String getSaleChannelType(){
		return this.saleChannelType;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setMainProductId(Long mainProductId){
		this.mainProductId = mainProductId;
	}

	
	public Long getMainProductId(){
		return this.mainProductId;
	}

	
	public void setSaleLimitId(Long saleLimitId){
		this.saleLimitId = saleLimitId;
	}

	
	public Long getSaleLimitId(){
		return this.saleLimitId;
	}

	
	public void setNamePrefix(String namePrefix){
		this.namePrefix = namePrefix;
	}

	
	public String getNamePrefix(){
		return this.namePrefix;
	}

	
	public void setProductType(Long productType){
		this.productType = productType;
	}

	
	public Long getProductType(){
		return this.productType;
	}

	
	public void setPresellDeliveryType(Long presellDeliveryType){
		this.presellDeliveryType = presellDeliveryType;
	}

	
	public Long getPresellDeliveryType(){
		return this.presellDeliveryType;
	}

	
	public void setStartSaleType(Long startSaleType){
		this.startSaleType = startSaleType;
	}

	
	public Long getStartSaleType(){
		return this.startSaleType;
	}

	
	public void setReduceType(Long reduceType){
		this.reduceType = reduceType;
	}

	
	public Long getReduceType(){
		return this.reduceType;
	}

	
	public void setPresellEndTime(String presellEndTime){
		this.presellEndTime = presellEndTime;
	}

	
	public String getPresellEndTime(){
		return this.presellEndTime;
	}

	
	public void setWeightValue(Double weightValue){
		this.weightValue = weightValue;
	}

	
	public Double getWeightValue(){
		return this.weightValue;
	}

	
	public void setWeightUnit(Long weightUnit){
		this.weightUnit = weightUnit;
	}

	
	public Long getWeightUnit(){
		return this.weightUnit;
	}

	
	public void setReferencePriceCertificate(ReferencePriceCertificate referencePriceCertificate){
		this.referencePriceCertificate = referencePriceCertificate;
	}

	
	public ReferencePriceCertificate getReferencePriceCertificate(){
		return this.referencePriceCertificate;
	}

	
	public void setReferencePrice(Long referencePrice){
		this.referencePrice = referencePrice;
	}

	
	public Long getReferencePrice(){
		return this.referencePrice;
	}

	
	public void setQualityInspectionInfo(QualityInspectionInfo qualityInspectionInfo){
		this.qualityInspectionInfo = qualityInspectionInfo;
	}

	
	public QualityInspectionInfo getQualityInspectionInfo(){
		return this.qualityInspectionInfo;
	}

	
	public void setUnitPriceInfo(UnitPriceInfo unitPriceInfo){
		this.unitPriceInfo = unitPriceInfo;
	}

	
	public UnitPriceInfo getUnitPriceInfo(){
		return this.unitPriceInfo;
	}

	
	public void setMainImageThreeToFour(String mainImageThreeToFour){
		this.mainImageThreeToFour = mainImageThreeToFour;
	}

	
	public String getMainImageThreeToFour(){
		return this.mainImageThreeToFour;
	}

	
	public void setIsC2bSwitchOn(Boolean isC2bSwitchOn){
		this.isC2bSwitchOn = isC2bSwitchOn;
	}

	
	public Boolean getIsC2bSwitchOn(){
		return this.isC2bSwitchOn;
	}

	
	public void setMicroAppId(String microAppId){
		this.microAppId = microAppId;
	}

	
	public String getMicroAppId(){
		return this.microAppId;
	}

	
	public void setIsAutoCharge(Boolean isAutoCharge){
		this.isAutoCharge = isAutoCharge;
	}

	
	public Boolean getIsAutoCharge(){
		return this.isAutoCharge;
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

	
	public void setShortProductName(String shortProductName){
		this.shortProductName = shortProductName;
	}

	
	public String getShortProductName(){
		return this.shortProductName;
	}

	
	public void setAfterSaleServiceV2(AfterSaleServiceV2 afterSaleServiceV2){
		this.afterSaleServiceV2 = afterSaleServiceV2;
	}

	
	public AfterSaleServiceV2 getAfterSaleServiceV2(){
		return this.afterSaleServiceV2;
	}

	
	public void setFormatUpdateTime(String formatUpdateTime){
		this.formatUpdateTime = formatUpdateTime;
	}

	
	public String getFormatUpdateTime(){
		return this.formatUpdateTime;
	}

	
	public void setSellNum(Long sellNum){
		this.sellNum = sellNum;
	}

	
	public Long getSellNum(){
		return this.sellNum;
	}

	
	public void setProductAuditInfo(ProductAuditInfo productAuditInfo){
		this.productAuditInfo = productAuditInfo;
	}

	
	public ProductAuditInfo getProductAuditInfo(){
		return this.productAuditInfo;
	}

	
	public void setMainPic34(List<String> mainPic34){
		this.mainPic34 = mainPic34;
	}

	
	public List<String> getMainPic34(){
		return this.mainPic34;
	}

	
	public void setShopCategory(ShopCategory shopCategory){
		this.shopCategory = shopCategory;
	}

	
	public ShopCategory getShopCategory(){
		return this.shopCategory;
	}

	
	public void setNameSuffix(String nameSuffix){
		this.nameSuffix = nameSuffix;
	}

	
	public String getNameSuffix(){
		return this.nameSuffix;
	}

	
	public void setUseBrandName(Boolean useBrandName){
		this.useBrandName = useBrandName;
	}

	
	public Boolean getUseBrandName(){
		return this.useBrandName;
	}

	
	public void setNewStepProduct(Boolean newStepProduct){
		this.newStepProduct = newStepProduct;
	}

	
	public Boolean getNewStepProduct(){
		return this.newStepProduct;
	}

	
	public void setIsCharityProduct(Boolean isCharityProduct){
		this.isCharityProduct = isCharityProduct;
	}

	
	public Boolean getIsCharityProduct(){
		return this.isCharityProduct;
	}

	
	public void setCharityId(String charityId){
		this.charityId = charityId;
	}

	
	public String getCharityId(){
		return this.charityId;
	}

	
	public void setIsEvaluateOpened(String isEvaluateOpened){
		this.isEvaluateOpened = isEvaluateOpened;
	}

	
	public String getIsEvaluateOpened(){
		return this.isEvaluateOpened;
	}

	
	public void setCustomProperty(CustomProperty customProperty){
		this.customProperty = customProperty;
	}

	
	public CustomProperty getCustomProperty(){
		return this.customProperty;
	}

	
	public void setDefaultProcessTime(DefaultProcessTime defaultProcessTime){
		this.defaultProcessTime = defaultProcessTime;
	}

	
	public DefaultProcessTime getDefaultProcessTime(){
		return this.defaultProcessTime;
	}

	
	public void setIsSecondHandDigital(Boolean isSecondHandDigital){
		this.isSecondHandDigital = isSecondHandDigital;
	}

	
	public Boolean getIsSecondHandDigital(){
		return this.isSecondHandDigital;
	}

}