package com.doudian.open.api.buyin_bindChannelProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinBindChannelProductParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID", example= "123456789")
	private Long productId;

	@SerializedName("channel_id")
	@OpField(required = true , desc = "渠道ID", example= "123456789")
	private Long channelId;

	@SerializedName("channel_type")
	@OpField(required = true , desc = "渠道类型：1: 店铺自卖，2：达人带货", example= "1")
	private Integer channelType;

	@SerializedName("is_all")
	@OpField(required = false , desc = "是否指定全部达人/全部店播达人", example= "false")
	private Boolean isAll;

	@SerializedName("author_ids")
	@OpField(required = false , desc = "需要绑定的达人uid 指定特定达人（is_all参数为false）时，该参数生效", example= "123456789")
	private List<Long> authorIds;

	@SerializedName("buyin_ids")
	@OpField(required = false , desc = "需要绑定的达人百应Id 指定特定达人（is_all参数为false）时，该参数生效", example= "123456789")
	private List<Long> buyinIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setChannelId(Long channelId){
		this.channelId = channelId;
	}

	
	public Long getChannelId(){
		return this.channelId;
	}

	
	public void setChannelType(Integer channelType){
		this.channelType = channelType;
	}

	
	public Integer getChannelType(){
		return this.channelType;
	}

	
	public void setIsAll(Boolean isAll){
		this.isAll = isAll;
	}

	
	public Boolean getIsAll(){
		return this.isAll;
	}

	
	public void setAuthorIds(List<Long> authorIds){
		this.authorIds = authorIds;
	}

	
	public List<Long> getAuthorIds(){
		return this.authorIds;
	}

	
	public void setBuyinIds(List<Long> buyinIds){
		this.buyinIds = buyinIds;
	}

	
	public List<Long> getBuyinIds(){
		return this.buyinIds;
	}

}