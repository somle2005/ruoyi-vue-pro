package com.doudian.open.api.sms_sendResult.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SmsSendResultData {


	@SerializedName("total")
	@OpField(desc = "数量", example = "100")
	private Long total;

	@SerializedName("sms_send_result_list")
	@OpField(desc = "短信结果列表", example = "")
	private List<SmsSendResultListItem> smsSendResultList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

	
	public void setSmsSendResultList(List<SmsSendResultListItem> smsSendResultList){
		this.smsSendResultList = smsSendResultList;
	}

	
	public List<SmsSendResultListItem> getSmsSendResultList(){
		return this.smsSendResultList;
	}

}