package com.doudian.open.api.product_qualityDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductQualityDetailData {


	@SerializedName("field_problem")
	@OpField(desc = "可优化问题项", example = "")
	private List<FieldProblemItem> fieldProblem;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "3469673915587121070")
	private Long productId;

	@SerializedName("product_name")
	@OpField(desc = "商品名字", example = "奈克牌大皮鞋")
	private String productName;

	@SerializedName("quality_score")
	@OpField(desc = "质量分", example = "")
	private QualityScore qualityScore;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFieldProblem(List<FieldProblemItem> fieldProblem){
		this.fieldProblem = fieldProblem;
	}

	
	public List<FieldProblemItem> getFieldProblem(){
		return this.fieldProblem;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setQualityScore(QualityScore qualityScore){
		this.qualityScore = qualityScore;
	}

	
	public QualityScore getQualityScore(){
		return this.qualityScore;
	}

}