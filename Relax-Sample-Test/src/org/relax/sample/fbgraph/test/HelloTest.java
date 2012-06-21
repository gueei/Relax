package org.relax.sample.fbgraph.test;

import junit.framework.Assert;

import org.relax.Relax;
import org.relax.sample.fbgraph.FbGraphActivity;

import android.test.ActivityInstrumentationTestCase2;

public class HelloTest extends ActivityInstrumentationTestCase2<org.relax.sample.fbgraph.FbGraphActivity> {

	public HelloTest() {
	    super("org.relax.sample.fbgraph", FbGraphActivity.class);
    }

	public void testCommand(){
		Relax.getInstance(getActivity());
		Assert.assertEquals(true, true);
	}
}
