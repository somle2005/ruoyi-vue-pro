package com.doudian.open.api.logistics_listShopNetsite.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class NetsitesItem {


	@SerializedName("netsite_code")
	@OpField(desc = "网点Code", example = "100010")
	private String netsiteCode;

	@SerializedName("netsite_name")
	@OpField(desc = "网点名称", example = "E世界")
	private String netsiteName;

	@SerializedName("amount")
	@OpField(desc = "电子面单余额数量", example = "1")
	private String amount;

	@SerializedName("sender_address")
	@OpField(desc = "寄件人地址", example = "-")
	private List<SenderAddressItem> senderAddress;

	@SerializedName("allocated_quantity")
	@OpField(desc = "已取单号数量，若业务本身无值，则传-1，前端可展示为“-”", example = "1")
	private Long allocatedQuantity;

	@SerializedName("cancelled_quantity")
	@OpField(desc = "已取消单号数量，若业务本身无值，则传-1，前端可展示为“-”", example = "1")
	private Long cancelledQuantity;

	@SerializedName("recycled_quantity")
	@OpField(desc = "已回收单号数量，若业务本身无值，则传-1，前端可展示为“-”", example = "1")
	private Long recycledQuantity;

	@SerializedName("company")
	@OpField(desc = "快递公司编码", example = "zhongtong")
	private String company;

	@SerializedName("company_type")
	@OpField(desc = "物流服务商业务类型 1：直营  2：加盟 3：落地配 4：直营带网点", example = "1")
	private Integer companyType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setNetsiteCode(String netsiteCode){
		this.netsiteCode = netsiteCode;
	}

	
	public String getNetsiteCode(){
		return this.netsiteCode;
	}

	
	public void setNetsiteName(String netsiteName){
		this.netsiteName = netsiteName;
	}

	
	public String getNetsiteName(){
		return this.netsiteName;
	}

	
	public void setAmount(String amount){
		this.amount = amount;
	}

	
	public String getAmount(){
		return this.amount;
	}

	
	public void setSenderAddress(List<SenderAddressItem> senderAddress){
		this.senderAddress = senderAddress;
	}

	
	public List<SenderAddressItem> getSenderAddress(){
		return this.senderAddress;
	}

	
	public void setAllocatedQuantity(Long allocatedQuantity){
		this.allocatedQuantity = allocatedQuantity;
	}

	
	public Long getAllocatedQuantity(){
		return this.allocatedQuantity;
	}

	
	public void setCancelledQuantity(Long cancelledQuantity){
		this.cancelledQuantity = cancelledQuantity;
	}

	
	public Long getCancelledQuantity(){
		return this.cancelledQuantity;
	}

	
	public void setRecycledQuantity(Long recycledQuantity){
		this.recycledQuantity = recycledQuantity;
	}

	
	public Long getRecycledQuantity(){
		return this.recycledQuantity;
	}

	
	public void setCompany(String company){
		this.company = company;
	}

	
	public String getCompany(){
		return this.company;
	}

	
	public void setCompanyType(Integer companyType){
		this.companyType = companyType;
	}

	
	public Integer getCompanyType(){
		return this.companyType;
	}

}