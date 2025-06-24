package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PatientInfo {


	@SerializedName("medical_history")
	@OpField(desc = "1-过往病史;存在表示有 2-过敏史；存在表示有3-家族病史 ；存在表示有4-孕期/哺乳期 ；存在表示是5-肝功能；存在表示异常6-肾功能；存在表示异常", example = "1")
	private List<Long> medicalHistory;

	@SerializedName("is_follow_up_visit")
	@OpField(desc = "是否复诊", example = "true")
	private Boolean isFollowUpVisit;

	@SerializedName("id_card_num")
	@OpField(desc = "身份号；脱敏后", example = "1**************23")
	private String idCardNum;

	@SerializedName("age")
	@OpField(desc = "年龄", example = "22")
	private Integer age;

	@SerializedName("gender")
	@OpField(desc = "性别", example = "男")
	private String gender;

	@SerializedName("name")
	@OpField(desc = "姓名", example = "张三")
	private String name;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMedicalHistory(List<Long> medicalHistory){
		this.medicalHistory = medicalHistory;
	}

	
	public List<Long> getMedicalHistory(){
		return this.medicalHistory;
	}

	
	public void setIsFollowUpVisit(Boolean isFollowUpVisit){
		this.isFollowUpVisit = isFollowUpVisit;
	}

	
	public Boolean getIsFollowUpVisit(){
		return this.isFollowUpVisit;
	}

	
	public void setIdCardNum(String idCardNum){
		this.idCardNum = idCardNum;
	}

	
	public String getIdCardNum(){
		return this.idCardNum;
	}

	
	public void setAge(Integer age){
		this.age = age;
	}

	
	public Integer getAge(){
		return this.age;
	}

	
	public void setGender(String gender){
		this.gender = gender;
	}

	
	public String getGender(){
		return this.gender;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}