package com.doudian.open.api.spu_getAuditInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuGetAuditInfoData {


	@SerializedName("spu_id")
	@OpField(desc = "SPU编号", example = "7166887849936109828")
	private Long spuId;

	@SerializedName("spu_status")
	@OpField(desc = "SPU状态，1:已上线，2:已下线，3:审核中，4:审核不通过", example = "4")
	private Long spuStatus;

	@SerializedName("reject_reason")
	@OpField(desc = "审核驳回原因", example = "您好，请严格按照版权页中的书名进行SPU提报。参考提报书名为：我是猫")
	private String rejectReason;

	@SerializedName("create_time")
	@OpField(desc = "审核记录创建时间", example = "2022-11-17 18:30:08")
	private String createTime;

	@SerializedName("update_time")
	@OpField(desc = "审核记录更新时间", example = "2022-11-17 18:38:04")
	private String updateTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

	
	public void setSpuStatus(Long spuStatus){
		this.spuStatus = spuStatus;
	}

	
	public Long getSpuStatus(){
		return this.spuStatus;
	}

	
	public void setRejectReason(String rejectReason){
		this.rejectReason = rejectReason;
	}

	
	public String getRejectReason(){
		return this.rejectReason;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

}