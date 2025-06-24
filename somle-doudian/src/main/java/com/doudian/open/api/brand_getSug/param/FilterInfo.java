package com.doudian.open.api.brand_getSug.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class FilterInfo {


	@SerializedName("brand_ids")
	@OpField(required = false , desc = "品牌ids", example= "[202132132342,213123443543]")
	private List<Long> brandIds;

	@SerializedName("brand_category")
	@OpField(required = false , desc = "品牌类别", example= "[20220]")
	private List<Long> brandCategory;

	@SerializedName("status")
	@OpField(required = false , desc = "品牌状态: 1.在线 2.离线", example= "1")
	private Long status;

	@SerializedName("related_ids")
	@OpField(required = false , desc = "品牌商标关联Id", example= "[12123123123,4323423423]")
	private List<Long> relatedIds;

	@SerializedName("trade_mark_ids")
	@OpField(required = false , desc = "商标IDs", example= "[21312323134]")
	private List<String> tradeMarkIds;

	@SerializedName("audit_status")
	@OpField(required = false , desc = "废弃字段，请勿填写: 1. 审核中 2. 审核通过 3. 审核拒绝 4. 送审失败", example= "[2]")
	private List<Integer> auditStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBrandIds(List<Long> brandIds){
		this.brandIds = brandIds;
	}

	
	public List<Long> getBrandIds(){
		return this.brandIds;
	}

	
	public void setBrandCategory(List<Long> brandCategory){
		this.brandCategory = brandCategory;
	}

	
	public List<Long> getBrandCategory(){
		return this.brandCategory;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setRelatedIds(List<Long> relatedIds){
		this.relatedIds = relatedIds;
	}

	
	public List<Long> getRelatedIds(){
		return this.relatedIds;
	}

	
	public void setTradeMarkIds(List<String> tradeMarkIds){
		this.tradeMarkIds = tradeMarkIds;
	}

	
	public List<String> getTradeMarkIds(){
		return this.tradeMarkIds;
	}

	
	public void setAuditStatus(List<Integer> auditStatus){
		this.auditStatus = auditStatus;
	}

	
	public List<Integer> getAuditStatus(){
		return this.auditStatus;
	}

}