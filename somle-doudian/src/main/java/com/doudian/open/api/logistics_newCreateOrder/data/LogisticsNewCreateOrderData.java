package com.doudian.open.api.logistics_newCreateOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsNewCreateOrderData {


	@SerializedName("ebill_infos")
	@OpField(desc = "电子面单信息列表", example = "")
	private List<EbillInfosItem> ebillInfos;

	@SerializedName("err_infos")
	@OpField(desc = "错误信息列表", example = "")
	private List<ErrInfosItem> errInfos;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEbillInfos(List<EbillInfosItem> ebillInfos){
		this.ebillInfos = ebillInfos;
	}

	
	public List<EbillInfosItem> getEbillInfos(){
		return this.ebillInfos;
	}

	
	public void setErrInfos(List<ErrInfosItem> errInfos){
		this.errInfos = errInfos;
	}

	
	public List<ErrInfosItem> getErrInfos(){
		return this.errInfos;
	}

}