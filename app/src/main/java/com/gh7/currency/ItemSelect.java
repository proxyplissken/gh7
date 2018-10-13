package com.gh7.currency;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ItemSelect extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_select);


        findViewById(R.id.itemone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), InputAmount.class);
                intent.putExtra("PRICE", "3.75");
                startActivity(intent);
            }
        });
        findViewById(R.id.itemtwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), InputAmount.class);
                intent.putExtra("PRICE", "5.75");
                startActivity(intent);
            }
        });


    }
}
