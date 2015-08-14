package com.mask.person;

import com.mask.person.base.BaseActivity;
import com.mask.person.utils.UIHelper;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/**
 * ∆Ù∂ØΩÁ√Ê
 * @author zhuangAh
 *
 */
public class SplachActivity extends BaseActivity {

	private Handler handler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splach);

		handler.postDelayed(runnable, 2000);
	}

	Runnable runnable = new Runnable() {

		@Override
		public void run() {

			UIHelper.toPageActivity(SplachActivity.this);
		}
	};

	protected void onDestroy() {
		handler.removeCallbacks(runnable);
	};
}
