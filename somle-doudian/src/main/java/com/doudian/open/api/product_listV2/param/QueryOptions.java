package com.doudian.open.api.product_listV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QueryOptions {


	@SerializedName("exist_audit_reject_suggest")
	@OpField(required = false , desc = "只查询有驳回建议的商品", example= "false")
	private Boolean existAuditRejectSuggest;

	@SerializedName("need_audit_reject_suggest")
	@OpField(required = false , desc = "需要返回审核驳回建议信息", example= "false")
	private Boolean needAuditRejectSuggest;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExistAuditRejectSuggest(Boolean existAuditRejectSuggest){
		this.existAuditRejectSuggest = existAuditRejectSuggest;
	}

	
	public Boolean getExistAuditRejectSuggest(){
		return this.existAuditRejectSuggest;
	}

	
	public void setNeedAuditRejectSuggest(Boolean needAuditRejectSuggest){
		this.needAuditRejectSuggest = needAuditRejectSuggest;
	}

	
	public Boolean getNeedAuditRejectSuggest(){
		return this.needAuditRejectSuggest;
	}

}