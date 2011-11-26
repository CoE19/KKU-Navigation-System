package kku.android.kns;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class KNSActivity extends Activity {
	    /** Called when the activity is first created. */
	    private EditText ed1;
	    private Button bt1;
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	     	ed1 = (EditText) findViewById(R.id.editText1);
			bt1 = (Button) findViewById(R.id.button1);
			bt1.setOnClickListener(new Button.OnClickListener() {
				public void onClick(View v) {
					String address = ed1.getText().toString();
					Intent i = new Intent(KNSActivity.this, Map.class);   
					i.putExtra("address", address);
					startActivity(i);
				}
			});
	    }
	}