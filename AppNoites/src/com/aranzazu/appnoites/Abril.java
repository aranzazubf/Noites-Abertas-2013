package com.aranzazu.appnoites;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

public class Abril extends TabActivity {
	 @Override public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
	        this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
	       
	        setContentView(R.layout.meses);
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	        TabHost tabhost = getTabHost();
	    	TabHost.TabSpec spec;
	    	Intent intent;
	    	Resources res =getResources();
	    	
	    	String dias[]=res.getStringArray(R.array.abril);
		    
	    	int[] resIDs = new int[] {
	    			R.drawable.ven5,
	    			R.drawable.sab6,
	                R.drawable.ven12,
	                R.drawable.sab13,
	                R.drawable.ven19,
	                R.drawable.sab20,
	                R.drawable.ve26,
	               R.drawable.sab27,
	             
	            };
	    	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, Dia.class);
	    		intent.putExtra("variable_integer", 3);
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);
		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	
}
}