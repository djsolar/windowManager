package hq.memFloat.main;

import hq.memFloat.R;
import hq.memFloat.service.FloatService;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CopyOfmemFloat extends Activity {
	Button btnstart;
	 Button btnstop;
	 TextView tv;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        
        btnstart = (Button) findViewById(R.id.btnstart);
        btnstart.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent service = new Intent();
        		service.setClass(CopyOfmemFloat.this, FloatService.class);		
        		startService(service);
            }
        });
        
        tv= (TextView) findViewById(R.id.tv);
        
        tv.setText("3333333333333333"); 
        
        
        Intent service = new Intent();
		service.setClass(CopyOfmemFloat.this, FloatService.class);		
		startService(service);
    }
    @Override
    protected void onStop(){
     super.onStop();
     Log.v("stop","stop");
     //createView();
    }
    @Override
    protected void onRestart(){
     super.onRestart();
     Log.v("restart","restart");
     
    }
  
}