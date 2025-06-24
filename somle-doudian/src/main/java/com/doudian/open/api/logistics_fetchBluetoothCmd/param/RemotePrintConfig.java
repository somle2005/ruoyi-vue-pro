package com.doudian.open.api.logistics_fetchBluetoothCmd.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RemotePrintConfig {


	@SerializedName("need_top_logo")
	@OpField(required = false , desc = "是否需要打印物流商logo", example= "true")
	private Boolean needTopLogo;

	@SerializedName("horizontal_offset")
	@OpField(required = false , desc = "水平偏移量，单位mm", example= "1")
	private Integer horizontalOffset;

	@SerializedName("vertical_offset")
	@OpField(required = false , desc = "垂直偏移量，单位mm", example= "1")
	private Integer verticalOffset;

	@SerializedName("print_direction")
	@OpField(required = false , desc = "打印方向。normal-正常；reverse-反转。", example= "normal")
	private String printDirection;

	@SerializedName("printer_name")
	@OpField(required = true , desc = "打印机名称。查看已支持的打印机信息 https://bytedance.feishu.cn/sheets/VFmQsxJNth8t2OtWWDJca5BbnDb?sheet=44acf5", example= "QR-488BT_xx")
	private String printerName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setNeedTopLogo(Boolean needTopLogo){
		this.needTopLogo = needTopLogo;
	}

	
	public Boolean getNeedTopLogo(){
		return this.needTopLogo;
	}

	
	public void setHorizontalOffset(Integer horizontalOffset){
		this.horizontalOffset = horizontalOffset;
	}

	
	public Integer getHorizontalOffset(){
		return this.horizontalOffset;
	}

	
	public void setVerticalOffset(Integer verticalOffset){
		this.verticalOffset = verticalOffset;
	}

	
	public Integer getVerticalOffset(){
		return this.verticalOffset;
	}

	
	public void setPrintDirection(String printDirection){
		this.printDirection = printDirection;
	}

	
	public String getPrintDirection(){
		return this.printDirection;
	}

	
	public void setPrinterName(String printerName){
		this.printerName = printerName;
	}

	
	public String getPrinterName(){
		return this.printerName;
	}

}