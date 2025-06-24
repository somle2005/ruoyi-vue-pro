package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CustomsReportInfo {


	@SerializedName("bar_code")
	@OpField(required = false , desc = "条形码", example= "xd")
	private String barCode;

	@SerializedName("g_model")
	@OpField(required = false , desc = "规格型号", example= "1")
	private String gModel;

	@SerializedName("usage")
	@OpField(required = false , desc = "用途", example= "ces1")
	private String usage;

	@SerializedName("report_brand_name")
	@OpField(required = false , desc = "品牌", example= "test")
	private String reportBrandName;

	@SerializedName("report_name")
	@OpField(required = false , desc = "品名", example= "test")
	private String reportName;

	@SerializedName("unit")
	@OpField(required = false , desc = "售卖单位", example= "yuan")
	private String unit;

	@SerializedName("second_measure_unit")
	@OpField(required = false , desc = "法定第二计量单位", example= "fen")
	private String secondMeasureUnit;

	@SerializedName("first_measure_unit")
	@OpField(required = false , desc = "法定第一计量单位", example= "pulata")
	private String firstMeasureUnit;

	@SerializedName("second_measure_qty")
	@OpField(required = false , desc = "法定第二计量数量", example= "法定第二计量数量")
	private Double secondMeasureQty;

	@SerializedName("first_measure_qty")
	@OpField(required = false , desc = "法定第一计量数量", example= "法定第一计量数量")
	private Double firstMeasureQty;

	@SerializedName("hs_code")
	@OpField(required = false , desc = "海关代码", example= "code")
	private String hsCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBarCode(String barCode){
		this.barCode = barCode;
	}

	
	public String getBarCode(){
		return this.barCode;
	}

	
	public void setGModel(String gModel){
		this.gModel = gModel;
	}

	
	public String getGModel(){
		return this.gModel;
	}

	
	public void setUsage(String usage){
		this.usage = usage;
	}

	
	public String getUsage(){
		return this.usage;
	}

	
	public void setReportBrandName(String reportBrandName){
		this.reportBrandName = reportBrandName;
	}

	
	public String getReportBrandName(){
		return this.reportBrandName;
	}

	
	public void setReportName(String reportName){
		this.reportName = reportName;
	}

	
	public String getReportName(){
		return this.reportName;
	}

	
	public void setUnit(String unit){
		this.unit = unit;
	}

	
	public String getUnit(){
		return this.unit;
	}

	
	public void setSecondMeasureUnit(String secondMeasureUnit){
		this.secondMeasureUnit = secondMeasureUnit;
	}

	
	public String getSecondMeasureUnit(){
		return this.secondMeasureUnit;
	}

	
	public void setFirstMeasureUnit(String firstMeasureUnit){
		this.firstMeasureUnit = firstMeasureUnit;
	}

	
	public String getFirstMeasureUnit(){
		return this.firstMeasureUnit;
	}

	
	public void setSecondMeasureQty(Double secondMeasureQty){
		this.secondMeasureQty = secondMeasureQty;
	}

	
	public Double getSecondMeasureQty(){
		return this.secondMeasureQty;
	}

	
	public void setFirstMeasureQty(Double firstMeasureQty){
		this.firstMeasureQty = firstMeasureQty;
	}

	
	public Double getFirstMeasureQty(){
		return this.firstMeasureQty;
	}

	
	public void setHsCode(String hsCode){
		this.hsCode = hsCode;
	}

	
	public String getHsCode(){
		return this.hsCode;
	}

}