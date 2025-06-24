package com.doudian.open.api.order_searchList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderSearchListParam {


	@SerializedName("product")
	@OpField(required = false , desc = "商品，number型代表商品ID，其它代表商品名称", example= "3473196049974326153")
	private String product;

	@SerializedName("b_type")
	@OpField(required = false , desc = "【下单端】 0、站外   1、火山   2、抖音   3、头条   4、西瓜   5、微信   6、值点app  7、头条lite   8、懂车帝  9、皮皮虾   11、抖音极速版   12、TikTok   13、musically   14、穿山甲   15、火山极速版   16、服务市场   26、番茄小说   27、UG教育营销电商平台   28、Jumanji   29、电商SDK", example= "2")
	private Long bType;

	@SerializedName("after_sale_status_desc")
	@OpField(required = false , desc = "售后状态：all-全部，in_aftersale-售后中，refund-退款中，refund_success-退款成功，refund_fail-退款失败，exchange_success-换货成功 aftersale_close-售后关闭", example= "refund_success")
	private String afterSaleStatusDesc;

	@SerializedName("tracking_no")
	@OpField(required = false , desc = "物流单号", example= "435435")
	private String trackingNo;

	@SerializedName("presell_type")
	@OpField(required = false , desc = "预售类型：0-普通订单；1-全款预售；2-定金预售；3-定金找货；", example= "0")
	private Long presellType;

	@SerializedName("order_type")
	@OpField(required = false , desc = "订单类型 0、普通订单 2、虚拟商品订单 4、电子券（poi核销） 5、三方核销", example= "1")
	private Long orderType;

	@SerializedName("create_time_start")
	@OpField(required = false , desc = "下单时间：开始，秒级时间戳", example= "1617355413")
	private Long createTimeStart;

	@SerializedName("create_time_end")
	@OpField(required = false , desc = "下单时间：截止，秒级时间戳", example= "1617355413")
	private Long createTimeEnd;

	@SerializedName("abnormal_order")
	@OpField(required = false , desc = "异常订单，1-异常取消，2-风控审核中", example= "1")
	private Long abnormalOrder;

	@SerializedName("trade_type")
	@OpField(required = false , desc = "交易类型：0-普通；1-拼团；2-定金预售；3-订金找货；4-拍卖；5-0元单；6-回收；7-寄卖；10-寄样；11-0元抽奖(超级福袋)；12-达人买样；13-普通定制；16-大众竞拍；18-小时达；102-定金预售的赠品单；103-收款；", example= "1")
	private Long tradeType;

	@SerializedName("combine_status")
	@OpField(required = false , desc = "状态组合查询，直接输入状态码（只支持一个元素）", example= "")
	private List<CombineStatusItem> combineStatus;

	@SerializedName("update_time_start")
	@OpField(required = false , desc = "更新时间：开始", example= "1617355413")
	private Long updateTimeStart;

	@SerializedName("update_time_end")
	@OpField(required = false , desc = "更新时间：截止", example= "1617355413")
	private Long updateTimeEnd;

	@SerializedName("size")
	@OpField(required = true , desc = "单页大小，限制100以内", example= "20")
	private Long size;

	@SerializedName("page")
	@OpField(required = true , desc = "页码，0页开始", example= "0")
	private Long page;

	@SerializedName("order_by")
	@OpField(required = false , desc = "排序条件(create_time 订单创建时间；update_time 订单更新时间；默认create_time；)", example= "create_time")
	private String orderBy;

	@SerializedName("order_asc")
	@OpField(required = false , desc = "排序类型，小到大或大到小，默认大到小", example= "false")
	private Boolean orderAsc;

	@SerializedName("fulfil_status")
	@OpField(required = false , desc = "履约状态；如小时达未接单no_accept", example= "no_accept")
	private String fulfilStatus;

	@SerializedName("is_searchable")
	private Boolean isSearchable;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProduct(String product){
		this.product = product;
	}

	
	public String getProduct(){
		return this.product;
	}

	
	public void setBType(Long bType){
		this.bType = bType;
	}

	
	public Long getBType(){
		return this.bType;
	}

	
	public void setAfterSaleStatusDesc(String afterSaleStatusDesc){
		this.afterSaleStatusDesc = afterSaleStatusDesc;
	}

	
	public String getAfterSaleStatusDesc(){
		return this.afterSaleStatusDesc;
	}

	
	public void setTrackingNo(String trackingNo){
		this.trackingNo = trackingNo;
	}

	
	public String getTrackingNo(){
		return this.trackingNo;
	}

	
	public void setPresellType(Long presellType){
		this.presellType = presellType;
	}

	
	public Long getPresellType(){
		return this.presellType;
	}

	
	public void setOrderType(Long orderType){
		this.orderType = orderType;
	}

	
	public Long getOrderType(){
		return this.orderType;
	}

	
	public void setCreateTimeStart(Long createTimeStart){
		this.createTimeStart = createTimeStart;
	}

	
	public Long getCreateTimeStart(){
		return this.createTimeStart;
	}

	
	public void setCreateTimeEnd(Long createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	
	public Long getCreateTimeEnd(){
		return this.createTimeEnd;
	}

	
	public void setAbnormalOrder(Long abnormalOrder){
		this.abnormalOrder = abnormalOrder;
	}

	
	public Long getAbnormalOrder(){
		return this.abnormalOrder;
	}

	
	public void setTradeType(Long tradeType){
		this.tradeType = tradeType;
	}

	
	public Long getTradeType(){
		return this.tradeType;
	}

	
	public void setCombineStatus(List<CombineStatusItem> combineStatus){
		this.combineStatus = combineStatus;
	}

	
	public List<CombineStatusItem> getCombineStatus(){
		return this.combineStatus;
	}

	
	public void setUpdateTimeStart(Long updateTimeStart){
		this.updateTimeStart = updateTimeStart;
	}

	
	public Long getUpdateTimeStart(){
		return this.updateTimeStart;
	}

	
	public void setUpdateTimeEnd(Long updateTimeEnd){
		this.updateTimeEnd = updateTimeEnd;
	}

	
	public Long getUpdateTimeEnd(){
		return this.updateTimeEnd;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setOrderBy(String orderBy){
		this.orderBy = orderBy;
	}

	
	public String getOrderBy(){
		return this.orderBy;
	}

	
	public void setOrderAsc(Boolean orderAsc){
		this.orderAsc = orderAsc;
	}

	
	public Boolean getOrderAsc(){
		return this.orderAsc;
	}

	
	public void setFulfilStatus(String fulfilStatus){
		this.fulfilStatus = fulfilStatus;
	}

	
	public String getFulfilStatus(){
		return this.fulfilStatus;
	}

	
	public void setIsSearchable(Boolean isSearchable){
		this.isSearchable = isSearchable;
	}

	
	public Boolean getIsSearchable(){
		return this.isSearchable;
	}

}