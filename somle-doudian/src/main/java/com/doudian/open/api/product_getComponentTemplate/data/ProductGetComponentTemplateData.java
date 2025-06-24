package com.doudian.open.api.product_getComponentTemplate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetComponentTemplateData {


	@SerializedName("component_template_info_list")
	@OpField(desc = "尺码模板列表", example = "")
	private List<ComponentTemplateInfoListItem> componentTemplateInfoList;

	@SerializedName("total_num")
	@OpField(desc = "总页数", example = "100")
	private Long totalNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setComponentTemplateInfoList(List<ComponentTemplateInfoListItem> componentTemplateInfoList){
		this.componentTemplateInfoList = componentTemplateInfoList;
	}

	
	public List<ComponentTemplateInfoListItem> getComponentTemplateInfoList(){
		return this.componentTemplateInfoList;
	}

	
	public void setTotalNum(Long totalNum){
		this.totalNum = totalNum;
	}

	
	public Long getTotalNum(){
		return this.totalNum;
	}

}