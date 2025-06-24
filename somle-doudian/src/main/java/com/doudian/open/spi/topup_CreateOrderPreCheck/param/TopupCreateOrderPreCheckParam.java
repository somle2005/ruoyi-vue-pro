package com.doudian.open.spi.topup_CreateOrderPreCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TopupCreateOrderPreCheckParam {


	@SerializedName("product_id_list")
	@OpField(required = false , desc = "商品id列表", example= "[123456]")
	private List<Long> productIdList;

	@SerializedName("sku_id_list")
	@OpField(required = false , desc = "skuId列表", example= "[123]")
	private List<Long> skuIdList;

	@SerializedName("account_info")
	@OpField(required = false , desc = "账号信息", example= "[{account_info_type:账号类型,account_info_name:账号名称,account_info_value:账号值,extra:扩展信息}]")
	private String accountInfo;

	@SerializedName("encrypt_account_info")
	@OpField(required = false , desc = "账号信息", example= "[{account_info_type:账号类型,account_info_name:账号名称,account_info_value:账号值,extra:扩展信息}]")
	private String encryptAccountInfo;

	@SerializedName("product_key")
	@OpField(required = false , desc = "商品id进行处理后的结果，用来解密账号id", example= "asdaqwrt")
	private String productKey;

	@SerializedName("code_list")
	@OpField(required = false , desc = "商品编码", example= "[123]")
	private List<String> codeList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductIdList(List<Long> productIdList){
		this.productIdList = productIdList;
	}

	
	public List<Long> getProductIdList(){
		return this.productIdList;
	}

	
	public void setSkuIdList(List<Long> skuIdList){
		this.skuIdList = skuIdList;
	}

	
	public List<Long> getSkuIdList(){
		return this.skuIdList;
	}

	
	public void setAccountInfo(String accountInfo){
		this.accountInfo = accountInfo;
	}

	
	public String getAccountInfo(){
		return this.accountInfo;
	}

	
	public void setEncryptAccountInfo(String encryptAccountInfo){
		this.encryptAccountInfo = encryptAccountInfo;
	}

	
	public String getEncryptAccountInfo(){
		return this.encryptAccountInfo;
	}

	
	public void setProductKey(String productKey){
		this.productKey = productKey;
	}

	
	public String getProductKey(){
		return this.productKey;
	}

	
	public void setCodeList(List<String> codeList){
		this.codeList = codeList;
	}

	
	public List<String> getCodeList(){
		return this.codeList;
	}

}