package com.example.andrew_vib.pogoda;
import android.content.Intent;
import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener listener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener listener3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Main3Activity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeToast("onCreate");
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(listener2);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(listener3);
    }

    @Override
    protected void onStart(){
        super.onStart();
        makeToast("onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        makeToast("onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        makeToast("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeToast("onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        makeToast("onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        makeToast("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeToast("onDestroy");
    }


    private void makeToast (String text){
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}

