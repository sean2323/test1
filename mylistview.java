package com.example.test1;

import java.io.File;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class mylistview extends ListActivity{

	private String[] s;
	ArrayAdapter<String> adapter;
	
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		//Toast.makeText(this, String.valueOf(position), Toast.LENGTH_LONG).show();
		Intent i=getIntent();
		i.putExtra("id", position);
		
		this.setResult(0,i);
		
		super.onListItemClick(l, v, position, id);
		this.finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Intent i=this.getIntent();
		 s=i.getExtras().getStringArray("file");
		
		
		//設定此Activity使用的res layout
        //setContentView(R.layout.main2);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);
        setListAdapter(adapter);
        //filldata();
	}


	
	
}
