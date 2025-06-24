package com.doudian.open.api.logistics_fetchBluetoothCmd.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WaybillInfosItem {


	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "1234")
	private String trackNo;

	@SerializedName("print_data")
	@OpField(desc = "打印指令", example = "1234")
	private String printData;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setPrintData(String printData){
		this.printData = printData;
	}

	
	public String getPrintData(){
		return this.printData;
	}

}