package com.doudian.open.api.product_addSchema.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class ProductAddSchemaParam {


	@SerializedName("commit")
	@OpField(required = true , desc = "是否提审", example= "true")
	private Boolean commit;

	@SerializedName("token")
	@OpField(required = true , desc = "商品发布提交token", example= "202404031422030A385E6530D92E9754EA")
	private String token;

	@SerializedName("model")
	@OpField(required = true , desc = "schema数据、json协议", example= "[{id:product_type,element_type:select,select_values:[{label:,value:0}]},{id:pickup_method,element_type:select,select_values:[{label:,value:0}]},{id:freight_id,element_type:input,value:3733036},{id:supply_day_return_selector,element_type:select,select_values:[{label:,value:15-1}]},{id:support_authentic_guaranteeV2,element_type:input,value:true},{id:quality_problem_return,element_type:input,value:7},{id:three_guarantees,element_type:select,select_values:[{label:,value:2}]},{id:fix_duration,element_type:select,select_values:[]},{id:extended_duration,element_type:select,select_values:[{label:,value:2190}]},{id:presell_type,element_type:select,select_values:[{label:,value:0}]},{id:delivery_delay_day,element_type:select,select_values:[{label:,value:1}]},{id:delay_rule_switch,element_type:input,value:false},{id:delay_rule_order_time,element_type:array,values:[]},{id:delay_rule_delivery_date,element_type:input,value:0},{id:presell_end_time_switch,element_type:input,value:true},{id:presell_end_time,element_type:input},{id:category_properties,element_type:complex,complex_value:[{id:2592,element_type:select,select_values:[{label:甜美,value:23925}]},{id:4924,element_type:input,value:12,value_attr:{}},{id:3972,element_type:input,value:123,value_attr:{}},{id:4895,element_type:input,value:1册,value_attr:{}},{id:813,element_type:select,select_values:[{label:H型,value:24667}]}]},{id:goods_category,element_type:input,value:20219},{id:main_image_three_to_four,element_type:array,values:[]},{id:size_info_template_id,element_type:input},{id:white_background_pic,element_type:input},{id:main_pic_video,element_type:input},{id:long_pic,element_type:input},{id:description,element_type:input,value:u003cpu003eu003cimg src=https://p-boe.byted.org/obj/ecom-shop-material/v1_ayoJLG_70411191472075410360078_3a7acaa53895d9919efd07647b82e227_sx_2615868_www3840-2160 style=max-width:100%;/u003eu003c/pu003e},{id:reduce_type,element_type:select,select_values:[{label:,value:1}]},{id:start_sale_type,element_type:select,select_values:[{label:,value:0}]},{id:sale_channel_type,element_type:select,select_values:[]},{id:short_product_name,element_type:input,value:},{id:reference_price,element_type:input},{id:reference_price_certificate_type,element_type:select,select_values:[]},{id:reference_price_certificate_urls,element_type:array},{id:total_buy_num,element_type:input},{id:max_buy_num,element_type:input},{id:min_buy_num,element_type:input,value:1},{id:weight_unit,element_type:select,select_values:[{label:,value:0}]},{id:weight_value,element_type:input,value:10},{id:title,element_type:input,value:测试 女装半身裙123},{id:title_prefix,element_type:input,value:},{id:title_suffix,element_type:input,value:},{id:title_use_brand_name,element_type:input,value:false},{id:qualification,element_type:complex,complex_value:[{id:3457058919409648559,element_type:array,values:[https://p-boe.byted.org/obj/ecom-shop-material/ayoJLG_m_a8966c7358a3ec2f6cfbd8d6036d4e1f_sx_60496_www661-661]}]},{id:pic,element_type:array,values:[https://p-boe.byted.org/obj/ecom-shop-material/ayoJLG_m_a8966c7358a3ec2f6cfbd8d6036d4e1f_sx_60496_www661-661]},{id:spec_detail,element_type:custom},{id:sku_detail,element_type:table,table_value:[[{id:sku_id,element_type:input,value:3659179643336928},{id:sku_sell_prop,element_type:array,values:[乳白色,XXS],values_attr:[{property_name:颜色分类},{property_name:尺码大小}]},{id:sku_status,element_type:input,value:true},{id:price,element_type:input,value:10000},{id:sku_type,element_type:input,value:0},{id:stock_info,element_type:input,value:0},{id:step_stock_info,element_type:input,value:0},{id:outer_sku_id,element_type:input},{id:code,element_type:input,value:}]]}]")
	private String model;

	@SerializedName("product_id")
	@OpField(required = false , desc = "1", example= "1")
	private Long productId;

	@SerializedName("recruit_info")
	@OpField(required = false , desc = "招商信息", example= "")
	private RecruitInfo recruitInfo;

	@SerializedName("recommend_ids")
	@OpField(required = false , desc = "预测记录id，类目预测记录key=category_recommend_id", example= "{category_recommend_id:aqwrqwrq123}")
	private Map<String,String> recommendIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCommit(Boolean commit){
		this.commit = commit;
	}

	
	public Boolean getCommit(){
		return this.commit;
	}

	
	public void setToken(String token){
		this.token = token;
	}

	
	public String getToken(){
		return this.token;
	}

	
	public void setModel(String model){
		this.model = model;
	}

	
	public String getModel(){
		return this.model;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setRecruitInfo(RecruitInfo recruitInfo){
		this.recruitInfo = recruitInfo;
	}

	
	public RecruitInfo getRecruitInfo(){
		return this.recruitInfo;
	}

	
	public void setRecommendIds(Map<String,String> recommendIds){
		this.recommendIds = recommendIds;
	}

	
	public Map<String,String> getRecommendIds(){
		return this.recommendIds;
	}

}