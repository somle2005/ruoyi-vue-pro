package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class FieldProblemItem {


	@SerializedName("problem_type")
	@OpField(desc = "问题类型", example = "废弃")
	private Long problemType;

	@SerializedName("field_key")
	@OpField(desc = "字段key", example = "props")
	private String fieldKey;

	@SerializedName("tab_optimization_type")
	@OpField(desc = "problem对应的tab类型", example = "无")
	private String tabOptimizationType;

	@SerializedName("detail_link")
	@OpField(desc = "诊断问题示例详情", example = "无")
	private String detailLink;

	@SerializedName("problem_position")
	@OpField(desc = "诊断问题定位", example = "无")
	private List<String> problemPosition;

	@SerializedName("is_fatal")
	@OpField(desc = "是否合规问题", example = "false")
	private Boolean isFatal;

	@SerializedName("is_empty_type")
	@OpField(desc = "该诊断项是否是信息空缺导致的", example = "false")
	private Boolean isEmptyType;

	@SerializedName("is_app_support")
	@OpField(desc = "是否支持app展示", example = "false")
	private Boolean isAppSupport;

	@SerializedName("problem_score")
	@OpField(desc = "问题得分", example = "12")
	private Double problemScore;

	@SerializedName("problem_name")
	@OpField(desc = "问题名", example = "商品缺少白底图")
	private String problemName;

	@SerializedName("is_support_exemption")
	@OpField(desc = "是否支持豁免", example = "true")
	private Boolean isSupportExemption;

	@SerializedName("problem_category")
	@OpField(desc = "问题分类", example = "suggest_problem")
	private String problemCategory;

	@SerializedName("problem_simple_name")
	@OpField(desc = "商品前端展示问题", example = "商品缺少白底图")
	private String problemSimpleName;

	@SerializedName("problem_desc")
	@OpField(desc = "诊断问题简介", example = "无")
	private String problemDesc;

	@SerializedName("optimization_type")
	@OpField(desc = "优化类型", example = "无")
	private Long optimizationType;

	@SerializedName("problem_biz_extra")
	@OpField(desc = "问题扩展信息", example = "")
	private ProblemBizExtra problemBizExtra;

	@SerializedName("is_quality_score")
	@OpField(desc = "是否是计分项", example = "true")
	private Boolean isQualityScore;

	@SerializedName("problem_key")
	@OpField(desc = "问题类型2024: 缺失模特上身效果图,请补充2025: 缺失商品平铺展示,请补充2026: 缺失商品局部/细节图展示,请补充488: 主图存在不良暗示问题1005: 商品无达人测评1002: 商品有山寨侵权风险1003: 商品品牌命中平台禁售管控604: 主图属于低质手机拍摄图606: 主图文字不规范602: 主图售卖主体缺失605: 主图存在压缩等问题603: 主图存在诱导点击嫌疑601: 主图含明显边框431: 缺少3:4主图455: 商品缺少规格图20001: 规格图重复425: 商品缺少主图视频或主图视频质量不合格703: 商品缺少讲解回放2011: 商品详情页缺少规格/尺寸2007: 商品详情页缺少清晰配料表2008: 商品详情页缺少清晰营养成分表803: 请丰富详情内容，不可仅为文字说明2005: 服饰商品详情页无清晰尺码表111: 标题可补充热搜词5002: 商品品牌属性[%s]与商品标题描述[%s]、详情描述[%s]不一致，请修改201: 类目选择需优化，建议选择类目：「%s」2002: 重要属性未全部填写", example = "2002")
	private Long problemKey;

	@SerializedName("prop_ids")
	@OpField(desc = "有问题的属性id", example = "[1,2,3]")
	private List<Long> propIds;

	@SerializedName("index")
	@OpField(desc = "多值时的位置", example = "0")
	private Long index;

	@SerializedName("is_block")
	@OpField(desc = "是否拦截发布", example = "false")
	private Boolean isBlock;

	@SerializedName("is_base_score")
	@OpField(desc = "是否基础分", example = "false")
	private Boolean isBaseScore;

	@SerializedName("second_optimization_type")
	@OpField(desc = "问题项所属二级优化类型", example = "无")
	private String secondOptimizationType;

	@SerializedName("is_ignored")
	@OpField(desc = "是否已忽略", example = "false")
	private Boolean isIgnored;

	@SerializedName("diagnose_target")
	@OpField(desc = "诊断项对应的问题域 如主图、白底图", example = "无")
	private String diagnoseTarget;

	@SerializedName("field_name")
	@OpField(desc = "诊断的字段类型：主图、标题、属性、短标题、主图视频、讲解回放、达人秀", example = "主图")
	private String fieldName;

	@SerializedName("suggestion")
	@OpField(desc = "建议", example = "商品缺少白底图素材，影响商品活动报名，建议补充纯白背景加商品主体图片")
	private String suggestion;

	@SerializedName("item_rcmd_effect")
	@OpField(desc = "收益指标", example = "")
	private ItemRcmdEffect itemRcmdEffect;

	@SerializedName("optimization_object")
	@OpField(desc = "优化类型一级分类", example = "无")
	private String optimizationObject;

	@SerializedName("optimization_issue")
	@OpField(desc = "优化类型二级分类", example = "无")
	private String optimizationIssue;

	@SerializedName("problem_affect_describe")
	@OpField(desc = "问题影响描述", example = "无")
	private List<String> problemAffectDescribe;

	@SerializedName("jump_link")
	@OpField(desc = "问题分类", example = "无")
	private String jumpLink;

	@SerializedName("first_optimization_type")
	@OpField(desc = "问题项所属一级优化类型", example = "无")
	private String firstOptimizationType;

	@SerializedName("is_support_ignore")
	@OpField(desc = "是否支持忽略预警", example = "无")
	private Boolean isSupportIgnore;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProblemType(Long problemType){
		this.problemType = problemType;
	}

	
	public Long getProblemType(){
		return this.problemType;
	}

	
	public void setFieldKey(String fieldKey){
		this.fieldKey = fieldKey;
	}

	
	public String getFieldKey(){
		return this.fieldKey;
	}

	
	public void setTabOptimizationType(String tabOptimizationType){
		this.tabOptimizationType = tabOptimizationType;
	}

	
	public String getTabOptimizationType(){
		return this.tabOptimizationType;
	}

	
	public void setDetailLink(String detailLink){
		this.detailLink = detailLink;
	}

	
	public String getDetailLink(){
		return this.detailLink;
	}

	
	public void setProblemPosition(List<String> problemPosition){
		this.problemPosition = problemPosition;
	}

	
	public List<String> getProblemPosition(){
		return this.problemPosition;
	}

	
	public void setIsFatal(Boolean isFatal){
		this.isFatal = isFatal;
	}

	
	public Boolean getIsFatal(){
		return this.isFatal;
	}

	
	public void setIsEmptyType(Boolean isEmptyType){
		this.isEmptyType = isEmptyType;
	}

	
	public Boolean getIsEmptyType(){
		return this.isEmptyType;
	}

	
	public void setIsAppSupport(Boolean isAppSupport){
		this.isAppSupport = isAppSupport;
	}

	
	public Boolean getIsAppSupport(){
		return this.isAppSupport;
	}

	
	public void setProblemScore(Double problemScore){
		this.problemScore = problemScore;
	}

	
	public Double getProblemScore(){
		return this.problemScore;
	}

	
	public void setProblemName(String problemName){
		this.problemName = problemName;
	}

	
	public String getProblemName(){
		return this.problemName;
	}

	
	public void setIsSupportExemption(Boolean isSupportExemption){
		this.isSupportExemption = isSupportExemption;
	}

	
	public Boolean getIsSupportExemption(){
		return this.isSupportExemption;
	}

	
	public void setProblemCategory(String problemCategory){
		this.problemCategory = problemCategory;
	}

	
	public String getProblemCategory(){
		return this.problemCategory;
	}

	
	public void setProblemSimpleName(String problemSimpleName){
		this.problemSimpleName = problemSimpleName;
	}

	
	public String getProblemSimpleName(){
		return this.problemSimpleName;
	}

	
	public void setProblemDesc(String problemDesc){
		this.problemDesc = problemDesc;
	}

	
	public String getProblemDesc(){
		return this.problemDesc;
	}

	
	public void setOptimizationType(Long optimizationType){
		this.optimizationType = optimizationType;
	}

	
	public Long getOptimizationType(){
		return this.optimizationType;
	}

	
	public void setProblemBizExtra(ProblemBizExtra problemBizExtra){
		this.problemBizExtra = problemBizExtra;
	}

	
	public ProblemBizExtra getProblemBizExtra(){
		return this.problemBizExtra;
	}

	
	public void setIsQualityScore(Boolean isQualityScore){
		this.isQualityScore = isQualityScore;
	}

	
	public Boolean getIsQualityScore(){
		return this.isQualityScore;
	}

	
	public void setProblemKey(Long problemKey){
		this.problemKey = problemKey;
	}

	
	public Long getProblemKey(){
		return this.problemKey;
	}

	
	public void setPropIds(List<Long> propIds){
		this.propIds = propIds;
	}

	
	public List<Long> getPropIds(){
		return this.propIds;
	}

	
	public void setIndex(Long index){
		this.index = index;
	}

	
	public Long getIndex(){
		return this.index;
	}

	
	public void setIsBlock(Boolean isBlock){
		this.isBlock = isBlock;
	}

	
	public Boolean getIsBlock(){
		return this.isBlock;
	}

	
	public void setIsBaseScore(Boolean isBaseScore){
		this.isBaseScore = isBaseScore;
	}

	
	public Boolean getIsBaseScore(){
		return this.isBaseScore;
	}

	
	public void setSecondOptimizationType(String secondOptimizationType){
		this.secondOptimizationType = secondOptimizationType;
	}

	
	public String getSecondOptimizationType(){
		return this.secondOptimizationType;
	}

	
	public void setIsIgnored(Boolean isIgnored){
		this.isIgnored = isIgnored;
	}

	
	public Boolean getIsIgnored(){
		return this.isIgnored;
	}

	
	public void setDiagnoseTarget(String diagnoseTarget){
		this.diagnoseTarget = diagnoseTarget;
	}

	
	public String getDiagnoseTarget(){
		return this.diagnoseTarget;
	}

	
	public void setFieldName(String fieldName){
		this.fieldName = fieldName;
	}

	
	public String getFieldName(){
		return this.fieldName;
	}

	
	public void setSuggestion(String suggestion){
		this.suggestion = suggestion;
	}

	
	public String getSuggestion(){
		return this.suggestion;
	}

	
	public void setItemRcmdEffect(ItemRcmdEffect itemRcmdEffect){
		this.itemRcmdEffect = itemRcmdEffect;
	}

	
	public ItemRcmdEffect getItemRcmdEffect(){
		return this.itemRcmdEffect;
	}

	
	public void setOptimizationObject(String optimizationObject){
		this.optimizationObject = optimizationObject;
	}

	
	public String getOptimizationObject(){
		return this.optimizationObject;
	}

	
	public void setOptimizationIssue(String optimizationIssue){
		this.optimizationIssue = optimizationIssue;
	}

	
	public String getOptimizationIssue(){
		return this.optimizationIssue;
	}

	
	public void setProblemAffectDescribe(List<String> problemAffectDescribe){
		this.problemAffectDescribe = problemAffectDescribe;
	}

	
	public List<String> getProblemAffectDescribe(){
		return this.problemAffectDescribe;
	}

	
	public void setJumpLink(String jumpLink){
		this.jumpLink = jumpLink;
	}

	
	public String getJumpLink(){
		return this.jumpLink;
	}

	
	public void setFirstOptimizationType(String firstOptimizationType){
		this.firstOptimizationType = firstOptimizationType;
	}

	
	public String getFirstOptimizationType(){
		return this.firstOptimizationType;
	}

	
	public void setIsSupportIgnore(Boolean isSupportIgnore){
		this.isSupportIgnore = isSupportIgnore;
	}

	
	public Boolean getIsSupportIgnore(){
		return this.isSupportIgnore;
	}

}