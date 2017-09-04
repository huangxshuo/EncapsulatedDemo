package com.miracle.encapsulateddemo.bean;

import com.miracle.encapsulateddemo.R;

/**
 * Created by miracle on 2017/8/26.
 */

public class Bank {
	private String bankName;
	private int type;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	private static int[] res = {R.drawable.guangfa, R.drawable.nongye, R.drawable.zhongguo};
	public int getDrawableRes() {
		return res[type];
	}
}
