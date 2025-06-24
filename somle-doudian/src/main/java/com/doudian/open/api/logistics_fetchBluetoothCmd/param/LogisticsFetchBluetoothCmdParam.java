package com.doudian.open.api.logistics_fetchBluetoothCmd.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsFetchBluetoothCmdParam {


	@SerializedName("waybill_applies")
	@OpField(required = true , desc = "运单信息，一次最多请求200单。", example= "")
	private List<WaybillAppliesItem> waybillApplies;

	@SerializedName("remote_print_config")
	@OpField(required = false , desc = "打印配置", example= "")
	private RemotePrintConfig remotePrintConfig;

	@SerializedName("cmd_type")
	@OpField(required = true , desc = "打印机指令类型。CPCL；TSPL", example= "CPCL")
	private String cmdType;

	@SerializedName("cmd_encode")
	@OpField(required = true , desc = "编码方式。origin：原串->字节数组->base64；gzip_byte：原串->字节数组->gzip压缩->base64", example= "gzip_byte")
	private String cmdEncode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWaybillApplies(List<WaybillAppliesItem> waybillApplies){
		this.waybillApplies = waybillApplies;
	}

	
	public List<WaybillAppliesItem> getWaybillApplies(){
		return this.waybillApplies;
	}

	
	public void setRemotePrintConfig(RemotePrintConfig remotePrintConfig){
		this.remotePrintConfig = remotePrintConfig;
	}

	
	public RemotePrintConfig getRemotePrintConfig(){
		return this.remotePrintConfig;
	}

	
	public void setCmdType(String cmdType){
		this.cmdType = cmdType;
	}

	
	public String getCmdType(){
		return this.cmdType;
	}

	
	public void setCmdEncode(String cmdEncode){
		this.cmdEncode = cmdEncode;
	}

	
	public String getCmdEncode(){
		return this.cmdEncode;
	}

}