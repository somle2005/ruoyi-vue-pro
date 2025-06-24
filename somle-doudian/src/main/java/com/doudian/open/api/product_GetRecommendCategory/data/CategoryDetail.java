package com.doudian.open.api.product_GetRecommendCategory.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CategoryDetail {


	@SerializedName("first_cid")
	@OpField(desc = "一级类目id", example = "20131")
	private Long firstCid;

	@SerializedName("first_cname")
	@OpField(desc = "一级类目名称", example = "一级类目名称")
	private String firstCname;

	@SerializedName("second_cid")
	@OpField(desc = "二级类目id", example = "34234")
	private Long secondCid;

	@SerializedName("second_cname")
	@OpField(desc = "二级类目名称", example = "二级类目名称")
	private String secondCname;

	@SerializedName("third_cid")
	@OpField(desc = "三级类目id", example = "13144")
	private Long thirdCid;

	@SerializedName("third_cname")
	@OpField(desc = "三级类目名称", example = "三级类目名称")
	private String thirdCname;

	@SerializedName("fourth_cid")
	@OpField(desc = "四级类目id", example = "154325")
	private Long fourthCid;

	@SerializedName("fourth_cname")
	@OpField(desc = "四级类目名称", example = "四级类目名称")
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

	
	public void setFirstCname(String firstCname){
		this.firstCname = firstCname;
	}

	
	public String getFirstCname(){
		return this.firstCname;
	}

	
	public void setSecondCid(Long secondCid){
		this.secondCid = secondCid;
	}

	
	public Long getSecondCid(){
		return this.secondCid;
	}

	
	public void setSecondCname(String secondCname){
		this.secondCname = secondCname;
	}

	
	public String getSecondCname(){
		return this.secondCname;
	}

	
	public void setThirdCid(Long thirdCid){
		this.thirdCid = thirdCid;
	}

	
	public Long getThirdCid(){
		return this.thirdCid;
	}

	
	public void setThirdCname(String thirdCname){
		this.thirdCname = thirdCname;
	}

	
	public String getThirdCname(){
		return this.thirdCname;
	}

	
	public void setFourthCid(Long fourthCid){
		this.fourthCid = fourthCid;
	}

	
	public Long getFourthCid(){
		return this.fourthCid;
	}

	
	public void setFourthCname(String fourthCname){
		this.fourthCname = fourthCname;
	}

	
	public String getFourthCname(){
		return this.fourthCname;
	}

}