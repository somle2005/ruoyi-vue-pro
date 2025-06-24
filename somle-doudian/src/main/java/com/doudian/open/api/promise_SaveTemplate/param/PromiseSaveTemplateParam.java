package com.doudian.open.api.promise_SaveTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PromiseSaveTemplateParam {


	@SerializedName("template_info")
	@OpField(required = true , desc = "模板信息", example= "")
	private TemplateInfo templateInfo;

	@SerializedName("wave_rule_configs")
	@OpField(required = false , desc = "波次规则配置。", example= "")
	private List<WaveRuleConfigsItem> waveRuleConfigs;

	@SerializedName("extra_info")
	@OpField(required = false , desc = "其他信息", example= "")
	private ExtraInfo extraInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateInfo(TemplateInfo templateInfo){
		this.templateInfo = templateInfo;
	}

	
	public TemplateInfo getTemplateInfo(){
		return this.templateInfo;
	}

	
	public void setWaveRuleConfigs(List<WaveRuleConfigsItem> waveRuleConfigs){
		this.waveRuleConfigs = waveRuleConfigs;
	}

	
	public List<WaveRuleConfigsItem> getWaveRuleConfigs(){
		return this.waveRuleConfigs;
	}

	
	public void setExtraInfo(ExtraInfo extraInfo){
		this.extraInfo = extraInfo;
	}

	
	public ExtraInfo getExtraInfo(){
		return this.extraInfo;
	}

}