package com.kakarote.crm9.erp.oa.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOaExamineCategory<M extends BaseOaExamineCategory<M>> extends Model<M> implements IBean {

	public void setCategoryId(java.lang.Integer categoryId) {
		set("category_id", categoryId);
	}
	
	public java.lang.Integer getCategoryId() {
		return getInt("category_id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}
	
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setCreateUserId(java.lang.Long createUserId) {
		set("create_user_id", createUserId);
	}
	
	public java.lang.Long getCreateUserId() {
		return getLong("create_user_id");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setIsSys(java.lang.Integer isSys) {
		set("is_sys", isSys);
	}
	
	public java.lang.Integer getIsSys() {
		return getInt("is_sys");
	}

	public void setExamineType(java.lang.Integer examineType) {
		set("examine_type", examineType);
	}
	
	public java.lang.Integer getExamineType() {
		return getInt("examine_type");
	}

	public void setUserIds(java.lang.String userIds) {
		set("user_ids", userIds);
	}
	
	public java.lang.String getUserIds() {
		return getStr("user_ids");
	}

	public void setDeptIds(java.lang.String deptIds) {
		set("dept_ids", deptIds);
	}
	
	public java.lang.String getDeptIds() {
		return getStr("dept_ids");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setIsDeleted(java.lang.Integer isDeleted) {
		set("is_deleted", isDeleted);
	}
	
	public java.lang.Integer getIsDeleted() {
		return getInt("is_deleted");
	}

	public void setDeleteTime(java.util.Date deleteTime) {
		set("delete_time", deleteTime);
	}
	
	public java.util.Date getDeleteTime() {
		return get("delete_time");
	}

	public void setDeleteUserId(java.lang.Long deleteUserId) {
		set("delete_user_id", deleteUserId);
	}
	
	public java.lang.Long getDeleteUserId() {
		return getLong("delete_user_id");
	}

}
