package com.doudian.open.api.order_getShopAccountItemFile.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderGetShopAccountItemFileData {


	@SerializedName("data")
	@OpField(desc = "data", example = "")
	private List<DataItem> data;

	@SerializedName("code")
	@OpField(desc = "返回值", example = "100000")
	private String code;

	@SerializedName("code_msg")
	@OpField(desc = "返回参数", example = "success")
	private String codeMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(List<DataItem> data){
		this.data = data;
	}

	
	public List<DataItem> getData(){
		return this.data;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setCodeMsg(String codeMsg){
		this.codeMsg = codeMsg;
	}

	
	public String getCodeMsg(){
		return this.codeMsg;
	}

}