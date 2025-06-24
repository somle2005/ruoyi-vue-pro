package com.doudian.open.api.product_listChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("detail_brief_material")
	@OpField(desc = "渠道品详情图信息", example = "")
	private DetailBriefMaterial detailBriefMaterial;

	@SerializedName("main_img_material")
	@OpField(desc = "渠道品主图信息", example = "")
	private MainImgMaterial mainImgMaterial;

	@SerializedName("sku_code_follow_main")
	@OpField(desc = "商家编码与主品保持一致配置，true-保持一致，false-自定义", example = "false")
	private Boolean skuCodeFollowMain;

	@SerializedName("name")
	@OpField(desc = "渠道品标题", example = "半身裙")
	private String name;

	@SerializedName("main_product_id")
	@OpField(desc = "主商品ID", example = "3232323232323232")
	private Long mainProductId;

	@SerializedName("channel_id")
	@OpField(desc = "渠道ID", example = "1771739938745351")
	private Long channelId;

	@SerializedName("channel_type")
	@OpField(desc = "渠道类型", example = "3")
	private Long channelType;

	@SerializedName("start_time")
	@OpField(desc = "有效期开始时间", example = "2023-02-21 16:46:21")
	private String startTime;

	@SerializedName("end_time")
	@OpField(desc = "有效期结束时间", example = "2023-02-21 16:46:21")
	private String endTime;

	@SerializedName("status")
	@OpField(desc = "渠道品状态0：下架2：上架3：封禁", example = "2")
	private Long status;

	@SerializedName("kol_info")
	@OpField(desc = "绑定达人信息", example = "")
	private KolInfo kolInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDetailBriefMaterial(DetailBriefMaterial detailBriefMaterial){
		this.detailBriefMaterial = detailBriefMaterial;
	}

	
	public DetailBriefMaterial getDetailBriefMaterial(){
		return this.detailBriefMaterial;
	}

	
	public void setMainImgMaterial(MainImgMaterial mainImgMaterial){
		this.mainImgMaterial = mainImgMaterial;
	}

	
	public MainImgMaterial getMainImgMaterial(){
		return this.mainImgMaterial;
	}

	
	public void setSkuCodeFollowMain(Boolean skuCodeFollowMain){
		this.skuCodeFollowMain = skuCodeFollowMain;
	}

	
	public Boolean getSkuCodeFollowMain(){
		return this.skuCodeFollowMain;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
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

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setKolInfo(KolInfo kolInfo){
		this.kolInfo = kolInfo;
	}

	
	public KolInfo getKolInfo(){
		return this.kolInfo;
	}

}