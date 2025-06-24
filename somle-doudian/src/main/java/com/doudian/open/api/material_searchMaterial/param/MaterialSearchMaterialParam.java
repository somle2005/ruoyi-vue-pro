package com.doudian.open.api.material_searchMaterial.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialSearchMaterialParam {


	@SerializedName("material_id")
	@OpField(required = false , desc = "素材id", example= "7000291764753940780")
	private String materialId;

	@SerializedName("material_name")
	@OpField(required = false , desc = "文件名称，支持模糊匹配", example= "模糊匹配")
	private String materialName;

	@SerializedName("material_type")
	@OpField(required = false , desc = "素材类型，空-不限 photo-图片 video-视频", example= "photo")
	private List<String> materialType;

	@SerializedName("operate_status")
	@OpField(required = false , desc = "素材状态，0-待下载 1-有效 4-回收站中", example= "[0,1,4]")
	private List<Integer> operateStatus;

	@SerializedName("audit_status")
	@OpField(required = false , desc = "审核状态，1-待审核 2-审核中 3-通过 4-拒绝", example= "[1,2,3,4]")
	private List<Integer> auditStatus;

	@SerializedName("create_time_start")
	@OpField(required = false , desc = "搜索创建开始时间，格式：yyyy-MM-dd HH:mm:ss", example= "2012-08-12 12:00:12")
	private String createTimeStart;

	@SerializedName("create_time_end")
	@OpField(required = false , desc = "搜索创建结束时间，格式：yyyy-MM-dd HH:mm:ss", example= "2022-11-12 12:00:12")
	private String createTimeEnd;

	@SerializedName("folder_id")
	@OpField(required = false , desc = "文件夹id，0--素材中心 -1--回收站", example= "6999834643465781548")
	private String folderId;

	@SerializedName("material_id_list")
	@OpField(required = false , desc = "素材id列表", example= "[7000291764753940780,7000291764753940780]")
	private List<String> materialIdList;

	@SerializedName("page_num")
	@OpField(required = false , desc = "第几页，1，2，……，默认值：1", example= "1")
	private Integer pageNum;

	@SerializedName("page_size")
	@OpField(required = false , desc = "页大小，1，2，……，100，默认值：50", example= "20")
	private Integer pageSize;

	@SerializedName("order_type")
	@OpField(required = false , desc = "排序方式，0-按照创建时间倒序 1-按照创建时间升序 6-按照素材大小降序 7-按照素材大小升序", example= "1")
	private Integer orderType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialId(String materialId){
		this.materialId = materialId;
	}

	
	public String getMaterialId(){
		return this.materialId;
	}

	
	public void setMaterialName(String materialName){
		this.materialName = materialName;
	}

	
	public String getMaterialName(){
		return this.materialName;
	}

	
	public void setMaterialType(List<String> materialType){
		this.materialType = materialType;
	}

	
	public List<String> getMaterialType(){
		return this.materialType;
	}

	
	public void setOperateStatus(List<Integer> operateStatus){
		this.operateStatus = operateStatus;
	}

	
	public List<Integer> getOperateStatus(){
		return this.operateStatus;
	}

	
	public void setAuditStatus(List<Integer> auditStatus){
		this.auditStatus = auditStatus;
	}

	
	public List<Integer> getAuditStatus(){
		return this.auditStatus;
	}

	
	public void setCreateTimeStart(String createTimeStart){
		this.createTimeStart = createTimeStart;
	}

	
	public String getCreateTimeStart(){
		return this.createTimeStart;
	}

	
	public void setCreateTimeEnd(String createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	
	public String getCreateTimeEnd(){
		return this.createTimeEnd;
	}

	
	public void setFolderId(String folderId){
		this.folderId = folderId;
	}

	
	public String getFolderId(){
		return this.folderId;
	}

	
	public void setMaterialIdList(List<String> materialIdList){
		this.materialIdList = materialIdList;
	}

	
	public List<String> getMaterialIdList(){
		return this.materialIdList;
	}

	
	public void setPageNum(Integer pageNum){
		this.pageNum = pageNum;
	}

	
	public Integer getPageNum(){
		return this.pageNum;
	}

	
	public void setPageSize(Integer pageSize){
		this.pageSize = pageSize;
	}

	
	public Integer getPageSize(){
		return this.pageSize;
	}

	
	public void setOrderType(Integer orderType){
		this.orderType = orderType;
	}

	
	public Integer getOrderType(){
		return this.orderType;
	}

}