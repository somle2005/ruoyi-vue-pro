package com.doudian.open.api.order_batchBindSerialNumber.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderBatchBindSerialNumberParam {


	@SerializedName("bind_list")
	@OpField(required = false , desc = "绑定列表;", example= "")
	private List<BindListItem> bindList;

	@SerializedName("bind_scene")
	@OpField(required = false , desc = "绑定场景 1 // 发货后 2 // 发货前", example= "1")
	private Integer bindScene;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBindList(List<BindListItem> bindList){
		this.bindList = bindList;
	}

	
	public List<BindListItem> getBindList(){
		return this.bindList;
	}

	
	public void setBindScene(Integer bindScene){
		this.bindScene = bindScene;
	}

	
	public Integer getBindScene(){
		return this.bindScene;
	}

}