package com.gh7.currency;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ItemSelect extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.item_select);


        findViewById(R.id.itemone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), InputAmount.class);
                intent.putExtra("PRICE", "3.75");
                intent.putExtra("IMAGE", R.drawable.milkone);
                startActivity(intent);
            }
        });
        findViewById(R.id.itemtwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), InputAmount.class);
                intent.putExtra("PRICE", "86.00");
                intent.putExtra("IMAGE", R.drawable.bike);
                startActivity(intent);
            }
        });
        findViewById(R.id.itemthree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), InputAmount.class);
                intent.putExtra("PRICE", "8.45");
                intent.putExtra("IMAGE", R.drawable.steak);
                startActivity(intent);
            }
        });

        findViewById(R.id.itemfour).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), InputAmount.class);
                intent.putExtra("PRICE", "25.65");
                intent.putExtra("IMAGE", R.drawable.barstool);
                startActivity(intent);
            }
        });
    }
}
