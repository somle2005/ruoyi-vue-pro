package com.doudian.open.api.logistics_createSFOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsCreateSFOrderParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单号；非抖音订单长度仅支持32个字符，格式：数字、大小写字母及“-”、“/”2种分隔符的组合字符串，例如：Doudian-123456", example= "474351860506696200")
	private String orderId;

	@SerializedName("pack_id")
	@OpField(required = false , desc = "用于拆包场景：包裹id（只能传入数字、字母和下划线；大小写敏感，即123A,123a 不可当做相同ID，否则存在一定可能取号失败）一单一包裹是不需要传，有2个以上时，从第二个开始都需要传不同id 和parcelQty（子母件）最多二选一填，两者可以都不填", example= "1")
	private String packId;

	@SerializedName("cargo_details")
	@OpField(required = true , desc = "托寄物信息", example= "")
	private List<CargoDetailsItem> cargoDetails;

	@SerializedName("service_list")
	@OpField(required = false , desc = "增值服务信息", example= "")
	private List<ServiceListItem> serviceList;

	@SerializedName("contact_info_list")
	@OpField(required = true , desc = "收寄双方信息（数组长度必须为2）", example= "")
	private List<ContactInfoListItem> contactInfoList;

	@SerializedName("pay_method")
	@OpField(required = false , desc = "付款方式，支持以下值： 1:寄方付 2:收方付", example= "1")
	private Integer payMethod;

	@SerializedName("express_type_id")
	@OpField(required = false , desc = "快件产品类别，仅 可使用与顺丰销售约定的快件产品", example= "1")
	private Integer expressTypeId;

	@SerializedName("parcel_qty")
	@OpField(required = false , desc = "子母件场景使用，包裹数，一个包裹对应一个运单号；若包裹数大于1，则返回一个母运单号和N-1个子运单号 和packid（拆包场景）二选一填", example= "1")
	private Integer parcelQty;

	@SerializedName("total_weight")
	@OpField(required = false , desc = "订单货物总重量， 若为子母件必填， 单位千克， 精确到小数点后3 位，如果提供此值， 必须>0 (子母件需>6)", example= "1.234")
	private String totalWeight;

	@SerializedName("is_sign_back")
	@OpField(required = false , desc = "是否返回签回单 （签单返还）的运单号， 支持以下值： 1：要求 0：不要求", example= "0")
	private Integer isSignBack;

	@SerializedName("remark")
	@OpField(required = false , desc = "备注", example= "1")
	private String remark;

	@SerializedName("total_length")
	@OpField(required = false , desc = "客户订单货物总长，单位厘米， 精确到小数点后3位， 包含子母件", example= "1.234")
	private String totalLength;

	@SerializedName("total_width")
	@OpField(required = false , desc = "客户订单货物总宽，单位厘米， 精确到小数点后3位， 包含子母件", example= "1.234")
	private String totalWidth;

	@SerializedName("total_height")
	@OpField(required = false , desc = "客户订单货物总高，单位厘米， 精确到小数点后3位， 包含子母件", example= "1.234")
	private String totalHeight;

	@SerializedName("volume")
	@OpField(required = false , desc = "订单货物总体积，单位立方厘米, 精确到小数点后3位，会用于计抛", example= "1.234")
	private String volume;

	@SerializedName("user_id")
	@OpField(required = false , desc = "共享账号场景下需传，代表实际使用取号服务的shop_id（需与order_id匹配）；若无法获取到该shop_id，value传值 -1", example= "1")
	private Long userId;

	@SerializedName("order_channel")
	@OpField(required = false , desc = "订单渠道来源编码，具体请参考[下单渠道来源编码表](https://bytedance.feishu.cn/sheets/shtcngIVwcJlgXLzWhEtKrmv7Af)，当order_id订单号为非抖音订单时必传", example= "1")
	private String orderChannel;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setPackId(String packId){
		this.packId = packId;
	}

	
	public String getPackId(){
		return this.packId;
	}

	
	public void setCargoDetails(List<CargoDetailsItem> cargoDetails){
		this.cargoDetails = cargoDetails;
	}

	
	public List<CargoDetailsItem> getCargoDetails(){
		return this.cargoDetails;
	}

	
	public void setServiceList(List<ServiceListItem> serviceList){
		this.serviceList = serviceList;
	}

	
	public List<ServiceListItem> getServiceList(){
		return this.serviceList;
	}

	
	public void setContactInfoList(List<ContactInfoListItem> contactInfoList){
		this.contactInfoList = contactInfoList;
	}

	
	public List<ContactInfoListItem> getContactInfoList(){
		return this.contactInfoList;
	}

	
	public void setPayMethod(Integer payMethod){
		this.payMethod = payMethod;
	}

	
	public Integer getPayMethod(){
		return this.payMethod;
	}

	
	public void setExpressTypeId(Integer expressTypeId){
		this.expressTypeId = expressTypeId;
	}

	
	public Integer getExpressTypeId(){
		return this.expressTypeId;
	}

	
	public void setParcelQty(Integer parcelQty){
		this.parcelQty = parcelQty;
	}

	
	public Integer getParcelQty(){
		return this.parcelQty;
	}

	
	public void setTotalWeight(String totalWeight){
		this.totalWeight = totalWeight;
	}

	
	public String getTotalWeight(){
		return this.totalWeight;
	}

	
	public void setIsSignBack(Integer isSignBack){
		this.isSignBack = isSignBack;
	}

	
	public Integer getIsSignBack(){
		return this.isSignBack;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setTotalLength(String totalLength){
		this.totalLength = totalLength;
	}

	
	public String getTotalLength(){
		return this.totalLength;
	}

	
	public void setTotalWidth(String totalWidth){
		this.totalWidth = totalWidth;
	}

	
	public String getTotalWidth(){
		return this.totalWidth;
	}

	
	public void setTotalHeight(String totalHeight){
		this.totalHeight = totalHeight;
	}

	
	public String getTotalHeight(){
		return this.totalHeight;
	}

	
	public void setVolume(String volume){
		this.volume = volume;
	}

	
	public String getVolume(){
		return this.volume;
	}

	
	public void setUserId(Long userId){
		this.userId = userId;
	}

	
	public Long getUserId(){
		return this.userId;
	}

	
	public void setOrderChannel(String orderChannel){
		this.orderChannel = orderChannel;
	}

	
	public String getOrderChannel(){
		return this.orderChannel;
	}

}