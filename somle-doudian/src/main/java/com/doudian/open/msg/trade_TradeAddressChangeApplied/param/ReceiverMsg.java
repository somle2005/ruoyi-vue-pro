package com.doudian.open.msg.trade_TradeAddressChangeApplied.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReceiverMsg {


	@SerializedName("addr")
	@OpField(required = false , desc = "收货地址，包含： province:省 city:市 town:区 detail:详细地址", example= "{province:{name:江苏省,id:320000},city:{name:苏州市,id:320500},town:{name:苏州工业园区,id:320571},street:{name:,id:},detail:,encrypt_detail:#Xo6CVO0o6ywDFNFFYxoQrVZmHwX8+4y0O4pqdZf7ENTdab3erMMTZve+8AGYU0gYTVmnvoYs#BUuIoPYutb6QeWwTvCMNf/dlsMeH+K75Rmzut3TnnA/qbo/SbUQJ0QdIsv5OUJaDvEG1Bor9bn3ex31Rx1krmqGjcN7mRmq/3DSpnGrDkrCbgcYW8FwqYFj8SCjHeccOpXeCo+t0IBLD9qyRb9QgeSartA==*CgwIARCtHBiqICABKAESPgo8WMlCkTZEnab+DWGl/Rqe5FvE2iIvZRj/Fu0CqKYWrBKfifp6yA2n9oj3Q+fbckpoKNdCyFQAI/1v1GrUGgA=#1##}")
	private String addr;

	@SerializedName("name")
	@OpField(required = false , desc = "收货人姓名", example= "李四")
	private String name;

	@SerializedName("tel")
	@OpField(required = false , desc = "收货人手机号", example= "13512345678")
	private String tel;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAddr(String addr){
		this.addr = addr;
	}

	
	public String getAddr(){
		return this.addr;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setTel(String tel){
		this.tel = tel;
	}

	
	public String getTel(){
		return this.tel;
	}

}