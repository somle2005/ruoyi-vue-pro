package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReferencePriceCertificate {


	@SerializedName("certificate_type")
	@OpField(desc = "凭证类型;1:厂商建议零售价,2:吊牌价,3:定价,4:官网零售售价", example = "1")
	private String certificateType;

	@SerializedName("certificate_urls")
	@OpField(desc = "凭证图片url", example = "http://www.")
	private String certificateUrls;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCertificateType(String certificateType){
		this.certificateType = certificateType;
	}

	
	public String getCertificateType(){
		return this.certificateType;
	}

	
	public void setCertificateUrls(String certificateUrls){
		this.certificateUrls = certificateUrls;
	}

	
	public String getCertificateUrls(){
		return this.certificateUrls;
	}

}