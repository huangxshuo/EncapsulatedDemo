package com.miracle.encapsulateddemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.miracle.encapsulateddemo.bean.Bank;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.zackratos.ultimatebar.UltimateBar;

import java.io.IOException;

public class MainActivity extends Activity implements View.OnClickListener {

	private Button btn_get;
	private Button btn_post;
	private static final String TAG = "MainActivity";
	private Button button;
	private MainActivity.demo demo;
	private static final int i = 827;
	private TextView tv_1;
	private TextView tv_2;
	private TextView tv_3;
	//private CardItemBinding mBinding;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//mBinding = DataBindingUtil.setContentView(this, R.layout.card_item);
		//mBinding.setClicker(this);
		UltimateBar ultimateBar = new UltimateBar(this);
		//ultimateBar.setColorBar(ContextCompat.getColor(this, R.color.colorAccent));
		ultimateBar.setTransparentBar(Color.BLUE, 50);
		setContentView(R.layout.activity_demo);
		tv_1 = (TextView) findViewById(R.id.tv_1);

		setColorfulText();

	}

	private void setColorfulText() {
		String color = "#FF0000";
		CharSequence cs = Html.fromHtml("<FONT COLOR='" + color + "'>" + "大傻逼" + "</FONT>");

		//tv_1.setText(Html.fromHtml("<font color='' size='20'>" + "jack" + "</font>" + "是傻逼"));
		tv_1.setText(cs);


	}



	private void getDesignModeIns() {

		DesiognMode.Builder builder = new DesiognMode.Builder("dick", 99);
		builder.address("westlack area")
				.gender("male")
				.income(18000)
				.create()
				.introduceSelf();
	}

	private void initView() {
		btn_get = (Button) findViewById(R.id.btn_get);
		btn_post = (Button) findViewById(R.id.btn_post);
		btn_get.setOnClickListener(this);
		btn_post.setOnClickListener(this);

	}

	class demo {
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {

			case R.id.btn_get:
				OkHttpClient mOkhttpClient = new OkHttpClient();
				Request request = new Request.Builder().url("www.baidu.com").build();
				Call call = mOkhttpClient.newCall(request);
				call.enqueue(new Callback() {
					@Override
					public void onFailure(Request request, IOException e) {

					}

					@Override
					public void onResponse(Response response) throws IOException {
						String responseStr = response.body().string();
					}
				});
				break;
			case R.id.btn:
				Bank bank = new Bank();
				bank.setBankName("中国银行");
				bank.setType(2);
				//mBinding.setBank(bank);
				break;
			case R.id.btn_1:
				Bank bank_1 = new Bank();
				bank_1.setBankName("农业银行");
				bank_1.setType(1);
				//mBinding.setBank(bank_1);
				break;
			case R.id.btn_2:
				Bank bank_2 = new Bank();
				bank_2.setBankName("广发银行");
				bank_2.setType(0);
				//mBinding.setBank(bank_2);
				break;

		}

	}
}
