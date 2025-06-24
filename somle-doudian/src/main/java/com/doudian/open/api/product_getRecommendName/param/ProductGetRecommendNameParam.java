package com.doudian.open.api.product_getRecommendName.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class ProductGetRecommendNameParam {


	@SerializedName("scene")
	@OpField(required = true , desc = "暂时仅开放一种场景：1. product_name_prefix，表示基于 命中的商品类目属性 推荐 商品标题前缀", example= "[product_name_prefix]")
	private List<String> scene;

	@SerializedName("category_leaf_id")
	@OpField(required = true , desc = "商品叶子类目id，请先使用【/product/getProductUpdateRule】接口查询类目id查看recommend_name_rule. satisfy_prefix是否=true", example= "26150")
	private Long categoryLeafId;

	@SerializedName("first_cid")
	@OpField(required = true , desc = "一级类目id，scene为product_name_prefix时必传，没有时传0", example= "20080")
	private Long firstCid;

	@SerializedName("first_cid_name")
	@OpField(required = true , desc = "一级类目名，scene为product_name_prefix时必传", example= "时尚饰品")
	private String firstCidName;

	@SerializedName("second_cid")
	@OpField(required = true , desc = "二级类目id，scene为product_name_prefix时必传，没有时传0", example= "20998")
	private Long secondCid;

	@SerializedName("second_cid_name")
	@OpField(required = true , desc = "二级类目名，scene为product_name_prefix时必传", example= "耳饰")
	private String secondCidName;

	@SerializedName("third_cid")
	@OpField(required = true , desc = "三级类目id，scene为product_name_prefix时必传，没有时传0", example= "26150")
	private Long thirdCid;

	@SerializedName("third_cid_name")
	@OpField(required = true , desc = "三级类目名，scene为product_name_prefix时必传", example= "耳钉")
	private String thirdCidName;

	@SerializedName("select_property")
	@OpField(required = true , desc = "商品类目属性，参考select_property:{1687:[{value:0,name:填入品牌名}],3320:[{value:18972,name:99新}]}", example= "{1687:[{value:0,name:填入品牌名}],3320:[{value:18972,name:99新}]}")
	private Map<Long,List<SelectPropertyItem>> selectProperty;

	@SerializedName("use_brand_name")
	@OpField(required = false , desc = "是否勾选使用品牌名", example= "false")
	private Boolean useBrandName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setScene(List<String> scene){
		this.scene = scene;
	}

	
	public List<String> getScene(){
		return this.scene;
	}

	
	public void setCategoryLeafId(Long categoryLeafId){
		this.categoryLeafId = categoryLeafId;
	}

	
	public Long getCategoryLeafId(){
		return this.categoryLeafId;
	}

	
	public void setFirstCid(Long firstCid){
		this.firstCid = firstCid;
	}

	
	public Long getFirstCid(){
		return this.firstCid;
	}

	
	public void setFirstCidName(String firstCidName){
		this.firstCidName = firstCidName;
	}

	
	public String getFirstCidName(){
		return this.firstCidName;
	}

	
	public void setSecondCid(Long secondCid){
		this.secondCid = secondCid;
	}

	
	public Long getSecondCid(){
		return this.secondCid;
	}

	
	public void setSecondCidName(String secondCidName){
		this.secondCidName = secondCidName;
	}

	
	public String getSecondCidName(){
		return this.secondCidName;
	}

	
	public void setThirdCid(Long thirdCid){
		this.thirdCid = thirdCid;
	}

	
	public Long getThirdCid(){
		return this.thirdCid;
	}

	
	public void setThirdCidName(String thirdCidName){
		this.thirdCidName = thirdCidName;
	}

	
	public String getThirdCidName(){
		return this.thirdCidName;
	}

	
	public void setSelectProperty(Map<Long,List<SelectPropertyItem>> selectProperty){
		this.selectProperty = selectProperty;
	}

	
	public Map<Long,List<SelectPropertyItem>> getSelectProperty(){
		return this.selectProperty;
	}

	
	public void setUseBrandName(Boolean useBrandName){
		this.useBrandName = useBrandName;
	}

	
	public Boolean getUseBrandName(){
		return this.useBrandName;
	}

}