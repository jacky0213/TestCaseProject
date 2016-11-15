package com.example.jkwong.testcaseproject;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@SuppressWarnings("ALL")
public class ExampleInstrumentedTest  extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public ExampleInstrumentedTest() {
        super(MainActivity.class);
    }


    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        solo.waitForActivity(MainActivity.class, 3000);
        solo.sleep(2000);
    }

    @Test
    public void test1() {
        Assert.assertTrue(solo.searchText("Hello World"));
    }

}
