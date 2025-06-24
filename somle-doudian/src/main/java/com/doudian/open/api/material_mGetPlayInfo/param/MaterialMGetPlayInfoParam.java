package com.doudian.open.api.material_mGetPlayInfo.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialMGetPlayInfoParam {


	@SerializedName("vid_list")
	@OpField(required = true , desc = "vid列表，列表长度(1, 20)", example= "[asd123asdqw ,asd1wdsadas]")
	private List<String> vidList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setVidList(List<String> vidList){
		this.vidList = vidList;
	}

	
	public List<String> getVidList(){
		return this.vidList;
	}

}