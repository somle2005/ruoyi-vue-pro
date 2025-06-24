package com.doudian.open.api.product_listV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductListV2Param {


	@SerializedName("status")
	@OpField(required = false , desc = "商品在店铺中状态: 0-在线；1-下线；2-删除；详见商品状态机：https://op.jinritemai.com/docs/question-docs/92/2070", example= "0")
	private Long status;

	@SerializedName("check_status")
	@OpField(required = false , desc = "商品审核状态: 1-未提交；2-待审核；3-审核通过；4-审核未通过；5-封禁；7-审核通过待上架；详见商品状态机：https://op.jinritemai.com/docs/question-docs/92/2070", example= "3")
	private Long checkStatus;

	@SerializedName("product_type")
	@OpField(required = false , desc = "商品类型；0-普通；1-新客商品；3-虚拟；6-玉石闪购；7-云闪购 ；127-其他类型；", example= "0")
	private Long productType;

	@SerializedName("start_time")
	@OpField(required = false , desc = "商品创建开始时间，unix时间戳，单位：秒；", example= "1619161933")
	private Long startTime;

	@SerializedName("end_time")
	@OpField(required = false , desc = "商品创建结束时间，unix时间戳，单位：秒；", example= "1619162000")
	private Long endTime;

	@SerializedName("update_start_time")
	@OpField(required = false , desc = "商品更新开始时间，unix时间戳，单位：秒；注意：查询范围是update_start_time和update_end_time之间的数据，不包含入参时间。", example= "1619161933")
	private Long updateStartTime;

	@SerializedName("update_end_time")
	@OpField(required = false , desc = "商品更新结束时间，unix时间戳，单位：秒；注意：查询范围是update_start_time和update_end_time之间的数据，不包含入参时间。", example= "1619161933")
	private Long updateEndTime;

	@SerializedName("page")
	@OpField(required = true , desc = "页码，从1开始，最大为100；page* size最大不能超过1万条", example= "1")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "页数，填写范围1~100；page* size最大不能超过1万条", example= "10")
	private Long size;

	@SerializedName("store_id")
	@OpField(required = false , desc = "小时达商家使用的门店id，即时零售单店版，无需使用", example= "123456")
	private Long storeId;

	@SerializedName("name")
	@OpField(required = false , desc = "商品标题，支持模糊匹配", example= "标题")
	private String name;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品id，最大支持传入100个；", example= "3600137140018749665")
	private List<String> productId;

	@SerializedName("use_cursor")
	@OpField(required = false , desc = "是否使用游标，true 使用，false 不使用；使用游标能遍历全量商品，不会受到只能查询到10000个数据的影响。特别说明：使用游标查询时，page字段失效，只会查询当前游标后面size条数据；根据获取查询数据为空来判断本次遍历结束；查询过程中数据发生变更，可能重复、遗漏数据；需要保证每次查询的筛选条件一致。", example= "true")
	private Boolean useCursor;

	@SerializedName("cursor_id")
	@OpField(required = false , desc = "游标id，结合use_cursor使用（use_cursor=true）;首次查询时不需要传值，每次查询结果会返回cursor_id，下一次查询时复制给该字段。当查询返回数据为空时，结束遍历。", example= "WzE2ODI1Nzc4MjksMTc2NDMxMDczMDU3MDg0M10=")
	private String cursorId;

	@SerializedName("can_combine_product")
	@OpField(required = false , desc = "能否参加搭配", example= "true")
	private Boolean canCombineProduct;

	@SerializedName("lookup_option")
	@OpField(required = false , desc = "查询option", example= "")
	private LookupOption lookupOption;

	@SerializedName("need_rectification_info")
	@OpField(required = false , desc = "是否需要自动整改信息", example= "false")
	private Boolean needRectificationInfo;

	@SerializedName("query_options")
	@OpField(required = false , desc = "查询定制参数", example= "")
	private QueryOptions queryOptions;

	@SerializedName("need_check_out")
	@OpField(required = false , desc = "是否需要核销", example= "false")
	private Boolean needCheckOut;

	@SerializedName("sku_codes")
	@OpField(required = false , desc = "sku商家编码，最大支持传入50个", example= "aaabbcc")
	private List<String> skuCodes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setCheckStatus(Long checkStatus){
		this.checkStatus = checkStatus;
	}

	
	public Long getCheckStatus(){
		return this.checkStatus;
	}

	
	public void setProductType(Long productType){
		this.productType = productType;
	}

	
	public Long getProductType(){
		return this.productType;
	}

	
	public void setStartTime(Long startTime){
		this.startTime = startTime;
	}

	
	public Long getStartTime(){
		return this.startTime;
	}

	
	public void setEndTime(Long endTime){
		this.endTime = endTime;
	}

	
	public Long getEndTime(){
		return this.endTime;
	}

	
	public void setUpdateStartTime(Long updateStartTime){
		this.updateStartTime = updateStartTime;
	}

	
	public Long getUpdateStartTime(){
		return this.updateStartTime;
	}

	
	public void setUpdateEndTime(Long updateEndTime){
		this.updateEndTime = updateEndTime;
	}

	
	public Long getUpdateEndTime(){
		return this.updateEndTime;
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

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setProductId(List<String> productId){
		this.productId = productId;
	}

	
	public List<String> getProductId(){
		return this.productId;
	}

	
	public void setUseCursor(Boolean useCursor){
		this.useCursor = useCursor;
	}

	
	public Boolean getUseCursor(){
		return this.useCursor;
	}

	
	public void setCursorId(String cursorId){
		this.cursorId = cursorId;
	}

	
	public String getCursorId(){
		return this.cursorId;
	}

	
	public void setCanCombineProduct(Boolean canCombineProduct){
		this.canCombineProduct = canCombineProduct;
	}

	
	public Boolean getCanCombineProduct(){
		return this.canCombineProduct;
	}

	
	public void setLookupOption(LookupOption lookupOption){
		this.lookupOption = lookupOption;
	}

	
	public LookupOption getLookupOption(){
		return this.lookupOption;
	}

	
	public void setNeedRectificationInfo(Boolean needRectificationInfo){
		this.needRectificationInfo = needRectificationInfo;
	}

	
	public Boolean getNeedRectificationInfo(){
		return this.needRectificationInfo;
	}

	
	public void setQueryOptions(QueryOptions queryOptions){
		this.queryOptions = queryOptions;
	}

	
	public QueryOptions getQueryOptions(){
		return this.queryOptions;
	}

	
	public void setNeedCheckOut(Boolean needCheckOut){
		this.needCheckOut = needCheckOut;
	}

	
	public Boolean getNeedCheckOut(){
		return this.needCheckOut;
	}

	
	public void setSkuCodes(List<String> skuCodes){
		this.skuCodes = skuCodes;
	}

	
	public List<String> getSkuCodes(){
		return this.skuCodes;
	}

}