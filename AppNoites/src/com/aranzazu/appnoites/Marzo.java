package com.aranzazu.appnoites;
import com.aranzazu.appnoites.R;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

public class Marzo extends TabActivity {
	
	 @Override public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
	        this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
	     
	        setContentView(R.layout.meses);
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	        TabHost tabhost = getTabHost();
	    	TabHost.TabSpec spec;
	    	Intent intent;
	    			
	    	Resources res =getResources(); 			
	    	String dias[]=res.getStringArray(R.array.marzo);
	    	int[] resIDs = new int[] {
	    			R.drawable.ve1,
	    			R.drawable.sab02,
	                R.drawable.ve8,
	                R.drawable.sab09,
	                R.drawable.ve15,
	                R.drawable.sab16,
	                R.drawable.ve22,
	                R.drawable.sab23,
	               R.drawable.xov28,
	               R.drawable.ve29,
	               R.drawable.sab30
	            };
	    	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, Dia.class);
	    		intent.putExtra("variable_integer", 2);
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);
		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	

}
}