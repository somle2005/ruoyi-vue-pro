package com.doudian.open.api.product_diagnoseCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductMaterialMapItem {


	@SerializedName("media_type")
	@OpField(required = false , desc = "素材类型", example= "0")
	private Long mediaType;

	@SerializedName("urls")
	@OpField(required = false , desc = "素材图片url", example= "[                https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_85c0dbe86f70bc22ccb3f20353ebc721_sx_318770_www800-800            ]")
	private List<String> urls;

	@SerializedName("resource_ids")
	@OpField(required = false , desc = "视频id", example= "[                v0227cg10001cv2q9ivog65p1fpta0ug            ]")
	private List<String> resourceIds;

	@SerializedName("material_id")
	@OpField(required = false , desc = "素材ID", example= "123")
	private Long materialId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMediaType(Long mediaType){
		this.mediaType = mediaType;
	}

	
	public Long getMediaType(){
		return this.mediaType;
	}

	
	public void setUrls(List<String> urls){
		this.urls = urls;
	}

	
	public List<String> getUrls(){
		return this.urls;
	}

	
	public void setResourceIds(List<String> resourceIds){
		this.resourceIds = resourceIds;
	}

	
	public List<String> getResourceIds(){
		return this.resourceIds;
	}

	
	public void setMaterialId(Long materialId){
		this.materialId = materialId;
	}

	
	public Long getMaterialId(){
		return this.materialId;
	}

}