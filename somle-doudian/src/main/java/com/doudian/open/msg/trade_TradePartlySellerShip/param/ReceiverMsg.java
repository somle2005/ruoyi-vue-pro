package com.doudian.open.msg.trade_TradePartlySellerShip.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReceiverMsg {


	@SerializedName("addr")
	@OpField(required = false , desc = "收货地址", example= "{province:{name:广东省,id:44},city:{name:广州市,id:440100},town:{name:天河区,id:440106},street:{name:员村街道,id:440106002},detail:广东省广州市天河区T26产业园A馆101}")
	private String addr;

	@SerializedName("name")
	@OpField(required = false , desc = "收货人姓名", example= "张三")
	private String name;

	@SerializedName("tel")
	@OpField(required = false , desc = "收货人手机号", example= "13117428565")
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