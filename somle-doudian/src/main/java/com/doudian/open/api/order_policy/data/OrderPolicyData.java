package com.doudian.open.api.order_policy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderPolicyData {


	@SerializedName("policy_info")
	@OpField(desc = "保单详情列表", example = "")
	private PolicyInfo policyInfo;

	@SerializedName("claim_info_list")
	@OpField(desc = "理赔列表", example = "")
	private List<ClaimInfoListItem> claimInfoList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPolicyInfo(PolicyInfo policyInfo){
		this.policyInfo = policyInfo;
	}

	
	public PolicyInfo getPolicyInfo(){
		return this.policyInfo;
	}

	
	public void setClaimInfoList(List<ClaimInfoListItem> claimInfoList){
		this.claimInfoList = claimInfoList;
	}

	
	public List<ClaimInfoListItem> getClaimInfoList(){
		return this.claimInfoList;
	}

}