package com.gh7.currency;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class InputAmount extends Activity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_amount);
        Button twentyDollar = findViewById(R.id.twentydollar);
        final LinearLayout money = findViewById(R.id.money);

        twentyDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(InputAmount.this);
                imageView.setImageResource(R.drawable.twenty);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                money.addView(imageView);

            }
        });
    }

}
