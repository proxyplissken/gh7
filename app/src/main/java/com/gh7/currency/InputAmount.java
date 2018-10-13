package com.gh7.currency;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.math.BigDecimal;

public class InputAmount extends Activity {


    public BigDecimal price = new BigDecimal("50.12");
    public BigDecimal paid = new BigDecimal("0.00");
    public BigDecimal remain = new BigDecimal("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_amount);

        ((TextView)findViewById(R.id.price)).setText(price.toString());
        ((TextView)findViewById(R.id.paid)).setText(paid.toString());
        ((TextView)findViewById(R.id.remain)).setText(remain.toString());

        final LinearLayout money = findViewById(R.id.money);

        findViewById(R.id.hundreddollar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);


                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.removeView(imageView);
                        updateTotals(new BigDecimal(-100));
                    }
                });

                imageView.setImageResource(R.drawable.hundred);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                money.addView(imageView);
                updateTotals(new BigDecimal("100"));
            }
        });

        findViewById(R.id.fiftydollar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.removeView(imageView);
                        updateTotals(new BigDecimal(-50));
                    }
                });

                imageView.setImageResource(R.drawable.fifty);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                money.addView(imageView);
                updateTotals(new BigDecimal("50"));

            }
        });

        findViewById(R.id.twentydollar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);


                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.removeView(imageView);
                        updateTotals(new BigDecimal(-20));
                    }
                });

                imageView.setImageResource(R.drawable.twenty);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                money.addView(imageView);
                updateTotals(new BigDecimal("20"));

            }
        });

        findViewById(R.id.tendollar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.removeView(imageView);
                        updateTotals(new BigDecimal(-10));
                    }
                });
                imageView.setImageResource(R.drawable.ten);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                money.addView(imageView);
                updateTotals(new BigDecimal("10"));

            }
        });

        findViewById(R.id.fivedollar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.removeView(imageView);
                        updateTotals(new BigDecimal(-5));
                    }
                });

                imageView.setImageResource(R.drawable.five);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                money.addView(imageView);
                updateTotals(new BigDecimal("5"));

            }
        });

        findViewById(R.id.onedollar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        money.removeView(imageView);
                        updateTotals(new BigDecimal(-1));
                    }
                });
                imageView.setImageResource(R.drawable.one);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                money.addView(imageView);
                updateTotals(new BigDecimal("1"));

            }
        });
    }

    public void updateTotals(BigDecimal amount){
        paid = paid.add(amount);
        remain = price.subtract(paid);
        ((TextView)findViewById(R.id.paid)).setText(paid.toString());
        ((TextView)findViewById(R.id.remain)).setText(remain.toString());
    }
}
