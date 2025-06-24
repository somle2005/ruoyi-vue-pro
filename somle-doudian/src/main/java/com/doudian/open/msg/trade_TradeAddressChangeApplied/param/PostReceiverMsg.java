package com.doudian.open.msg.trade_TradeAddressChangeApplied.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PostReceiverMsg {


	@SerializedName("addr")
	@OpField(required = false , desc = "收货地址，包含： province:省 city:市 town:区 detail:详细地址", example= "{province:{name:江苏省,id:320000},city:{name:苏州市,id:320500},town:{name:吴中区,id:320506},street:{name:,id:},detail:,encrypt_detail:#Xo6CVO0o6ywDFNFFYxoQrVZmHwX8+4y0O4pqdZf7ENTdab3erMMTZve+8AGYU0gYTVmnvoYs#4E3uQp+l7nXabY4XWpaXDDMjPBYGIe3Jvp/JzxDpRLNrWT+pc29ekOv0sset+h+1B/oWhxi0yO16Z7oLJ4Z2uk0mh7RmT7ZnLyKSna+KzbjeUWJa1L1HYjWX+bxs+73ifiUYJhknkrDHd+P04W32PLgMqg==*CgwIARCtHBiqICABKAESPgo8Rjl+1KEBnfM0b/LOKL5atfj9mAjcWJMnmciPYBmMkGq0wJ49eVGuSIKicy7obRV16+IUROigk3JLDcHSGgA=#1##}")
	private String addr;

	@SerializedName("name")
	@OpField(required = false , desc = "收货人姓名", example= "张三")
	private String name;

	@SerializedName("tel")
	@OpField(required = false , desc = "收货人手机号", example= "18512345678")
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