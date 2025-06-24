package com.doudian.open.msg.trade_TradeSellerShip.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReceiverMsg {


	@SerializedName("addr")
	@OpField(required = false , desc = "收货地址，包含： province:省 city:市 town:区 detail:详细地址", example= "{province:浙江省,province_id:330000,city:杭州市,city_id:330100,town:江干区,town_id:330104,street:,street_id:0,detail:,encrypt_detail:#GkRvvx3QltXvEohGKiEILh+IuaVekvJg9C4yzMGDt4HacJdKS2vx6vUGfbTanBshzDL93Yll3/h/Vm28HgXP8UVC9JuAUey1XnWvp4eMz3va7eNxZHlAYhcmws8Xm/j7iXE0z5/qrn3mP5fxy94oebT4R7EGn/NjfeWJJ48ilPME488pdo2fnHR0XnBclZxY4eKWeJct7dgnLvM5GgxPuMBeAcIXQbuHxxDsHbZ8M9htXZEq7wD4gaougwL4zer4pD9i#E/lIKlvsB/wSyFMZE93ozUUr8ojA9jvOoDC8+qu3WmSdnsn5szVtzuyBiOadXUqJP5hKFbPG1DtzAtGfGPy8RzWt6swDcPQg1WoOxgptAo9N3OZJcoB1vcAfxKVDE0hdqJpeF6cqFV6fJTpsn/n1CHuT9rPjLfJYPC0gKkxQ14+GWOti6jTTrCKza0UDBHebkJtMaFKlHfmtBcWn1OPsBLIrSUJdfKnkoma05KkCOKFWHA6jlow7BpADeG1uOnlqauC7WG/2k4tO3aJBOmX0miGPEtexeNKe0prCqOwJ8WjAolTW4JXJUa7zyJtShlc0N2mCGIe8cvlVC6ASjzb8vQ==*CgwIARCtHBiqICABKAESPgo8Fb7m/xUdLZxdfwEemDoqxMZERRs0uzuBgzbvrq+ICHLKYnlM5I2YKCE9F58HKcUEixnKqx7TY4o8qsTRGgA=#1##,name:,encrypt_name:#kHyT6Bd5#PZNmtA8Nis9+Od9btPDP+DWB/lufTGVaWo6YBNI/3FDvegT+Ot/7urFwuSQxeyDFs9wJ6lj1R4NNB5GjY7oIB8S4uAtSnzrvbKKarNDbeA==*CgwIARCtHBiqICABKAESPgo8N/p383ZE9bErQuLTEtAJOKfRRRyieEB6gwSpVFsAhAyJLUtnvnVtgzyPCjmukYeiYjiFLROvcFbg7TC7GgA=#1##,mobile:,encrypt_mobile:$x56Luk7c3suFqoRsY6pKcHRwLpoznM9jxWvSiQ8KhuQ=$nNmYwnczIOdYdw0sA0WV4A6RFnmkFOg9+3pZO15P6zSb00K9aAz+c0+GG4RIE8ZrEjB5jiiKznHaqgl4NBDJbhWhIJze84utgqapZ1FScNql*CgwIARCtHBiqICABKAESPgo8hQq41UQVTojT9o2g5811TkZV/Z/RmM4+Ofjc8Xq71gFnfXMKwVadlQRti3CbiyvNYpaOYM+69aJlMvoUGgA=$1$$”}")
	private String addr;

	@SerializedName("name")
	@OpField(required = false , desc = "收货人姓名", example= "张三")
	private String name;

	@SerializedName("tel")
	@OpField(required = false , desc = "收货人手机号", example= "13117428564")
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