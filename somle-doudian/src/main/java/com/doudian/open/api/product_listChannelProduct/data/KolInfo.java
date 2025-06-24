package com.doudian.open.api.product_listChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class KolInfo {


	@SerializedName("bind_kol_num")
	@OpField(desc = "绑定达人数量", example = "11")
	private Long bindKolNum;

	@SerializedName("bind_all")
	@OpField(desc = "绑定所有", example = "true")
	private Boolean bindAll;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBindKolNum(Long bindKolNum){
		this.bindKolNum = bindKolNum;
	}

	
	public Long getBindKolNum(){
		return this.bindKolNum;
	}

	
	public void setBindAll(Boolean bindAll){
		this.bindAll = bindAll;
	}

	
	public Boolean getBindAll(){
		return this.bindAll;
	}

}