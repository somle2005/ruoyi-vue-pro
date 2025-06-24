package com.doudian.open.api.logistics_newCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsNewCreateOrderParam {


	@SerializedName("sender_info")
	@OpField(required = true , desc = "寄件人信息", example= "")
	private SenderInfo senderInfo;

	@SerializedName("logistics_code")
	@OpField(required = true , desc = "物流服务商编码", example= "jtexpress")
	private String logisticsCode;

	@SerializedName("order_infos")
	@OpField(required = true , desc = "详细订单列表", example= "")
	private List<OrderInfosItem> orderInfos;

	@SerializedName("user_id")
	@OpField(required = false , desc = "共享账号场景下需传，代表实际使用取号服务的shop_id（需与order_id匹配）；若无法获取到该shop_id，value传值 -1", example= "1")
	private Long userId;

	@SerializedName("delivery_req")
	@OpField(required = false , desc = "派送要求（目前仅德邦支持）", example= "")
	private DeliveryReq deliveryReq;

	@SerializedName("order_channel")
	@OpField(required = false , desc = "订单渠道来源编码，具体请参考[下单渠道来源编码表](https://bytedance.feishu.cn/sheets/shtcngIVwcJlgXLzWhEtKrmv7Af)，当order_id订单号为非抖音订单时必传", example= "1")
	private String orderChannel;

	@SerializedName("ebill_delivery_info")
	@OpField(required = false , desc = "发货场景结构体", example= "")
	private EbillDeliveryInfo ebillDeliveryInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSenderInfo(SenderInfo senderInfo){
		this.senderInfo = senderInfo;
	}

	
	public SenderInfo getSenderInfo(){
		return this.senderInfo;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setOrderInfos(List<OrderInfosItem> orderInfos){
		this.orderInfos = orderInfos;
	}

	
	public List<OrderInfosItem> getOrderInfos(){
		return this.orderInfos;
	}

	
	public void setUserId(Long userId){
		this.userId = userId;
	}

	
	public Long getUserId(){
		return this.userId;
	}

	
	public void setDeliveryReq(DeliveryReq deliveryReq){
		this.deliveryReq = deliveryReq;
	}

	
	public DeliveryReq getDeliveryReq(){
		return this.deliveryReq;
	}

	
	public void setOrderChannel(String orderChannel){
		this.orderChannel = orderChannel;
	}

	
	public String getOrderChannel(){
		return this.orderChannel;
	}

	
	public void setEbillDeliveryInfo(EbillDeliveryInfo ebillDeliveryInfo){
		this.ebillDeliveryInfo = ebillDeliveryInfo;
	}

	
	public EbillDeliveryInfo getEbillDeliveryInfo(){
		return this.ebillDeliveryInfo;
	}

}