package org.relax.sample.fbgraph;

import gueei.binding.Command;
import gueei.binding.observables.StringObservable;
import gueei.binding.v30.app.BindingActivityV30;
import android.os.Bundle;
import android.view.View;

public class FbGraphActivity extends BindingActivityV30 {
	
	public final StringObservable HelloWorld = 
			new StringObservable("Hello world from Android-Binding");
	
	public final Command SayGoodBye = 
			new Command(){
				@Override
                public void Invoke(View arg0, Object... arg1) {
					HelloWorld.set("Good bye :)");
                }
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.inflateAndBind(R.xml.fbgraphactivity_metadata, this);
    }
}
