package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WriteoffInfoItem {


	@SerializedName("writeoff_no")
	@OpField(desc = "核销券码", example = "xxxx")
	private String writeoffNo;

	@SerializedName("writeoff_start_time")
	@OpField(desc = "核销有效开始时间", example = "1617355413")
	private Long writeoffStartTime;

	@SerializedName("writeoff_expire_time")
	@OpField(desc = "核销过期时间", example = "1617355413")
	private Long writeoffExpireTime;

	@SerializedName("writeoff_status")
	@OpField(desc = "核销状态", example = "3")
	private Long writeoffStatus;

	@SerializedName("writeoff_status_desc")
	@OpField(desc = "核销状态文案", example = "已使用")
	private String writeoffStatusDesc;

	@SerializedName("verify_order_id")
	@OpField(desc = "核销店铺订单id", example = "1234567")
	private String verifyOrderId;

	@SerializedName("writeoff_no_mask")
	@OpField(desc = "脱敏核销券码", example = "Te****1168")
	private String writeoffNoMask;

	@SerializedName("writtenoff_count")
	@OpField(desc = "已核销次数", example = "1")
	private Long writtenoffCount;

	@SerializedName("writeoff_total_count")
	@OpField(desc = "总核销次数", example = "2")
	private Long writeoffTotalCount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWriteoffNo(String writeoffNo){
		this.writeoffNo = writeoffNo;
	}

	
	public String getWriteoffNo(){
		return this.writeoffNo;
	}

	
	public void setWriteoffStartTime(Long writeoffStartTime){
		this.writeoffStartTime = writeoffStartTime;
	}

	
	public Long getWriteoffStartTime(){
		return this.writeoffStartTime;
	}

	
	public void setWriteoffExpireTime(Long writeoffExpireTime){
		this.writeoffExpireTime = writeoffExpireTime;
	}

	
	public Long getWriteoffExpireTime(){
		return this.writeoffExpireTime;
	}

	
	public void setWriteoffStatus(Long writeoffStatus){
		this.writeoffStatus = writeoffStatus;
	}

	
	public Long getWriteoffStatus(){
		return this.writeoffStatus;
	}

	
	public void setWriteoffStatusDesc(String writeoffStatusDesc){
		this.writeoffStatusDesc = writeoffStatusDesc;
	}

	
	public String getWriteoffStatusDesc(){
		return this.writeoffStatusDesc;
	}

	
	public void setVerifyOrderId(String verifyOrderId){
		this.verifyOrderId = verifyOrderId;
	}

	
	public String getVerifyOrderId(){
		return this.verifyOrderId;
	}

	
	public void setWriteoffNoMask(String writeoffNoMask){
		this.writeoffNoMask = writeoffNoMask;
	}

	
	public String getWriteoffNoMask(){
		return this.writeoffNoMask;
	}

	
	public void setWrittenoffCount(Long writtenoffCount){
		this.writtenoffCount = writtenoffCount;
	}

	
	public Long getWrittenoffCount(){
		return this.writtenoffCount;
	}

	
	public void setWriteoffTotalCount(Long writeoffTotalCount){
		this.writeoffTotalCount = writeoffTotalCount;
	}

	
	public Long getWriteoffTotalCount(){
		return this.writeoffTotalCount;
	}

}