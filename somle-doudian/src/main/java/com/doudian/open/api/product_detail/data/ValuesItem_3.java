package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ValuesItem_3 {


	@SerializedName("value_id")
	@OpField(desc = "标准销售属性值id", example = "12")
	private String valueId;

	@SerializedName("extra")
	@OpField(desc = "其他扩展信息：包括度量衡信息等", example = "")
	private Extra extra;

	@SerializedName("id")
	@OpField(desc = "规格值id", example = "1695459998447656")
	private Long id;

	@SerializedName("spec_id")
	@OpField(desc = "规格ID", example = "1713023983665214")
	private Long specId;

	@SerializedName("name")
	@OpField(desc = "销售属性值", example = "红色")
	private String name;

	@SerializedName("pid")
	@OpField(desc = "规格值父id", example = "1695459998447640")
	private Long pid;

	@SerializedName("is_leaf")
	@OpField(desc = "是否是销售属性值", example = "1")
	private Integer isLeaf;

	@SerializedName("status")
	@OpField(desc = "在线状态，-2彻底删除、0在线、1下线、2删除", example = "1")
	private Integer status;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValueId(String valueId){
		this.valueId = valueId;
	}

	
	public String getValueId(){
		return this.valueId;
	}

	
	public void setExtra(Extra extra){
		this.extra = extra;
	}

	
	public Extra getExtra(){
		return this.extra;
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setSpecId(Long specId){
		this.specId = specId;
	}

	
	public Long getSpecId(){
		return this.specId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setPid(Long pid){
		this.pid = pid;
	}

	
	public Long getPid(){
		return this.pid;
	}

	
	public void setIsLeaf(Integer isLeaf){
		this.isLeaf = isLeaf;
	}

	
	public Integer getIsLeaf(){
		return this.isLeaf;
	}

	
	public void setStatus(Integer status){
		this.status = status;
	}

	
	public Integer getStatus(){
		return this.status;
	}

}