package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ReferencePriceCertificate {


	@SerializedName("certificate_type")
	@OpField(required = false , desc = "通过/product/getProductUpdateRule获取可选的参考价格类型", example= "1")
	private Long certificateType;

	@SerializedName("certificate_urls")
	@OpField(required = false , desc = "图片url需要使用商品素材中心的url并且只能有一张", example= "[http://www.aaa.com]")
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