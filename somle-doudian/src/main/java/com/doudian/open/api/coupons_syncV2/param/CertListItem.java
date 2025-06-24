package com.doudian.open.api.coupons_syncV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CertListItem {


	@SerializedName("cert_link")
	@OpField(required = false , desc = "卡券跳转链接（腾讯游戏商家必传字段）", example= "https://obd.gtimg.com/new-benefit-web-schema/dev/dist/index.html?ShortLinkId=6438f6f4a87f2&e=test&dyp=1&c=cafsdadsfas")
	private String certLink;

	@SerializedName("out_cert_id")
	@OpField(required = false , desc = "外部卡券id", example= "666")
	private String outCertId;

	@SerializedName("cert_no")
	@OpField(required = true , desc = "卡券券码", example= "7136xxxasd")
	private String certNo;

	@SerializedName("cert_key")
	@OpField(required = false , desc = "卡密", example= "1")
	private String certKey;

	@SerializedName("grant_time")
	@OpField(required = true , desc = "发券时间", example= "2010-01-01 12:12:12")
	private String grantTime;

	@SerializedName("can_extend_valid_count")
	@OpField(required = false , desc = "可延期次数", example= "1")
	private Long canExtendValidCount;

	@SerializedName("status")
	@OpField(required = false , desc = "状态：1未激活 2未使用", example= "1")
	private Long status;

	@SerializedName("valid_start")
	@OpField(required = false , desc = "有效开始时间，大闸蟹场景必传", example= "2010-01-01 12:12:12")
	private String validStart;

	@SerializedName("valid_end")
	@OpField(required = false , desc = "有效结束时间，大闸蟹场景必传", example= "2010-01-01 12:12:12")
	private String validEnd;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCertLink(String certLink){
		this.certLink = certLink;
	}

	
	public String getCertLink(){
		return this.certLink;
	}

	
	public void setOutCertId(String outCertId){
		this.outCertId = outCertId;
	}

	
	public String getOutCertId(){
		return this.outCertId;
	}

	
	public void setCertNo(String certNo){
		this.certNo = certNo;
	}

	
	public String getCertNo(){
		return this.certNo;
	}

	
	public void setCertKey(String certKey){
		this.certKey = certKey;
	}

	
	public String getCertKey(){
		return this.certKey;
	}

	
	public void setGrantTime(String grantTime){
		this.grantTime = grantTime;
	}

	
	public String getGrantTime(){
		return this.grantTime;
	}

	
	public void setCanExtendValidCount(Long canExtendValidCount){
		this.canExtendValidCount = canExtendValidCount;
	}

	
	public Long getCanExtendValidCount(){
		return this.canExtendValidCount;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setValidStart(String validStart){
		this.validStart = validStart;
	}

	
	public String getValidStart(){
		return this.validStart;
	}

	
	public void setValidEnd(String validEnd){
		this.validEnd = validEnd;
	}

	
	public String getValidEnd(){
		return this.validEnd;
	}

}