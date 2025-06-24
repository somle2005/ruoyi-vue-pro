package com.doudian.open.api.product_batchGetProductLocks.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductLockInfosItem {


	@SerializedName("product_locks")
	@OpField(desc = "商品锁4:  商品规格锁5:  运费模版锁7:  sku价格锁（商品下所有sku价格不能修改）8:  物流信息锁9:  发货方式和时间锁10: 发货方式锁11: 发货时间锁12: 库存类型锁14: 商品标题锁15: 商品描述锁16: 商品白底图锁17: 商品下架操作锁18: 商品库存增加锁（商品下所有sku都不能增加库存）19: 商品库存减少锁（商品下所有sku都不能减少库存）20: 类目锁21: 预售发货模式锁22: 商品主图锁23: 商品编辑操作锁24: 库存区域仓锁25: 商品删除操作锁26: 商品上架操作锁27: 特殊时间延迟发货锁28: 7天无理由权益锁29: 过敏包退权益锁", example = "[18]")
	private List<Long> productLocks;

	@SerializedName("sku_lock_infos")
	@OpField(desc = "sku锁信息", example = "")
	private List<SkuLockInfosItem> skuLockInfos;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "3686835674755019677")
	private Long productId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductLocks(List<Long> productLocks){
		this.productLocks = productLocks;
	}

	
	public List<Long> getProductLocks(){
		return this.productLocks;
	}

	
	public void setSkuLockInfos(List<SkuLockInfosItem> skuLockInfos){
		this.skuLockInfos = skuLockInfos;
	}

	
	public List<SkuLockInfosItem> getSkuLockInfos(){
		return this.skuLockInfos;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

}