package com.doudian.open.api.promise_SaveTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class WaveRuleConfigsItem {


	@SerializedName("time_type")
	@OpField(required = false , desc = "波次时效类型。1-承诺发货 2-承诺送达", example= "1")
	private Long timeType;

	@SerializedName("wave_id")
	@OpField(required = false , desc = "波次id。如果是创建新的波次，则该参数不填。如果是修改波次，则该参数为对应的修改的波次的id。", example= "864")
	private String waveId;

	@SerializedName("day")
	@OpField(required = false , desc = "发货/送达时间: 天数。如果time_type = 1, wave_type = 0, 则可选0D/1D/2D。如果time_type = 2, wave_type = 0, 则可选0D/1D/2D/3D/4D/5D/6D/7D。", example= "1D")
	private String day;

	@SerializedName("detail_id")
	@OpField(required = false , desc = "波次对应产能id。如果是创建新的波次，则该参数不填。如果是修改波次，则该参数为对应的修改的波次的产能id。", example= "")
	private String detailId;

	@SerializedName("capacity")
	@OpField(required = false , desc = "可在这里配置制定日期的产能。如果is_default为true，则date和capacity都不填，表示常规产能。如果is_default为false，填写date和capacity，表示指定日期的产能。例子，表示2024-07-17产能为111。", example= "")
	private List<CapacityItem> capacity;

	@SerializedName("warehouse_info")
	@OpField(required = false , desc = "仓库信息。warehouse_id和warehouse_name可以同时不填。若不填，则该模板的生效范围为全店生效。如果填写了仓库信息，则该模板按仓生效。", example= "")
	private WarehouseInfo warehouseInfo;

	@SerializedName("cutoff_time_hms")
	@OpField(required = false , desc = "截单时间：时分秒。（精确到秒）", example= "16:00:00")
	private String cutoffTimeHms;

	@SerializedName("wave_type")
	@OpField(required = false , desc = "波次类型 0-默认波次 1-特殊类目波次 2-不可达地址波次", example= "0")
	private Integer waveType;

	@SerializedName("address_list")
	@OpField(required = false , desc = "地址列表。当time_type = 2时，可以填写address_list，表示承诺送达的地址列表。当time_type = 1时，该参数不填。", example= "")
	private List<AddressListItem> addressList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTimeType(Long timeType){
		this.timeType = timeType;
	}

	
	public Long getTimeType(){
		return this.timeType;
	}

	
	public void setWaveId(String waveId){
		this.waveId = waveId;
	}

	
	public String getWaveId(){
		return this.waveId;
	}

	
	public void setDay(String day){
		this.day = day;
	}

	
	public String getDay(){
		return this.day;
	}

	
	public void setDetailId(String detailId){
		this.detailId = detailId;
	}

	
	public String getDetailId(){
		return this.detailId;
	}

	
	public void setCapacity(List<CapacityItem> capacity){
		this.capacity = capacity;
	}

	
	public List<CapacityItem> getCapacity(){
		return this.capacity;
	}

	
	public void setWarehouseInfo(WarehouseInfo warehouseInfo){
		this.warehouseInfo = warehouseInfo;
	}

	
	public WarehouseInfo getWarehouseInfo(){
		return this.warehouseInfo;
	}

	
	public void setCutoffTimeHms(String cutoffTimeHms){
		this.cutoffTimeHms = cutoffTimeHms;
	}

	
	public String getCutoffTimeHms(){
		return this.cutoffTimeHms;
	}

	
	public void setWaveType(Integer waveType){
		this.waveType = waveType;
	}

	
	public Integer getWaveType(){
		return this.waveType;
	}

	
	public void setAddressList(List<AddressListItem> addressList){
		this.addressList = addressList;
	}

	
	public List<AddressListItem> getAddressList(){
		return this.addressList;
	}

}