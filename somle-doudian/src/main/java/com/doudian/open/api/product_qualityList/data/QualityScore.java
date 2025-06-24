package com.doudian.open.api.product_qualityList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QualityScore {


	@SerializedName("version")
	@OpField(desc = "质量分版本", example = "middle_score")
	private String version;

	@SerializedName("level")
	@OpField(desc = "质量分等级", example = "lv3")
	private String level;

	@SerializedName("score")
	@OpField(desc = "质量分", example = "100")
	private Long score;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setVersion(String version){
		this.version = version;
	}

	
	public String getVersion(){
		return this.version;
	}

	
	public void setLevel(String level){
		this.level = level;
	}

	
	public String getLevel(){
		return this.level;
	}

	
	public void setScore(Long score){
		this.score = score;
	}

	
	public Long getScore(){
		return this.score;
	}

}