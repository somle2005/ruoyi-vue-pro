package com.doudian.open.api.sms_batchSend.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SmsBatchSendData {


	@SerializedName("send_result_list")
	@OpField(desc = "发送结果列表", example = "")
	private List<SendResultListItem> sendResultList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSendResultList(List<SendResultListItem> sendResultList){
		this.sendResultList = sendResultList;
	}

	
	public List<SendResultListItem> getSendResultList(){
		return this.sendResultList;
	}

}