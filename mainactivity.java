package com.example.test1;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
public class MainActivity extends Activity {
 public static final String TAG = "VideoPlayer";
 private VideoView mVideoView;
 private Uri mUri;
 private int mPositionWhenPaused = -1;
 private Button btn;
 private String[] sfile={"A","B","C","D"};

 private MediaController mMediaController;

 /* (non-Javadoc)
  * @see android.app.Activity#onCreate(android.os.Bundle)
  */
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  // TODO Auto-generated method stub
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  btn=(Button)findViewById(R.id.button1);
  
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,mylistview.class);
				Bundle b=new Bundle();
				b.putStringArray("file", sfile);
				i.putExtras(b);
				//startActivity(i);
				startActivityForResult(i,0);
				
			}
		});

 }

 @Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	// TODO Auto-generated method stub
	 int id;
	
	  id=data.getExtras().getInt("id");
	  //btn.setText(String.valueOf(id));
	 Toast.makeText(this, "index:"+String.valueOf(id)+"\nfile name:"+sfile[id], Toast.LENGTH_LONG).show();
	super.onActivityResult(requestCode, resultCode, data);
}



 

}