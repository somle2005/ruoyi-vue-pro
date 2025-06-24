package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QualityScore {


	@SerializedName("score")
	@OpField(desc = "质量分", example = "100")
	private Long score;

	@SerializedName("level")
	@OpField(desc = "等级", example = "lv2")
	private String level;

	@SerializedName("version")
	@OpField(desc = "质量分版本", example = "new_quality_score")
	private String version;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setScore(Long score){
		this.score = score;
	}

	
	public Long getScore(){
		return this.score;
	}

	
	public void setLevel(String level){
		this.level = level;
	}

	
	public String getLevel(){
		return this.level;
	}

	
	public void setVersion(String version){
		this.version = version;
	}

	
	public String getVersion(){
		return this.version;
	}

}