package com.doudian.open.api.order_batchDecrypt.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CipherInfosItem {


	@SerializedName("auth_id")
	@OpField(required = true , desc = "订单号", example= "4933609365066313446")
	private String authId;

	@SerializedName("cipher_text")
	@OpField(required = true , desc = "待解密值", example= "$c0qBj0QrZm9qae50eoBTInPj8PWvCjUyafxWt5cELI0=$pExhpmm6cJ5VuSkvduc3QrdA4THYUZjuoENdITyvkWbRm44PiY8HsHWEXzxQ77kBM7xzNMxoLzfIUnxxxJ/P6uautZu7FjzmjUAkXvbFWlM+*CgkIARCtHCABKAESPgo82qRAg0QjFELjtKxb8xUtm1YUGo6/9spO0OEG2j7RCutuqWHOYJpEdvPZIqsirv5F4byTrHMVDwn+9Bz4GgA=$1$$,#ML3B#0BB1W4adLHYf+1s8VI3eLeeK0Kq0kc8zLLZ0B9WFvKWLZHIU5mf2HF23PCR+z0aYj7R7CCv6DymAy8Mzpa+olZkPYr1PoWmJ*CgkIARCtHCABKAESPgo8YToGx4Xhzb2dDxYMRP1ZEDGC+8STVmEMRed/naetKeJTUXwnWv0P3lgEgPPP/UFHZ2LTzUKIX2ticBvHGgA=#1##")
	private String cipherText;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuthId(String authId){
		this.authId = authId;
	}

	
	public String getAuthId(){
		return this.authId;
	}

	
	public void setCipherText(String cipherText){
		this.cipherText = cipherText;
	}

	
	public String getCipherText(){
		return this.cipherText;
	}

}