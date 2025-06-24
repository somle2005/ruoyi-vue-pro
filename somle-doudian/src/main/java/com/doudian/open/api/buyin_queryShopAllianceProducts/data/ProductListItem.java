package com.doudian.open.api.buyin_queryShopAllianceProducts.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductListItem {


	@SerializedName("sample_conf")
	@OpField(desc = "达人买样返款设置信息", example = "")
	private SampleConf sampleConf;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "34312324232145")
	private Long productId;

	@SerializedName("title")
	@OpField(desc = "商品名称", example = "测试商品的名称")
	private String title;

	@SerializedName("cover")
	@OpField(desc = "商品主图", example = "https://sf1-ttcdn-tos.pstatp.com/img/temai/Fpt8fam5_q50.webp")
	private String cover;

	@SerializedName("price")
	@OpField(desc = "商品售价（单位为分）", example = "100")
	private Long price;

	@SerializedName("market_price")
	@OpField(desc = "市场价 (单位为分)", example = "100")
	private Long marketPrice;

	@SerializedName("status")
	@OpField(desc = "商品状态，2：商品在架；3：商家关闭推广；4：商品下架；6：平台治理关闭；99：商家删除", example = "2")
	private Long status;

	@SerializedName("cos_ratio")
	@OpField(desc = "普通佣金率，值乘以了100， 如50%返回50", example = "50.00")
	private Double cosRatio;

	@SerializedName("detail_url")
	@OpField(desc = "商品链接", example = "https://haohuo.jinritemai.com/views/product/item2?id=34312324232145")
	private String detailUrl;

	@SerializedName("sales")
	@OpField(desc = "销量（单位为分）", example = "0")
	private Long sales;

	@SerializedName("cos_fee")
	@OpField(desc = "佣金（单位为分）", example = "50")
	private Long cosFee;

	@SerializedName("update_time")
	@OpField(desc = "更新时间戳", example = "1660790303")
	private Long updateTime;

	@SerializedName("imgs")
	@OpField(desc = "图片列表", example = "[https://p3-aio.ecombdimg.com/obj/temai/5f2e085982cbad84cadb30a100d42a09ww]")
	private List<String> imgs;

	@SerializedName("check_status")
	@OpField(desc = "审核状态。 0：未审核；2：审核未通过；3：审核通过", example = "3")
	private Long checkStatus;

	@SerializedName("create_time")
	@OpField(desc = "创建时间戳", example = "1650007266")
	private Long createTime;

	@SerializedName("is_exclusive")
	@OpField(desc = "是否开启专属计划", example = "false")
	private Boolean isExclusive;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSampleConf(SampleConf sampleConf){
		this.sampleConf = sampleConf;
	}

	
	public SampleConf getSampleConf(){
		return this.sampleConf;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setTitle(String title){
		this.title = title;
	}

	
	public String getTitle(){
		return this.title;
	}

	
	public void setCover(String cover){
		this.cover = cover;
	}

	
	public String getCover(){
		return this.cover;
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setMarketPrice(Long marketPrice){
		this.marketPrice = marketPrice;
	}

	
	public Long getMarketPrice(){
		return this.marketPrice;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setCosRatio(Double cosRatio){
		this.cosRatio = cosRatio;
	}

	
	public Double getCosRatio(){
		return this.cosRatio;
	}

	
	public void setDetailUrl(String detailUrl){
		this.detailUrl = detailUrl;
	}

	
	public String getDetailUrl(){
		return this.detailUrl;
	}

	
	public void setSales(Long sales){
		this.sales = sales;
	}

	
	public Long getSales(){
		return this.sales;
	}

	
	public void setCosFee(Long cosFee){
		this.cosFee = cosFee;
	}

	
	public Long getCosFee(){
		return this.cosFee;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setImgs(List<String> imgs){
		this.imgs = imgs;
	}

	
	public List<String> getImgs(){
		return this.imgs;
	}

	
	public void setCheckStatus(Long checkStatus){
		this.checkStatus = checkStatus;
	}

	
	public Long getCheckStatus(){
		return this.checkStatus;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setIsExclusive(Boolean isExclusive){
		this.isExclusive = isExclusive;
	}

	
	public Boolean getIsExclusive(){
		return this.isExclusive;
	}

}