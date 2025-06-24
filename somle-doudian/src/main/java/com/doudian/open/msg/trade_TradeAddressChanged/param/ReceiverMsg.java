package com.doudian.open.msg.trade_TradeAddressChanged.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReceiverMsg {


	@SerializedName("addr")
	@OpField(required = false , desc = "收货地址，包含： province:省 city:市 town:区 detail:详细地址", example= "{province:{name:陕西省,id:61},city:{name:西安市,id:610100},town:{name:莲湖区,id:610104},street:{name:红庙坡街道,id:610104004},detail:,encrypt_detail:#PzYfEZpxDmaYNP/W6TC+kuI8y6sW+Nrr#BYAANzPnUKdAq+IBJXJABgyEVAU4Lb5EBuNw45UotcuNVxMJhmCtCtj8cmSK8kBBMJp5unWZJ/jLNq9ZsJdF3aiIj43ynrOAlGTB/6T3M1QzExcJDQ/tfHSpVlWVAA==*CgwIARCtHBiqICABKAESPgo8x1+raNEh52E6ABE+lRLt/v10RRls7mFwHSKsGDHBKQiTVe8oC6EspmSe+o8avz09ZlbdbzCFbeZnE3SNGgA=#1##}")
	private String addr;

	@SerializedName("name")
	@OpField(required = false , desc = "收货人姓名", example= "张三")
	private String name;

	@SerializedName("tel")
	@OpField(required = false , desc = "收货人手机号", example= "14227438564")
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