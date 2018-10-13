package com.gh7.currency;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.math.BigDecimal;

public class InputAmount extends Activity {


    public BigDecimal price;
    public BigDecimal paid = new BigDecimal("0.00");
    public BigDecimal remain;
    public boolean binged = false;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_amount);

        String priceValue = getIntent().getStringExtra("PRICE");
        remain = price = new BigDecimal(priceValue);

        mp = MediaPlayer.create(this, R.raw.bell);

        ((TextView)findViewById(R.id.price)).setText(price.toString());
        ((TextView)findViewById(R.id.paid)).setText(paid.toString());
        ((TextView)findViewById(R.id.remain)).setText(remain.toString());

        final LinearLayout bills = findViewById(R.id.bills);
        final LinearLayout change = findViewById(R.id.change);

        findViewById(R.id.hundreddollar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);


                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bills.removeView(imageView);
                        updateTotals(new BigDecimal("-100"));
                    }
                });

                imageView.setImageResource(R.drawable.hundred);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                bills.addView(imageView);
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
                        bills.removeView(imageView);
                        updateTotals(new BigDecimal("-50"));
                    }
                });

                imageView.setImageResource(R.drawable.fifty);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                bills.addView(imageView);
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
                        bills.removeView(imageView);
                        updateTotals(new BigDecimal("-20"));
                    }
                });

                imageView.setImageResource(R.drawable.twenty);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                bills.addView(imageView);
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
                        bills.removeView(imageView);
                        updateTotals(new BigDecimal("-10"));
                    }
                });
                imageView.setImageResource(R.drawable.ten);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                bills.addView(imageView);
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
                        bills.removeView(imageView);
                        updateTotals(new BigDecimal("-5"));
                    }
                });

                imageView.setImageResource(R.drawable.five);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                bills.addView(imageView);
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
                        bills.removeView(imageView);
                        updateTotals(new BigDecimal("-1"));
                    }
                });
                imageView.setImageResource(R.drawable.one);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                bills.addView(imageView);
                updateTotals(new BigDecimal("1"));

            }
        });

        findViewById(R.id.quarter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        change.removeView(imageView);
                        updateTotals(new BigDecimal("-.25"));
                    }
                });
                imageView.setImageResource(R.drawable.quarter);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                change.addView(imageView);
                updateTotals(new BigDecimal(".25"));

            }
        });

        findViewById(R.id.dime).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        change.removeView(imageView);
                        updateTotals(new BigDecimal("-.1"));
                    }
                });
                imageView.setImageResource(R.drawable.dime);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                change.addView(imageView);
                updateTotals(new BigDecimal(".1"));

            }
        });

        findViewById(R.id.nickel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        change.removeView(imageView);
                        updateTotals(new BigDecimal("-.05"));
                    }
                });
                imageView.setImageResource(R.drawable.nickel);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                change.addView(imageView);
                updateTotals(new BigDecimal(".05"));

            }
        });

        findViewById(R.id.penny).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = new ImageView(InputAmount.this);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        change.removeView(imageView);
                        updateTotals(new BigDecimal("-.01"));
                    }
                });
                imageView.setImageResource(R.drawable.penny);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(380,175));
                change.addView(imageView);
                updateTotals(new BigDecimal(".01"));

            }
        });

        updateDisplay();
        updateThumb();
    }

    public void updateTotals(BigDecimal amount){
        paid = paid.add(amount);
        remain = price.subtract(paid);
        updateDisplay();
        updateThumb();
    }

    public void updateDisplay(){
        ((TextView)findViewById(R.id.price)).setText("$" + price.toString());
        ((TextView)findViewById(R.id.paid)).setText("$" +paid.toString());
        ((TextView)findViewById(R.id.remain)).setText("$" +remain.abs().toString());

        if(remain.floatValue() <=0){
            ((TextView)findViewById(R.id.remain)).setTextColor(0xFF006400);
            ((TextView)findViewById(R.id.remaintext)).setTextColor(0xFF006400);
            ((TextView)findViewById(R.id.remaintext)).setText("Change");
        } else {
            ((TextView)findViewById(R.id.remain)).setTextColor(Color.RED);
            ((TextView)findViewById(R.id.remaintext)).setTextColor(Color.RED);
            ((TextView)findViewById(R.id.remaintext)).setText("Remaining");
        }
    }

    public void updateThumb() {
        ImageView thumb = findViewById(R.id.thumb);
        FrameLayout thumbback = findViewById(R.id.thumbback);
        if (remain.floatValue() <= 0){
            thumb.setRotation(0f);
            thumbback.setBackgroundColor(Color.GREEN);
            if(!binged) {
                binged = true;
                mp.start();
            }
        } else {
            binged = false;
            thumb.setRotation(-180f * (remain.floatValue() / price.floatValue()));
            thumbback.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
        }
    }
}
