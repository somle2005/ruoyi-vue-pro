package com.doudian.open.api.sms_public_template.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SmsPublicTemplateData {


	@SerializedName("total")
	@OpField(desc = "数据总量", example = "100")
	private Long total;

	@SerializedName("public_template_list")
	@OpField(desc = "列表页数据", example = "")
	private List<PublicTemplateListItem> publicTemplateList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

	
	public void setPublicTemplateList(List<PublicTemplateListItem> publicTemplateList){
		this.publicTemplateList = publicTemplateList;
	}

	
	public List<PublicTemplateListItem> getPublicTemplateList(){
		return this.publicTemplateList;
	}

}