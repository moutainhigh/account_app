package com.egfbank.account.pojo;

import java.math.BigDecimal;
import java.util.Date;


public class EgfAccountFreeze {

	 private String freezeId;

	 private String accountNo;

	 private String freezeType;

	 private BigDecimal freezeAmount;

	 private BigDecimal systemAmount;

	 private Date createTime;

	 private Date updateTime;

		public void setFreezeId (String freezeId) {
			this.freezeId = freezeId;
		}

		public String getFreezeId () {
			return freezeId;
		}

		public void setAccountNo (String accountNo) {
			this.accountNo = accountNo;
		}

		public String getAccountNo () {
			return accountNo;
		}

		public void setFreezeType (String freezeType) {
			this.freezeType = freezeType;
		}

		public String getFreezeType () {
			return freezeType;
		}

		public void setFreezeAmount (BigDecimal freezeAmount) {
			this.freezeAmount = freezeAmount;
		}

		public BigDecimal getFreezeAmount () {
			return freezeAmount;
		}

		public void setSystemAmount (BigDecimal systemAmount) {
			this.systemAmount = systemAmount;
		}

		public BigDecimal getSystemAmount () {
			return systemAmount;
		}

		public void setCreateTime (Date createTime) {
			this.createTime = createTime;
		}

		public Date getCreateTime () {
			return createTime;
		}

		public void setUpdateTime (Date updateTime) {
			this.updateTime = updateTime;
		}

		public Date getUpdateTime () {
			return updateTime;
		}

}
