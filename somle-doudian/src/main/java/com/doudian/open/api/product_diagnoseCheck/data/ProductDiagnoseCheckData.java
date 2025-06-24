package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductDiagnoseCheckData {


	@SerializedName("quality_score")
	@OpField(desc = "质量分", example = "")
	private QualityScore qualityScore;

	@SerializedName("diagnose_essential_material")
	@OpField(desc = "必要图文", example = "")
	private DiagnoseEssentialMaterial diagnoseEssentialMaterial;

	@SerializedName("quality_score_calculating")
	@OpField(desc = "质量分是否计算中", example = "true")
	private Boolean qualityScoreCalculating;

	@SerializedName("field_problem")
	@OpField(desc = "字段问题", example = "")
	private List<FieldProblemItem> fieldProblem;

	@SerializedName("base_score")
	@OpField(desc = "基础分", example = "无")
	private Long baseScore;

	@SerializedName("diagnose_recommend")
	@OpField(desc = "推荐值", example = "")
	private DiagnoseRecommend diagnoseRecommend;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setQualityScore(QualityScore qualityScore){
		this.qualityScore = qualityScore;
	}

	
	public QualityScore getQualityScore(){
		return this.qualityScore;
	}

	
	public void setDiagnoseEssentialMaterial(DiagnoseEssentialMaterial diagnoseEssentialMaterial){
		this.diagnoseEssentialMaterial = diagnoseEssentialMaterial;
	}

	
	public DiagnoseEssentialMaterial getDiagnoseEssentialMaterial(){
		return this.diagnoseEssentialMaterial;
	}

	
	public void setQualityScoreCalculating(Boolean qualityScoreCalculating){
		this.qualityScoreCalculating = qualityScoreCalculating;
	}

	
	public Boolean getQualityScoreCalculating(){
		return this.qualityScoreCalculating;
	}

	
	public void setFieldProblem(List<FieldProblemItem> fieldProblem){
		this.fieldProblem = fieldProblem;
	}

	
	public List<FieldProblemItem> getFieldProblem(){
		return this.fieldProblem;
	}

	
	public void setBaseScore(Long baseScore){
		this.baseScore = baseScore;
	}

	
	public Long getBaseScore(){
		return this.baseScore;
	}

	
	public void setDiagnoseRecommend(DiagnoseRecommend diagnoseRecommend){
		this.diagnoseRecommend = diagnoseRecommend;
	}

	
	public DiagnoseRecommend getDiagnoseRecommend(){
		return this.diagnoseRecommend;
	}

}