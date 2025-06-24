package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ReferencePriceCertificate {


	@SerializedName("certificate_type")
	@OpField(required = false , desc = "参考价凭证类型，通过/product/getProductUpdateRule获取可选类型", example= "1")
	private Long certificateType;

	@SerializedName("certificate_urls")
	@OpField(required = false , desc = "凭证图片，必须是商品素材中心URL，最多允许一张图片", example= "[https://www.aaaa.com]")
	private List<String> certificateUrls;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCertificateType(Long certificateType){
		this.certificateType = certificateType;
	}

	
	public Long getCertificateType(){
		return this.certificateType;
	}

	
	public void setCertificateUrls(List<String> certificateUrls){
		this.certificateUrls = certificateUrls;
	}

	
	public List<String> getCertificateUrls(){
		return this.certificateUrls;
	}

}