package com.mask.person;

import com.mask.person.base.BaseActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class PageActiivty extends BaseActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fragmer_page);
	}
}
