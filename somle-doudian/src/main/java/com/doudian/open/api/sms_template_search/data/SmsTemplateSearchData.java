package com.doudian.open.api.sms_template_search.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SmsTemplateSearchData {


	@SerializedName("template_search_list")
	@OpField(desc = "模板列表", example = "")
	private List<TemplateSearchListItem> templateSearchList;

	@SerializedName("total")
	@OpField(desc = "总条数", example = "100")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateSearchList(List<TemplateSearchListItem> templateSearchList){
		this.templateSearchList = templateSearchList;
	}

	
	public List<TemplateSearchListItem> getTemplateSearchList(){
		return this.templateSearchList;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}