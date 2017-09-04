package com.miracle.encapsulateddemo;

import android.text.Html;
import android.text.Spanned;

/**
 * Created by miracle on 2017/8/14.
 */

public class ParseDemo {
	public static void main(String[] args) {
		String json = "\"dueBeanList\":[{\"annualizedExpectedPercent\":\"16.00%\",\"daysRemaining\":\"10\",\"daysTotal\":\"14\",\"dueAmount\":\"¥500.00\",\"dueDate\":\"2017-08-10\",\"interestDesc\":\"=预期利息3.07+奖励0\",\"interestExpected\":\"3.07\",\"interestReceived\":\"0\",\"interestTotal\":\"3.07\",\"investAmount\":\"503.07\",\"investBeginTime\":\"2017-08-10\",\"investEndTime\":\"2017-08-24\",\"investStatus\":\"投资中\",\"reward\":\"0\",\"status\":0,\"statusDesc\":\"购买成功\"},{\"dueAmount\":\"\",\"dueDate\":\"收益中\",\"status\":1,\"statusDesc\":\"\"},{\"dueAmount\":\"¥503.07\",\"dueDate\":\"2017-08-24\",\"status\":0,\"statusDesc\":\"已到期，本日计息\"}],\"durationDesc\":\"项目期限\",\"fromWallet\":0,\"fromWalletTip\":\"申购资金来自个人账户，本息只能还款至个人账户\",\"id\":2,\"interestReceived\":\"0\",\"interestTotal\":\"500.00\",\"investBeginTime\":\"2017-08-10\",\"investDetailId\":57528,\"investStatus\":\"投资中\",\"moneyStatus\":\"资金状态(回款到个人账户)\",\"projectDuration\":\"14天\",\"projectEndTime\":\"2017-08-24到期\",\"projectId\":1,\"projectInterest\":\"16.00%\",\"projectInterestDesc\":\"年化收益\",\"projectTitle\":\"茂茂-供应链第1期\",\"statusNew\":1,\"toWallet\":1,\"toWalletRedenvelope\":\"0\",\"toWalletUISwitch\":0}\n";

		String string = "\"dueBeanList\":[{\"dueDate\":\"2017-08-06\",\"statusDesc\":\"购买成功\",\"dueAmount\":\"¥500.00\",\"status\":0,\"investBeginTime\":\"2017-08-06\",\"investStatus\":\"投资中\",\"daysRemaining\":\"16\",\"daysTotal\":\"25\",\"interestReceived\":\"0\",\"interestTotal\":\"3.42\",\"interestExpected\":\"3.42\",\"reward\":\"0\",\"investAmount\":\"503.42\",\"annualizedExpectedPercent\":\"10.00%\",\"investEndTime\":\"2017-08-31\",\"interestDesc\":\"=预期利息3.42+奖励0\"},{\"dueDate\":\"收益中\",\"statusDesc\":\"\",\"dueAmount\":\"\",\"status\":1,\"investBeginTime\":null,\"investStatus\":null,\"daysRemaining\":null,\"daysTotal\":null,\"interestReceived\":null,\"interestTotal\":null,\"interestExpected\":null,\"reward\":null,\"investAmount\":null,\"annualizedExpectedPercent\":null,\"investEndTime\":null,\"interestDesc\":null},{\"dueDate\":\"2017-08-31\",\"statusDesc\":\"已到期，本日计息\",\"dueAmount\":\"¥503.42\",\"status\":0,\"investBeginTime\":null,\"investStatus\":null,\"daysRemaining\":null,\"daysTotal\":null,\"interestReceived\":null,\"interestTotal\":null,\"interestExpected\":null,\"reward\":null,\"investAmount\":null,\"annualizedExpectedPercent\":null,\"investEndTime\":null,\"interestDesc\":null}],\"fromWallet\":0,\"fromWalletTip\":\"申购资金来自个人账户，本息只能还款至钱包\",\"statusNew\":1,\"toWalletUISwitch\":0,\"toWalletRedenvelope\":\"0\",\"sCoupon\":null,\"durationDesc\":\"项目期限\",\"projectInterestDesc\":\"年化收益\",\"investBeginTime\":\"2017-08-06\",\"investStatus\":\"投资中\",\"daysRemaining\":\"16\",\"daysTotal\":\"25\",\"interestReceived\":\"0\",\"interestTotal\":\"500.00\",\"investAmount\":null},\"errorType\":null,\"errorMsg\":\"正常\",\"success\":true}\n";

		String result = "{\"id\":57607,\"projectId\":1967,\"investDetailId\":57557,\"toWallet\":1,\"projectTitle\":\"企鹅第21期\",\"projectEndTime\":\"2017-08-31到期\",\"projectDuration\":\"25天\",\"projectInterest\":\"10.00%\",\"moneyStatus\":\"资金状态(回款到个人账户)\",\"cardNo\":\"6214242710498509\",\"bankCode\":\"CCB\",\"dueBeanList\":[{\"dueDate\":\"2017-08-06\",\"statusDesc\":\"购买成功\",\"dueAmount\":\"¥500.00\",\"status\":0,\"investBeginTime\":\"2017-08-06\",\"investStatus\":\"投资中\",\"daysRemaining\":\"16\",\"daysTotal\":\"25\",\"interestReceived\":\"0\",\"interestTotal\":\"3.42\",\"interestExpected\":\"3.42\",\"reward\":\"0\",\"investAmount\":\"503.42\",\"annualizedExpectedPercent\":\"10.00%\",\"investEndTime\":\"2017-08-31\",\"interestDesc\":\"=预期利息3.42+奖励0\"},{\"dueDate\":\"收益中\",\"statusDesc\":\"\",\"dueAmount\":\"\",\"status\":1,\"investBeginTime\":null,\"investStatus\":null,\"daysRemaining\":null,\"daysTotal\":null,\"interestReceived\":null,\"interestTotal\":null,\"interestExpected\":null,\"reward\":null,\"investAmount\":null,\"annualizedExpectedPercent\":null,\"investEndTime\":null,\"interestDesc\":null},{\"dueDate\":\"2017-08-31\",\"statusDesc\":\"已到期，本日计息\",\"dueAmount\":\"¥503.42\",\"status\":0,\"investBeginTime\":null,\"investStatus\":null,\"daysRemaining\":null,\"daysTotal\":null,\"interestReceived\":null,\"interestTotal\":null,\"interestExpected\":null,\"reward\":null,\"investAmount\":null,\"annualizedExpectedPercent\":null,\"investEndTime\":null,\"interestDesc\":null}],\"fromWallet\":0,\"fromWalletTip\":\"申购资金来自个人账户，本息只能还款至钱包\",\"statusNew\":1,\"toWalletUISwitch\":0,\"toWalletRedenvelope\":\"0\",\"sCoupon\":null,\"durationDesc\":\"项目期限\",\"projectInterestDesc\":\"年化收益\",\"investBeginTime\":\"2017-08-06\",\"investStatus\":\"投资中\",\"daysRemaining\":\"16\",\"daysTotal\":\"25\",\"interestReceived\":\"0\",\"interestTotal\":\"500.00\",\"investAmount\":null},\"errorType\":null,\"errorMsg\":\"正常\",\"success\":true}\n";

		String debug_result = "{\"code\":\"0\",\"result\":{\"id\":57572,\"projectId\":1947,\"investDetailId\":57522,\"toWallet\":1,\"projectTitle\":\"茂茂01第2期\",\"projectEndTime\":\"2017-08-31到期\",\"projectDuration\":\"27天\",\"projectInterest\":\"16.00%\",\"moneyStatus\":\"资金状态(回款到个人账户)\",\"cardNo\":\"6214242710498509\",\"bankCode\":\"CCB\",\"dueBeanList\":[{\"dueDate\":\"2017-08-04\",\"statusDesc\":\"购买成功\",\"dueAmount\":\"¥5000.00\",\"status\":0,\"investBeginTime\":\"2017-08-04\",\"investStatus\":\"投资中\",\"daysRemaining\":\"16\",\"daysTotal\":\"27\",\"interestReceived\":\"0\",\"interestTotal\":\"59.18\",\"interestExpected\":\"59.18\",\"reward\":\"0\",\"investAmount\":\"5059.18\",\"annualizedExpectedPercent\":\"16.00%\",\"investEndTime\":\"2017-08-31\",\"interestDesc\":\"=预期利息59.18+奖励0\"},{\"dueDate\":\"收益中\",\"statusDesc\":\"\",\"dueAmount\":\"\",\"status\":1,\"investBeginTime\":null,\"investStatus\":null,\"daysRemaining\":null,\"daysTotal\":null,\"interestReceived\":null,\"interestTotal\":null,\"interestExpected\":null,\"reward\":null,\"investAmount\":null,\"annualizedExpectedPercent\":null,\"investEndTime\":null,\"interestDesc\":null},{\"dueDate\":\"2017-08-31\",\"statusDesc\":\"已到期，本日计息\",\"dueAmount\":\"¥5059.18\",\"status\":0,\"investBeginTime\":null,\"investStatus\":null,\"daysRemaining\":null,\"daysTotal\":null,\"interestReceived\":null,\"interestTotal\":null,\"interestExpected\":null,\"reward\":null,\"investAmount\":null,\"annualizedExpectedPercent\":null,\"investEndTime\":null,\"interestDesc\":null}],\"fromWallet\":0,\"fromWalletTip\":\"申购资金来自个人账户，本息只能还款至钱包\",\"statusNew\":1,\"toWalletUISwitch\":0,\"toWalletRedenvelope\":\"0\",\"sCoupon\":null,\"durationDesc\":\"项目期限\",\"projectInterestDesc\":\"年化收益\",\"investBeginTime\":\"2017-08-04\",\"investStatus\":\"投资中\",\"daysRemaining\":\"16\",\"daysTotal\":\"27\",\"interestReceived\":\"0\",\"interestTotal\":\"5000.00\",\"investAmount\":null},\"errorType\":null,\"errorMsg\":\"正常\",\"success\":true}\n";

		//System.out.print(getProguardName("姚明"));

		System.out.print(format());
	}

	private static String getProguardName(String name) {
		if (name == null || name.length() == 0) {
			return "";
		}
		String nameStr = name;
		switch (nameStr.length()) {
			case 1:
				return "*";
			case 2:
				return name.substring(0, 1) + "*";
			default:
				String star = "";
				for (int i = 0; i < nameStr.length() - 2; i++) {
					star += "*";
				}
				return nameStr.substring(0, 1) + star + nameStr.substring(nameStr.length() - 1, nameStr.length());
		}
	}

	private static String formatText() {
		String format = format();
		Spanned result = Html.fromHtml(format);
		return result.toString();
	}

	private static String format() {

		return String.format(100 + "+" + "<FONT COLOR='#EC1316'>" + 10 + "</FONT>" + "元");
	}
}
