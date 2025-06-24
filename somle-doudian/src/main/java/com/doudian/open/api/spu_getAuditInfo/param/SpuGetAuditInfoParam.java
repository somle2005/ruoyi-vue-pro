package com.doudian.open.api.spu_getAuditInfo.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuGetAuditInfoParam {


	@SerializedName("spu_id")
	@OpField(required = true , desc = "SPU编号；使用【/spu/createSpu】创建spuid创建成功后，可以使用spu_id查询审核状态；建议场景成功后间隔1小时后再查询审核结果；", example= "7166887849936109828")
	private Long spuId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

}