package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SerialNoListItem_5 {


	@SerializedName("stage")
	@OpField(desc = "2-绑定操作的序列号；3-发货回传的序列号；4-快递小哥拍照胡穿的物流单号。如果之前在商家后台绑定了SN/69/IMEI码，并且发货的时候重新回传了SN/69/IMEI码，则会覆盖绑定的SN/69/IMEI码，接口返回的绑定阶段的SN/69/IMEI码和发货阶段返回的值一致。", example = "2")
	private Long stage;

	@SerializedName("serial_no_list")
	@OpField(desc = "每个阶段关联的SN/69/IMEI码信息。", example = "")
	private List<SerialNoListItem> serialNoList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStage(Long stage){
		this.stage = stage;
	}

	
	public Long getStage(){
		return this.stage;
	}

	
	public void setSerialNoList(List<SerialNoListItem> serialNoList){
		this.serialNoList = serialNoList;
	}

	
	public List<SerialNoListItem> getSerialNoList(){
		return this.serialNoList;
	}

}