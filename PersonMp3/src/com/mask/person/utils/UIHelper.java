package com.mask.person.utils;

import com.mask.person.PageActiivty;

import android.content.Context;
import android.content.Intent;

public class UIHelper {
	
	public static void toPageActivity(Context context){
		
		Intent intent = new Intent(context,PageActiivty.class);
		context.startActivity(intent);
	}


}
