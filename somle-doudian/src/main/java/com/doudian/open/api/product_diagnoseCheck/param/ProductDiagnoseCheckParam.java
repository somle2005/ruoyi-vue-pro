package com.doudian.open.api.product_diagnoseCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class ProductDiagnoseCheckParam {


	@SerializedName("product_format_new")
	@OpField(required = false , desc = "属性实体", example= "{}")
	private Map<Long,List<ProductFormatNewItem>> productFormatNew;

	@SerializedName("short_product_name")
	@OpField(required = false , desc = "短标题", example= "商品短标题")
	private String shortProductName;

	@SerializedName("spec_name")
	@OpField(required = false , desc = "规格名", example= "颜色分类")
	private String specName;

	@SerializedName("spec_value")
	@OpField(required = false , desc = "规格词", example= "红色")
	private String specValue;

	@SerializedName("sku_list")
	@OpField(required = false , desc = "商品sku", example= "")
	private List<SkuListItem> skuList;

	@SerializedName("quality_score_version")
	@OpField(required = false , desc = "质量分", example= "100")
	private String qualityScoreVersion;

	@SerializedName("product_main_pic")
	@OpField(required = false , desc = "主图信息，主图1：1和主图3：4", example= "")
	private List<ProductMainPicItem> productMainPic;

	@SerializedName("poi_use_condition")
	@OpField(required = false , desc = "卡券使用条件", example= "无")
	private String poiUseCondition;

	@SerializedName("size_info_template_id")
	@OpField(required = false , desc = "尺码模板id", example= "123")
	private Long sizeInfoTemplateId;

	@SerializedName("props")
	@OpField(required = false , desc = "属性", example= "废弃")
	private Map<String,String> props;

	@SerializedName("biz_kind")
	@OpField(required = false , desc = "0:普通商品，1:教育类商品 2:跨境商品", example= "0")
	private Long bizKind;

	@SerializedName("desc_text")
	@OpField(required = false , desc = "详情文字", example= "详情文字")
	private String descText;

	@SerializedName("risk_prop")
	@OpField(required = false , desc = "高危词判断", example= "高危词判断")
	private String riskProp;

	@SerializedName("product_type")
	@OpField(required = true , desc = "商品类型", example= "0")
	private Long productType;

	@SerializedName("category")
	@OpField(required = true , desc = "叶子类目ID", example= "24981")
	private Long category;

	@SerializedName("pic")
	@OpField(required = false , desc = "主图", example= "[https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_8f6130a19c5af35f7fbe9d56ef24e25e_sx_707570_www800-800,https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_8f6130a19c5af35f7fbe9d56ef24e25e_sx_707570_www800-800]")
	private List<String> pic;

	@SerializedName("product_material_map")
	@OpField(required = false , desc = "商品素材信息", example= "")
	private Map<Long,ProductMaterialMapItem> productMaterialMap;

	@SerializedName("product_id")
	@OpField(required = true , desc = "商品id", example= "351111111111111")
	private Long productId;

	@SerializedName("product_name")
	@OpField(required = false , desc = "商品名称", example= "商品名称")
	private String productName;

	@SerializedName("product_biz")
	@OpField(required = false , desc = "业务类型", example= "1223233423232")
	private Long productBiz;

	@SerializedName("is_template_opened")
	@OpField(required = false , desc = "尺码模板开关", example= "true")
	private Boolean isTemplateOpened;

	@SerializedName("poi_notification")
	@OpField(required = false , desc = "商品卡券领取", example= "废弃")
	private String poiNotification;

	@SerializedName("check_type")
	@OpField(required = false , desc = "场景 1发布 2诊断", example= "0")
	private Long checkType;

	@SerializedName("brand_id")
	@OpField(required = false , desc = "品牌ID", example= "122323")
	private String brandId;

	@SerializedName("desc_pic")
	@OpField(required = false , desc = "详情图", example= "[        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_bb06b738f66a8e34355a2f6d65856010_sx_592497_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_a3bd8b131292c606714addb42ac49994_sx_515811_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_1204eabbf5dd783f2763e8c2e448e4f8_sx_621215_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_c44f2b860c07f9391682c43acc60372d_sx_491669_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_776be48ff5bdc35311d0eb8ba18024fd_sx_578742_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_4730dfb87ade298e5bebf26224a5e7a2_sx_728745_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_b71a3bbdefc5cc1ee6342855ba2bf245_sx_646607_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_58956b9470b717a582797969f84ffbe5_sx_771903_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_0c8133579f1befff9493bf421740bff7_sx_824777_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_77878fc69879a331b916c3e253cace78_sx_894403_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_61b5b9a136704383a9482970d52478e8_sx_758447_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_692481144791458665a93017af20ad1b_sx_794850_www800-800,        https://p3-aio.ecombdimg.com/obj/ecom-shop-material/jpeg_m_48ba5b33e39dd2b7cbf80238caed839b_sx_691435_www800-800    ]")
	private List<String> descPic;

	@SerializedName("cross_border")
	@OpField(required = false , desc = "是否跨境 0 否 1 是", example= "0")
	private Long crossBorder;

	@SerializedName("brand_related_id")
	@OpField(required = false , desc = "品牌关联ID", example= "0")
	private String brandRelatedId;

	@SerializedName("component_template")
	@OpField(required = false , desc = "尺码结构及详细数据", example= "")
	private ComponentTemplate componentTemplate;

	@SerializedName("recommend_remark")
	@OpField(required = false , desc = "商品推荐语", example= "废弃")
	private String recommendRemark;

	@SerializedName("only_base_score")
	@OpField(required = false , desc = "是否仅需要基础分相关诊断项", example= "0")
	private Long onlyBaseScore;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductFormatNew(Map<Long,List<ProductFormatNewItem>> productFormatNew){
		this.productFormatNew = productFormatNew;
	}

	
	public Map<Long,List<ProductFormatNewItem>> getProductFormatNew(){
		return this.productFormatNew;
	}

	
	public void setShortProductName(String shortProductName){
		this.shortProductName = shortProductName;
	}

	
	public String getShortProductName(){
		return this.shortProductName;
	}

	
	public void setSpecName(String specName){
		this.specName = specName;
	}

	
	public String getSpecName(){
		return this.specName;
	}

	
	public void setSpecValue(String specValue){
		this.specValue = specValue;
	}

	
	public String getSpecValue(){
		return this.specValue;
	}

	
	public void setSkuList(List<SkuListItem> skuList){
		this.skuList = skuList;
	}

	
	public List<SkuListItem> getSkuList(){
		return this.skuList;
	}

	
	public void setQualityScoreVersion(String qualityScoreVersion){
		this.qualityScoreVersion = qualityScoreVersion;
	}

	
	public String getQualityScoreVersion(){
		return this.qualityScoreVersion;
	}

	
	public void setProductMainPic(List<ProductMainPicItem> productMainPic){
		this.productMainPic = productMainPic;
	}

	
	public List<ProductMainPicItem> getProductMainPic(){
		return this.productMainPic;
	}

	
	public void setPoiUseCondition(String poiUseCondition){
		this.poiUseCondition = poiUseCondition;
	}

	
	public String getPoiUseCondition(){
		return this.poiUseCondition;
	}

	
	public void setSizeInfoTemplateId(Long sizeInfoTemplateId){
		this.sizeInfoTemplateId = sizeInfoTemplateId;
	}

	
	public Long getSizeInfoTemplateId(){
		return this.sizeInfoTemplateId;
	}

	
	public void setProps(Map<String,String> props){
		this.props = props;
	}

	
	public Map<String,String> getProps(){
		return this.props;
	}

	
	public void setBizKind(Long bizKind){
		this.bizKind = bizKind;
	}

	
	public Long getBizKind(){
		return this.bizKind;
	}

	
	public void setDescText(String descText){
		this.descText = descText;
	}

	
	public String getDescText(){
		return this.descText;
	}

	
	public void setRiskProp(String riskProp){
		this.riskProp = riskProp;
	}

	
	public String getRiskProp(){
		return this.riskProp;
	}

	
	public void setProductType(Long productType){
		this.productType = productType;
	}

	
	public Long getProductType(){
		return this.productType;
	}

	
	public void setCategory(Long category){
		this.category = category;
	}

	
	public Long getCategory(){
		return this.category;
	}

	
	public void setPic(List<String> pic){
		this.pic = pic;
	}

	
	public List<String> getPic(){
		return this.pic;
	}

	
	public void setProductMaterialMap(Map<Long,ProductMaterialMapItem> productMaterialMap){
		this.productMaterialMap = productMaterialMap;
	}

	
	public Map<Long,ProductMaterialMapItem> getProductMaterialMap(){
		return this.productMaterialMap;
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

	
	public void setProductBiz(Long productBiz){
		this.productBiz = productBiz;
	}

	
	public Long getProductBiz(){
		return this.productBiz;
	}

	
	public void setIsTemplateOpened(Boolean isTemplateOpened){
		this.isTemplateOpened = isTemplateOpened;
	}

	
	public Boolean getIsTemplateOpened(){
		return this.isTemplateOpened;
	}

	
	public void setPoiNotification(String poiNotification){
		this.poiNotification = poiNotification;
	}

	
	public String getPoiNotification(){
		return this.poiNotification;
	}

	
	public void setCheckType(Long checkType){
		this.checkType = checkType;
	}

	
	public Long getCheckType(){
		return this.checkType;
	}

	
	public void setBrandId(String brandId){
		this.brandId = brandId;
	}

	
	public String getBrandId(){
		return this.brandId;
	}

	
	public void setDescPic(List<String> descPic){
		this.descPic = descPic;
	}

	
	public List<String> getDescPic(){
		return this.descPic;
	}

	
	public void setCrossBorder(Long crossBorder){
		this.crossBorder = crossBorder;
	}

	
	public Long getCrossBorder(){
		return this.crossBorder;
	}

	
	public void setBrandRelatedId(String brandRelatedId){
		this.brandRelatedId = brandRelatedId;
	}

	
	public String getBrandRelatedId(){
		return this.brandRelatedId;
	}

	
	public void setComponentTemplate(ComponentTemplate componentTemplate){
		this.componentTemplate = componentTemplate;
	}

	
	public ComponentTemplate getComponentTemplate(){
		return this.componentTemplate;
	}

	
	public void setRecommendRemark(String recommendRemark){
		this.recommendRemark = recommendRemark;
	}

	
	public String getRecommendRemark(){
		return this.recommendRemark;
	}

	
	public void setOnlyBaseScore(Long onlyBaseScore){
		this.onlyBaseScore = onlyBaseScore;
	}

	
	public Long getOnlyBaseScore(){
		return this.onlyBaseScore;
	}

}