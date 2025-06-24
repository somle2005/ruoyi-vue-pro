package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UserIdInfo {


	@SerializedName("id_card_no")
	@OpField(desc = "证件号", example = "#zuLyd4U4J3p+czzXkwg+ZQ673h7KTcrKOddb5iPGAAE0K3MYJmgXEXof9LDtoScAfMKvdVRqpAL4CEI3SrLwYATIzTF9Qw==")
	private String idCardNo;

	@SerializedName("encrypt_id_card_no")
	@OpField(desc = "证件号", example = "#zuLyd4U4J3p+czzXkwg+ZQ673h7KTcrKOddb5iPGAAE0K3MYJmgXEXof9LDtoScAfMKvdVRqpAL4CEI3SrLwYATIzTF9Qw==")
	private String encryptIdCardNo;

	@SerializedName("id_card_name")
	@OpField(desc = "证件姓名", example = "#zuLyd4U4J3p+czzXkwg+ZQ673h7KTcrKOddb5iPGAAE0K3MYJmgXEXof9LDtoScAfMKvdVRqpAL4CEI3SrLwYATIzTF9Qw==")
	private String idCardName;

	@SerializedName("encrypt_id_card_name")
	@OpField(desc = "证件姓名", example = "#zuLyd4U4J3p+czzXkwg+ZQ673h7KTcrKOddb5iPGAAE0K3MYJmgXEXof9LDtoScAfMKvdVRqpAL4CEI3SrLwYATIzTF9Qw==")
	private String encryptIdCardName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIdCardNo(String idCardNo){
		this.idCardNo = idCardNo;
	}

	
	public String getIdCardNo(){
		return this.idCardNo;
	}

	
	public void setEncryptIdCardNo(String encryptIdCardNo){
		this.encryptIdCardNo = encryptIdCardNo;
	}

	
	public String getEncryptIdCardNo(){
		return this.encryptIdCardNo;
	}

	
	public void setIdCardName(String idCardName){
		this.idCardName = idCardName;
	}

	
	public String getIdCardName(){
		return this.idCardName;
	}

	
	public void setEncryptIdCardName(String encryptIdCardName){
		this.encryptIdCardName = encryptIdCardName;
	}

	
	public String getEncryptIdCardName(){
		return this.encryptIdCardName;
	}

}