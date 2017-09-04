/**
 * Copyright (C) 2014 Luki(liulongke@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.miracle.encapsulateddemo;


import java.io.Serializable;
import java.util.List;

/**
 * @author Luki
 */
public class InvestDetailBean implements Serializable{

	public String bankCode;
	public String cardNo;
	public int fromWallet;
	public String fromWalletTip;
	public int id;
	public int investDetailId;
	public String moneyStatus;
	public String projectDuration;
	public String projectEndTime;
	public long projectId;
	public String projectInterest;
	public String projectTitle;
	public SCouponBean sCoupon;
	public int statusNew;
	public int toWallet;
	public String toWalletRedenvelope;
	public int toWalletUISwitch;
	public String projectInterestDesc;
	public String durationDesc;
	public List<DueBean> dueBeanList;
	private static final long serialVersionUID = -3267442809359273787L;



	public static class SCouponBean {
		public int ableNumber;
		public long addTime;
		public int addUserId;
		public int amount;
		public int amountLowerLimit;
		public int amountUpperLimit;
		public String brief;
		public int dayLowerLimit;
		public int dayUpperLimit;
		public String desc;
		public long endTime;
		public int expire;
		public int id;
		public int isDeleted;
		public int maxAcquire;
		public long modifyTime;
		public int modifyUserId;
		public int number;
		public double rate;
		public int stage;
		public long startTime;
		public String tag;
		public String title;
		public int type;

	}

	public static class DueBean {

		public String dueAmount;
		public String dueDate;
		public int status;
		public String statusDesc;
		//public int gray;

		//起投日
		public String investBeginTime;
		//投资状态 （投资中）
		public String investStatus;
		//投资剩余天数（天）
		public String daysRemaining;
		//投资计息天数（天）
		public String daysTotal;
		//已收利息（元）
		public String interestReceived;
		//预期总收益(元)
		public String interestTotal;
		//预期利息（元）
		public String interestExpected;
		//奖励（元）
		public String reward;
		//投资金额
		public String investAmount;
		//预期年化
		public String annualizedExpectedPercent;
		//结算日
		public String investEndTime;
		//收益描述
		public String interestDesc;

		@Override
		public String toString() {
			return "DueBean{" +
					"dueAmount='" + dueAmount + '\'' +
					", dueDate='" + dueDate + '\'' +
					", status=" + status +
					", statusDesc='" + statusDesc + '\'' +
					", investBeginTime='" + investBeginTime + '\'' +
					", investStatus='" + investStatus + '\'' +
					", daysRemaining='" + daysRemaining + '\'' +
					", daysTotal='" + daysTotal + '\'' +
					", interestReceived='" + interestReceived + '\'' +
					", interestTotal='" + interestTotal + '\'' +
					", interestExpected='" + interestExpected + '\'' +
					", reward='" + reward + '\'' +
					", investAmount='" + investAmount + '\'' +
					", annualizedExpectedPercent='" + annualizedExpectedPercent + '\'' +
					", investEndTime='" + investEndTime + '\'' +
					", interestDesc='" + interestDesc + '\'' +
					'}';
		}
	}

	public String getStatusByInt() {

		if (statusNew == 2) {
			return "已还款";
		} else if (statusNew == 3) {
			return "还款中";
		}else if (statusNew == 1) {
			return "投资中";
		}
		return "";
	}

	//收益来源
	/*public String interestSource() {
		return " = 预期利息" + interestExpected + "+ 使用奖励" + reward;
	}*/

	//汇款路径  目前只回款到账户
	public String returnWay() {
		/*if (toWalletUISwitch == 1) {
			return "到期回款到账户余额";
		}else if (toWalletUISwitch == 0) {
			return "到期回款到银行卡";
		}*/
		return "到期回款到个人账户";
	}

	@Override
	public String toString() {
		return "InvestDetailBean{" +
				"bankCode='" + bankCode + '\'' +
				", cardNo='" + cardNo + '\'' +
				", fromWallet=" + fromWallet +
				", fromWalletTip='" + fromWalletTip + '\'' +
				", id=" + id +
				", investDetailId=" + investDetailId +
				", moneyStatus='" + moneyStatus + '\'' +
				", projectDuration='" + projectDuration + '\'' +
				", projectEndTime='" + projectEndTime + '\'' +
				", projectId=" + projectId +
				", projectInterest='" + projectInterest + '\'' +
				", projectTitle='" + projectTitle + '\'' +
				", sCoupon=" + sCoupon +
				", statusNew=" + statusNew +
				", toWallet=" + toWallet +
				", toWalletRedenvelope='" + toWalletRedenvelope + '\'' +
				", toWalletUISwitch=" + toWalletUISwitch +
				", projectInterestDesc='" + projectInterestDesc + '\'' +
				", durationDesc='" + durationDesc + '\'' +
				", dueBeanList=" + dueBeanList +
				'}';
	}
}
