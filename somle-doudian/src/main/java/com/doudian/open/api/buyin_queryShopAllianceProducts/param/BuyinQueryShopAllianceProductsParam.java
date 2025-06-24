package com.doudian.open.api.buyin_queryShopAllianceProducts.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinQueryShopAllianceProductsParam {


	@SerializedName("page")
	@OpField(required = true , desc = "分页页数，从1开始", example= "1")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "分页大小，最大20", example= "20")
	private Long size;

	@SerializedName("product_ids")
	@OpField(required = false , desc = "商品ID列表，用“,”分隔", example= "35632345453243,34242532432")
	private List<Long> productIds;

	@SerializedName("status")
	@OpField(required = false , desc = "商品状态。2：商品在架；3：商家关闭推广；4：商品下架；6：平台治理关闭；99：商家删除", example= "2")
	private Long status;

	@SerializedName("title")
	@OpField(required = false , desc = "商品名称", example= "测试商品的名称")
	private String title;

	@SerializedName("in_stock")
	@OpField(required = false , desc = "是否有库存", example= "true")
	private Boolean inStock;

	@SerializedName("check_status")
	@OpField(required = false , desc = "审核状态。 0：未审核；2：审核未通过；3：审核通过", example= "3")
	private List<Long> checkStatus;

	@SerializedName("sort_by")
	@OpField(required = false , desc = "排序字段。 update_time: 更新时间; cos_ratio: 佣金率", example= "update_time")
	private String sortBy;

	@SerializedName("sort_order")
	@OpField(required = false , desc = "排序方式（Desc或者Asc）。Desc：降序；Asc：生序", example= "Desc")
	private String sortOrder;

	@SerializedName("fields")
	@OpField(required = false , desc = "加载更多的字段，如 is_exclusive", example= "[is_exclusive]")
	private List<String> fields;

	@SerializedName("launch")
	@OpField(required = false , desc = "0或者不填：原联盟计划商品 1：查询新投放商品", example= "1")
	private Long launch;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setProductIds(List<Long> productIds){
		this.productIds = productIds;
	}

	
	public List<Long> getProductIds(){
		return this.productIds;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setTitle(String title){
		this.title = title;
	}

	
	public String getTitle(){
		return this.title;
	}

	
	public void setInStock(Boolean inStock){
		this.inStock = inStock;
	}

	
	public Boolean getInStock(){
		return this.inStock;
	}

	
	public void setCheckStatus(List<Long> checkStatus){
		this.checkStatus = checkStatus;
	}

	
	public List<Long> getCheckStatus(){
		return this.checkStatus;
	}

	
	public void setSortBy(String sortBy){
		this.sortBy = sortBy;
	}

	
	public String getSortBy(){
		return this.sortBy;
	}

	
	public void setSortOrder(String sortOrder){
		this.sortOrder = sortOrder;
	}

	
	public String getSortOrder(){
		return this.sortOrder;
	}

	
	public void setFields(List<String> fields){
		this.fields = fields;
	}

	
	public List<String> getFields(){
		return this.fields;
	}

	
	public void setLaunch(Long launch){
		this.launch = launch;
	}

	
	public Long getLaunch(){
		return this.launch;
	}

}