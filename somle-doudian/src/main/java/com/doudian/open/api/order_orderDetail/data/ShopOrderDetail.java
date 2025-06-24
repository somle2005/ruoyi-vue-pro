package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class ShopOrderDetail {


	@SerializedName("order_operate_record_list")
	@OpField(desc = "订单操作记录", example = "")
	private List<OrderOperateRecordListItem> orderOperateRecordList;

	@SerializedName("make_up_post_amount")
	@OpField(desc = "运费补差金额单位：分", example = "10")
	private Long makeUpPostAmount;

	@SerializedName("promise_detail")
	@OpField(desc = "订单时效信息", example = "")
	private PromiseDetail promiseDetail;

	@SerializedName("bmp_source")
	@OpField(desc = "业务身份-来源", example = "flower")
	private String bmpSource;

	@SerializedName("bmp_vertical_market")
	@OpField(desc = "业务身份-垂类", example = "giftcard")
	private String bmpVerticalMarket;

	@SerializedName("bmp_seller_type")
	@OpField(desc = "业务身份-卖家身份", example = "xiaodian")
	private String bmpSellerType;

	@SerializedName("urge_deliver_times")
	@OpField(desc = "催单次数", example = "1")
	private Long urgeDeliverTimes;

	@SerializedName("shop_period_purchase_info")
	@OpField(desc = "周期购信息（有值表示为周期购订单，空表示不是周期购订单）", example = "")
	private ShopPeriodPurchaseInfo shopPeriodPurchaseInfo;

	@SerializedName("relation_shop_order_ids")
	@OpField(desc = "订单关联的订单号，如维修单主商品关联的维修单订单号", example = "[6890328423432]")
	private List<String> relationShopOrderIds;

	@SerializedName("extra_promotion_amount_detail")
	@OpField(desc = "额外优惠信息；字段文档：https://bytedance.larkoffice.com/docx/G7UodvZY0ojuF9x7fL7ceVF9nSe", example = "")
	private List<ExtraPromotionAmountDetailItem> extraPromotionAmountDetail;

	@SerializedName("shop_recycle_subsidy_amount_info")
	@OpField(desc = "换新额外补贴", example = "")
	private ShopRecycleSubsidyAmountInfo shopRecycleSubsidyAmountInfo;

	@SerializedName("order_tag")
	@OpField(desc = "订单的一些c端标签", example = "{tag_key:tag_value}")
	private Map<String,String> orderTag;

	@SerializedName("fulfill_status")
	@OpField(desc = "接单状态", example = "ACCEPTED")
	private String fulfillStatus;

	@SerializedName("original_shop_id")
	@OpField(desc = "即时零售订单对应总店id", example = "1234")
	private Long originalShopId;

	@SerializedName("free_interest")
	@OpField(desc = "抖音月付信息", example = "")
	private FreeInterest freeInterest;

	@SerializedName("receipt_time_map")
	@OpField(desc = "小时达相关订单时效样式：RemindMerchantStockingTime：1701303000（秒级时间戳）相关枚举及含义：RemindMerchantStockingTime-提醒商家开始备货时间；LatestStockingCompletionTime --最晚备货完成时间；RemindMerchantDeliveryTime--提醒商家发配送时间；EtaDuration--eta时长（小时达）", example = "{RemindMerchantStockingTime:1701303000}")
	private Map<String,String> receiptTimeMap;

	@SerializedName("consolidate_info")
	@OpField(desc = "订单中转信息", example = "")
	private ConsolidateInfo consolidateInfo;

	@SerializedName("aweme_id")
	@OpField(desc = "达人抖音号，样品订单场景下才会返回的申样达人信息；", example = "Youyou")
	private String awemeId;

	@SerializedName("user_icon")
	@OpField(desc = "达人抖音头像，样品订单场景下才会返回的申样达人信息；", example = "https://p26.douyinpic.com/img/aweme-avatar")
	private String userIcon;

	@SerializedName("user_nick_name")
	@OpField(desc = "达人抖音昵称，样品订单场景下才会返回的申样达人信息；", example = "这是个名字")
	private String userNickName;

	@SerializedName("receipt_date")
	@OpField(desc = "用户选择的预约送达日期", example = "2023-08-07")
	private String receiptDate;

	@SerializedName("recommend_end_ship_time")
	@OpField(desc = "建议商家最晚发货时间，秒", example = "1691063298")
	private Long recommendEndShipTime;

	@SerializedName("recommend_start_ship_time")
	@OpField(desc = "建议商家最早发货时间，秒", example = "1691063298")
	private Long recommendStartShipTime;

	@SerializedName("order_recycle_info")
	@OpField(desc = "回收单信息", example = "")
	private OrderRecycleInfo orderRecycleInfo;

	@SerializedName("tax_amount_not_come_out")
	@OpField(desc = "跨境后置备案订单税费是否未计算完成 0-计算完成 1-未计算完成", example = "0")
	private Long taxAmountNotComeOut;

	@SerializedName("accept_order_status")
	@OpField(desc = "小时达订单的接单状态 0-未接单；1-已接单；2-超时取消，或商家取消", example = "1")
	private Long acceptOrderStatus;

	@SerializedName("shop_id")
	@OpField(desc = "店铺id，抖店平台生成，平台下唯一；", example = "94956")
	private Long shopId;

	@SerializedName("shop_name")
	@OpField(desc = "商户名称", example = "订单专用_测试店三")
	private String shopName;

	@SerializedName("open_id")
	@OpField(desc = "抖音小程序ID", example = "69175")
	private String openId;

	@SerializedName("order_id")
	@OpField(desc = "店铺父订单号，抖店平台生成，平台下唯一；", example = "6917533224570258991")
	private String orderId;

	@SerializedName("order_level")
	@OpField(desc = "订单层级，主订单是2级", example = "2")
	private Long orderLevel;

	@SerializedName("biz")
	@OpField(desc = "【业务来源】 1  -鲁班 2  -小店 3  -好好学习 4  -ev 5  -虚拟 6  -建站 7  -平台卡券 8  -玉石 9  -ez 10 -ep 11 -三方卡券 12 -服务市场 13 - EP 视频课 14 - EP 直播课 21 -跨境BBC 22 -跨境BC 23 -跨境CC|UPU 24 -手机充值 25 -拍卖保证金 26 -懂车帝抵扣券 27 -懂车帝返现券 28 -离岛免税 29 -海南会员购 30 -抽奖 31 -清北-企业代付 32 -抖+券 33 -联盟寄样 49 -刀剑 53 -通信卡 66 -加油包 76 -大闸蟹 99 -保险 101-三方卡券卡密模式 102-小店海外 108-上门取件收款", example = "2")
	private Long biz;

	@SerializedName("biz_desc")
	@OpField(desc = "业务来源描述", example = "小店")
	private String bizDesc;

	@SerializedName("order_type")
	@OpField(desc = "【订单类型】 0、普通订单 2、虚拟商品订单 4、电子券（poi核销） 5、三方核销  6、服务市场", example = "0")
	private Long orderType;

	@SerializedName("order_type_desc")
	@OpField(desc = "订单类型描述", example = "普通订单")
	private String orderTypeDesc;

	@SerializedName("trade_type")
	@OpField(desc = "交易类型，不推荐使用，已废弃。请使用sku_order_list.trade_type即可。", example = "0")
	private Long tradeType;

	@SerializedName("trade_type_desc")
	@OpField(desc = "交易类型描述,不推荐使用，已废弃。请使用sku_order_list. trade_type_desc下即可。", example = "普通")
	private String tradeTypeDesc;

	@SerializedName("order_status")
	@OpField(desc = "订单状态1 待确认/待支付（订单创建完毕）105 已支付 2 备货中 101 部分发货 3 已发货（全部发货）4 已取消5 已完成（已收货）", example = "3")
	private Long orderStatus;

	@SerializedName("order_status_desc")
	@OpField(desc = "订单状态描述", example = "已发货")
	private String orderStatusDesc;

	@SerializedName("main_status")
	@OpField(desc = "主流程状态，1 待确认/待支付（订单创建完毕）103 部分支付105 已支付2 备货中101 部分发货3 已发货（全部发货）4 已取消5 已完成（已收货）21 发货前退款完结22 发货后退款完结39 收货后退款完结", example = "3")
	private Long mainStatus;

	@SerializedName("main_status_desc")
	@OpField(desc = "主流程状态描述", example = "已全部发货")
	private String mainStatusDesc;

	@SerializedName("pay_time")
	@OpField(desc = "支付时间，时间戳，秒", example = "1.682479081e+09")
	private Long payTime;

	@SerializedName("order_expire_time")
	@OpField(desc = "订单过期时间，时间戳，秒", example = "1800")
	private Long orderExpireTime;

	@SerializedName("finish_time")
	@OpField(desc = "订单完成时间，时间戳，秒", example = "0")
	private Long finishTime;

	@SerializedName("create_time")
	@OpField(desc = "下单时间，时间戳，秒", example = "1.682479079e+09")
	private Long createTime;

	@SerializedName("update_time")
	@OpField(desc = "订单更新时间，时间戳，秒", example = "1.682479087e+09")
	private Long updateTime;

	@SerializedName("cancel_reason")
	@OpField(desc = "取消原因", example = "支付超时")
	private String cancelReason;

	@SerializedName("buyer_words")
	@OpField(desc = "买家留言", example = "取消")
	private String buyerWords;

	@SerializedName("seller_words")
	@OpField(desc = "商家备注", example = "取消")
	private String sellerWords;

	@SerializedName("b_type")
	@OpField(desc = "【下单端】 0、站外 1、火山 2、抖音 3、头条 4、西瓜 5、微信 6、值点app 7、头条lite 8、懂车帝 9、皮皮虾 11、抖音极速版 12、TikTok 13、musically 14、穿山甲 15、火山极速版 16、服务市场 26、番茄小说 27、UG教育营销电商平台 28、Jumanji 29、电商SDK", example = "2")
	private Long bType;

	@SerializedName("b_type_desc")
	@OpField(desc = "下单端描述", example = "抖音")
	private String bTypeDesc;

	@SerializedName("sub_b_type")
	@OpField(desc = "【下单场景】 0、未知 1、app内-原生 2、app内-小程序 3、H5 13、电商SDK-头条 35、电商SDK-头条lite", example = "3")
	private Long subBType;

	@SerializedName("sub_b_type_desc")
	@OpField(desc = "下单场景描述", example = "H5")
	private String subBTypeDesc;

	@SerializedName("app_id")
	@OpField(desc = "具体某个小程序的ID", example = "1128")
	private Long appId;

	@SerializedName("pay_type")
	@OpField(desc = "额；7=无需支付（0元单）；8=DOU分期（信用支付）；9=新卡支付；12=先用后付；16=收银台支付", example = "2")
	private Long payType;

	@SerializedName("channel_payment_no")
	@OpField(desc = "支付渠道的流水号", example = "mock_DPM2304261117519001500291007185")
	private String channelPaymentNo;

	@SerializedName("order_amount")
	@OpField(desc = "订单金额（单位：分）", example = "20500")
	private Long orderAmount;

	@SerializedName("pay_amount")
	@OpField(desc = "支付金额（单位：分）", example = "20500")
	private Long payAmount;

	@SerializedName("post_amount")
	@OpField(desc = "快递费（单位：分）", example = "500")
	private Long postAmount;

	@SerializedName("post_insurance_amount")
	@OpField(desc = "运费险金额（单位：分）", example = "0")
	private Long postInsuranceAmount;

	@SerializedName("modify_amount")
	@OpField(desc = "改价金额变化量（单位：分）", example = "0")
	private Long modifyAmount;

	@SerializedName("modify_post_amount")
	@OpField(desc = "改价运费金额变化量（单位：分）", example = "0")
	private Long modifyPostAmount;

	@SerializedName("promotion_amount")
	@OpField(desc = "订单优惠总金额（单位：分） = 店铺优惠金额 + 平台优惠金额 + 达人优惠金额", example = "0")
	private Long promotionAmount;

	@SerializedName("promotion_shop_amount")
	@OpField(desc = "店铺优惠金额（单位：分），属于店铺的优惠活动、优惠券、红包的总优惠金额", example = "0")
	private Long promotionShopAmount;

	@SerializedName("promotion_platform_amount")
	@OpField(desc = "平台优惠金额（单位：分），属于平台的优惠活动、优惠券、红包的总优惠金额", example = "0")
	private Long promotionPlatformAmount;

	@SerializedName("shop_cost_amount")
	@OpField(desc = "商家承担金额（单位：分），订单参与活动和优惠中商家承担部分的总金额", example = "0")
	private Long shopCostAmount;

	@SerializedName("platform_cost_amount")
	@OpField(desc = "平台承担金额（单位：分），订单参与活动和优惠中平台+作者（达人）承担部分的总金额,包含作者（达人）承担金额：platform_cost_amount = only_platform_cost_amount + author_cost_amount", example = "0")
	private Long platformCostAmount;

	@SerializedName("promotion_talent_amount")
	@OpField(desc = "达人优惠金额（单位：分），属于达人的优惠活动、优惠券、红包的总优惠金额", example = "0")
	private Long promotionTalentAmount;

	@SerializedName("promotion_pay_amount")
	@OpField(desc = "支付优惠金额（单位：分），支付渠道上的优惠金额", example = "0")
	private Long promotionPayAmount;

	@SerializedName("post_tel")
	@OpField(desc = "收件人电话", example = "1231234")
	private String postTel;

	@SerializedName("encrypt_post_tel")
	@OpField(desc = "收件人电话", example = "1231234")
	private String encryptPostTel;

	@SerializedName("post_receiver")
	@OpField(desc = "收件人姓名", example = "aaa")
	private String postReceiver;

	@SerializedName("encrypt_post_receiver")
	@OpField(desc = "收件人姓名", example = "aaa")
	private String encryptPostReceiver;

	@SerializedName("post_addr")
	@OpField(desc = "收件人地址", example = "")
	private PostAddr postAddr;

	@SerializedName("exp_ship_time")
	@OpField(desc = "预计发货时间，时间戳，秒", example = "1.682524799e+09")
	private Long expShipTime;

	@SerializedName("ship_time")
	@OpField(desc = "发货时间，时间戳，秒", example = "1.682479086e+09")
	private Long shipTime;

	@SerializedName("logistics_info")
	@OpField(desc = "物流信息", example = "")
	private List<LogisticsInfoItem> logisticsInfo;

	@SerializedName("promotion_detail")
	@OpField(desc = "优惠信息，用户下单过程中享受到的优惠", example = "")
	private PromotionDetail promotionDetail;

	@SerializedName("sku_order_list")
	@OpField(desc = "订单详情信息，一个主订单下有可以最大返回40个子订单", example = "")
	private List<SkuOrderListItem> skuOrderList;

	@SerializedName("seller_remark_stars")
	@OpField(desc = "插旗信息：0-灰 1-紫 2-青 3-绿 4-橙 5-红", example = "0")
	private Long sellerRemarkStars;

	@SerializedName("order_phase_list")
	@OpField(desc = "定金预售阶段单", example = "")
	private List<OrderPhaseListItem> orderPhaseList;

	@SerializedName("doudian_open_id")
	@OpField(desc = "用户唯一id，规则详见：https://op.jinritemai.com/docs/guide-docs/1368/4416", example = "1@#SGf7u/L4T728WdIaNcm6c+7SOqTObqbPh6wJBSm6lRGO+VEipIFB4EZDoWtkW1ThcrgNhg==")
	private String doudianOpenId;

	@SerializedName("open_address_id")
	@OpField(
        desc = "开放平台地址id",
        example = "#OdfQ5MRY8CwIUcAc4ZWxWTkylwttMX0FRCxV1IcXrXWStlVxgZcjnYPKIV/BvfK2HlqfMUb6Z7fwo4SzGKecuYMkGg8eDUy4XFfvuu5u7OtPiJa7vzUseQqtHhBPENxRzh86RJ2F0Nc="
    )
	private String openAddressId;

	@SerializedName("serial_number_list")
	@OpField(desc = "商品序列号（IMEI码或SN码）", example = "[546443524543534,646443524543534]")
	private List<String> serialNumberList;

	@SerializedName("promotion_redpack_amount")
	@OpField(desc = "红包优惠金额（单位：分）", example = "0")
	private Long promotionRedpackAmount;

	@SerializedName("promotion_redpack_platform_amount")
	@OpField(desc = "平台红包优惠金额（单位：分），属于平台的红包的优惠金额", example = "0")
	private Long promotionRedpackPlatformAmount;

	@SerializedName("promotion_redpack_talent_amount")
	@OpField(desc = "达人红包优惠金额（单位：分），属于达人的红包的优惠金额", example = "0")
	private Long promotionRedpackTalentAmount;

	@SerializedName("user_id_info")
	@OpField(desc = "用户证件信息", example = "")
	private UserIdInfo userIdInfo;

	@SerializedName("appointment_ship_time")
	@OpField(desc = "预约发货时间", example = "0")
	private Long appointmentShipTime;

	@SerializedName("d_car_shop_biz_data")
	@OpField(desc = "懂车帝购车信息", example = "")
	private DCarShopBizData dCarShopBizData;

	@SerializedName("shop_order_tag_ui")
	@OpField(desc = "店铺单标签", example = "")
	private List<ShopOrderTagUiItem> shopOrderTagUi;

	@SerializedName("total_promotion_amount")
	@OpField(desc = "总优惠金额（单位：分），total_promotion_amount = promotion_amount + post_promotion_amount", example = "0")
	private Long totalPromotionAmount;

	@SerializedName("post_origin_amount")
	@OpField(desc = "运费原价（单位：分），post_origin_amount = post_amount + post_promotion_amount", example = "500")
	private Long postOriginAmount;

	@SerializedName("post_promotion_amount")
	@OpField(desc = "运费优惠金额（单位：分）", example = "0")
	private Long postPromotionAmount;

	@SerializedName("user_tag_ui")
	@OpField(desc = "用户特征标签；", example = "")
	private List<UserTagUiItem> userTagUi;

	@SerializedName("author_cost_amount")
	@OpField(desc = "作者（达人）承担金额（单位：分），订单参与活动和优惠中作者（达人）承担部分的总金额", example = "0")
	private Long authorCostAmount;

	@SerializedName("only_platform_cost_amount")
	@OpField(desc = "仅平台承担金额（单位：分），订单参与活动和优惠中平台承担部分的总金额", example = "0")
	private Long onlyPlatformCostAmount;

	@SerializedName("promise_info")
	@OpField(desc = "履约时效信息(json串)", example = "{identifier:S#2023-04-26}")
	private String promiseInfo;

	@SerializedName("mask_post_receiver")
	@OpField(desc = "收件人姓名（脱敏后）", example = "生***")
	private String maskPostReceiver;

	@SerializedName("mask_post_tel")
	@OpField(desc = "收件人电话（脱敏后），电商脱敏格式为1********35，即时零售脱敏格式为*******1035(后四位明文)", example = "1********20")
	private String maskPostTel;

	@SerializedName("mask_post_addr")
	@OpField(desc = "收件人地址（脱敏后）", example = "")
	private MaskPostAddr maskPostAddr;

	@SerializedName("user_coordinate")
	@OpField(desc = "买家收货地址经纬度信息，高德坐标系；", example = "")
	private UserCoordinate userCoordinate;

	@SerializedName("earliest_receipt_time")
	@OpField(desc = "预约配送单最早送达时间，Unix时间戳：秒；当early_arrival=false时使用，仅小时达业务返回；", example = "0")
	private Long earliestReceiptTime;

	@SerializedName("latest_receipt_time")
	@OpField(desc = "预约配送单最晚送达时间，Unix时间戳：秒；当early_arrival=false时使用，仅小时达业务返回；", example = "0")
	private Long latestReceiptTime;

	@SerializedName("early_arrival")
	@OpField(desc = "是否尽快送达，true-是（配合target_arrival_time字段使用），false-否（配合earliest_receipt_time和latest_receipt_time使用），仅小时达业务返回；", example = "false")
	private Boolean earlyArrival;

	@SerializedName("target_arrival_time")
	@OpField(desc = "尽快送达的时间点，Unix时间戳：秒；当early_arrival=true时使用，仅小时达业务返回；", example = "0")
	private Long targetArrivalTime;

	@SerializedName("packing_amount")
	@OpField(desc = "打包费，单位：分；", example = "0")
	private Long packingAmount;

	@SerializedName("supermarket_order_serial_no")
	@OpField(desc = "门店流水号，日内按下单时间从“1”递增生成，仅小时达业务返回；（注：商家自定义小票需加上日期信息，格式为“日期-流水号”，例如“18-1”，便于骑手取货）", example = "135334")
	private String supermarketOrderSerialNo;

	@SerializedName("tax_amount")
	@OpField(desc = "税费(子单税费之和)", example = "0")
	private Long taxAmount;

	@SerializedName("address_tag_ui")
	@OpField(desc = "地址标签列表", example = "")
	private List<AddressTagUiItem> addressTagUi;

	@SerializedName("mask_pay_tel")
	@OpField(desc = "脱敏下单人手机号（鲜花订单），电商脱敏格式为1********35，即时零售脱敏格式为*******1035(后四位明文)", example = "XXX")
	private String maskPayTel;

	@SerializedName("pay_tel")
	@OpField(desc = "下单人手机号（鲜花订单）", example = "134")
	private String payTel;

	@SerializedName("encrypt_pay_tel")
	@OpField(desc = "下单人手机号（鲜花订单）", example = "134")
	private String encryptPayTel;

	@SerializedName("greet_words")
	@OpField(desc = "贺卡文字(鲜花订单)", example = "贺卡")
	private String greetWords;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderOperateRecordList(List<OrderOperateRecordListItem> orderOperateRecordList){
		this.orderOperateRecordList = orderOperateRecordList;
	}

	
	public List<OrderOperateRecordListItem> getOrderOperateRecordList(){
		return this.orderOperateRecordList;
	}

	
	public void setMakeUpPostAmount(Long makeUpPostAmount){
		this.makeUpPostAmount = makeUpPostAmount;
	}

	
	public Long getMakeUpPostAmount(){
		return this.makeUpPostAmount;
	}

	
	public void setPromiseDetail(PromiseDetail promiseDetail){
		this.promiseDetail = promiseDetail;
	}

	
	public PromiseDetail getPromiseDetail(){
		return this.promiseDetail;
	}

	
	public void setBmpSource(String bmpSource){
		this.bmpSource = bmpSource;
	}

	
	public String getBmpSource(){
		return this.bmpSource;
	}

	
	public void setBmpVerticalMarket(String bmpVerticalMarket){
		this.bmpVerticalMarket = bmpVerticalMarket;
	}

	
	public String getBmpVerticalMarket(){
		return this.bmpVerticalMarket;
	}

	
	public void setBmpSellerType(String bmpSellerType){
		this.bmpSellerType = bmpSellerType;
	}

	
	public String getBmpSellerType(){
		return this.bmpSellerType;
	}

	
	public void setUrgeDeliverTimes(Long urgeDeliverTimes){
		this.urgeDeliverTimes = urgeDeliverTimes;
	}

	
	public Long getUrgeDeliverTimes(){
		return this.urgeDeliverTimes;
	}

	
	public void setShopPeriodPurchaseInfo(ShopPeriodPurchaseInfo shopPeriodPurchaseInfo){
		this.shopPeriodPurchaseInfo = shopPeriodPurchaseInfo;
	}

	
	public ShopPeriodPurchaseInfo getShopPeriodPurchaseInfo(){
		return this.shopPeriodPurchaseInfo;
	}

	
	public void setRelationShopOrderIds(List<String> relationShopOrderIds){
		this.relationShopOrderIds = relationShopOrderIds;
	}

	
	public List<String> getRelationShopOrderIds(){
		return this.relationShopOrderIds;
	}

	
	public void setExtraPromotionAmountDetail(List<ExtraPromotionAmountDetailItem> extraPromotionAmountDetail){
		this.extraPromotionAmountDetail = extraPromotionAmountDetail;
	}

	
	public List<ExtraPromotionAmountDetailItem> getExtraPromotionAmountDetail(){
		return this.extraPromotionAmountDetail;
	}

	
	public void setShopRecycleSubsidyAmountInfo(ShopRecycleSubsidyAmountInfo shopRecycleSubsidyAmountInfo){
		this.shopRecycleSubsidyAmountInfo = shopRecycleSubsidyAmountInfo;
	}

	
	public ShopRecycleSubsidyAmountInfo getShopRecycleSubsidyAmountInfo(){
		return this.shopRecycleSubsidyAmountInfo;
	}

	
	public void setOrderTag(Map<String,String> orderTag){
		this.orderTag = orderTag;
	}

	
	public Map<String,String> getOrderTag(){
		return this.orderTag;
	}

	
	public void setFulfillStatus(String fulfillStatus){
		this.fulfillStatus = fulfillStatus;
	}

	
	public String getFulfillStatus(){
		return this.fulfillStatus;
	}

	
	public void setOriginalShopId(Long originalShopId){
		this.originalShopId = originalShopId;
	}

	
	public Long getOriginalShopId(){
		return this.originalShopId;
	}

	
	public void setFreeInterest(FreeInterest freeInterest){
		this.freeInterest = freeInterest;
	}

	
	public FreeInterest getFreeInterest(){
		return this.freeInterest;
	}

	
	public void setReceiptTimeMap(Map<String,String> receiptTimeMap){
		this.receiptTimeMap = receiptTimeMap;
	}

	
	public Map<String,String> getReceiptTimeMap(){
		return this.receiptTimeMap;
	}

	
	public void setConsolidateInfo(ConsolidateInfo consolidateInfo){
		this.consolidateInfo = consolidateInfo;
	}

	
	public ConsolidateInfo getConsolidateInfo(){
		return this.consolidateInfo;
	}

	
	public void setAwemeId(String awemeId){
		this.awemeId = awemeId;
	}

	
	public String getAwemeId(){
		return this.awemeId;
	}

	
	public void setUserIcon(String userIcon){
		this.userIcon = userIcon;
	}

	
	public String getUserIcon(){
		return this.userIcon;
	}

	
	public void setUserNickName(String userNickName){
		this.userNickName = userNickName;
	}

	
	public String getUserNickName(){
		return this.userNickName;
	}

	
	public void setReceiptDate(String receiptDate){
		this.receiptDate = receiptDate;
	}

	
	public String getReceiptDate(){
		return this.receiptDate;
	}

	
	public void setRecommendEndShipTime(Long recommendEndShipTime){
		this.recommendEndShipTime = recommendEndShipTime;
	}

	
	public Long getRecommendEndShipTime(){
		return this.recommendEndShipTime;
	}

	
	public void setRecommendStartShipTime(Long recommendStartShipTime){
		this.recommendStartShipTime = recommendStartShipTime;
	}

	
	public Long getRecommendStartShipTime(){
		return this.recommendStartShipTime;
	}

	
	public void setOrderRecycleInfo(OrderRecycleInfo orderRecycleInfo){
		this.orderRecycleInfo = orderRecycleInfo;
	}

	
	public OrderRecycleInfo getOrderRecycleInfo(){
		return this.orderRecycleInfo;
	}

	
	public void setTaxAmountNotComeOut(Long taxAmountNotComeOut){
		this.taxAmountNotComeOut = taxAmountNotComeOut;
	}

	
	public Long getTaxAmountNotComeOut(){
		return this.taxAmountNotComeOut;
	}

	
	public void setAcceptOrderStatus(Long acceptOrderStatus){
		this.acceptOrderStatus = acceptOrderStatus;
	}

	
	public Long getAcceptOrderStatus(){
		return this.acceptOrderStatus;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setShopName(String shopName){
		this.shopName = shopName;
	}

	
	public String getShopName(){
		return this.shopName;
	}

	
	public void setOpenId(String openId){
		this.openId = openId;
	}

	
	public String getOpenId(){
		return this.openId;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
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

	
	public void setBuyerWords(String buyerWords){
		this.buyerWords = buyerWords;
	}

	
	public String getBuyerWords(){
		return this.buyerWords;
	}

	
	public void setSellerWords(String sellerWords){
		this.sellerWords = sellerWords;
	}

	
	public String getSellerWords(){
		return this.sellerWords;
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

	
	public void setAppId(Long appId){
		this.appId = appId;
	}

	
	public Long getAppId(){
		return this.appId;
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

	
	public void setPostAmount(Long postAmount){
		this.postAmount = postAmount;
	}

	
	public Long getPostAmount(){
		return this.postAmount;
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

	
	public void setLogisticsInfo(List<LogisticsInfoItem> logisticsInfo){
		this.logisticsInfo = logisticsInfo;
	}

	
	public List<LogisticsInfoItem> getLogisticsInfo(){
		return this.logisticsInfo;
	}

	
	public void setPromotionDetail(PromotionDetail promotionDetail){
		this.promotionDetail = promotionDetail;
	}

	
	public PromotionDetail getPromotionDetail(){
		return this.promotionDetail;
	}

	
	public void setSkuOrderList(List<SkuOrderListItem> skuOrderList){
		this.skuOrderList = skuOrderList;
	}

	
	public List<SkuOrderListItem> getSkuOrderList(){
		return this.skuOrderList;
	}

	
	public void setSellerRemarkStars(Long sellerRemarkStars){
		this.sellerRemarkStars = sellerRemarkStars;
	}

	
	public Long getSellerRemarkStars(){
		return this.sellerRemarkStars;
	}

	
	public void setOrderPhaseList(List<OrderPhaseListItem> orderPhaseList){
		this.orderPhaseList = orderPhaseList;
	}

	
	public List<OrderPhaseListItem> getOrderPhaseList(){
		return this.orderPhaseList;
	}

	
	public void setDoudianOpenId(String doudianOpenId){
		this.doudianOpenId = doudianOpenId;
	}

	
	public String getDoudianOpenId(){
		return this.doudianOpenId;
	}

	
	public void setOpenAddressId(String openAddressId){
		this.openAddressId = openAddressId;
	}

	
	public String getOpenAddressId(){
		return this.openAddressId;
	}

	
	public void setSerialNumberList(List<String> serialNumberList){
		this.serialNumberList = serialNumberList;
	}

	
	public List<String> getSerialNumberList(){
		return this.serialNumberList;
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

	
	public void setUserIdInfo(UserIdInfo userIdInfo){
		this.userIdInfo = userIdInfo;
	}

	
	public UserIdInfo getUserIdInfo(){
		return this.userIdInfo;
	}

	
	public void setAppointmentShipTime(Long appointmentShipTime){
		this.appointmentShipTime = appointmentShipTime;
	}

	
	public Long getAppointmentShipTime(){
		return this.appointmentShipTime;
	}

	
	public void setDCarShopBizData(DCarShopBizData dCarShopBizData){
		this.dCarShopBizData = dCarShopBizData;
	}

	
	public DCarShopBizData getDCarShopBizData(){
		return this.dCarShopBizData;
	}

	
	public void setShopOrderTagUi(List<ShopOrderTagUiItem> shopOrderTagUi){
		this.shopOrderTagUi = shopOrderTagUi;
	}

	
	public List<ShopOrderTagUiItem> getShopOrderTagUi(){
		return this.shopOrderTagUi;
	}

	
	public void setTotalPromotionAmount(Long totalPromotionAmount){
		this.totalPromotionAmount = totalPromotionAmount;
	}

	
	public Long getTotalPromotionAmount(){
		return this.totalPromotionAmount;
	}

	
	public void setPostOriginAmount(Long postOriginAmount){
		this.postOriginAmount = postOriginAmount;
	}

	
	public Long getPostOriginAmount(){
		return this.postOriginAmount;
	}

	
	public void setPostPromotionAmount(Long postPromotionAmount){
		this.postPromotionAmount = postPromotionAmount;
	}

	
	public Long getPostPromotionAmount(){
		return this.postPromotionAmount;
	}

	
	public void setUserTagUi(List<UserTagUiItem> userTagUi){
		this.userTagUi = userTagUi;
	}

	
	public List<UserTagUiItem> getUserTagUi(){
		return this.userTagUi;
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

	
	public void setUserCoordinate(UserCoordinate userCoordinate){
		this.userCoordinate = userCoordinate;
	}

	
	public UserCoordinate getUserCoordinate(){
		return this.userCoordinate;
	}

	
	public void setEarliestReceiptTime(Long earliestReceiptTime){
		this.earliestReceiptTime = earliestReceiptTime;
	}

	
	public Long getEarliestReceiptTime(){
		return this.earliestReceiptTime;
	}

	
	public void setLatestReceiptTime(Long latestReceiptTime){
		this.latestReceiptTime = latestReceiptTime;
	}

	
	public Long getLatestReceiptTime(){
		return this.latestReceiptTime;
	}

	
	public void setEarlyArrival(Boolean earlyArrival){
		this.earlyArrival = earlyArrival;
	}

	
	public Boolean getEarlyArrival(){
		return this.earlyArrival;
	}

	
	public void setTargetArrivalTime(Long targetArrivalTime){
		this.targetArrivalTime = targetArrivalTime;
	}

	
	public Long getTargetArrivalTime(){
		return this.targetArrivalTime;
	}

	
	public void setPackingAmount(Long packingAmount){
		this.packingAmount = packingAmount;
	}

	
	public Long getPackingAmount(){
		return this.packingAmount;
	}

	
	public void setSupermarketOrderSerialNo(String supermarketOrderSerialNo){
		this.supermarketOrderSerialNo = supermarketOrderSerialNo;
	}

	
	public String getSupermarketOrderSerialNo(){
		return this.supermarketOrderSerialNo;
	}

	
	public void setTaxAmount(Long taxAmount){
		this.taxAmount = taxAmount;
	}

	
	public Long getTaxAmount(){
		return this.taxAmount;
	}

	
	public void setAddressTagUi(List<AddressTagUiItem> addressTagUi){
		this.addressTagUi = addressTagUi;
	}

	
	public List<AddressTagUiItem> getAddressTagUi(){
		return this.addressTagUi;
	}

	
	public void setMaskPayTel(String maskPayTel){
		this.maskPayTel = maskPayTel;
	}

	
	public String getMaskPayTel(){
		return this.maskPayTel;
	}

	
	public void setPayTel(String payTel){
		this.payTel = payTel;
	}

	
	public String getPayTel(){
		return this.payTel;
	}

	
	public void setEncryptPayTel(String encryptPayTel){
		this.encryptPayTel = encryptPayTel;
	}

	
	public String getEncryptPayTel(){
		return this.encryptPayTel;
	}

	
	public void setGreetWords(String greetWords){
		this.greetWords = greetWords;
	}

	
	public String getGreetWords(){
		return this.greetWords;
	}

}