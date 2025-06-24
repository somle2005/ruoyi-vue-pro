package com.doudian.open.msg.trade_TradeLogisticsChanged.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReceiverMsg {


	@SerializedName("addr")
	@OpField(required = false , desc = "收货地址，包含： province:省 city:市 town:区 detail:详细地址", example= "{province:{name:陕西省,id:61},city:{name:咸阳市,id:610400},town:{name:兴平市,id:610481},street:{name:阜寨镇,id:610481107},detail:,encrypt_detail:#LQxQ1h25RqUU+Ky6l38q#cDg8g12q0pW1TUzB0EUVbIaopLg8bByepKNpQ76asViKWLpzUk9850qcOVEpc18j97VmKIoYasgUtGCA9/Iep+EJjtRsCJJ1uomB5b7yu47qhJta89UscQ==*CgwIARCtHBiqICABKAESPgo8vVWSGzmdh4tEjVQ9PeGiOhWGHTfIH2xffyc9tV0I8vPQxfwKylgr/W+gvRQ8CG5msZAI7NoOWODGFtCvGgA=#1##}")
	private String addr;

	@SerializedName("name")
	@OpField(required = false , desc = "收货人姓名", example= "张三")
	private String name;

	@SerializedName("tel")
	@OpField(required = false , desc = "收货人手机号", example= "13117428732")
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