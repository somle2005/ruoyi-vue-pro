package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PicSuggestion {


	@SerializedName("after_pics")
	@OpField(desc = "修改后图片，需要重新走素材中心转图", example = "修改后图片，需要重新走素材中心转图")
	private List<String> afterPics;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAfterPics(List<String> afterPics){
		this.afterPics = afterPics;
	}

	
	public List<String> getAfterPics(){
		return this.afterPics;
	}

}