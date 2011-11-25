package kku.android.kns;

import android.app.Activity;
import android.os.Bundle;

public class KNSActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void methd1() {
    	int a = 1;
    	a = 2;
        a = 3;
    }
    
    
    public void methd2() {
    	int i = 0;
    	i=1;
    	i=2;
    }
}
