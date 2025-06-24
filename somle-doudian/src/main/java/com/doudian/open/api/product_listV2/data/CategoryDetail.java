package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CategoryDetail {


	@SerializedName("first_cid")
	@OpField(desc = "一级类目", example = "20117")
	private Long firstCid;

	@SerializedName("second_cid")
	@OpField(desc = "二级类目", example = "22139")
	private Long secondCid;

	@SerializedName("third_cid")
	@OpField(desc = "三级类目", example = "28901")
	private Long thirdCid;

	@SerializedName("fourth_cid")
	@OpField(desc = "四级类目", example = "31800")
	private Long fourthCid;

	@SerializedName("first_cname")
	@OpField(desc = "一级类目名称", example = "本地生活服务")
	private String firstCname;

	@SerializedName("second_cname")
	@OpField(desc = "二级类目名称", example = "餐饮美食卡券")
	private String secondCname;

	@SerializedName("third_cname")
	@OpField(desc = "三级类目名称", example = "甜品/冰淇淋/咖啡/冷饮")
	private String thirdCname;

	@SerializedName("fourth_cname")
	@OpField(desc = "四级类目名称", example = "咖啡")
	private String fourthCname;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFirstCid(Long firstCid){
		this.firstCid = firstCid;
	}

	
	public Long getFirstCid(){
		return this.firstCid;
	}

	
	public void setSecondCid(Long secondCid){
		this.secondCid = secondCid;
	}

	
	public Long getSecondCid(){
		return this.secondCid;
	}

	
	public void setThirdCid(Long thirdCid){
		this.thirdCid = thirdCid;
	}

	
	public Long getThirdCid(){
		return this.thirdCid;
	}

	
	public void setFourthCid(Long fourthCid){
		this.fourthCid = fourthCid;
	}

	
	public Long getFourthCid(){
		return this.fourthCid;
	}

	
	public void setFirstCname(String firstCname){
		this.firstCname = firstCname;
	}

	
	public String getFirstCname(){
		return this.firstCname;
	}

	
	public void setSecondCname(String secondCname){
		this.secondCname = secondCname;
	}

	
	public String getSecondCname(){
		return this.secondCname;
	}

	
	public void setThirdCname(String thirdCname){
		this.thirdCname = thirdCname;
	}

	
	public String getThirdCname(){
		return this.thirdCname;
	}

	
	public void setFourthCname(String fourthCname){
		this.fourthCname = fourthCname;
	}

	
	public String getFourthCname(){
		return this.fourthCname;
	}

}