package com.gh7.currency;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {

    private Handler handler;
    private Thread t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);
        handler = new Handler();
    }

    @Override
    protected void onResume() {
        super.onResume();
        t = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                    handler.post(new Runnable(){
                        @Override
                        public void run() {
                            Intent i = new Intent(Splash.this, ItemSelect.class);
                            startActivity(i);
                        }});
                } catch (InterruptedException e) {
                }
            }
        };
        t.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(t!=null){
            t.interrupt();
        }
    }
}

