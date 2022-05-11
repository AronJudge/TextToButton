package com.ts.car.texttobutton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflater.from(this).setFactory2(new LayoutInflater.Factory2() {
            @Nullable
            @Override
            public View onCreateView(@Nullable View view, @NonNull String name, @NonNull Context context, @NonNull AttributeSet attributeSet) {
                if(TextUtils.equals(name, "TextView")) {
                    Button bt = new Button(MainActivity.this);
                    bt.setText("I am a button");
                    return bt;
                }
                return  null;
            }

            @Nullable
            @Override
            public View onCreateView(@NonNull String s, @NonNull Context context, @NonNull AttributeSet attributeSet) {
                return null;
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}