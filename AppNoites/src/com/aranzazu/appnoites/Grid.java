package com.aranzazu.appnoites;
import com.aranzazu.appnoites.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class Grid extends Activity{

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
    getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
    setContentView(R.layout.grid);

    Intent returnIntent = new Intent();
    returnIntent.putExtra("result",1);
    setResult(RESULT_OK,returnIntent);     
    
}
}