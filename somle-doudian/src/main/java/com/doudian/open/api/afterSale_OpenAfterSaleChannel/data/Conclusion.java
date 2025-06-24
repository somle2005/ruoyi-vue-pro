package com.doudian.open.api.afterSale_OpenAfterSaleChannel.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class Conclusion {


	@SerializedName("match_conclusion")
	@OpField(desc = "匹配到超级售后的类型，1是超售后期售后，2是EP订单超级售后，3是虚拟订单超级售后，4是超售后次数售后", example = "1")
	private Integer matchConclusion;

	@SerializedName("match_message")
	@OpField(desc = "匹配结果的解释，成功时为空", example = "")
	private String matchMessage;

	@SerializedName("can_apply_type_list")
	@OpField(desc = "当前超级售后可以发起的售后类型，0是退货退款，1是已发货仅退款，2是未发货仅退款，3是换货", example = "[1,2]")
	private List<Long> canApplyTypeList;

	@SerializedName("match_success")
	@OpField(desc = "匹配是否成功，当match_conclusion不为0且can_apply_type_list不是空的时候，此值为true", example = "true")
	private Boolean matchSuccess;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMatchConclusion(Integer matchConclusion){
		this.matchConclusion = matchConclusion;
	}

	
	public Integer getMatchConclusion(){
		return this.matchConclusion;
	}

	
	public void setMatchMessage(String matchMessage){
		this.matchMessage = matchMessage;
	}

	
	public String getMatchMessage(){
		return this.matchMessage;
	}

	
	public void setCanApplyTypeList(List<Long> canApplyTypeList){
		this.canApplyTypeList = canApplyTypeList;
	}

	
	public List<Long> getCanApplyTypeList(){
		return this.canApplyTypeList;
	}

	
	public void setMatchSuccess(Boolean matchSuccess){
		this.matchSuccess = matchSuccess;
	}

	
	public Boolean getMatchSuccess(){
		return this.matchSuccess;
	}

}