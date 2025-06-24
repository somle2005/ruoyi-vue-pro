package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class SkuOrderListItem {


	@SerializedName("gov_subsidy_detail")
	@OpField(desc = "政府补贴信息，比如一品多地", example = "")
	private GovSubsidyDetail govSubsidyDetail;

	@SerializedName("serial_no_info")
	@OpField(desc = "政府补贴序列号信息", example = "")
	private SerialNoInfo serialNoInfo;

	@SerializedName("bmp_seller_type")
	@OpField(desc = "业务身份-卖家身份", example = "xiaodian")
	private String bmpSellerType;

	@SerializedName("bmp_vertical_market")
	@OpField(desc = "业务身份-垂类", example = "giftcard")
	private String bmpVerticalMarket;

	@SerializedName("bmp_source")
	@OpField(desc = "业务身份-来源", example = "flower")
	private String bmpSource;

	@SerializedName("sku_period_purchase_info")
	@OpField(desc = "周期购sku单信息", example = "")
	private SkuPeriodPurchaseInfo skuPeriodPurchaseInfo;

	@SerializedName("sp_product_id")
	@OpField(desc = "服务商品编码，如维修单的服务商品编码", example = "32467832")
	private String spProductId;

	@SerializedName("relation_sku_order_ids")
	@OpField(desc = "商品单相关联的商品单号，如维修主商品单关联的维修单商品单号", example = "[6374932845093]")
	private List<String> relationSkuOrderIds;

	@SerializedName("custom_properties")
	@OpField(desc = "商品属性，适用于外卖或即时零售场景下商品存在属性的情况", example = "")
	private List<CustomPropertiesItem> customProperties;

	@SerializedName("sku_cargo_future_stock")
	@OpField(desc = "库存扣减信息", example = "")
	private SkuCargoFutureStock skuCargoFutureStock;

	@SerializedName("promotion_detail")
	@OpField(desc = "优惠信息，用户下单过程中享受到的优惠", example = "")
	private PromotionDetail promotionDetail;

	@SerializedName("product_channel_info")
	@OpField(desc = "渠道商品信息", example = "")
	private ProductChannelInfo productChannelInfo;

	@SerializedName("low_price_info")
	@OpField(desc = "超值购信息", example = "")
	private LowPriceInfo lowPriceInfo;

	@SerializedName("packing_charge_amount")
	@OpField(desc = "打包费，单位：分", example = "100")
	private Long packingChargeAmount;

	@SerializedName("extra_info")
	@OpField(desc = "商品单额外信息如商品69码：barcodes: [6970848860361]", example = "{barcodes: [6970848860361]}")
	private Map<String,String> extraInfo;

	@SerializedName("voucher_deduction_amount")
	@OpField(desc = "提货券商品抵扣金额；单位：分", example = "200")
	private Long voucherDeductionAmount;

	@SerializedName("free_interest")
	@OpField(desc = "商品单，抖音月付信息", example = "")
	private FreeInterest_4_4 freeInterest;

	@SerializedName("promotion_pay_amount_details")
	@OpField(desc = "支付优惠详情，与promotion_pay_amount对应", example = "")
	private List<PromotionPayAmountDetailsItem> promotionPayAmountDetails;

	@SerializedName("goods_price")
	@OpField(desc = "商品原价", example = "100")
	private Long goodsPrice;

	@SerializedName("quality_inspection_status")
	@OpField(desc = "质检状态；0-无需质检;1-可质检;2-必须质检", example = "0")
	private Long qualityInspectionStatus;

	@SerializedName("order_id")
	@OpField(desc = "商品订单号", example = "4781320682406083640")
	private String orderId;

	@SerializedName("parent_order_id")
	@OpField(desc = "父订单号（店铺订单号）", example = "4781320682406083640")
	private String parentOrderId;

	@SerializedName("order_level")
	@OpField(desc = "订单层级", example = "3")
	private Long orderLevel;

	@SerializedName("biz")
	@OpField(desc = "【业务来源】 1、鲁班 2、小店 3、好好学习 4、ev 5、虚拟 6、建站 7、核销 8、玉石 9、ez 10、ep 11、虚拟卡券 12、服务市场 13、EP视频课 14、EP直播课 21、跨境BBC 22、跨境BC 23、跨境CC,UPC 24、手机充值 25、拍卖保证金 26、懂车帝抵扣券 27、懂车帝返现券 28、离岛免税 29、海南会员购 30、抽奖 32、dou+券 76、大闸蟹 99、保险 102、小店海外", example = "1")
	private Long biz;

	@SerializedName("biz_desc")
	@OpField(desc = "业务来源描述", example = "鲁班")
	private String bizDesc;

	@SerializedName("order_type")
	@OpField(desc = "【订单类型】 0、普通订单 2、虚拟商品订单 4、电子券（poi核销） 5、三方核销", example = "0")
	private Long orderType;

	@SerializedName("order_type_desc")
	@OpField(desc = "订单类型描述", example = "普通订单")
	private String orderTypeDesc;

	@SerializedName("trade_type")
	@OpField(desc = "交易类型；0-普通；1-拼团；2-定金预售；3-订金找货；4-拍卖；5-0元单；6-回收；7-寄卖；10-寄样；11-零元抽奖；12-达人买样；13-普通定制；16-大众竞拍；18-小时达；102-定金预售的赠品单；103-收款；和trade_type_desc成对出现", example = "1")
	private Long tradeType;

	@SerializedName("trade_type_desc")
	@OpField(desc = "交易类型描述；和trade_type成对出现", example = "拼团")
	private String tradeTypeDesc;

	@SerializedName("order_status")
	@OpField(desc = "订单状态", example = "3")
	private Long orderStatus;

	@SerializedName("order_status_desc")
	@OpField(desc = "订单状态描述", example = "待支付")
	private String orderStatusDesc;

	@SerializedName("main_status")
	@OpField(desc = "主流程状态", example = "103")
	private Long mainStatus;

	@SerializedName("main_status_desc")
	@OpField(desc = "主流程状态描述", example = "部分支付")
	private String mainStatusDesc;

	@SerializedName("pay_time")
	@OpField(desc = "支付时间", example = "1617355413")
	private Long payTime;

	@SerializedName("order_expire_time")
	@OpField(desc = "订单过期时间", example = "1800")
	private Long orderExpireTime;

	@SerializedName("finish_time")
	@OpField(desc = "订单完成时间", example = "1617355413")
	private Long finishTime;

	@SerializedName("create_time")
	@OpField(desc = "下单时间", example = "1617355413")
	private Long createTime;

	@SerializedName("update_time")
	@OpField(desc = "订单更新时间", example = "1617355413")
	private Long updateTime;

	@SerializedName("cancel_reason")
	@OpField(desc = "取消原因", example = "不想要")
	private String cancelReason;

	@SerializedName("b_type")
	@OpField(desc = "【下单端】 0、站外 1、火山 2、抖音 3、头条 4、西瓜 5、微信 6、值点app 7、头条lite 8、懂车帝 9、皮皮虾 11、抖音极速版 12、TikTok 13、musically 14、穿山甲 15、火山极速版 16、服务市场 26、番茄小说 27、UG教育营销电商平台 28、Jumanji 29、电商SDK", example = "1")
	private Long bType;

	@SerializedName("b_type_desc")
	@OpField(desc = "下单端描述", example = "抖音")
	private String bTypeDesc;

	@SerializedName("sub_b_type")
	@OpField(desc = "【下单场景】 0、未知 1、app内-原生 2、app内-小程序 3、H5 13、电商SDK-头条 35、电商SDK-头条lite", example = "1")
	private Long subBType;

	@SerializedName("sub_b_type_desc")
	@OpField(desc = "下单场景描述", example = "小程序")
	private String subBTypeDesc;

	@SerializedName("send_pay")
	@OpField(desc = "已废弃，不推荐使用。流量来源：1-鲁班广告 2-联盟 3-商城 4-自主经营 5-线索通支付表单 6-抖音门店 7-抖+ 8-穿山甲", example = "1")
	private Long sendPay;

	@SerializedName("send_pay_desc")
	@OpField(desc = "已废弃，不推荐使用。流量来源描述", example = "鲁班广告")
	private String sendPayDesc;

	@SerializedName("author_id")
	@OpField(desc = "直播主播id（达人）", example = "324234453")
	private Long authorId;

	@SerializedName("author_name")
	@OpField(desc = "直播主播名称", example = "XXXX")
	private String authorName;

	@SerializedName("theme_type")
	@OpField(desc = "【下单来源】 0、其他 1、直播间", example = "1")
	private String themeType;

	@SerializedName("theme_type_desc")
	@OpField(desc = "下单来源描述", example = "直播间")
	private String themeTypeDesc;

	@SerializedName("app_id")
	@OpField(desc = "小程序id", example = "43545454556")
	private Long appId;

	@SerializedName("room_id")
	@OpField(desc = "直播间id", example = "43545454556")
	private Long roomId;

	@SerializedName("content_id")
	@OpField(desc = "内容id", example = "43545454556")
	private String contentId;

	@SerializedName("video_id")
	@OpField(desc = "视频id", example = "43545454556")
	private String videoId;

	@SerializedName("origin_id")
	@OpField(desc = "流量来源id", example = "43545454556")
	private String originId;

	@SerializedName("cid")
	@OpField(desc = "创意id（creative_id）", example = "43545454556")
	private Long cid;

	@SerializedName("c_biz")
	@OpField(desc = "【C端流量来源】 0-unknown 2-精选联盟 8-小店自卖", example = "1")
	private Long cBiz;

	@SerializedName("c_biz_desc")
	@OpField(desc = "C端流量来源业务类型描述", example = "精选联盟")
	private String cBizDesc;

	@SerializedName("page_id")
	@OpField(desc = "鲁班广告落地页ID", example = "43545454556")
	private Long pageId;

	@SerializedName("pay_type")
	@OpField(desc = "【支付类型】 0、货到付款 1 、微信 2、支付宝 3、小程序 4、银行卡 5、余额 7、无需支付（0元单） 8、DOU分期（信用支付） 9、新卡支付", example = "1")
	private Long payType;

	@SerializedName("channel_payment_no")
	@OpField(desc = "支付渠道的流水号", example = "PAY234532534534")
	private String channelPaymentNo;

	@SerializedName("order_amount")
	@OpField(desc = "订单金额（单位：分）", example = "600")
	private Long orderAmount;

	@SerializedName("pay_amount")
	@OpField(desc = "支付金额（单位：分）", example = "500")
	private Long payAmount;

	@SerializedName("post_insurance_amount")
	@OpField(desc = "运费险金额（单位：分）", example = "10")
	private Long postInsuranceAmount;

	@SerializedName("modify_amount")
	@OpField(desc = "改价金额变化量（单位：分）", example = "-10")
	private Long modifyAmount;

	@SerializedName("modify_post_amount")
	@OpField(desc = "改价运费金额变化量（单位：分）", example = "-1")
	private Long modifyPostAmount;

	@SerializedName("promotion_amount")
	@OpField(desc = "订单优惠总金额（单位：分）= 店铺优惠金额+ 平台优惠金额+ 达人优惠金额", example = "1000")
	private Long promotionAmount;

	@SerializedName("promotion_shop_amount")
	@OpField(desc = "店铺优惠金额（单位：分），属于店铺的优惠活动、优惠券、红包的总优惠金额", example = "100")
	private Long promotionShopAmount;

	@SerializedName("promotion_platform_amount")
	@OpField(desc = "平台优惠金额（单位：分），属于平台的优惠活动、优惠券、红包的总优惠金额", example = "100")
	private Long promotionPlatformAmount;

	@SerializedName("shop_cost_amount")
	@OpField(desc = "商家承担金额（单位：分），订单参与活动和优惠中商家承担部分的总金额", example = "100")
	private Long shopCostAmount;

	@SerializedName("platform_cost_amount")
	@OpField(desc = "平台承担金额（单位：分），订单参与活动和优惠中平台+作者（达人）承担部分的总金额,包含作者（达人）承担金额：platform_cost_amount = only_platform_cost_amount + author_cost_amount", example = "100")
	private Long platformCostAmount;

	@SerializedName("promotion_talent_amount")
	@OpField(desc = "达人优惠金额（单位：分），属于达人的优惠活动、优惠券、红包的总优惠金额", example = "100")
	private Long promotionTalentAmount;

	@SerializedName("promotion_pay_amount")
	@OpField(desc = "支付优惠金额（单位：分），支付渠道上的优惠金额", example = "10")
	private Long promotionPayAmount;

	@SerializedName("code")
	@OpField(desc = "商家后台商品编码", example = "djfafj")
	private String code;

	@SerializedName("post_tel")
	@OpField(desc = "收件人电话", example = "12345678911")
	private String postTel;

	@SerializedName("encrypt_post_tel")
	@OpField(desc = "收件人电话", example = "12345678911")
	private String encryptPostTel;

	@SerializedName("post_receiver")
	@OpField(desc = "收件人姓名", example = "张三")
	private String postReceiver;

	@SerializedName("encrypt_post_receiver")
	@OpField(desc = "收件人姓名", example = "张三")
	private String encryptPostReceiver;

	@SerializedName("post_addr")
	@OpField(desc = "收件人地址", example = "")
	private PostAddr postAddr;

	@SerializedName("exp_ship_time")
	@OpField(desc = "预计发货时间", example = "1617355413")
	private Long expShipTime;

	@SerializedName("ship_time")
	@OpField(desc = "发货时间", example = "1617355413")
	private Long shipTime;

	@SerializedName("logistics_receipt_time")
	@OpField(desc = "物流收货时间", example = "1617355413")
	private Long logisticsReceiptTime;

	@SerializedName("confirm_receipt_time")
	@OpField(desc = "用户确认收货时间", example = "1617355413")
	private Long confirmReceiptTime;

	@SerializedName("goods_type")
	@OpField(desc = "【商品类型】 0、实体 1、虚拟", example = "1")
	private Long goodsType;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "3473196049974326153")
	private Long productId;

	@SerializedName("sku_id")
	@OpField(desc = "商品skuId", example = "3254535")
	private Long skuId;

	@SerializedName("spec")
	@OpField(desc = "规格信息", example = "")
	private List<SpecItem> spec;

	@SerializedName("first_cid")
	@OpField(desc = "一级类目", example = "20005")
	private Long firstCid;

	@SerializedName("second_cid")
	@OpField(desc = "二级类目", example = "20174")
	private Long secondCid;

	@SerializedName("third_cid")
	@OpField(desc = "三级类目", example = "20174")
	private Long thirdCid;

	@SerializedName("fourth_cid")
	@OpField(desc = "四级类目", example = "20174")
	private Long fourthCid;

	@SerializedName("out_sku_id")
	@OpField(desc = "外部Skuid", example = "43564553")
	private String outSkuId;

	@SerializedName("supplier_id")
	@OpField(desc = "sku外部供应商编码", example = "fsgfgsdg")
	private String supplierId;

	@SerializedName("out_product_id")
	@OpField(desc = "商品外部编码", example = "432655662343")
	private String outProductId;

	@SerializedName("warehouse_ids")
	@OpField(desc = "仓id，废弃，使用inventory_list", example = "[49574835439,954764056]")
	private List<String> warehouseIds;

	@SerializedName("out_warehouse_ids")
	@OpField(desc = "外部仓id，废弃，使用inventory_list", example = "[49574835439,954764056]")
	private List<String> outWarehouseIds;

	@SerializedName("inventory_type")
	@OpField(desc = "库存类型，普通库存/区域库存，废弃，使用inventory_list", example = "2")
	private String inventoryType;

	@SerializedName("inventory_type_desc")
	@OpField(desc = "库存类型描述，废弃，使用inventory_list", example = "普通库存")
	private String inventoryTypeDesc;

	@SerializedName("reduce_stock_type")
	@OpField(desc = "【库存扣减方式】 1、下单减库存 2、支付减库存", example = "1")
	private Long reduceStockType;

	@SerializedName("reduce_stock_type_desc")
	@OpField(desc = "库存扣减方式名称", example = "下单减库存")
	private String reduceStockTypeDesc;

	@SerializedName("origin_amount")
	@OpField(desc = "商品现价（单位：分）", example = "100")
	private Long originAmount;

	@SerializedName("has_tax")
	@OpField(desc = "是否包税", example = "true")
	private Boolean hasTax;

	@SerializedName("item_num")
	@OpField(desc = "订单商品数量", example = "2")
	private Long itemNum;

	@SerializedName("sum_amount")
	@OpField(desc = "商品现价*件数", example = "200")
	private Long sumAmount;

	@SerializedName("source_platform")
	@OpField(desc = "商品来源平台", example = "XXX")
	private String sourcePlatform;

	@SerializedName("product_pic")
	@OpField(desc = "商品图片", example = "https:xxxxx")
	private String productPic;

	@SerializedName("is_comment")
	@OpField(desc = "是否评价 :1已评价，0未评价，2表示追评", example = "1")
	private Long isComment;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "衣服")
	private String productName;

	@SerializedName("inventory_list")
	@OpField(desc = "仓库信息", example = "")
	private List<InventoryListItem> inventoryList;

	@SerializedName("post_amount")
	@OpField(desc = "运费（单位：分）", example = "1")
	private Long postAmount;

	@SerializedName("pre_sale_type")
	@OpField(desc = "预售类型 ，0 现货类型，1 全款预售 2 阶梯发货", example = "1")
	private Long preSaleType;

	@SerializedName("after_sale_info")
	@OpField(desc = "售后信息", example = "")
	private AfterSaleInfo afterSaleInfo;

	@SerializedName("promotion_redpack_amount")
	@OpField(desc = "红包优惠金额（单位：分）", example = "100")
	private Long promotionRedpackAmount;

	@SerializedName("promotion_redpack_platform_amount")
	@OpField(desc = "平台红包优惠金额（单位：分），属于平台的红包的优惠金额", example = "100")
	private Long promotionRedpackPlatformAmount;

	@SerializedName("promotion_redpack_talent_amount")
	@OpField(desc = "达人红包优惠金额（单位：分），属于达人的红包的优惠金额", example = "100")
	private Long promotionRedpackTalentAmount;

	@SerializedName("receive_type")
	@OpField(desc = "1:邮寄，2:自提", example = "1")
	private Long receiveType;

	@SerializedName("need_serial_number")
	@OpField(desc = "是否需要上传序列号，用于判断发货时是否需要上传商品序列号（IMEI码或SN码），true 表示是3C数码商品，需要上传序列号", example = "false")
	private Boolean needSerialNumber;

	@SerializedName("ad_env_type")
	@OpField(desc = "广告来源，video：短视频 live：直播", example = "live")
	private String adEnvType;

	@SerializedName("sku_order_tag_ui")
	@OpField(desc = "商品单标签", example = "")
	private List<SkuOrderTagUiItem> skuOrderTagUi;

	@SerializedName("product_id_str")
	@OpField(desc = "商品ID，字符串型", example = "3473196049974326153")
	private String productIdStr;

	@SerializedName("appointment_ship_time")
	@OpField(desc = "预约发货时间", example = "1617355413")
	private Long appointmentShipTime;

	@SerializedName("room_id_str")
	@OpField(desc = "直播房间ID，字符串类型", example = "147319604997432615")
	private String roomIdStr;

	@SerializedName("given_product_type")
	@OpField(desc = "绑定类型 MASTER-主品单 FREE-免费赠品", example = "FREE")
	private String givenProductType;

	@SerializedName("master_sku_order_id")
	@OpField(desc = "废弃，使用master_sku_order_id_list；绑定的主品sku单单号 如果given_product_type=FREE 则master_sku_order_id_list为主品sku单单号", example = "4781320682406083640")
	private String masterSkuOrderId;

	@SerializedName("card_voucher")
	@OpField(desc = "商品卡券基本信息", example = "")
	private CardVoucher cardVoucher;

	@SerializedName("bundle_sku_info")
	@OpField(desc = "组套商品子商品列表", example = "")
	private List<BundleSkuInfoItem> bundleSkuInfo;

	@SerializedName("account_list")
	@OpField(desc = "账号信息list", example = "")
	private AccountList accountList;

	@SerializedName("sku_customization_info")
	@OpField(desc = "定制商品信息", example = "")
	private List<SkuCustomizationInfoItem> skuCustomizationInfo;

	@SerializedName("author_cost_amount")
	@OpField(desc = "作者（达人）承担金额（单位：分），订单参与活动和优惠中作者（达人）承担部分的总金额", example = "100")
	private Long authorCostAmount;

	@SerializedName("only_platform_cost_amount")
	@OpField(desc = "仅平台承担金额（单位：分），订单参与活动和优惠中平台承担部分的总金额", example = "100")
	private Long onlyPlatformCostAmount;

	@SerializedName("promise_info")
	@OpField(desc = "履约时效信息(json串)", example = "{identifier:R#2022-07-13,receipt:{FulfillDecisionId:7117833576879604004,LatestPushTime:1657533600,PromiseTag:ENUM:NEXT2_DAY,ExpReceiptTime:1657727999,RealWarehouseCode:101}}")
	private String promiseInfo;

	@SerializedName("store_info")
	@OpField(desc = "门店信息", example = "")
	private StoreInfo storeInfo;

	@SerializedName("mask_post_receiver")
	@OpField(desc = "收件人姓名（脱敏后）", example = "王**")
	private String maskPostReceiver;

	@SerializedName("mask_post_tel")
	@OpField(desc = "收件人电话（脱敏后）", example = "1********35")
	private String maskPostTel;

	@SerializedName("mask_post_addr")
	@OpField(desc = "收件人地址（脱敏后）", example = "")
	private MaskPostAddr maskPostAddr;

	@SerializedName("contract_info")
	@OpField(desc = "合约信息", example = "")
	private ContractInfo contractInfo;

	@SerializedName("master_sku_order_id_list")
	@OpField(desc = "绑定的主品sku单单号 如果given_product_type=FREE 则master_sku_order_id为主品sku单单号", example = "[4781320682406083640]")
	private List<String> masterSkuOrderIdList;

	@SerializedName("given_product_activity_info")
	@OpField(desc = "赠品活动信息", example = "")
	private GivenProductActivityInfo givenProductActivityInfo;

	@SerializedName("quality_check_info")
	@OpField(desc = "质检信息", example = "")
	private QualityCheckInfo qualityCheckInfo;

	@SerializedName("sku_yun_warehouse_info")
	@OpField(desc = "sku云仓择仓信息（云仓业务使用，非商品区域仓功能使用）", example = "")
	private List<SkuYunWarehouseInfoItem> skuYunWarehouseInfo;

	@SerializedName("tax_amount")
	@OpField(desc = "税费", example = "8")
	private Long taxAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setGovSubsidyDetail(GovSubsidyDetail govSubsidyDetail){
		this.govSubsidyDetail = govSubsidyDetail;
	}

	
	public GovSubsidyDetail getGovSubsidyDetail(){
		return this.govSubsidyDetail;
	}

	
	public void setSerialNoInfo(SerialNoInfo serialNoInfo){
		this.serialNoInfo = serialNoInfo;
	}

	
	public SerialNoInfo getSerialNoInfo(){
		return this.serialNoInfo;
	}

	
	public void setBmpSellerType(String bmpSellerType){
		this.bmpSellerType = bmpSellerType;
	}

	
	public String getBmpSellerType(){
		return this.bmpSellerType;
	}

	
	public void setBmpVerticalMarket(String bmpVerticalMarket){
		this.bmpVerticalMarket = bmpVerticalMarket;
	}

	
	public String getBmpVerticalMarket(){
		return this.bmpVerticalMarket;
	}

	
	public void setBmpSource(String bmpSource){
		this.bmpSource = bmpSource;
	}

	
	public String getBmpSource(){
		return this.bmpSource;
	}

	
	public void setSkuPeriodPurchaseInfo(SkuPeriodPurchaseInfo skuPeriodPurchaseInfo){
		this.skuPeriodPurchaseInfo = skuPeriodPurchaseInfo;
	}

	
	public SkuPeriodPurchaseInfo getSkuPeriodPurchaseInfo(){
		return this.skuPeriodPurchaseInfo;
	}

	
	public void setSpProductId(String spProductId){
		this.spProductId = spProductId;
	}

	
	public String getSpProductId(){
		return this.spProductId;
	}

	
	public void setRelationSkuOrderIds(List<String> relationSkuOrderIds){
		this.relationSkuOrderIds = relationSkuOrderIds;
	}

	
	public List<String> getRelationSkuOrderIds(){
		return this.relationSkuOrderIds;
	}

	
	public void setCustomProperties(List<CustomPropertiesItem> customProperties){
		this.customProperties = customProperties;
	}

	
	public List<CustomPropertiesItem> getCustomProperties(){
		return this.customProperties;
	}

	
	public void setSkuCargoFutureStock(SkuCargoFutureStock skuCargoFutureStock){
		this.skuCargoFutureStock = skuCargoFutureStock;
	}

	
	public SkuCargoFutureStock getSkuCargoFutureStock(){
		return this.skuCargoFutureStock;
	}

	
	public void setPromotionDetail(PromotionDetail promotionDetail){
		this.promotionDetail = promotionDetail;
	}

	
	public PromotionDetail getPromotionDetail(){
		return this.promotionDetail;
	}

	
	public void setProductChannelInfo(ProductChannelInfo productChannelInfo){
		this.productChannelInfo = productChannelInfo;
	}

	
	public ProductChannelInfo getProductChannelInfo(){
		return this.productChannelInfo;
	}

	
	public void setLowPriceInfo(LowPriceInfo lowPriceInfo){
		this.lowPriceInfo = lowPriceInfo;
	}

	
	public LowPriceInfo getLowPriceInfo(){
		return this.lowPriceInfo;
	}

	
	public void setPackingChargeAmount(Long packingChargeAmount){
		this.packingChargeAmount = packingChargeAmount;
	}

	
	public Long getPackingChargeAmount(){
		return this.packingChargeAmount;
	}

	
	public void setExtraInfo(Map<String,String> extraInfo){
		this.extraInfo = extraInfo;
	}

	
	public Map<String,String> getExtraInfo(){
		return this.extraInfo;
	}

	
	public void setVoucherDeductionAmount(Long voucherDeductionAmount){
		this.voucherDeductionAmount = voucherDeductionAmount;
	}

	
	public Long getVoucherDeductionAmount(){
		return this.voucherDeductionAmount;
	}

	
	public void setFreeInterest(FreeInterest_4_4 freeInterest){
		this.freeInterest = freeInterest;
	}

	
	public FreeInterest_4_4 getFreeInterest(){
		return this.freeInterest;
	}

	
	public void setPromotionPayAmountDetails(List<PromotionPayAmountDetailsItem> promotionPayAmountDetails){
		this.promotionPayAmountDetails = promotionPayAmountDetails;
	}

	
	public List<PromotionPayAmountDetailsItem> getPromotionPayAmountDetails(){
		return this.promotionPayAmountDetails;
	}

	
	public void setGoodsPrice(Long goodsPrice){
		this.goodsPrice = goodsPrice;
	}

	
	public Long getGoodsPrice(){
		return this.goodsPrice;
	}

	
	public void setQualityInspectionStatus(Long qualityInspectionStatus){
		this.qualityInspectionStatus = qualityInspectionStatus;
	}

	
	public Long getQualityInspectionStatus(){
		return this.qualityInspectionStatus;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setParentOrderId(String parentOrderId){
		this.parentOrderId = parentOrderId;
	}

	
	public String getParentOrderId(){
		return this.parentOrderId;
	}

	
	public void setOrderLevel(Long orderLevel){
		this.orderLevel = orderLevel;
	}

	
	public Long getOrderLevel(){
		return this.orderLevel;
	}

	
	public void setBiz(Long biz){
		this.biz = biz;
	}

	
	public Long getBiz(){
		return this.biz;
	}

	
	public void setBizDesc(String bizDesc){
		this.bizDesc = bizDesc;
	}

	
	public String getBizDesc(){
		return this.bizDesc;
	}

	
	public void setOrderType(Long orderType){
		this.orderType = orderType;
	}

	
	public Long getOrderType(){
		return this.orderType;
	}

	
	public void setOrderTypeDesc(String orderTypeDesc){
		this.orderTypeDesc = orderTypeDesc;
	}

	
	public String getOrderTypeDesc(){
		return this.orderTypeDesc;
	}

	
	public void setTradeType(Long tradeType){
		this.tradeType = tradeType;
	}

	
	public Long getTradeType(){
		return this.tradeType;
	}

	
	public void setTradeTypeDesc(String tradeTypeDesc){
		this.tradeTypeDesc = tradeTypeDesc;
	}

	
	public String getTradeTypeDesc(){
		return this.tradeTypeDesc;
	}

	
	public void setOrderStatus(Long orderStatus){
		this.orderStatus = orderStatus;
	}

	
	public Long getOrderStatus(){
		return this.orderStatus;
	}

	
	public void setOrderStatusDesc(String orderStatusDesc){
		this.orderStatusDesc = orderStatusDesc;
	}

	
	public String getOrderStatusDesc(){
		return this.orderStatusDesc;
	}

	
	public void setMainStatus(Long mainStatus){
		this.mainStatus = mainStatus;
	}

	
	public Long getMainStatus(){
		return this.mainStatus;
	}

	
	public void setMainStatusDesc(String mainStatusDesc){
		this.mainStatusDesc = mainStatusDesc;
	}

	
	public String getMainStatusDesc(){
		return this.mainStatusDesc;
	}

	
	public void setPayTime(Long payTime){
		this.payTime = payTime;
	}

	
	public Long getPayTime(){
		return this.payTime;
	}

	
	public void setOrderExpireTime(Long orderExpireTime){
		this.orderExpireTime = orderExpireTime;
	}

	
	public Long getOrderExpireTime(){
		return this.orderExpireTime;
	}

	
	public void setFinishTime(Long finishTime){
		this.finishTime = finishTime;
	}

	
	public Long getFinishTime(){
		return this.finishTime;
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

	
	public void setCancelReason(String cancelReason){
		this.cancelReason = cancelReason;
	}

	
	public String getCancelReason(){
		return this.cancelReason;
	}

	
	public void setBType(Long bType){
		this.bType = bType;
	}

	
	public Long getBType(){
		return this.bType;
	}

	
	public void setBTypeDesc(String bTypeDesc){
		this.bTypeDesc = bTypeDesc;
	}

	
	public String getBTypeDesc(){
		return this.bTypeDesc;
	}

	
	public void setSubBType(Long subBType){
		this.subBType = subBType;
	}

	
	public Long getSubBType(){
		return this.subBType;
	}

	
	public void setSubBTypeDesc(String subBTypeDesc){
		this.subBTypeDesc = subBTypeDesc;
	}

	
	public String getSubBTypeDesc(){
		return this.subBTypeDesc;
	}

	
	public void setSendPay(Long sendPay){
		this.sendPay = sendPay;
	}

	
	public Long getSendPay(){
		return this.sendPay;
	}

	
	public void setSendPayDesc(String sendPayDesc){
		this.sendPayDesc = sendPayDesc;
	}

	
	public String getSendPayDesc(){
		return this.sendPayDesc;
	}

	
	public void setAuthorId(Long authorId){
		this.authorId = authorId;
	}

	
	public Long getAuthorId(){
		return this.authorId;
	}

	
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}

	
	public String getAuthorName(){
		return this.authorName;
	}

	
	public void setThemeType(String themeType){
		this.themeType = themeType;
	}

	
	public String getThemeType(){
		return this.themeType;
	}

	
	public void setThemeTypeDesc(String themeTypeDesc){
		this.themeTypeDesc = themeTypeDesc;
	}

	
	public String getThemeTypeDesc(){
		return this.themeTypeDesc;
	}

	
	public void setAppId(Long appId){
		this.appId = appId;
	}

	
	public Long getAppId(){
		return this.appId;
	}

	
	public void setRoomId(Long roomId){
		this.roomId = roomId;
	}

	
	public Long getRoomId(){
		return this.roomId;
	}

	
	public void setContentId(String contentId){
		this.contentId = contentId;
	}

	
	public String getContentId(){
		return this.contentId;
	}

	
	public void setVideoId(String videoId){
		this.videoId = videoId;
	}

	
	public String getVideoId(){
		return this.videoId;
	}

	
	public void setOriginId(String originId){
		this.originId = originId;
	}

	
	public String getOriginId(){
		return this.originId;
	}

	
	public void setCid(Long cid){
		this.cid = cid;
	}

	
	public Long getCid(){
		return this.cid;
	}

	
	public void setCBiz(Long cBiz){
		this.cBiz = cBiz;
	}

	
	public Long getCBiz(){
		return this.cBiz;
	}

	
	public void setCBizDesc(String cBizDesc){
		this.cBizDesc = cBizDesc;
	}

	
	public String getCBizDesc(){
		return this.cBizDesc;
	}

	
	public void setPageId(Long pageId){
		this.pageId = pageId;
	}

	
	public Long getPageId(){
		return this.pageId;
	}

	
	public void setPayType(Long payType){
		this.payType = payType;
	}

	
	public Long getPayType(){
		return this.payType;
	}

	
	public void setChannelPaymentNo(String channelPaymentNo){
		this.channelPaymentNo = channelPaymentNo;
	}

	
	public String getChannelPaymentNo(){
		return this.channelPaymentNo;
	}

	
	public void setOrderAmount(Long orderAmount){
		this.orderAmount = orderAmount;
	}

	
	public Long getOrderAmount(){
		return this.orderAmount;
	}

	
	public void setPayAmount(Long payAmount){
		this.payAmount = payAmount;
	}

	
	public Long getPayAmount(){
		return this.payAmount;
	}

	
	public void setPostInsuranceAmount(Long postInsuranceAmount){
		this.postInsuranceAmount = postInsuranceAmount;
	}

	
	public Long getPostInsuranceAmount(){
		return this.postInsuranceAmount;
	}

	
	public void setModifyAmount(Long modifyAmount){
		this.modifyAmount = modifyAmount;
	}

	
	public Long getModifyAmount(){
		return this.modifyAmount;
	}

	
	public void setModifyPostAmount(Long modifyPostAmount){
		this.modifyPostAmount = modifyPostAmount;
	}

	
	public Long getModifyPostAmount(){
		return this.modifyPostAmount;
	}

	
	public void setPromotionAmount(Long promotionAmount){
		this.promotionAmount = promotionAmount;
	}

	
	public Long getPromotionAmount(){
		return this.promotionAmount;
	}

	
	public void setPromotionShopAmount(Long promotionShopAmount){
		this.promotionShopAmount = promotionShopAmount;
	}

	
	public Long getPromotionShopAmount(){
		return this.promotionShopAmount;
	}

	
	public void setPromotionPlatformAmount(Long promotionPlatformAmount){
		this.promotionPlatformAmount = promotionPlatformAmount;
	}

	
	public Long getPromotionPlatformAmount(){
		return this.promotionPlatformAmount;
	}

	
	public void setShopCostAmount(Long shopCostAmount){
		this.shopCostAmount = shopCostAmount;
	}

	
	public Long getShopCostAmount(){
		return this.shopCostAmount;
	}

	
	public void setPlatformCostAmount(Long platformCostAmount){
		this.platformCostAmount = platformCostAmount;
	}

	
	public Long getPlatformCostAmount(){
		return this.platformCostAmount;
	}

	
	public void setPromotionTalentAmount(Long promotionTalentAmount){
		this.promotionTalentAmount = promotionTalentAmount;
	}

	
	public Long getPromotionTalentAmount(){
		return this.promotionTalentAmount;
	}

	
	public void setPromotionPayAmount(Long promotionPayAmount){
		this.promotionPayAmount = promotionPayAmount;
	}

	
	public Long getPromotionPayAmount(){
		return this.promotionPayAmount;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setPostTel(String postTel){
		this.postTel = postTel;
	}

	
	public String getPostTel(){
		return this.postTel;
	}

	
	public void setEncryptPostTel(String encryptPostTel){
		this.encryptPostTel = encryptPostTel;
	}

	
	public String getEncryptPostTel(){
		return this.encryptPostTel;
	}

	
	public void setPostReceiver(String postReceiver){
		this.postReceiver = postReceiver;
	}

	
	public String getPostReceiver(){
		return this.postReceiver;
	}

	
	public void setEncryptPostReceiver(String encryptPostReceiver){
		this.encryptPostReceiver = encryptPostReceiver;
	}

	
	public String getEncryptPostReceiver(){
		return this.encryptPostReceiver;
	}

	
	public void setPostAddr(PostAddr postAddr){
		this.postAddr = postAddr;
	}

	
	public PostAddr getPostAddr(){
		return this.postAddr;
	}

	
	public void setExpShipTime(Long expShipTime){
		this.expShipTime = expShipTime;
	}

	
	public Long getExpShipTime(){
		return this.expShipTime;
	}

	
	public void setShipTime(Long shipTime){
		this.shipTime = shipTime;
	}

	
	public Long getShipTime(){
		return this.shipTime;
	}

	
	public void setLogisticsReceiptTime(Long logisticsReceiptTime){
		this.logisticsReceiptTime = logisticsReceiptTime;
	}

	
	public Long getLogisticsReceiptTime(){
		return this.logisticsReceiptTime;
	}

	
	public void setConfirmReceiptTime(Long confirmReceiptTime){
		this.confirmReceiptTime = confirmReceiptTime;
	}

	
	public Long getConfirmReceiptTime(){
		return this.confirmReceiptTime;
	}

	
	public void setGoodsType(Long goodsType){
		this.goodsType = goodsType;
	}

	
	public Long getGoodsType(){
		return this.goodsType;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setSpec(List<SpecItem> spec){
		this.spec = spec;
	}

	
	public List<SpecItem> getSpec(){
		return this.spec;
	}

	
	public void setFirstCid(Long firstCid){
		this.firstCid = firstCid;
	}

	
	public Long getFirstCid(){
		return this.firstCid;
	}

	
	public void setSecondCid(Long secondCid){
		this.secondCid = secondCid;
	}

	
	public Long getSecondCid(){
		return this.secondCid;
	}

	
	public void setThirdCid(Long thirdCid){
		this.thirdCid = thirdCid;
	}

	
	public Long getThirdCid(){
		return this.thirdCid;
	}

	
	public void setFourthCid(Long fourthCid){
		this.fourthCid = fourthCid;
	}

	
	public Long getFourthCid(){
		return this.fourthCid;
	}

	
	public void setOutSkuId(String outSkuId){
		this.outSkuId = outSkuId;
	}

	
	public String getOutSkuId(){
		return this.outSkuId;
	}

	
	public void setSupplierId(String supplierId){
		this.supplierId = supplierId;
	}

	
	public String getSupplierId(){
		return this.supplierId;
	}

	
	public void setOutProductId(String outProductId){
		this.outProductId = outProductId;
	}

	
	public String getOutProductId(){
		return this.outProductId;
	}

	
	public void setWarehouseIds(List<String> warehouseIds){
		this.warehouseIds = warehouseIds;
	}

	
	public List<String> getWarehouseIds(){
		return this.warehouseIds;
	}

	
	public void setOutWarehouseIds(List<String> outWarehouseIds){
		this.outWarehouseIds = outWarehouseIds;
	}

	
	public List<String> getOutWarehouseIds(){
		return this.outWarehouseIds;
	}

	
	public void setInventoryType(String inventoryType){
		this.inventoryType = inventoryType;
	}

	
	public String getInventoryType(){
		return this.inventoryType;
	}

	
	public void setInventoryTypeDesc(String inventoryTypeDesc){
		this.inventoryTypeDesc = inventoryTypeDesc;
	}

	
	public String getInventoryTypeDesc(){
		return this.inventoryTypeDesc;
	}

	
	public void setReduceStockType(Long reduceStockType){
		this.reduceStockType = reduceStockType;
	}

	
	public Long getReduceStockType(){
		return this.reduceStockType;
	}

	
	public void setReduceStockTypeDesc(String reduceStockTypeDesc){
		this.reduceStockTypeDesc = reduceStockTypeDesc;
	}

	
	public String getReduceStockTypeDesc(){
		return this.reduceStockTypeDesc;
	}

	
	public void setOriginAmount(Long originAmount){
		this.originAmount = originAmount;
	}

	
	public Long getOriginAmount(){
		return this.originAmount;
	}

	
	public void setHasTax(Boolean hasTax){
		this.hasTax = hasTax;
	}

	
	public Boolean getHasTax(){
		return this.hasTax;
	}

	
	public void setItemNum(Long itemNum){
		this.itemNum = itemNum;
	}

	
	public Long getItemNum(){
		return this.itemNum;
	}

	
	public void setSumAmount(Long sumAmount){
		this.sumAmount = sumAmount;
	}

	
	public Long getSumAmount(){
		return this.sumAmount;
	}

	
	public void setSourcePlatform(String sourcePlatform){
		this.sourcePlatform = sourcePlatform;
	}

	
	public String getSourcePlatform(){
		return this.sourcePlatform;
	}

	
	public void setProductPic(String productPic){
		this.productPic = productPic;
	}

	
	public String getProductPic(){
		return this.productPic;
	}

	
	public void setIsComment(Long isComment){
		this.isComment = isComment;
	}

	
	public Long getIsComment(){
		return this.isComment;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setInventoryList(List<InventoryListItem> inventoryList){
		this.inventoryList = inventoryList;
	}

	
	public List<InventoryListItem> getInventoryList(){
		return this.inventoryList;
	}

	
	public void setPostAmount(Long postAmount){
		this.postAmount = postAmount;
	}

	
	public Long getPostAmount(){
		return this.postAmount;
	}

	
	public void setPreSaleType(Long preSaleType){
		this.preSaleType = preSaleType;
	}

	
	public Long getPreSaleType(){
		return this.preSaleType;
	}

	
	public void setAfterSaleInfo(AfterSaleInfo afterSaleInfo){
		this.afterSaleInfo = afterSaleInfo;
	}

	
	public AfterSaleInfo getAfterSaleInfo(){
		return this.afterSaleInfo;
	}

	
	public void setPromotionRedpackAmount(Long promotionRedpackAmount){
		this.promotionRedpackAmount = promotionRedpackAmount;
	}

	
	public Long getPromotionRedpackAmount(){
		return this.promotionRedpackAmount;
	}

	
	public void setPromotionRedpackPlatformAmount(Long promotionRedpackPlatformAmount){
		this.promotionRedpackPlatformAmount = promotionRedpackPlatformAmount;
	}

	
	public Long getPromotionRedpackPlatformAmount(){
		return this.promotionRedpackPlatformAmount;
	}

	
	public void setPromotionRedpackTalentAmount(Long promotionRedpackTalentAmount){
		this.promotionRedpackTalentAmount = promotionRedpackTalentAmount;
	}

	
	public Long getPromotionRedpackTalentAmount(){
		return this.promotionRedpackTalentAmount;
	}

	
	public void setReceiveType(Long receiveType){
		this.receiveType = receiveType;
	}

	
	public Long getReceiveType(){
		return this.receiveType;
	}

	
	public void setNeedSerialNumber(Boolean needSerialNumber){
		this.needSerialNumber = needSerialNumber;
	}

	
	public Boolean getNeedSerialNumber(){
		return this.needSerialNumber;
	}

	
	public void setAdEnvType(String adEnvType){
		this.adEnvType = adEnvType;
	}

	
	public String getAdEnvType(){
		return this.adEnvType;
	}

	
	public void setSkuOrderTagUi(List<SkuOrderTagUiItem> skuOrderTagUi){
		this.skuOrderTagUi = skuOrderTagUi;
	}

	
	public List<SkuOrderTagUiItem> getSkuOrderTagUi(){
		return this.skuOrderTagUi;
	}

	
	public void setProductIdStr(String productIdStr){
		this.productIdStr = productIdStr;
	}

	
	public String getProductIdStr(){
		return this.productIdStr;
	}

	
	public void setAppointmentShipTime(Long appointmentShipTime){
		this.appointmentShipTime = appointmentShipTime;
	}

	
	public Long getAppointmentShipTime(){
		return this.appointmentShipTime;
	}

	
	public void setRoomIdStr(String roomIdStr){
		this.roomIdStr = roomIdStr;
	}

	
	public String getRoomIdStr(){
		return this.roomIdStr;
	}

	
	public void setGivenProductType(String givenProductType){
		this.givenProductType = givenProductType;
	}

	
	public String getGivenProductType(){
		return this.givenProductType;
	}

	
	public void setMasterSkuOrderId(String masterSkuOrderId){
		this.masterSkuOrderId = masterSkuOrderId;
	}

	
	public String getMasterSkuOrderId(){
		return this.masterSkuOrderId;
	}

	
	public void setCardVoucher(CardVoucher cardVoucher){
		this.cardVoucher = cardVoucher;
	}

	
	public CardVoucher getCardVoucher(){
		return this.cardVoucher;
	}

	
	public void setBundleSkuInfo(List<BundleSkuInfoItem> bundleSkuInfo){
		this.bundleSkuInfo = bundleSkuInfo;
	}

	
	public List<BundleSkuInfoItem> getBundleSkuInfo(){
		return this.bundleSkuInfo;
	}

	
	public void setAccountList(AccountList accountList){
		this.accountList = accountList;
	}

	
	public AccountList getAccountList(){
		return this.accountList;
	}

	
	public void setSkuCustomizationInfo(List<SkuCustomizationInfoItem> skuCustomizationInfo){
		this.skuCustomizationInfo = skuCustomizationInfo;
	}

	
	public List<SkuCustomizationInfoItem> getSkuCustomizationInfo(){
		return this.skuCustomizationInfo;
	}

	
	public void setAuthorCostAmount(Long authorCostAmount){
		this.authorCostAmount = authorCostAmount;
	}

	
	public Long getAuthorCostAmount(){
		return this.authorCostAmount;
	}

	
	public void setOnlyPlatformCostAmount(Long onlyPlatformCostAmount){
		this.onlyPlatformCostAmount = onlyPlatformCostAmount;
	}

	
	public Long getOnlyPlatformCostAmount(){
		return this.onlyPlatformCostAmount;
	}

	
	public void setPromiseInfo(String promiseInfo){
		this.promiseInfo = promiseInfo;
	}

	
	public String getPromiseInfo(){
		return this.promiseInfo;
	}

	
	public void setStoreInfo(StoreInfo storeInfo){
		this.storeInfo = storeInfo;
	}

	
	public StoreInfo getStoreInfo(){
		return this.storeInfo;
	}

	
	public void setMaskPostReceiver(String maskPostReceiver){
		this.maskPostReceiver = maskPostReceiver;
	}

	
	public String getMaskPostReceiver(){
		return this.maskPostReceiver;
	}

	
	public void setMaskPostTel(String maskPostTel){
		this.maskPostTel = maskPostTel;
	}

	
	public String getMaskPostTel(){
		return this.maskPostTel;
	}

	
	public void setMaskPostAddr(MaskPostAddr maskPostAddr){
		this.maskPostAddr = maskPostAddr;
	}

	
	public MaskPostAddr getMaskPostAddr(){
		return this.maskPostAddr;
	}

	
	public void setContractInfo(ContractInfo contractInfo){
		this.contractInfo = contractInfo;
	}

	
	public ContractInfo getContractInfo(){
		return this.contractInfo;
	}

	
	public void setMasterSkuOrderIdList(List<String> masterSkuOrderIdList){
		this.masterSkuOrderIdList = masterSkuOrderIdList;
	}

	
	public List<String> getMasterSkuOrderIdList(){
		return this.masterSkuOrderIdList;
	}

	
	public void setGivenProductActivityInfo(GivenProductActivityInfo givenProductActivityInfo){
		this.givenProductActivityInfo = givenProductActivityInfo;
	}

	
	public GivenProductActivityInfo getGivenProductActivityInfo(){
		return this.givenProductActivityInfo;
	}

	
	public void setQualityCheckInfo(QualityCheckInfo qualityCheckInfo){
		this.qualityCheckInfo = qualityCheckInfo;
	}

	
	public QualityCheckInfo getQualityCheckInfo(){
		return this.qualityCheckInfo;
	}

	
	public void setSkuYunWarehouseInfo(List<SkuYunWarehouseInfoItem> skuYunWarehouseInfo){
		this.skuYunWarehouseInfo = skuYunWarehouseInfo;
	}

	
	public List<SkuYunWarehouseInfoItem> getSkuYunWarehouseInfo(){
		return this.skuYunWarehouseInfo;
	}

	
	public void setTaxAmount(Long taxAmount){
		this.taxAmount = taxAmount;
	}

	
	public Long getTaxAmount(){
		return this.taxAmount;
	}

}