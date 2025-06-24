package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class RecordLogsListItem {


	@SerializedName("operator")
	@OpField(desc = "操作人", example = "商家")
	private String operator;

	@SerializedName("time")
	@OpField(desc = "操作时间", example = "2022-09-05 21:34:24")
	private String time;

	@SerializedName("text")
	@OpField(desc = "操作内容", example = "买家举证")
	private String text;

	@SerializedName("images")
	@OpField(desc = "图片列表", example = "图片链接")
	private List<String> images;

	@SerializedName("desc_kvs")
	@OpField(desc = "额外信息", example = "")
	private List<DescKvsItem> descKvs;

	@SerializedName("action")
	@OpField(desc = "动作", example = "仲裁举证")
	private String action;

	@SerializedName("role")
	@OpField(desc = "角色；1-买家，2-商家，3-平台客服，4-系统", example = "2")
	private Long role;

	@SerializedName("all_evidence")
	@OpField(desc = "所有类型凭证", example = "")
	private List<AllEvidenceItem> allEvidence;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOperator(String operator){
		this.operator = operator;
	}

	
	public String getOperator(){
		return this.operator;
	}

	
	public void setTime(String time){
		this.time = time;
	}

	
	public String getTime(){
		return this.time;
	}

	
	public void setText(String text){
		this.text = text;
	}

	
	public String getText(){
		return this.text;
	}

	
	public void setImages(List<String> images){
		this.images = images;
	}

	
	public List<String> getImages(){
		return this.images;
	}

	
	public void setDescKvs(List<DescKvsItem> descKvs){
		this.descKvs = descKvs;
	}

	
	public List<DescKvsItem> getDescKvs(){
		return this.descKvs;
	}

	
	public void setAction(String action){
		this.action = action;
	}

	
	public String getAction(){
		return this.action;
	}

	
	public void setRole(Long role){
		this.role = role;
	}

	
	public Long getRole(){
		return this.role;
	}

	
	public void setAllEvidence(List<AllEvidenceItem> allEvidence){
		this.allEvidence = allEvidence;
	}

	
	public List<AllEvidenceItem> getAllEvidence(){
		return this.allEvidence;
	}

}