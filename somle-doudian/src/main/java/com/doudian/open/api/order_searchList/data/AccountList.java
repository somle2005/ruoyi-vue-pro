package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AccountList {


	@SerializedName("account_info")
	@OpField(desc = "账号信息", example = "")
	private List<AccountInfoItem> accountInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAccountInfo(List<AccountInfoItem> accountInfo){
		this.accountInfo = accountInfo;
	}

	
	public List<AccountInfoItem> getAccountInfo(){
		return this.accountInfo;
	}

}