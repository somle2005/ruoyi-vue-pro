package com.doudian.open.api.sku_syncStockBatchMultiProducts.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ResultsItem {


	@SerializedName("sku_id")
	@OpField(desc = "商品规格ID", example = "1751540901742600")
	private Long skuId;

	@SerializedName("warehouse_id")
	@OpField(desc = "仓ID", example = "7155357637939495204")
	private Long warehouseId;

	@SerializedName("stock_num")
	@OpField(desc = "现货库存数", example = "1")
	private Long stockNum;

	@SerializedName("step_stock_num")
	@OpField(desc = "阶梯库存数", example = "2")
	private Long stepStockNum;

	@SerializedName("change_num")
	@OpField(desc = "更改的现货库存数", example = "1")
	private Long changeNum;

	@SerializedName("step_change_num")
	@OpField(desc = "更改的阶梯库存数", example = "2")
	private Long stepChangeNum;

	@SerializedName("status_code")
	@OpField(desc = "状态码", example = "0")
	private Long statusCode;

	@SerializedName("status_message")
	@OpField(desc = "状态信息", example = "-")
	private String statusMessage;

	@SerializedName("uniq_id")
	@OpField(desc = "请求的唯一标识", example = "uniqId1")
	private String uniqId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setWarehouseId(Long warehouseId){
		this.warehouseId = warehouseId;
	}

	
	public Long getWarehouseId(){
		return this.warehouseId;
	}

	
	public void setStockNum(Long stockNum){
		this.stockNum = stockNum;
	}

	
	public Long getStockNum(){
		return this.stockNum;
	}

	
	public void setStepStockNum(Long stepStockNum){
		this.stepStockNum = stepStockNum;
	}

	
	public Long getStepStockNum(){
		return this.stepStockNum;
	}

	
	public void setChangeNum(Long changeNum){
		this.changeNum = changeNum;
	}

	
	public Long getChangeNum(){
		return this.changeNum;
	}

	
	public void setStepChangeNum(Long stepChangeNum){
		this.stepChangeNum = stepChangeNum;
	}

	
	public Long getStepChangeNum(){
		return this.stepChangeNum;
	}

	
	public void setStatusCode(Long statusCode){
		this.statusCode = statusCode;
	}

	
	public Long getStatusCode(){
		return this.statusCode;
	}

	
	public void setStatusMessage(String statusMessage){
		this.statusMessage = statusMessage;
	}

	
	public String getStatusMessage(){
		return this.statusMessage;
	}

	
	public void setUniqId(String uniqId){
		this.uniqId = uniqId;
	}

	
	public String getUniqId(){
		return this.uniqId;
	}

}