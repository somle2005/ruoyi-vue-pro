package com.doudian.open.api.product_updateChannelProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductUpdateChannelProductParam {


	@SerializedName("main_product_id")
	@OpField(required = true , desc = "主商品ID", example= "3631654780608339610")
	private Long mainProductId;

	@SerializedName("channel_id")
	@OpField(required = true , desc = "渠道ID", example= "1775199232748660")
	private Long channelId;

	@SerializedName("channel_type")
	@OpField(required = true , desc = "渠道类型。不支持修改。3：商家自卖4：达人带货", example= "3")
	private Long channelType;

	@SerializedName("name")
	@OpField(required = false , desc = "渠道品定制标题，必填", example= "半身裙")
	private String name;

	@SerializedName("main_img_list")
	@OpField(required = false , desc = "渠道品定制主图，最高支持5张。detail_brief_follow_main值为false时，必须设置商详图", example= "[https://tosv.boe.byted.org/obj/ecom-shop-material/ayoJLG_m_290637ca0b8211e45bf4a441fc10b938_sx_47135_www600-600, https://tosv.boe.byted.org/obj/ecom-shop-material/ayoJLG_m_290637ca0b8211e45bf4a441fc10b938_sx_47135_www600-600]")
	private List<String> mainImgList;

	@SerializedName("start_time")
	@OpField(required = false , desc = "有效期开始时间", example= "2023-02-21 16:46:21")
	private String startTime;

	@SerializedName("end_time")
	@OpField(required = false , desc = "有效期结束时间", example= "2023-02-21 16:46:21")
	private String endTime;

	@SerializedName("price_follow_main")
	@OpField(required = true , desc = "渠道品SKU价格是否跟随主品", example= "true")
	private Boolean priceFollowMain;

	@SerializedName("share_main_stock")
	@OpField(required = true , desc = "渠道品SKU库存是否与主商品共享库存", example= "true")
	private Boolean shareMainStock;

	@SerializedName("is_kol_exclusive")
	@OpField(required = true , desc = "是否『达人专属』渠道品，不支持修改", example= "false")
	private Boolean isKolExclusive;

	@SerializedName("channel_buy_limit")
	@OpField(required = false , desc = "渠道品限购信息", example= "")
	private ChannelBuyLimit channelBuyLimit;

	@SerializedName("sku_channel")
	@OpField(required = true , desc = "渠道SKU相关信息", example= "")
	private List<SkuChannelItem> skuChannel;

	@SerializedName("detail_brief_img")
	@OpField(required = false , desc = "渠道品定制详情图，最高支持50张。可省略，默认使用主商品详情图列表", example= "[https://tosv.boe.byted.org/obj/ecom-shop-material/ayoJLG_m_290637ca0b8211e45bf4a441fc10b938_sx_47135_www600-600, https://tosv.boe.byted.org/obj/ecom-shop-material/ayoJLG_m_290637ca0b8211e45bf4a441fc10b938_sx_47135_www600-600]")
	private List<String> detailBriefImg;

	@SerializedName("freight_template")
	@OpField(required = false , desc = "运费模板", example= "")
	private FreightTemplate freightTemplate;

	@SerializedName("sku_code_follow_main")
	@OpField(required = false , desc = "商家编码与主品保持一致配置，true-商家编码与主品保持一致，false-商家编码自定义", example= "false")
	private Boolean skuCodeFollowMain;

	@SerializedName("detail_brief_follow_main")
	@OpField(required = false , desc = "商详与主品保持一致配置，true：保持一致；false：单独配置（此时必须传入商详图片，否则渠道品在c端将没有商详图）", example= "true")
	private Boolean detailBriefFollowMain;


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

	
	public void setMainImgList(List<String> mainImgList){
		this.mainImgList = mainImgList;
	}

	
	public List<String> getMainImgList(){
		return this.mainImgList;
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

	
	public void setDetailBriefImg(List<String> detailBriefImg){
		this.detailBriefImg = detailBriefImg;
	}

	
	public List<String> getDetailBriefImg(){
		return this.detailBriefImg;
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

	
	public void setDetailBriefFollowMain(Boolean detailBriefFollowMain){
		this.detailBriefFollowMain = detailBriefFollowMain;
	}

	
	public Boolean getDetailBriefFollowMain(){
		return this.detailBriefFollowMain;
	}

}