package com.doudian.open.api.buyin_promotionStrategyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ValidKolInfo {


	@SerializedName("valid_kol_range")
	@OpField(desc = "生效达人范围 1：全部达人 2：指定达人 3：条件圈选 4：专属指定达人", example = "1")
	private Long validKolRange;

	@SerializedName("kol_infos")
	@OpField(desc = "指定达人列表", example = "")
	private List<KolInfosItem> kolInfos;

	@SerializedName("kol_num")
	@OpField(desc = "指定达人数量", example = "3")
	private Long kolNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValidKolRange(Long validKolRange){
		this.validKolRange = validKolRange;
	}

	
	public Long getValidKolRange(){
		return this.validKolRange;
	}

	
	public void setKolInfos(List<KolInfosItem> kolInfos){
		this.kolInfos = kolInfos;
	}

	
	public List<KolInfosItem> getKolInfos(){
		return this.kolInfos;
	}

	
	public void setKolNum(Long kolNum){
		this.kolNum = kolNum;
	}

	
	public Long getKolNum(){
		return this.kolNum;
	}

}