package com.kakarote.crm9.erp.work.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWorkTaskClass<M extends BaseWorkTaskClass<M>> extends Model<M> implements IBean {

	public void setClassId(java.lang.Integer classId) {
		set("class_id", classId);
	}
	
	public java.lang.Integer getClassId() {
		return getInt("class_id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
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

	public void setWorkId(java.lang.Integer workId) {
		set("work_id", workId);
	}
	
	public java.lang.Integer getWorkId() {
		return getInt("work_id");
	}

	public void setOrderNum(java.lang.Integer orderNum) {
		set("order_num", orderNum);
	}
	
	public java.lang.Integer getOrderNum() {
		return getInt("order_num");
	}

}
