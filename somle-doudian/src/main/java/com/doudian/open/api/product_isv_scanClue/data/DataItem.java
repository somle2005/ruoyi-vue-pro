package com.doudian.open.api.product_isv_scanClue.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DataItem {


	@SerializedName("clue_id")
	@OpField(desc = "线索ID", example = "123")
	private Long clueId;

	@SerializedName("clue_name")
	@OpField(desc = "线索名", example = "我是线索")
	private String clueName;

	@SerializedName("pic_url")
	@OpField(desc = "线索图片URL", example = "https://p3-aio.ecombdimg.com/obj/ecom-shop-material/SVCpeIZ_m_eb5bf8ba296491e6ed50bf4d5f4cb291_sx_38409_www")
	private String picUrl;

	@SerializedName("first_cid")
	@OpField(desc = "一级类目ID", example = "20029")
	private Long firstCid;

	@SerializedName("first_name")
	@OpField(desc = "一级类目名", example = "彩妆/香水/美妆工具")
	private String firstName;

	@SerializedName("second_cid")
	@OpField(desc = "二级类目ID", example = "20570")
	private Long secondCid;

	@SerializedName("second_name")
	@OpField(desc = "二级类目名", example = "男士彩妆")
	private String secondName;

	@SerializedName("brand_id")
	@OpField(desc = "品牌ID", example = "0")
	private Long brandId;

	@SerializedName("brand_name_cn")
	@OpField(desc = "品牌名-中文", example = "")
	private String brandNameCn;

	@SerializedName("brand_name_en")
	@OpField(desc = "品牌名-英文", example = "")
	private String brandNameEn;

	@SerializedName("price_min")
	@OpField(desc = "建议售价最小值, 单位 分", example = "1890")
	private Long priceMin;

	@SerializedName("price_max")
	@OpField(desc = "建议售价最大值, 单位 分", example = "3990")
	private Long priceMax;

	@SerializedName("search_heat")
	@OpField(desc = "搜索热度-根据搜索人数进行指数化处理，热度越高代表搜索人数越多", example = "577")
	private Long searchHeat;

	@SerializedName("demand_and_supply_rate")
	@OpField(desc = "需供比-根据近30天的用户搜索量 / 商品数量进行指数化处理，需供比越大代表当前商机潜力越大（供不应求）", example = "4.56")
	private Double demandAndSupplyRate;

	@SerializedName("third_cid")
	@OpField(desc = "三级类目ID", example = "0")
	private Long thirdCid;

	@SerializedName("third_name")
	@OpField(desc = "三级类目名", example = "")
	private String thirdName;

	@SerializedName("fourth_cid")
	@OpField(desc = "四级类目ID", example = "0")
	private Long fourthCid;

	@SerializedName("fourth_name")
	@OpField(desc = "四级类目名", example = "")
	private String fourthName;

	@SerializedName("query_name_cut_list")
	@OpField(desc = "线索名的分词列表-底层是搜索审核打分的分词规则", example = "[加绒,加厚]")
	private List<String> queryNameCutList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setClueId(Long clueId){
		this.clueId = clueId;
	}

	
	public Long getClueId(){
		return this.clueId;
	}

	
	public void setClueName(String clueName){
		this.clueName = clueName;
	}

	
	public String getClueName(){
		return this.clueName;
	}

	
	public void setPicUrl(String picUrl){
		this.picUrl = picUrl;
	}

	
	public String getPicUrl(){
		return this.picUrl;
	}

	
	public void setFirstCid(Long firstCid){
		this.firstCid = firstCid;
	}

	
	public Long getFirstCid(){
		return this.firstCid;
	}

	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	
	public String getFirstName(){
		return this.firstName;
	}

	
	public void setSecondCid(Long secondCid){
		this.secondCid = secondCid;
	}

	
	public Long getSecondCid(){
		return this.secondCid;
	}

	
	public void setSecondName(String secondName){
		this.secondName = secondName;
	}

	
	public String getSecondName(){
		return this.secondName;
	}

	
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}

	
	public Long getBrandId(){
		return this.brandId;
	}

	
	public void setBrandNameCn(String brandNameCn){
		this.brandNameCn = brandNameCn;
	}

	
	public String getBrandNameCn(){
		return this.brandNameCn;
	}

	
	public void setBrandNameEn(String brandNameEn){
		this.brandNameEn = brandNameEn;
	}

	
	public String getBrandNameEn(){
		return this.brandNameEn;
	}

	
	public void setPriceMin(Long priceMin){
		this.priceMin = priceMin;
	}

	
	public Long getPriceMin(){
		return this.priceMin;
	}

	
	public void setPriceMax(Long priceMax){
		this.priceMax = priceMax;
	}

	
	public Long getPriceMax(){
		return this.priceMax;
	}

	
	public void setSearchHeat(Long searchHeat){
		this.searchHeat = searchHeat;
	}

	
	public Long getSearchHeat(){
		return this.searchHeat;
	}

	
	public void setDemandAndSupplyRate(Double demandAndSupplyRate){
		this.demandAndSupplyRate = demandAndSupplyRate;
	}

	
	public Double getDemandAndSupplyRate(){
		return this.demandAndSupplyRate;
	}

	
	public void setThirdCid(Long thirdCid){
		this.thirdCid = thirdCid;
	}

	
	public Long getThirdCid(){
		return this.thirdCid;
	}

	
	public void setThirdName(String thirdName){
		this.thirdName = thirdName;
	}

	
	public String getThirdName(){
		return this.thirdName;
	}

	
	public void setFourthCid(Long fourthCid){
		this.fourthCid = fourthCid;
	}

	
	public Long getFourthCid(){
		return this.fourthCid;
	}

	
	public void setFourthName(String fourthName){
		this.fourthName = fourthName;
	}

	
	public String getFourthName(){
		return this.fourthName;
	}

	
	public void setQueryNameCutList(List<String> queryNameCutList){
		this.queryNameCutList = queryNameCutList;
	}

	
	public List<String> getQueryNameCutList(){
		return this.queryNameCutList;
	}

}