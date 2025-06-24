package com.doudian.open.api.sms_sign_search.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SmsSignSearchData {


	@SerializedName("sign_search_list")
	@OpField(desc = "签名列表", example = "")
	private List<SignSearchListItem> signSearchList;

	@SerializedName("total")
	@OpField(desc = "总数", example = "100")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSignSearchList(List<SignSearchListItem> signSearchList){
		this.signSearchList = signSearchList;
	}

	
	public List<SignSearchListItem> getSignSearchList(){
		return this.signSearchList;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}