package com.doudian.open.api.logistics_waybillApply.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsWaybillApplyData {


	@SerializedName("waybill_infos")
	@OpField(desc = "正常返回结构体", example = "-")
	private List<WaybillInfosItem> waybillInfos;

	@SerializedName("err_infos")
	@OpField(desc = "错误返回结构体", example = "-")
	private List<ErrInfosItem> errInfos;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWaybillInfos(List<WaybillInfosItem> waybillInfos){
		this.waybillInfos = waybillInfos;
	}

	
	public List<WaybillInfosItem> getWaybillInfos(){
		return this.waybillInfos;
	}

	
	public void setErrInfos(List<ErrInfosItem> errInfos){
		this.errInfos = errInfos;
	}

	
	public List<ErrInfosItem> getErrInfos(){
		return this.errInfos;
	}

}