package com.mask.person.utils;

import com.mask.person.PageActiivty;

import android.content.Context;
import android.content.Intent;

/**
 * ������ת������
 * @author zhaungAH
 *
 */
public class UIHelper {
	
	/**
	 * ��ת������ҳ
	 * @param context
	 */
	public static void toPageActivity(Context context){
		
		Intent intent = new Intent(context,PageActiivty.class);
		context.startActivity(intent);
	}


}
