package com.doudian.open.api.token_create.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TokenCreateData {


	@SerializedName("access_token")
	@OpField(desc = "token值。 Tips： 1. 在 access_token 过期前1h之前，ISV使用 refresh_token 刷新时，会返回原来的 access_token 和 refresh_token，但是二者有效期不会变； 2. 在 access_token 过期前1h之内，ISV使用 refresh_token 刷新时，会返回新的 access_token 和 refresh_token，但是原来的 access_token 和 refresh_token 继续有效一个小时； 3. 在 access_token 过期后，ISV使用 refresh_token 刷新时，将获得新的 acces_token 和 refresh_token，同时原来的 acces_token 和 refresh_token 失效；", example = "5a3bd7d0-1b48-46d6-811e-7e05ace08a2f")
	private String accessToken;

	@SerializedName("expires_in")
	@OpField(desc = "过期时间(秒级时间戳)", example = "412219354")
	private Long expiresIn;

	@SerializedName("refresh_token")
	@OpField(desc = "刷新token值。用于刷新access_token的刷新令牌（有效期：14 天）", example = "50b6ae40-ed8f-4b60-a4af-2ed743a4b903")
	private String refreshToken;

	@SerializedName("scope")
	@OpField(desc = "范围", example = "SCOPE")
	private String scope;

	@SerializedName("shop_id")
	@OpField(desc = "店铺ID", example = "11111172")
	private Long shopId;

	@SerializedName("shop_name")
	@OpField(desc = "店铺名称", example = "李飞测试放心花人店一体")
	private String shopName;

	@SerializedName("authority_id")
	@OpField(desc = "授权ID", example = "3445403781179769176")
	private String authorityId;

	@SerializedName("auth_subject_type")
	@OpField(desc = "授权主体类型", example = "WuLiuShang")
	private String authSubjectType;

	@SerializedName("encrypt_operator")
	@OpField(desc = "操作店铺账号（加密），调用解密接口时候传入", example = "x123xxxxxxxxxx")
	private String encryptOperator;

	@SerializedName("operator_name")
	@OpField(desc = "操作店铺账号昵称（脱敏）", example = "*磊")
	private String operatorName;

	@SerializedName("shop_biz_type")
	@OpField(desc = "店铺业务类型。0：普通店铺，1：即时零售连锁店，2：即时零售个体店", example = "0")
	private Long shopBizType;

	@SerializedName("toutiao_id")
	@OpField(desc = "token生成对应的账号", example = "121212")
	private String toutiaoId;

	@SerializedName("token_type")
	@OpField(desc = "0表示token是由主账号生成，1表示token由子账号生成", example = "0")
	private Long tokenType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAccessToken(String accessToken){
		this.accessToken = accessToken;
	}

	
	public String getAccessToken(){
		return this.accessToken;
	}

	
	public void setExpiresIn(Long expiresIn){
		this.expiresIn = expiresIn;
	}

	
	public Long getExpiresIn(){
		return this.expiresIn;
	}

	
	public void setRefreshToken(String refreshToken){
		this.refreshToken = refreshToken;
	}

	
	public String getRefreshToken(){
		return this.refreshToken;
	}

	
	public void setScope(String scope){
		this.scope = scope;
	}

	
	public String getScope(){
		return this.scope;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setShopName(String shopName){
		this.shopName = shopName;
	}

	
	public String getShopName(){
		return this.shopName;
	}

	
	public void setAuthorityId(String authorityId){
		this.authorityId = authorityId;
	}

	
	public String getAuthorityId(){
		return this.authorityId;
	}

	
	public void setAuthSubjectType(String authSubjectType){
		this.authSubjectType = authSubjectType;
	}

	
	public String getAuthSubjectType(){
		return this.authSubjectType;
	}

	
	public void setEncryptOperator(String encryptOperator){
		this.encryptOperator = encryptOperator;
	}

	
	public String getEncryptOperator(){
		return this.encryptOperator;
	}

	
	public void setOperatorName(String operatorName){
		this.operatorName = operatorName;
	}

	
	public String getOperatorName(){
		return this.operatorName;
	}

	
	public void setShopBizType(Long shopBizType){
		this.shopBizType = shopBizType;
	}

	
	public Long getShopBizType(){
		return this.shopBizType;
	}

	
	public void setToutiaoId(String toutiaoId){
		this.toutiaoId = toutiaoId;
	}

	
	public String getToutiaoId(){
		return this.toutiaoId;
	}

	
	public void setTokenType(Long tokenType){
		this.tokenType = tokenType;
	}

	
	public Long getTokenType(){
		return this.tokenType;
	}

}