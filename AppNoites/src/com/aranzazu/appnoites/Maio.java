package com.aranzazu.appnoites;

import com.aranzazu.appnoites.R;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

public class Maio extends TabActivity {
	 @Override public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
	        this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
	       
	        setContentView(R.layout.meses);
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	        
	        TabHost tabhost = getTabHost();
	    	TabHost.TabSpec spec;
	    	Intent intent;
	    	Resources res =getResources();
	    	String dias[]=res.getStringArray(R.array.maio);
	    	int[] resIDs = new int[] {
	    			R.drawable.ve3l,
	    			R.drawable.sab4,
	                R.drawable.ve10,
	                R.drawable.sab11,
	                R.drawable.ven17,
	                R.drawable.sab18,
	               
	            };
	      	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, Dia.class);
	    		intent.putExtra("variable_integer", 4);
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);
		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	
		    	
	    	

	    }
}
