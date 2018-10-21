package com.nomad.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.nomad.domain.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Inject
    User mUser;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_name);

        DaggerMainComponent.builder().build().inject(this);
        Log.d(TAG, "onCreate: " + mUser.name);

        DaggerMainComponent.builder().textViewModule(new TextViewModule(this)).build().inject(this);
        textView.setText(mUser.name);
    }
}
