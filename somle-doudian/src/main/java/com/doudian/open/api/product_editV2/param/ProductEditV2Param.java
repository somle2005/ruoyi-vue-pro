package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class ProductEditV2Param {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID", example= "3506108675121111111")
	private Long productId;

	@SerializedName("product_type")
	@OpField(required = false , desc = "0-普通，3-虚拟，6玉石闪购，7云闪购", example= "0")
	private Long productType;

	@SerializedName("category_leaf_id")
	@OpField(required = false , desc = "叶子类目ID通过/shop/getShopCategory接口获取", example= "20000")
	private Long categoryLeafId;

	@SerializedName("name")
	@OpField(required = false , desc = "商品名称，至少8个字符（4个汉字），最多60个字符(30个汉字)，不能含emoj表情", example= "xxx补水液")
	private String name;

	@SerializedName("recommend_remark")
	@OpField(required = false , desc = "商家推荐语，不能含emoj表情", example= "这个商品很好啊")
	private String recommendRemark;

	@SerializedName("pic")
	@OpField(required = false , desc = "商品轮播图，多张图片用 | 分开，第一张图为主图，最多5张，至少600x600，大小不超过5M", example= "img_url1|img_url2|img_url3")
	private String pic;

	@SerializedName("description")
	@OpField(required = false , desc = "商详图片，多张图片用 | 分开。图片数量总和，不得超过50张。", example= "img_url1|img_url2|img_url3")
	private String description;

	@SerializedName("pay_type")
	@OpField(required = false , desc = "已废弃，支付方式，0货到付款 1在线支付，2，货到付款+在线支付", example= "1")
	private Long payType;

	@SerializedName("delivery_method")
	@OpField(required = false , desc = "海南免税生效。 0:离岛免税、1:邮寄、2:离岛自提+邮寄", example= "7")
	private Integer deliveryMethod;

	@SerializedName("cdf_category")
	@OpField(required = false , desc = "海南免税：海关限购分类编码", example= "1")
	private String cdfCategory;

	@SerializedName("reduce_type")
	@OpField(required = false , desc = "1 减库存类型：1-拍下减库存 2-付款减库存", example= "1")
	private Long reduceType;

	@SerializedName("assoc_ids")
	@OpField(required = false , desc = "【已废弃】同店商品推荐：为空表示使用系统推荐；多个product_id使用“|”分开", example= "1|2|3")
	private String assocIds;

	@SerializedName("freight_id")
	@OpField(required = false , desc = "运费模板id，传0表示包邮，通过/freightTemplate/list接口获取", example= "123")
	private Long freightId;

	@SerializedName("weight")
	@OpField(required = false , desc = "重量。数据范围需要小于10000，如果超过，请更换的weight_unit", example= "1000")
	private Double weight;

	@SerializedName("weight_unit")
	@OpField(required = false , desc = "重量单位，0-kg, 1-g", example= "1")
	private Long weightUnit;

	@SerializedName("delivery_delay_day")
	@OpField(required = false , desc = "delivery_delay_day： 承诺发货时间，单位是天,不传则默认为2天。现货发货(presell_type=0)和阶梯发货模式(presell_type=2)时必填，支持传入9999 、1、 2 （分别表示当日发、次日发、48小时发），具体支持传入的参数范围/product/getProductUpdateRule", example= "7")
	private Long deliveryDelayDay;

	@SerializedName("presell_type")
	@OpField(required = false , desc = "发货模式，0-现货发货，1-预售发货，2-阶梯发货，默认0", example= "0")
	private Long presellType;

	@SerializedName("presell_delay")
	@OpField(required = false , desc = "全款预售模式时的发货时间/阶梯模式下阶梯发货时间，具体支持传入的参数范围/product/getProductUpdateRule", example= "7")
	private Long presellDelay;

	@SerializedName("presell_end_time")
	@OpField(required = false , desc = "预售结束时间，格式2020-02-21 18:54:27，最多支持设置距离当前30天", example= "2020-02-21 18:54:27")
	private String presellEndTime;

	@SerializedName("supply_7day_return")
	@OpField(required = false , desc = "【该字段将在2023年4月30日下线，请开发使用最新的after_sale_service字段传值；】是否支持7天无理由，0不支持，1支持，2支持（拆封后不支持）", example= "该字段将在2023年4月30日下线，请开发使用最新的after_sale_service字段传值；")
	private Long supply7dayReturn;

	@SerializedName("mobile")
	@OpField(required = false , desc = "客服电话号码", example= "40012345")
	private String mobile;

	@SerializedName("commit")
	@OpField(required = true , desc = "false仅保存，true保存+提审", example= "true")
	private Boolean commit;

	@SerializedName("remark")
	@OpField(required = false , desc = "商家可见备注", example= "备注")
	private String remark;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部product_id。超市小时达场景不推荐使用", example= "123")
	private Long outProductId;

	@SerializedName("quality_list")
	@OpField(required = false , desc = "资质信息，可通过/product/qualificationConfig获取", example= "")
	private List<QualityListItem> qualityList;

	@SerializedName("spec_name")
	@OpField(required = false , desc = "【废弃不再使用，请使用spec_info参数】如果不填，则规格名为各级规格名用 - 自动生成", example= "颜色-尺码")
	private String specName;

	@SerializedName("specs")
	@OpField(required = false , desc = "【废弃不再使用，请使用spec_info参数】店铺通用规格，能被同类商品通用。多规格用^分隔，规格与规格值用|分隔，多个规格值用,分隔。如果创建或编辑现货+预售商品或新预售商品时，须包含发货时效，如：颜色|黑色,白色,黄色^尺码|S,M,L^发货时效|5天内发货,15天内发货", example= "颜色|红色,黑色^尺码|S,M")
	private String specs;

	@SerializedName("spec_prices")
	@OpField(required = false , desc = "【字段废弃，请使用spec_prices_v2】sku详情，数量应该等于规格1规格2规格3，sku数量和规格组合数必须一致 sku不可售时，库存可设置为0。price单位为分。 delivery_infos为SKU物流信息，info_value为字符串类型（示例：12），info_type填weight，info_unit支持mg,g,kg，超市小时达场景主品用普通库存，子品用区域库存（sku_type: 1 // 区域库存，stock_num_map: {123: 99999 // 门店ID:库存数量}）。gold_process_charge表示商品加工费，只有计价金类目可填并必填。sell_properties为sku规格信息，代替spec_detail_name1、spec_detail_name2、spec_detail_name3，支持填写超过三级规格，样式:[{property_id:123,property_name:颜色,value_id:456,value_name:红色,remark:偏深},{property_id:789,property_name:净含量,value_id:891,value_name:30ml,remark:null,measurement:{measure_unit:ml,measure_unit_id:4,value:30}}] 其中property_id规格项属性id,自定义时传0,property_name为规格项名称,value_id为规格值属性id自定义时传0,value_name为规格值名称,remark为规格值备注(选填),measurement为度量衡信息，当规格值为度量衡属性自定义值时传递。", example= "[{spec_detail_name1:红色,spec_detail_name2:S,spec_detail_name3:,stock_num:11,price:100,code:,step_stock_num:0,supplier_id:,outer_sku_id:,delivery_infos:[{info_type:weight,info_value:100,info_unit:mg}]},{spec_detail_name1:红色,spec_detail_name2:M,spec_detail_name3:,stock_num:22,price:100,code:,step_stock_num:0,supplier_id:,outer_sku_id:,delivery_infos:[{info_type:weight,info_value:100,info_unit:mg}]},{spec_detail_name1:黑色,spec_detail_name2:S,spec_detail_name3:,stock_num:44,price:100,code:,step_stock_num:0,supplier_id:,outer_sku_id:,delivery_infos:[{info_type:weight,info_value:100,info_unit:mg}]},{spec_detail_name1:黑色,spec_detail_name2:M,spec_detail_name3:,stock_num:55,price:100,code:,step_stock_num:0,supplier_id:,outer_sku_id:,delivery_infos:[{info_type:weight,info_value:100,info_unit:mg}]}]")
	private String specPrices;

	@SerializedName("spec_pic")
	@OpField(required = false , desc = "如颜色-尺寸, 颜色就是主规格, 颜色如黑,白,黄,它们图片url以逗号分隔 注：pic、description、spec_pic这三个字段里的传入的图片数量总和，不得超过50张。", example= "img_url,img_url,img_url")
	private String specPic;

	@SerializedName("maximum_per_order")
	@OpField(required = false , desc = "每个用户每次下单限购件数", example= "2")
	private Long maximumPerOrder;

	@SerializedName("limit_per_buyer")
	@OpField(required = false , desc = "每个用户累计限购件数", example= "3")
	private Long limitPerBuyer;

	@SerializedName("minimum_per_order")
	@OpField(required = false , desc = "每个用户每次下单至少购买的件数", example= "2")
	private Long minimumPerOrder;

	@SerializedName("product_format_new")
	@OpField(required = false , desc = "通过/product/getCatePropertyV2获取 格式：{property_id:[{value:value,name:property_name,diy_type:0}]}, name的类型是string，value和diy_type的类型是number 度量衡参照open度量衡对接文档填写", example= "{405:[{value:27664,name:复习资料,diy_type:0}],449:[{value:0,name:佚名,diy_type:0}],501:[{value:7310,name:否,diy_type:0}],855:[{value:61683,name:北京出版社,diy_type:0}],1088:[{value:407,name:小学五年级,diy_type:0}],1319:[{value:0,name:1,diy_type:0}],1601:[{value:13911,name:通用版,diy_type:0}],1618:[{value:0,name:9787218122861,diy_type:0}],1831:[{value:0,name:小学英语看图说话写话二年级,diy_type:0}],2000:[{value:34762,name:无,diy_type:0}],2229:[{value:0,name:1,diy_type:0}],2763:[{value:25193,name:英语,diy_type:0}],3271:[{value:0,name:1,diy_type:0}],3296:[{value:0,name:16.80元,diy_type:0}],785:[{measure_info:{template_id:147,values:[{module_id:396,prefix:,suffix:,value:棉},{module_id:397,prefix:,suffix:,unit_id:15,unit_name:%,value:60}]},value_id:,value_name:棉60%},{measure_info:{template_id:147,values:[{module_id:396,prefix:,suffix:,value:聚酯纤维（涤纶）},{module_id:397,prefix:,suffix:,unit_id:15,unit_name:%,value:40}]},value_id:,value_name:聚酯纤维（涤纶）40%}]}")
	private String productFormatNew;

	@SerializedName("spu_id")
	@OpField(required = false , desc = "spu id", example= "不透出")
	private Long spuId;

	@SerializedName("appoint_delivery_day")
	@OpField(required = false , desc = "可预约发货天数", example= "2")
	private Long appointDeliveryDay;

	@SerializedName("third_url")
	@OpField(required = false , desc = "third_url", example= "http://img.alicdn.com/xxxx")
	private String thirdUrl;

	@SerializedName("extra")
	@OpField(required = false , desc = "extra", example= "不透出")
	private String extra;

	@SerializedName("src")
	@OpField(required = false , desc = "src", example= "不透出")
	private String src;

	@SerializedName("outer_product_id")
	@OpField(required = false , desc = "外部product id。超市小时达场景不推荐使用", example= "11111111111111")
	private String outerProductId;

	@SerializedName("standard_brand_id")
	@OpField(required = false , desc = "standard_brand_id，通过/brand/list获取，无品牌id则传596120136", example= "111")
	private Long standardBrandId;

	@SerializedName("need_check_out")
	@OpField(required = false , desc = "卡券类型需要传true", example= "true")
	private Boolean needCheckOut;

	@SerializedName("poi_resource")
	@OpField(required = false , desc = "卡券信息", example= "")
	private PoiResource poiResource;

	@SerializedName("force_use_quality_list")
	@OpField(required = false , desc = "使用qualityList覆盖当前商品资质，qualityList传空代表清空", example= "false")
	private Boolean forceUseQualityList;

	@SerializedName("car_vin_code")
	@OpField(required = false , desc = "汽车Vin码", example= "VIN11111111111111")
	private String carVinCode;

	@SerializedName("presell_config_level")
	@OpField(required = false , desc = "0：全款预售，1：sku预售，2：现货+预售 ，3：新预售", example= "2")
	private Long presellConfigLevel;

	@SerializedName("need_recharge_mode")
	@OpField(required = false , desc = "充值模式", example= "false")
	private Boolean needRechargeMode;

	@SerializedName("account_template_id")
	@OpField(required = false , desc = "多账号模板", example= "1")
	private String accountTemplateId;

	@SerializedName("presell_delivery_type")
	@OpField(required = false , desc = "全款预售和sku预售时传递，其他不传： 0 预售结束后发货  1支付完成后发货", example= "1")
	private Long presellDeliveryType;

	@SerializedName("white_back_ground_pic_url")
	@OpField(required = false , desc = "白底图url(仅素材中心url有效)", example= "http://aaaa")
	private String whiteBackGroundPicUrl;

	@SerializedName("long_pic_url")
	@OpField(required = false , desc = "3:4长图url(仅素材中心url有效)", example= "http://aaaa")
	private String longPicUrl;

	@SerializedName("after_sale_service")
	@OpField(required = false , desc = "售后服务参数,key:value格式  supply_day_return_selector(7天无理由选项)：N天-政策代号，N只支持7和15 supply_red_ass_return（红屁屁无忧）：0不支持，1支持 supply_allergy_return（过敏无忧,仅跨境可选）：0不支持，1支持 damaged_order_return（坏损包退）：0不支持，1支持 support_allergy_returnV2（过敏包退，境内可选）：0不支持，1支持", example= "damaged_order_return: 1")
	private Map<String,String> afterSaleService;

	@SerializedName("sell_channel")
	@OpField(required = false , desc = "售卖方式;0:全渠道手售卖,1:仅指定直播间售卖", example= "[0]")
	private List<Long> sellChannel;

	@SerializedName("start_sale_type")
	@OpField(required = false , desc = "审核通过后上架售卖时间配置:0-立即上架售卖 1-放入仓库", example= "0")
	private Long startSaleType;

	@SerializedName("delay_rule")
	@OpField(required = false , desc = "特殊日期延迟发货规则", example= "")
	private DelayRule delayRule;

	@SerializedName("material_video_id")
	@OpField(required = false , desc = "主图视频ID，可以先通过https://op.jinritemai.com/docs/api-docs/69/1617接口上传视频，获取审核通过的视频素材ID进行传入", example= "vaaaa")
	private String materialVideoId;

	@SerializedName("pickup_method")
	@OpField(required = false , desc = "提取方式新字段，推荐使用。0: 普通商品-使用物流发货, 1: 虚拟商品-无需物流与电子交易凭证, 2: 虚拟商品-使用电子交易凭证, 3: 虚拟商品-充值直连", example= "0")
	private String pickupMethod;

	@SerializedName("size_info_template_id")
	@OpField(required = false , desc = "尺码模板ID", example= "101")
	private Long sizeInfoTemplateId;

	@SerializedName("substitute_goods_url")
	@OpField(required = false , desc = "外部商品url", example= "https://xxx.xxx.xxx")
	private String substituteGoodsUrl;

	@SerializedName("sale_channel_type")
	@OpField(required = false , desc = "销售渠道类型，可选onlineOnly（纯电商，仅在线上售卖）或sameAsOffline（专柜同款，线上线下都有售卖），云零售商家（https://fxg.jinritemai.com/ffa/merchant-growth/cloud-retail）可以设置", example= "sameAsOffline")
	private String saleChannelType;

	@SerializedName("name_prefix")
	@OpField(required = false , desc = "通过/product/getRecommendName接口推荐的商品标题前缀（注意系统根据类目属性生成前缀字符串时，末尾有一个空格）", example= "钛钢木质耳饰")
	private String namePrefix;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "103121")
	private Long storeId;

	@SerializedName("main_product_id")
	@OpField(required = false , desc = "主商品ID", example= "3121213")
	private Long mainProductId;

	@SerializedName("sale_limit_id")
	@OpField(required = false , desc = "限售模板ID", example= "123")
	private Long saleLimitId;

	@SerializedName("reference_price")
	@OpField(required = false , desc = "商品参考价", example= "12300")
	private Long referencePrice;

	@SerializedName("reference_price_certificate")
	@OpField(required = false , desc = "参考价凭证相关信息", example= "")
	private ReferencePriceCertificate referencePriceCertificate;

	@SerializedName("main_image_three_to_four")
	@OpField(required = false , desc = "商品主图3:4，多张图片用 | 分开，最多5张，大小不超过5M。", example= "img_url1|img_url2|img_url3")
	private String mainImageThreeToFour;

	@SerializedName("unit_price_info")
	@OpField(required = false , desc = "价格规则信息", example= "")
	private UnitPriceInfo unitPriceInfo;

	@SerializedName("quality_inspection_info")
	@OpField(required = false , desc = "前置质检相关（特定二手商家、特定二手类目使用）", example= "")
	private QualityInspectionInfo qualityInspectionInfo;

	@SerializedName("is_c2b_switch_on")
	@OpField(required = false , desc = "是否支持c2b小程序（特定c2b定制商家使用，请使用/product/getProductUpdateRule接口获取是否支持）", example= "true")
	private Boolean isC2bSwitchOn;

	@SerializedName("micro_app_id")
	@OpField(required = false , desc = "支持c2b定制时的小程序id（特定c2b定制商家使用，请使用/product/getProductUpdateRule接口获取是否支持）", example= "abcde")
	private String microAppId;

	@SerializedName("is_auto_charge")
	@OpField(required = false , desc = "是否修改为自动充值商品", example= "false")
	private Boolean isAutoCharge;

	@SerializedName("short_product_name")
	@OpField(required = false , desc = "导购短标题，短标题可用于物流打单及商品搜索场景，说明详见：https://school.jinritemai.com/doudian/web/article/aHUW2MCvHqF3?from=shop_article", example= "好吃牛肉干")
	private String shortProductName;

	@SerializedName("after_sale_service_v2")
	@OpField(required = false , desc = "售后服务新结构（老的after_sale_service中的字段后续会慢慢迁移到这里）", example= "")
	private AfterSaleServiceV2 afterSaleServiceV2;

	@SerializedName("spec_prices_v2")
	@OpField(required = false , desc = "sku新参数，建议切到新参数，后续老参数spec_prices废弃", example= "")
	private List<SpecPricesV2Item> specPricesV2;

	@SerializedName("spec_info")
	@OpField(required = false , desc = "规格模版详细信息", example= "")
	private SpecInfo specInfo;

	@SerializedName("with_sku_type")
	@OpField(required = false , desc = "true:主动设置库存类型（仅对区域库存生效，普通库存、阶梯库存不受此字段影响）", example= "true")
	private Boolean withSkuType;

	@SerializedName("name_suffix")
	@OpField(required = false , desc = "通过/product/getRecommendName接口推荐的商品标题后缀（注意系统根据类目属性生成后缀字符串时，前面可能有一个空格）", example= "36.9度")
	private String nameSuffix;

	@SerializedName("use_brand_name")
	@OpField(required = false , desc = "是否勾选使用品牌名, 注意勾选时需要接入/product/getRecommendName接口", example= "false")
	private Boolean useBrandName;

	@SerializedName("open_logistics_info")
	@OpField(required = false , desc = "跨境物流信息", example= "")
	private OpenLogisticsInfo openLogisticsInfo;

	@SerializedName("custom_property")
	@OpField(required = false , desc = "商品定制属性。适用于到家商品场景", example= "")
	private CustomProperty customProperty;

	@SerializedName("is_evaluate_opened")
	@OpField(required = false , desc = "测评模块是否打开", example= "false")
	private Boolean isEvaluateOpened;

	@SerializedName("default_process_time")
	@OpField(required = false , desc = "商品维度默认处理时长", example= "")
	private DefaultProcessTime defaultProcessTime;

	@SerializedName("recommend_ids")
	@OpField(required = false , desc = "预测记录id，类目预测记录key=category_recommend_id", example= "{category_recommend_id:qwerqwr123}")
	private Map<String,String> recommendIds;

	@SerializedName("show_checkout_entry")
	@OpField(required = false , desc = "虚拟商品设置是否订单展示核销去使用", example= "true")
	private Boolean showCheckoutEntry;


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

	
	public void setProductType(Long productType){
		this.productType = productType;
	}

	
	public Long getProductType(){
		return this.productType;
	}

	
	public void setCategoryLeafId(Long categoryLeafId){
		this.categoryLeafId = categoryLeafId;
	}

	
	public Long getCategoryLeafId(){
		return this.categoryLeafId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setRecommendRemark(String recommendRemark){
		this.recommendRemark = recommendRemark;
	}

	
	public String getRecommendRemark(){
		return this.recommendRemark;
	}

	
	public void setPic(String pic){
		this.pic = pic;
	}

	
	public String getPic(){
		return this.pic;
	}

	
	public void setDescription(String description){
		this.description = description;
	}

	
	public String getDescription(){
		return this.description;
	}

	
	public void setPayType(Long payType){
		this.payType = payType;
	}

	
	public Long getPayType(){
		return this.payType;
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

	
	public void setReduceType(Long reduceType){
		this.reduceType = reduceType;
	}

	
	public Long getReduceType(){
		return this.reduceType;
	}

	
	public void setAssocIds(String assocIds){
		this.assocIds = assocIds;
	}

	
	public String getAssocIds(){
		return this.assocIds;
	}

	
	public void setFreightId(Long freightId){
		this.freightId = freightId;
	}

	
	public Long getFreightId(){
		return this.freightId;
	}

	
	public void setWeight(Double weight){
		this.weight = weight;
	}

	
	public Double getWeight(){
		return this.weight;
	}

	
	public void setWeightUnit(Long weightUnit){
		this.weightUnit = weightUnit;
	}

	
	public Long getWeightUnit(){
		return this.weightUnit;
	}

	
	public void setDeliveryDelayDay(Long deliveryDelayDay){
		this.deliveryDelayDay = deliveryDelayDay;
	}

	
	public Long getDeliveryDelayDay(){
		return this.deliveryDelayDay;
	}

	
	public void setPresellType(Long presellType){
		this.presellType = presellType;
	}

	
	public Long getPresellType(){
		return this.presellType;
	}

	
	public void setPresellDelay(Long presellDelay){
		this.presellDelay = presellDelay;
	}

	
	public Long getPresellDelay(){
		return this.presellDelay;
	}

	
	public void setPresellEndTime(String presellEndTime){
		this.presellEndTime = presellEndTime;
	}

	
	public String getPresellEndTime(){
		return this.presellEndTime;
	}

	
	public void setSupply7dayReturn(Long supply7dayReturn){
		this.supply7dayReturn = supply7dayReturn;
	}

	
	public Long getSupply7dayReturn(){
		return this.supply7dayReturn;
	}

	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	
	public String getMobile(){
		return this.mobile;
	}

	
	public void setCommit(Boolean commit){
		this.commit = commit;
	}

	
	public Boolean getCommit(){
		return this.commit;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setOutProductId(Long outProductId){
		this.outProductId = outProductId;
	}

	
	public Long getOutProductId(){
		return this.outProductId;
	}

	
	public void setQualityList(List<QualityListItem> qualityList){
		this.qualityList = qualityList;
	}

	
	public List<QualityListItem> getQualityList(){
		return this.qualityList;
	}

	
	public void setSpecName(String specName){
		this.specName = specName;
	}

	
	public String getSpecName(){
		return this.specName;
	}

	
	public void setSpecs(String specs){
		this.specs = specs;
	}

	
	public String getSpecs(){
		return this.specs;
	}

	
	public void setSpecPrices(String specPrices){
		this.specPrices = specPrices;
	}

	
	public String getSpecPrices(){
		return this.specPrices;
	}

	
	public void setSpecPic(String specPic){
		this.specPic = specPic;
	}

	
	public String getSpecPic(){
		return this.specPic;
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

	
	public void setProductFormatNew(String productFormatNew){
		this.productFormatNew = productFormatNew;
	}

	
	public String getProductFormatNew(){
		return this.productFormatNew;
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

	
	public void setAppointDeliveryDay(Long appointDeliveryDay){
		this.appointDeliveryDay = appointDeliveryDay;
	}

	
	public Long getAppointDeliveryDay(){
		return this.appointDeliveryDay;
	}

	
	public void setThirdUrl(String thirdUrl){
		this.thirdUrl = thirdUrl;
	}

	
	public String getThirdUrl(){
		return this.thirdUrl;
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

	
	public void setSrc(String src){
		this.src = src;
	}

	
	public String getSrc(){
		return this.src;
	}

	
	public void setOuterProductId(String outerProductId){
		this.outerProductId = outerProductId;
	}

	
	public String getOuterProductId(){
		return this.outerProductId;
	}

	
	public void setStandardBrandId(Long standardBrandId){
		this.standardBrandId = standardBrandId;
	}

	
	public Long getStandardBrandId(){
		return this.standardBrandId;
	}

	
	public void setNeedCheckOut(Boolean needCheckOut){
		this.needCheckOut = needCheckOut;
	}

	
	public Boolean getNeedCheckOut(){
		return this.needCheckOut;
	}

	
	public void setPoiResource(PoiResource poiResource){
		this.poiResource = poiResource;
	}

	
	public PoiResource getPoiResource(){
		return this.poiResource;
	}

	
	public void setForceUseQualityList(Boolean forceUseQualityList){
		this.forceUseQualityList = forceUseQualityList;
	}

	
	public Boolean getForceUseQualityList(){
		return this.forceUseQualityList;
	}

	
	public void setCarVinCode(String carVinCode){
		this.carVinCode = carVinCode;
	}

	
	public String getCarVinCode(){
		return this.carVinCode;
	}

	
	public void setPresellConfigLevel(Long presellConfigLevel){
		this.presellConfigLevel = presellConfigLevel;
	}

	
	public Long getPresellConfigLevel(){
		return this.presellConfigLevel;
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

	
	public void setPresellDeliveryType(Long presellDeliveryType){
		this.presellDeliveryType = presellDeliveryType;
	}

	
	public Long getPresellDeliveryType(){
		return this.presellDeliveryType;
	}

	
	public void setWhiteBackGroundPicUrl(String whiteBackGroundPicUrl){
		this.whiteBackGroundPicUrl = whiteBackGroundPicUrl;
	}

	
	public String getWhiteBackGroundPicUrl(){
		return this.whiteBackGroundPicUrl;
	}

	
	public void setLongPicUrl(String longPicUrl){
		this.longPicUrl = longPicUrl;
	}

	
	public String getLongPicUrl(){
		return this.longPicUrl;
	}

	
	public void setAfterSaleService(Map<String,String> afterSaleService){
		this.afterSaleService = afterSaleService;
	}

	
	public Map<String,String> getAfterSaleService(){
		return this.afterSaleService;
	}

	
	public void setSellChannel(List<Long> sellChannel){
		this.sellChannel = sellChannel;
	}

	
	public List<Long> getSellChannel(){
		return this.sellChannel;
	}

	
	public void setStartSaleType(Long startSaleType){
		this.startSaleType = startSaleType;
	}

	
	public Long getStartSaleType(){
		return this.startSaleType;
	}

	
	public void setDelayRule(DelayRule delayRule){
		this.delayRule = delayRule;
	}

	
	public DelayRule getDelayRule(){
		return this.delayRule;
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

	
	public void setSubstituteGoodsUrl(String substituteGoodsUrl){
		this.substituteGoodsUrl = substituteGoodsUrl;
	}

	
	public String getSubstituteGoodsUrl(){
		return this.substituteGoodsUrl;
	}

	
	public void setSaleChannelType(String saleChannelType){
		this.saleChannelType = saleChannelType;
	}

	
	public String getSaleChannelType(){
		return this.saleChannelType;
	}

	
	public void setNamePrefix(String namePrefix){
		this.namePrefix = namePrefix;
	}

	
	public String getNamePrefix(){
		return this.namePrefix;
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

	
	public void setReferencePrice(Long referencePrice){
		this.referencePrice = referencePrice;
	}

	
	public Long getReferencePrice(){
		return this.referencePrice;
	}

	
	public void setReferencePriceCertificate(ReferencePriceCertificate referencePriceCertificate){
		this.referencePriceCertificate = referencePriceCertificate;
	}

	
	public ReferencePriceCertificate getReferencePriceCertificate(){
		return this.referencePriceCertificate;
	}

	
	public void setMainImageThreeToFour(String mainImageThreeToFour){
		this.mainImageThreeToFour = mainImageThreeToFour;
	}

	
	public String getMainImageThreeToFour(){
		return this.mainImageThreeToFour;
	}

	
	public void setUnitPriceInfo(UnitPriceInfo unitPriceInfo){
		this.unitPriceInfo = unitPriceInfo;
	}

	
	public UnitPriceInfo getUnitPriceInfo(){
		return this.unitPriceInfo;
	}

	
	public void setQualityInspectionInfo(QualityInspectionInfo qualityInspectionInfo){
		this.qualityInspectionInfo = qualityInspectionInfo;
	}

	
	public QualityInspectionInfo getQualityInspectionInfo(){
		return this.qualityInspectionInfo;
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

	
	public void setSpecPricesV2(List<SpecPricesV2Item> specPricesV2){
		this.specPricesV2 = specPricesV2;
	}

	
	public List<SpecPricesV2Item> getSpecPricesV2(){
		return this.specPricesV2;
	}

	
	public void setSpecInfo(SpecInfo specInfo){
		this.specInfo = specInfo;
	}

	
	public SpecInfo getSpecInfo(){
		return this.specInfo;
	}

	
	public void setWithSkuType(Boolean withSkuType){
		this.withSkuType = withSkuType;
	}

	
	public Boolean getWithSkuType(){
		return this.withSkuType;
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

	
	public void setOpenLogisticsInfo(OpenLogisticsInfo openLogisticsInfo){
		this.openLogisticsInfo = openLogisticsInfo;
	}

	
	public OpenLogisticsInfo getOpenLogisticsInfo(){
		return this.openLogisticsInfo;
	}

	
	public void setCustomProperty(CustomProperty customProperty){
		this.customProperty = customProperty;
	}

	
	public CustomProperty getCustomProperty(){
		return this.customProperty;
	}

	
	public void setIsEvaluateOpened(Boolean isEvaluateOpened){
		this.isEvaluateOpened = isEvaluateOpened;
	}

	
	public Boolean getIsEvaluateOpened(){
		return this.isEvaluateOpened;
	}

	
	public void setDefaultProcessTime(DefaultProcessTime defaultProcessTime){
		this.defaultProcessTime = defaultProcessTime;
	}

	
	public DefaultProcessTime getDefaultProcessTime(){
		return this.defaultProcessTime;
	}

	
	public void setRecommendIds(Map<String,String> recommendIds){
		this.recommendIds = recommendIds;
	}

	
	public Map<String,String> getRecommendIds(){
		return this.recommendIds;
	}

	
	public void setShowCheckoutEntry(Boolean showCheckoutEntry){
		this.showCheckoutEntry = showCheckoutEntry;
	}

	
	public Boolean getShowCheckoutEntry(){
		return this.showCheckoutEntry;
	}

}