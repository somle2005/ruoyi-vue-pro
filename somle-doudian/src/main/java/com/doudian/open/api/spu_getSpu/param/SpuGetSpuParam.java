package com.doudian.open.api.spu_getSpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuGetSpuParam {


	@SerializedName("category_leaf_id")
	@OpField(required = false , desc = "叶子类目ID", example= "23362")
	private Long categoryLeafId;

	@SerializedName("key_properties")
	@OpField(required = false , desc = "关键属性", example= "")
	private List<KeyPropertiesItem> keyProperties;

	@SerializedName("spu_id")
	@OpField(required = false , desc = "SPU ID（传SPUID时，关键属性不用传，传关键属性时，SPU ID不用传，两个都传的情况下，会以SPU ID为准，查询SPU）", example= "7120712486076088620")
	private Long spuId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryLeafId(Long categoryLeafId){
		this.categoryLeafId = categoryLeafId;
	}

	
	public Long getCategoryLeafId(){
		return this.categoryLeafId;
	}

	
	public void setKeyProperties(List<KeyPropertiesItem> keyProperties){
		this.keyProperties = keyProperties;
	}

	
	public List<KeyPropertiesItem> getKeyProperties(){
		return this.keyProperties;
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

}