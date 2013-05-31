package com.example.helloworld;

import java.util.ArrayList;
import java.util.Collections;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;


public class MainActivity extends Activity {

	Button btn;
	EditText txt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn=(Button)findViewById(R.id.button1);
		txt=(EditText)findViewById(R.id.editText1);
		btn.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			
			public void onClick(View v) 
			{
				String s= txt.getText().toString();
				ArrayList<Character> cl= new ArrayList<Character>(s.length());
				for(char ch:s.toCharArray())
				{
					cl.add(ch);
				}
				Collections.shuffle(cl);
				char[] newch= new char[cl.size()];
				for(int i=0;i<newch.length;i++)
				{
					newch[i]=cl.get(i);
				}
				String jumbled=new String(newch);
				txt.setText(jumbled);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
