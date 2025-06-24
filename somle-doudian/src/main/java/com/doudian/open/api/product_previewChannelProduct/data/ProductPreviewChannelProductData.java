package com.doudian.open.api.product_previewChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductPreviewChannelProductData {


	@SerializedName("main_product_id")
	@OpField(desc = "主商品ID", example = "3631654780608339610")
	private Long mainProductId;

	@SerializedName("channel_id")
	@OpField(desc = "渠道ID", example = "1775199232748660")
	private Long channelId;

	@SerializedName("channel_type")
	@OpField(desc = "渠道类型", example = "3")
	private Long channelType;

	@SerializedName("name")
	@OpField(desc = "渠道品标题", example = "半身裙")
	private String name;

	@SerializedName("start_time")
	@OpField(desc = "有效期开始时间", example = "2023-02-21 16:46:21")
	private String startTime;

	@SerializedName("end_time")
	@OpField(desc = "有效期结束时间", example = "2023-02-21 16:46:21")
	private String endTime;

	@SerializedName("price_follow_main")
	@OpField(desc = "价格是否跟随主品", example = "true")
	private Boolean priceFollowMain;

	@SerializedName("share_main_stock")
	@OpField(desc = "库存是否与主品共享", example = "true")
	private Boolean shareMainStock;

	@SerializedName("is_kol_exclusive")
	@OpField(desc = "是否『达人专属』渠道品", example = "true")
	private Boolean isKolExclusive;

	@SerializedName("status")
	@OpField(desc = "渠道品状态0：下架2：上架3：封禁", example = "1")
	private Long status;

	@SerializedName("channel_buy_limit")
	@OpField(desc = "限购信息", example = "")
	private ChannelBuyLimit channelBuyLimit;

	@SerializedName("sku_channel")
	@OpField(desc = "SKU信息", example = "")
	private List<SkuChannelItem> skuChannel;

	@SerializedName("main_img_material")
	@OpField(desc = "渠道品主图信息", example = "")
	private MainImgMaterial mainImgMaterial;

	@SerializedName("detail_brief_material")
	@OpField(desc = "渠道品详情图信息", example = "")
	private DetailBriefMaterial detailBriefMaterial;

	@SerializedName("freight_template")
	@OpField(desc = "运费模板配置", example = "")
	private FreightTemplate freightTemplate;

	@SerializedName("sku_code_follow_main")
	@OpField(desc = "商家编码与主品保持一致配置，true-与主品保持一致，false-自定义", example = "false")
	private Boolean skuCodeFollowMain;

	@SerializedName("check_status")
	@OpField(desc = "渠道品审核状态，1：未提交审核；2：审核中；3：审核通过；4：审核拒绝", example = "3")
	private Long checkStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMainProductId(Long mainProductId){
		this.mainProductId = mainProductId;
	}

	
	public Long getMainProductId(){
		return this.mainProductId;
	}

	
	public void setChannelId(Long channelId){
		this.channelId = channelId;
	}

	
	public Long getChannelId(){
		return this.channelId;
	}

	
	public void setChannelType(Long channelType){
		this.channelType = channelType;
	}

	
	public Long getChannelType(){
		return this.channelType;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	
	public String getStartTime(){
		return this.startTime;
	}

	
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	
	public String getEndTime(){
		return this.endTime;
	}

	
	public void setPriceFollowMain(Boolean priceFollowMain){
		this.priceFollowMain = priceFollowMain;
	}

	
	public Boolean getPriceFollowMain(){
		return this.priceFollowMain;
	}

	
	public void setShareMainStock(Boolean shareMainStock){
		this.shareMainStock = shareMainStock;
	}

	
	public Boolean getShareMainStock(){
		return this.shareMainStock;
	}

	
	public void setIsKolExclusive(Boolean isKolExclusive){
		this.isKolExclusive = isKolExclusive;
	}

	
	public Boolean getIsKolExclusive(){
		return this.isKolExclusive;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setChannelBuyLimit(ChannelBuyLimit channelBuyLimit){
		this.channelBuyLimit = channelBuyLimit;
	}

	
	public ChannelBuyLimit getChannelBuyLimit(){
		return this.channelBuyLimit;
	}

	
	public void setSkuChannel(List<SkuChannelItem> skuChannel){
		this.skuChannel = skuChannel;
	}

	
	public List<SkuChannelItem> getSkuChannel(){
		return this.skuChannel;
	}

	
	public void setMainImgMaterial(MainImgMaterial mainImgMaterial){
		this.mainImgMaterial = mainImgMaterial;
	}

	
	public MainImgMaterial getMainImgMaterial(){
		return this.mainImgMaterial;
	}

	
	public void setDetailBriefMaterial(DetailBriefMaterial detailBriefMaterial){
		this.detailBriefMaterial = detailBriefMaterial;
	}

	
	public DetailBriefMaterial getDetailBriefMaterial(){
		return this.detailBriefMaterial;
	}

	
	public void setFreightTemplate(FreightTemplate freightTemplate){
		this.freightTemplate = freightTemplate;
	}

	
	public FreightTemplate getFreightTemplate(){
		return this.freightTemplate;
	}

	
	public void setSkuCodeFollowMain(Boolean skuCodeFollowMain){
		this.skuCodeFollowMain = skuCodeFollowMain;
	}

	
	public Boolean getSkuCodeFollowMain(){
		return this.skuCodeFollowMain;
	}

	
	public void setCheckStatus(Long checkStatus){
		this.checkStatus = checkStatus;
	}

	
	public Long getCheckStatus(){
		return this.checkStatus;
	}

}