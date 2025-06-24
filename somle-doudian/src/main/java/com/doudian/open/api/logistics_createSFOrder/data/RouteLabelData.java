package com.doudian.open.api.logistics_createSFOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RouteLabelData {


	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "UT290000008742")
	private String trackNo;

	@SerializedName("source_transfer_code")
	@OpField(desc = "原寄地中转场", example = "010W")
	private String sourceTransferCode;

	@SerializedName("source_city_code")
	@OpField(desc = "原寄地城市代码", example = "010")
	private String sourceCityCode;

	@SerializedName("source_dept_code")
	@OpField(desc = "原寄地网点代码", example = "010")
	private String sourceDeptCode;

	@SerializedName("sourceTeamCode")
	@OpField(desc = "原寄地单元区域", example = "013")
	private String sourceTeamCode;

	@SerializedName("destCityCode")
	@OpField(desc = "目的地城市代码, eg:755", example = "755")
	private String destCityCode;

	@SerializedName("destDeptCode")
	@OpField(desc = "目的地网点代码, eg:755AQ", example = "755AQ")
	private String destDeptCode;

	@SerializedName("dest_dept_code_mapping")
	@OpField(desc = "目的地网点代码映射码", example = "123456")
	private String destDeptCodeMapping;

	@SerializedName("dest_team_code")
	@OpField(desc = "目的地单元区域, eg:001", example = "001")
	private String destTeamCode;

	@SerializedName("dest_team_code_mapping")
	@OpField(desc = "目的地单元区域映射码", example = "123456")
	private String destTeamCodeMapping;

	@SerializedName("dest_transfer_code")
	@OpField(desc = "目的地中转场", example = "010W")
	private String destTransferCode;

	@SerializedName("dest_route_label")
	@OpField(desc = "打单时的路由标签信息如果 是大网的路由标签,这里的 值是目的地网点代码,如果 是同城配的路由标签,这里 的值是根据同城配的设置映 射出来的值,不同的配置结 果会不一样,不能根据-符 号切分(如:上海同城配,可能 是:集散点-目的地网点-接 驳点,也有可能是目的地网 点代码-集散点-接驳点)", example = "010W-AS-049")
	private String destRouteLabel;

	@SerializedName("pro_name")
	@OpField(desc = "产品名称 对应RLS:pro_name", example = "123456")
	private String proName;

	@SerializedName("cargo_type_code")
	@OpField(desc = "快件内容: 如:C816、SP601", example = "C816")
	private String cargoTypeCode;

	@SerializedName("limit_type_code")
	@OpField(desc = "时效代码, 如:T4", example = "T4")
	private String limitTypeCode;

	@SerializedName("express_type_code")
	@OpField(desc = "产品类型,如:B1", example = "B1")
	private String expressTypeCode;

	@SerializedName("coding_mapping")
	@OpField(desc = "入港映射码 eg:S10", example = "S10")
	private String codingMapping;

	@SerializedName("coding_mapping_out")
	@OpField(desc = "出港映射码", example = "C1E")
	private String codingMappingOut;

	@SerializedName("xb_flag")
	@OpField(desc = "XB标志 0:不需要打印XB 1:需要打印XB", example = "0")
	private String xbFlag;

	@SerializedName("print_flag")
	@OpField(desc = "打印标志 返回值总共有9位,每位只 有0和1两种,0表示按丰密 面单默认的规则,1是显示, 顺序如下,如111110000 表示打印寄方姓名、寄方 电话、寄方公司名、寄方 地址和重量,收方姓名、收 方电话、收方公司和收方 地址按丰密面单默认规则 1:寄方姓名 2:寄方电话 3:寄方公司名 4:寄方地址 5:重量 6:收方姓名 7:收方电话 8:收方公司名 9:收方地址", example = "000000000")
	private String printFlag;

	@SerializedName("two_dimension_code")
	@OpField(desc = "二维码 根据规则生成字符串信息, 格式为MMM={k1:(目的 地中转场代码),k2:(目的 地原始网点代码),k3:(目 的地单元区域),k4:(附件 通过三维码(express_type_code、 limit_type_code、 cargo_type_code)映射时效类型),k5:(运单 号),k6:(AB标识),k7:( 校验码)} （ISV自身做逻辑展示）", example = "MMM={k1:010W,k2:010AS,k3:049,k4:T801,k5:SF1312146042644,k6:,k7:39acf4f}")
	private String twoDimensionCode;

	@SerializedName("pro_code")
	@OpField(desc = "时效类型: 值为二维码中的K4", example = "同城标快")
	private String proCode;

	@SerializedName("print_icon")
	@OpField(desc = "打印图标,根据托寄物判断需 要打印的图标(重货,蟹类,生鲜,易碎，Z标) 返回值有8位，每一位只有0和1两种， 0表示按运单默认的规则， 1表示显示。后面两位默认0备用。 顺序如下：重货,蟹类,生鲜,易碎,医药类,Z标,0,0 如：00000000表示不需要打印重货，蟹类，生鲜，易碎 ,医药,Z标,备用,备用", example = "000000000")
	private String printIcon;

	@SerializedName("ab_flag")
	@OpField(desc = "AB标", example = "123456")
	private String abFlag;

	@SerializedName("err_msg")
	@OpField(desc = "查询出现异常时返回信息。 返回代码: 0 系统异常 1 未找到面单", example = "1")
	private String errMsg;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setSourceTransferCode(String sourceTransferCode){
		this.sourceTransferCode = sourceTransferCode;
	}

	
	public String getSourceTransferCode(){
		return this.sourceTransferCode;
	}

	
	public void setSourceCityCode(String sourceCityCode){
		this.sourceCityCode = sourceCityCode;
	}

	
	public String getSourceCityCode(){
		return this.sourceCityCode;
	}

	
	public void setSourceDeptCode(String sourceDeptCode){
		this.sourceDeptCode = sourceDeptCode;
	}

	
	public String getSourceDeptCode(){
		return this.sourceDeptCode;
	}

	
	public void setSourceTeamCode(String sourceTeamCode){
		this.sourceTeamCode = sourceTeamCode;
	}

	
	public String getSourceTeamCode(){
		return this.sourceTeamCode;
	}

	
	public void setDestCityCode(String destCityCode){
		this.destCityCode = destCityCode;
	}

	
	public String getDestCityCode(){
		return this.destCityCode;
	}

	
	public void setDestDeptCode(String destDeptCode){
		this.destDeptCode = destDeptCode;
	}

	
	public String getDestDeptCode(){
		return this.destDeptCode;
	}

	
	public void setDestDeptCodeMapping(String destDeptCodeMapping){
		this.destDeptCodeMapping = destDeptCodeMapping;
	}

	
	public String getDestDeptCodeMapping(){
		return this.destDeptCodeMapping;
	}

	
	public void setDestTeamCode(String destTeamCode){
		this.destTeamCode = destTeamCode;
	}

	
	public String getDestTeamCode(){
		return this.destTeamCode;
	}

	
	public void setDestTeamCodeMapping(String destTeamCodeMapping){
		this.destTeamCodeMapping = destTeamCodeMapping;
	}

	
	public String getDestTeamCodeMapping(){
		return this.destTeamCodeMapping;
	}

	
	public void setDestTransferCode(String destTransferCode){
		this.destTransferCode = destTransferCode;
	}

	
	public String getDestTransferCode(){
		return this.destTransferCode;
	}

	
	public void setDestRouteLabel(String destRouteLabel){
		this.destRouteLabel = destRouteLabel;
	}

	
	public String getDestRouteLabel(){
		return this.destRouteLabel;
	}

	
	public void setProName(String proName){
		this.proName = proName;
	}

	
	public String getProName(){
		return this.proName;
	}

	
	public void setCargoTypeCode(String cargoTypeCode){
		this.cargoTypeCode = cargoTypeCode;
	}

	
	public String getCargoTypeCode(){
		return this.cargoTypeCode;
	}

	
	public void setLimitTypeCode(String limitTypeCode){
		this.limitTypeCode = limitTypeCode;
	}

	
	public String getLimitTypeCode(){
		return this.limitTypeCode;
	}

	
	public void setExpressTypeCode(String expressTypeCode){
		this.expressTypeCode = expressTypeCode;
	}

	
	public String getExpressTypeCode(){
		return this.expressTypeCode;
	}

	
	public void setCodingMapping(String codingMapping){
		this.codingMapping = codingMapping;
	}

	
	public String getCodingMapping(){
		return this.codingMapping;
	}

	
	public void setCodingMappingOut(String codingMappingOut){
		this.codingMappingOut = codingMappingOut;
	}

	
	public String getCodingMappingOut(){
		return this.codingMappingOut;
	}

	
	public void setXbFlag(String xbFlag){
		this.xbFlag = xbFlag;
	}

	
	public String getXbFlag(){
		return this.xbFlag;
	}

	
	public void setPrintFlag(String printFlag){
		this.printFlag = printFlag;
	}

	
	public String getPrintFlag(){
		return this.printFlag;
	}

	
	public void setTwoDimensionCode(String twoDimensionCode){
		this.twoDimensionCode = twoDimensionCode;
	}

	
	public String getTwoDimensionCode(){
		return this.twoDimensionCode;
	}

	
	public void setProCode(String proCode){
		this.proCode = proCode;
	}

	
	public String getProCode(){
		return this.proCode;
	}

	
	public void setPrintIcon(String printIcon){
		this.printIcon = printIcon;
	}

	
	public String getPrintIcon(){
		return this.printIcon;
	}

	
	public void setAbFlag(String abFlag){
		this.abFlag = abFlag;
	}

	
	public String getAbFlag(){
		return this.abFlag;
	}

	
	public void setErrMsg(String errMsg){
		this.errMsg = errMsg;
	}

	
	public String getErrMsg(){
		return this.errMsg;
	}

}