package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuControlRule {


	@SerializedName("support_spu_product")
	@OpField(desc = "是否支持spu发品", example = "true")
	private Boolean supportSpuProduct;

	@SerializedName("control_type")
	@OpField(desc = "0不管控 1弱管控 2强管控", example = "2")
	private Long controlType;

	@SerializedName("support_create_spu")
	@OpField(desc = "是否支持新建spu", example = "true")
	private Boolean supportCreateSpu;

	@SerializedName("support_rectify_spu")
	@OpField(desc = "是否支持spu纠错", example = "false")
	private Boolean supportRectifySpu;

	@SerializedName("support_report_spu")
	@OpField(desc = "是否支持spu举报", example = "true")
	private Boolean supportReportSpu;

	@SerializedName("no_need_audit_spu")
	@OpField(desc = "是否spu免审", example = "false")
	private Boolean noNeedAuditSpu;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSupportSpuProduct(Boolean supportSpuProduct){
		this.supportSpuProduct = supportSpuProduct;
	}

	
	public Boolean getSupportSpuProduct(){
		return this.supportSpuProduct;
	}

	
	public void setControlType(Long controlType){
		this.controlType = controlType;
	}

	
	public Long getControlType(){
		return this.controlType;
	}

	
	public void setSupportCreateSpu(Boolean supportCreateSpu){
		this.supportCreateSpu = supportCreateSpu;
	}

	
	public Boolean getSupportCreateSpu(){
		return this.supportCreateSpu;
	}

	
	public void setSupportRectifySpu(Boolean supportRectifySpu){
		this.supportRectifySpu = supportRectifySpu;
	}

	
	public Boolean getSupportRectifySpu(){
		return this.supportRectifySpu;
	}

	
	public void setSupportReportSpu(Boolean supportReportSpu){
		this.supportReportSpu = supportReportSpu;
	}

	
	public Boolean getSupportReportSpu(){
		return this.supportReportSpu;
	}

	
	public void setNoNeedAuditSpu(Boolean noNeedAuditSpu){
		this.noNeedAuditSpu = noNeedAuditSpu;
	}

	
	public Boolean getNoNeedAuditSpu(){
		return this.noNeedAuditSpu;
	}

}