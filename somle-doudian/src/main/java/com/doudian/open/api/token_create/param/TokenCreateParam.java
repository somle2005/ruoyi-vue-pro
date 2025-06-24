package com.doudian.open.api.token_create.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TokenCreateParam {


	@SerializedName("code")
	@OpField(required = false , desc = "授权码；参数必传，工具型应用: 传code值；自用型应用:传", example= "82bdc687-eff1-4f63-8444-0b43086c25fd")
	private String code;

	@SerializedName("grant_type")
	@OpField(required = true , desc = "授权类型 ；【工具型应用:authorization_code  自用型应用:authorization_self】，如果自用型应用有授权code，传authorization_code", example= "authorization_code")
	private String grantType;

	@SerializedName("test_shop")
	@OpField(required = false , desc = "判断测试店铺标识 ，非必传，若新增测试店铺传1，若不是则不必传", example= "2")
	private String testShop;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，抖店自研应用使用。当auth_subject_type不为空时，该字段请勿传值，请将值传入到auth_id字段中", example= "17239")
	private String shopId;

	@SerializedName("auth_id")
	@OpField(required = false , desc = "授权id，配合auth_subject_type字段使用。当auth_subject_type不为空时，请使用auth_id字段传值，shop_id请勿使用。", example= "112334")
	private String authId;

	@SerializedName("auth_subject_type")
	@OpField(required = false , desc = "授权主体类型，配合auth_id字段使用，YunCang -云仓；WuLiuShang -物流商；WLGongYingShang -物流供应商；MiniApp -小程序；MCN-联盟MCN机构；DouKe-联盟抖客 ；Colonel-联盟团长；", example= "WuLiuShang")
	private String authSubjectType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setGrantType(String grantType){
		this.grantType = grantType;
	}

	
	public String getGrantType(){
		return this.grantType;
	}

	
	public void setTestShop(String testShop){
		this.testShop = testShop;
	}

	
	public String getTestShop(){
		return this.testShop;
	}

	
	public void setShopId(String shopId){
		this.shopId = shopId;
	}

	
	public String getShopId(){
		return this.shopId;
	}

	
	public void setAuthId(String authId){
		this.authId = authId;
	}

	
	public String getAuthId(){
		return this.authId;
	}

	
	public void setAuthSubjectType(String authSubjectType){
		this.authSubjectType = authSubjectType;
	}

	
	public String getAuthSubjectType(){
		return this.authSubjectType;
	}

}