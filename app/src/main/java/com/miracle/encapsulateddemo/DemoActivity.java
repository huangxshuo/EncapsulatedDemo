package com.miracle.encapsulateddemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class DemoActivity extends Activity {
	private TextView tv_1;
	private RecyclerView recycler_view;
	private List<String> mDatas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo);
		tv_1 = (TextView) findViewById(R.id.tv_1);
		setColorfulText();

		TextView tv_combine = (TextView) findViewById(R.id.tv_combine);
		String format = String.format("¥%1$s   门市价: ¥%2$s", 18.8, 22);
		int i = format.lastIndexOf("门");
		SpannableStringBuilder spanna = new SpannableStringBuilder(format);
		spanna.setSpan(new AbsoluteSizeSpan(dipToPx(this, 14)), 0, 1, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
		spanna.setSpan(new ForegroundColorSpan(Color.parseColor("#afafaf")), i, format.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
		spanna.setSpan(new AbsoluteSizeSpan(dipToPx(this, 14)), i, format.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
		tv_combine.setText(spanna);

		//setRecycleView();
		TextView tv_version = (TextView) findViewById(R.id.tv_version);
		tv_version.setText(BuildConfig.VERSION_NAME);

	}

	private void setRecycleView() {
		initData();
		recycler_view = (RecyclerView) findViewById(R.id.recycle_view);
		//recycler_view.setLayoutManager(new LinearLayoutManager(this));
		//recycler_view.setLayoutManager(new GridLayoutManager(this, 4));
		recycler_view.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.HORIZONTAL));
		recycler_view.setAdapter(new HomeAdapter());
		//recycler_view.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
		recycler_view.addItemDecoration(new DividerGridItemDecoration(this));
	}

	protected void initData()
	{
		mDatas = new ArrayList<String>();
		for (int i = 'A'; i < 'z'; i++)
		{
			mDatas.add("" + (char) i);
		}
	}


	public int dipToPx(Context context, int dip) {
		return (int) (dip * getScreenDensity(context) + 0.5f);
	}

	public float getScreenDensity(Context context) {
		try {
			DisplayMetrics dm = new DisplayMetrics();
			((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay()
					.getMetrics(dm);
			return dm.density;
		} catch (Exception e) {
			return DisplayMetrics.DENSITY_DEFAULT;
		}
	}

	private void setColorfulText() {
		String color = "#ffff00";
		CharSequence cs = Html.fromHtml("<font color='blue'>送一顶  </font><FONT COLOR='green' SIZE='50'>原谅帽</FONT>给你");

		//tv_1.setText(Html.fromHtml("<font color='' size='20'>" + "jack" + "</font>" + "是傻逼"));
		tv_1.setText(cs);


	}

	class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>
	{

		@Override
		public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
		{
			MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
					DemoActivity.this).inflate(R.layout.item_home, parent,
					false));
			return holder;
		}

		@Override
		public void onBindViewHolder(MyViewHolder holder, int position)
		{
			holder.tv.setText(mDatas.get(position));
		}

		@Override
		public int getItemCount()
		{
			return mDatas.size();
		}

		class MyViewHolder extends RecyclerView.ViewHolder
		{

			TextView tv;

			public MyViewHolder(View view)
			{
				super(view);
				tv = (TextView) view.findViewById(R.id.id_num);
			}
		}
	}

}
