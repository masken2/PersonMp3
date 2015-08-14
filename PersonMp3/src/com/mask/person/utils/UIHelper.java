package com.mask.person.utils;

import com.mask.person.PageActiivty;

import android.content.Context;
import android.content.Intent;

/**
 * 界面跳转帮助类
 * @author zhaungAH
 *
 */
public class UIHelper {
	
	/**
	 * 跳转到引导页
	 * @param context
	 */
	public static void toPageActivity(Context context){
		
		Intent intent = new Intent(context,PageActiivty.class);
		context.startActivity(intent);
	}


}
