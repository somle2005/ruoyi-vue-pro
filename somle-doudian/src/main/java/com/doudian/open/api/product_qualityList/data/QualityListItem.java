package com.doudian.open.api.product_qualityList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class QualityListItem {


	@SerializedName("field_problem")
	@OpField(desc = "可优化问题项", example = "")
	private List<FieldProblemItem> fieldProblem;

	@SerializedName("quality_score")
	@OpField(desc = "质量分数据", example = "")
	private QualityScore qualityScore;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "3502373827210525080")
	private Long productId;

	@SerializedName("product_name")
	@OpField(desc = "商品名字", example = "奈克牌皮鞋")
	private String productName;

	@SerializedName("problem_num_to_improve")
	@OpField(desc = "待优化问题数量", example = "2")
	private Long problemNumToImprove;

	@SerializedName("problem_type_distribution")
	@OpField(desc = "待优化问题分布列表，废弃不再用", example = "")
	private List<ProblemTypeDistributionItem> problemTypeDistribution;

	@SerializedName("meet_standard")
	@OpField(desc = "商品是否达标，1达标，2不达标", example = "2")
	private Long meetStandard;

	@SerializedName("base_score")
	@OpField(desc = "商品基础分，废弃不再用", example = "20")
	private Long baseScore;


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

	
	public void setQualityScore(QualityScore qualityScore){
		this.qualityScore = qualityScore;
	}

	
	public QualityScore getQualityScore(){
		return this.qualityScore;
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

	
	public void setProblemNumToImprove(Long problemNumToImprove){
		this.problemNumToImprove = problemNumToImprove;
	}

	
	public Long getProblemNumToImprove(){
		return this.problemNumToImprove;
	}

	
	public void setProblemTypeDistribution(List<ProblemTypeDistributionItem> problemTypeDistribution){
		this.problemTypeDistribution = problemTypeDistribution;
	}

	
	public List<ProblemTypeDistributionItem> getProblemTypeDistribution(){
		return this.problemTypeDistribution;
	}

	
	public void setMeetStandard(Long meetStandard){
		this.meetStandard = meetStandard;
	}

	
	public Long getMeetStandard(){
		return this.meetStandard;
	}

	
	public void setBaseScore(Long baseScore){
		this.baseScore = baseScore;
	}

	
	public Long getBaseScore(){
		return this.baseScore;
	}

}