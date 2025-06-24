package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CustomsReportInfo {


	@SerializedName("hs_code")
	@OpField(required = false , desc = "海关代码", example= "adaa")
	private String hsCode;

	@SerializedName("first_measure_qty")
	@OpField(required = false , desc = "法定第一计量数量", example= "12.1")
	private Double firstMeasureQty;

	@SerializedName("second_measure_qty")
	@OpField(required = false , desc = "法定第二计量数量", example= "12.3")
	private Double secondMeasureQty;

	@SerializedName("first_measure_unit")
	@OpField(required = false , desc = "法定第一计量单位", example= "ml")
	private String firstMeasureUnit;

	@SerializedName("second_measure_unit")
	@OpField(required = false , desc = "法定第二计量单位", example= "ml")
	private String secondMeasureUnit;

	@SerializedName("unit")
	@OpField(required = false , desc = "售卖单位", example= "ml")
	private String unit;

	@SerializedName("report_name")
	@OpField(required = false , desc = "品名", example= "名称")
	private String reportName;

	@SerializedName("report_brand_name")
	@OpField(required = false , desc = "品牌", example= "品牌名")
	private String reportBrandName;

	@SerializedName("usage")
	@OpField(required = false , desc = "用途", example= "用途")
	private String usage;

	@SerializedName("g_model")
	@OpField(required = false , desc = "规格型号", example= "x")
	private String gModel;

	@SerializedName("bar_code")
	@OpField(required = false , desc = "条形码", example= "xxx")
	private String barCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setHsCode(String hsCode){
		this.hsCode = hsCode;
	}

	
	public String getHsCode(){
		return this.hsCode;
	}

	
	public void setFirstMeasureQty(Double firstMeasureQty){
		this.firstMeasureQty = firstMeasureQty;
	}

	
	public Double getFirstMeasureQty(){
		return this.firstMeasureQty;
	}

	
	public void setSecondMeasureQty(Double secondMeasureQty){
		this.secondMeasureQty = secondMeasureQty;
	}

	
	public Double getSecondMeasureQty(){
		return this.secondMeasureQty;
	}

	
	public void setFirstMeasureUnit(String firstMeasureUnit){
		this.firstMeasureUnit = firstMeasureUnit;
	}

	
	public String getFirstMeasureUnit(){
		return this.firstMeasureUnit;
	}

	
	public void setSecondMeasureUnit(String secondMeasureUnit){
		this.secondMeasureUnit = secondMeasureUnit;
	}

	
	public String getSecondMeasureUnit(){
		return this.secondMeasureUnit;
	}

	
	public void setUnit(String unit){
		this.unit = unit;
	}

	
	public String getUnit(){
		return this.unit;
	}

	
	public void setReportName(String reportName){
		this.reportName = reportName;
	}

	
	public String getReportName(){
		return this.reportName;
	}

	
	public void setReportBrandName(String reportBrandName){
		this.reportBrandName = reportBrandName;
	}

	
	public String getReportBrandName(){
		return this.reportBrandName;
	}

	
	public void setUsage(String usage){
		this.usage = usage;
	}

	
	public String getUsage(){
		return this.usage;
	}

	
	public void setGModel(String gModel){
		this.gModel = gModel;
	}

	
	public String getGModel(){
		return this.gModel;
	}

	
	public void setBarCode(String barCode){
		this.barCode = barCode;
	}

	
	public String getBarCode(){
		return this.barCode;
	}

}