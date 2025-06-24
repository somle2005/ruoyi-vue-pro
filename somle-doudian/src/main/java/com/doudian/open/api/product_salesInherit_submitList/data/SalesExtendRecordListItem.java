package com.doudian.open.api.product_salesInherit_submitList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SalesExtendRecordListItem {


	@SerializedName("platform_id")
	@OpField(desc = "站外平台id（1:淘宝）", example = "1")
	private Long platformId;

	@SerializedName("submit_time")
	@OpField(desc = "提报时间，单位：秒；", example = "1672992488")
	private Long submitTime;

	@SerializedName("submit_sales_num")
	@OpField(desc = "提报销量", example = "200")
	private Long submitSalesNum;

	@SerializedName("product_id")
	@OpField(desc = "抖店商品id", example = "3592723937143965891")
	private Long productId;

	@SerializedName("outside_product_id")
	@OpField(desc = "站外商品id", example = "682264320200")
	private Long outsideProductId;

	@SerializedName("audit_status")
	@OpField(desc = "审核状态（0:待审核；1:已通过；2:已驳回）", example = "0")
	private Integer auditStatus;

	@SerializedName("audit_msg")
	@OpField(desc = "驳回原因", example = "您所提报的商品销量过低,建议积累一定销量后再提报")
	private String auditMsg;

	@SerializedName("audit_time")
	@OpField(desc = "审核结果时间包含审核失败和成功；单位：秒；", example = "1672992488")
	private Long auditTime;

	@SerializedName("extend_sales_num")
	@OpField(desc = "实际审核通过后的继承销量，审核通过后可在抖店c端买家商详页面查看的销量；", example = "100")
	private Long extendSalesNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlatformId(Long platformId){
		this.platformId = platformId;
	}

	
	public Long getPlatformId(){
		return this.platformId;
	}

	
	public void setSubmitTime(Long submitTime){
		this.submitTime = submitTime;
	}

	
	public Long getSubmitTime(){
		return this.submitTime;
	}

	
	public void setSubmitSalesNum(Long submitSalesNum){
		this.submitSalesNum = submitSalesNum;
	}

	
	public Long getSubmitSalesNum(){
		return this.submitSalesNum;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setOutsideProductId(Long outsideProductId){
		this.outsideProductId = outsideProductId;
	}

	
	public Long getOutsideProductId(){
		return this.outsideProductId;
	}

	
	public void setAuditStatus(Integer auditStatus){
		this.auditStatus = auditStatus;
	}

	
	public Integer getAuditStatus(){
		return this.auditStatus;
	}

	
	public void setAuditMsg(String auditMsg){
		this.auditMsg = auditMsg;
	}

	
	public String getAuditMsg(){
		return this.auditMsg;
	}

	
	public void setAuditTime(Long auditTime){
		this.auditTime = auditTime;
	}

	
	public Long getAuditTime(){
		return this.auditTime;
	}

	
	public void setExtendSalesNum(Long extendSalesNum){
		this.extendSalesNum = extendSalesNum;
	}

	
	public Long getExtendSalesNum(){
		return this.extendSalesNum;
	}

}