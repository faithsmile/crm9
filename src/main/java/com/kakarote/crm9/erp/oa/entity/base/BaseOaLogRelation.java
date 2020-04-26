package com.kakarote.crm9.erp.oa.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOaLogRelation<M extends BaseOaLogRelation<M>> extends Model<M> implements IBean {

	public void setRId(java.lang.Integer rId) {
		set("r_id", rId);
	}
	
	public java.lang.Integer getRId() {
		return getInt("r_id");
	}

	public void setLogId(java.lang.Integer logId) {
		set("log_id", logId);
	}
	
	public java.lang.Integer getLogId() {
		return getInt("log_id");
	}

	public void setCustomerIds(java.lang.String customerIds) {
		set("customer_ids", customerIds);
	}
	
	public java.lang.String getCustomerIds() {
		return getStr("customer_ids");
	}

	public void setContactsIds(java.lang.String contactsIds) {
		set("contacts_ids", contactsIds);
	}
	
	public java.lang.String getContactsIds() {
		return getStr("contacts_ids");
	}

	public void setBusinessIds(java.lang.String businessIds) {
		set("business_ids", businessIds);
	}
	
	public java.lang.String getBusinessIds() {
		return getStr("business_ids");
	}

	public void setContractIds(java.lang.String contractIds) {
		set("contract_ids", contractIds);
	}
	
	public java.lang.String getContractIds() {
		return getStr("contract_ids");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
