package com.doudian.open.api.security_batchReportOrderSecurityEvent.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class EventsItem {


	@SerializedName("event_id")
	@OpField(required = true , desc = "HTTP 请求头里的 doudian-event-id 对应的值", example= "1649843080000603")
	private String eventId;

	@SerializedName("account_id")
	@OpField(required = true , desc = "商户的账户ID，每个ISV下需要保证唯一。独立生成的账户唯一标识", example= "101234567")
	private String accountId;

	@SerializedName("account_type")
	@OpField(required = true , desc = "main_account 服务商账号体系中的主账号、子账号 main_account/sub_account", example= "main_account")
	private String accountType;

	@SerializedName("order_related_shop_id")
	@OpField(required = true , desc = "orderIds 实际归属的店铺id", example= "10001")
	private String orderRelatedShopId;

	@SerializedName("shop_ids")
	@OpField(required = false , desc = "选填 ，account_id 关联的店铺 ID 列表", example= "[1,2,3]")
	private List<String> shopIds;

	@SerializedName("order_ids")
	@OpField(required = true , desc = "订单 ids, 单次最大数量 50, 超过 50 需分批上传", example= "[111,222,333]")
	private List<String> orderIds;

	@SerializedName("operation_type")
	@OpField(required = true , desc = "操作类型.支持操作类型:      1:view_order (查看订单)      2:view_order_list (查看订单列表)      3:download_order (下载订单)      4:download_order_list (下载订单列表)      5:print_order (打印订单)      6:print_order_list (打印订单列表)      7:export_order (导出订单)      8:export_order_list (导出订单列表)      9:delete_order (删除订单)", example= "1")
	private Integer operationType;

	@SerializedName("operate_time")
	@OpField(required = true , desc = "精确到秒的操作时间戳，格林威治时间，如1522555200", example= "1522555200")
	private String operateTime;

	@SerializedName("url")
	@OpField(required = true , desc = "isv请求url", example= "/torder/check")
	private String url;

	@SerializedName("ip")
	@OpField(required = true , desc = "客户端IP，须为用户操作时真实客户端外网IP 若使用SLB，客户端IP添加在HTTP请求的X-Forwarded-For末尾；若使用CWAF，客户端IP放在 X-Real-Ip 属性", example= "42.120.74.21")
	private String ip;

	@SerializedName("mac")
	@OpField(required = false , desc = "登录设备的mac地址", example= "5489-98f6-16c0")
	private String mac;

	@SerializedName("identify_info_list")
	@OpField(required = true , desc = "对外发送的订单信息明细格式 场景:商家来调解密接口，同时解密接口里面包含了敏感信息", example= "")
	private List<IdentifyInfoListItem> identifyInfoList;

	@SerializedName("device_type")
	@OpField(required = false , desc = "iOS / Android / Windows	商户在什么设备上使用 ISV 的软件", example= "iOS")
	private String deviceType;

	@SerializedName("device_id")
	@OpField(required = false , desc = "设备id，标识唯一设备", example= "12345")
	private String deviceId;

	@SerializedName("referer")
	@OpField(required = true , desc = "HTTP 请求头里referer对应的值,参考链接", example= "https://www.abc.com/")
	private String referer;

	@SerializedName("user_agent")
	@OpField(required = false , desc = "HTTP 请求头里的 userAgent对应的值", example= "Mozilla/5.0")
	private String userAgent;

	@SerializedName("purchase_product_info_list")
	@OpField(required = false , desc = "采购商品信息", example= "")
	private List<PurchaseProductInfoListItem> purchaseProductInfoList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEventId(String eventId){
		this.eventId = eventId;
	}

	
	public String getEventId(){
		return this.eventId;
	}

	
	public void setAccountId(String accountId){
		this.accountId = accountId;
	}

	
	public String getAccountId(){
		return this.accountId;
	}

	
	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	
	public String getAccountType(){
		return this.accountType;
	}

	
	public void setOrderRelatedShopId(String orderRelatedShopId){
		this.orderRelatedShopId = orderRelatedShopId;
	}

	
	public String getOrderRelatedShopId(){
		return this.orderRelatedShopId;
	}

	
	public void setShopIds(List<String> shopIds){
		this.shopIds = shopIds;
	}

	
	public List<String> getShopIds(){
		return this.shopIds;
	}

	
	public void setOrderIds(List<String> orderIds){
		this.orderIds = orderIds;
	}

	
	public List<String> getOrderIds(){
		return this.orderIds;
	}

	
	public void setOperationType(Integer operationType){
		this.operationType = operationType;
	}

	
	public Integer getOperationType(){
		return this.operationType;
	}

	
	public void setOperateTime(String operateTime){
		this.operateTime = operateTime;
	}

	
	public String getOperateTime(){
		return this.operateTime;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

	
	public void setIp(String ip){
		this.ip = ip;
	}

	
	public String getIp(){
		return this.ip;
	}

	
	public void setMac(String mac){
		this.mac = mac;
	}

	
	public String getMac(){
		return this.mac;
	}

	
	public void setIdentifyInfoList(List<IdentifyInfoListItem> identifyInfoList){
		this.identifyInfoList = identifyInfoList;
	}

	
	public List<IdentifyInfoListItem> getIdentifyInfoList(){
		return this.identifyInfoList;
	}

	
	public void setDeviceType(String deviceType){
		this.deviceType = deviceType;
	}

	
	public String getDeviceType(){
		return this.deviceType;
	}

	
	public void setDeviceId(String deviceId){
		this.deviceId = deviceId;
	}

	
	public String getDeviceId(){
		return this.deviceId;
	}

	
	public void setReferer(String referer){
		this.referer = referer;
	}

	
	public String getReferer(){
		return this.referer;
	}

	
	public void setUserAgent(String userAgent){
		this.userAgent = userAgent;
	}

	
	public String getUserAgent(){
		return this.userAgent;
	}

	
	public void setPurchaseProductInfoList(List<PurchaseProductInfoListItem> purchaseProductInfoList){
		this.purchaseProductInfoList = purchaseProductInfoList;
	}

	
	public List<PurchaseProductInfoListItem> getPurchaseProductInfoList(){
		return this.purchaseProductInfoList;
	}

}