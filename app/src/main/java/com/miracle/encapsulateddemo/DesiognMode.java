package com.miracle.encapsulateddemo;

import android.util.Log;

/**
 * Created by miracle on 2017/7/27.
 */

public class DesiognMode {
	private String name;
	private int age;
	private String address;
	private double income;
	private String gender;

	private DesiognMode(Builder builder) {
		name = builder.name;
		age = builder.age;
		address = builder.address;
		income = builder.income;
		gender = builder.gender;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public double getIncome() {
		return income;
	}

	public String getGender() {
		return gender;
	}

	public void introduceSelf() {
		Log.e("buildMode", "introduceSelf: " + name + age + address + income + gender);
	}

	public static class Builder {
		private final String name;
		private final int age;
		private String address;
		private double income;
		private String gender;

		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder income(double income) {
			this.income = income;
			return this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public DesiognMode create() {
			return new DesiognMode(this);
		}
	}
}
