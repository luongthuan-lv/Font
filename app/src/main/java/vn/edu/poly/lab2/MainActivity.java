package vn.edu.poly.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Part1(View view) {
        startActivity(new Intent(MainActivity.this,Sub1Activity.class));
    }

    public void Part2(View view) {
        startActivity(new Intent(MainActivity.this,Sub2Activity.class));
    }

    public void Part3(View view) {
        startActivity(new Intent(MainActivity.this,Sub3Activity.class));
    }

    public void Part4(View view) {
        startActivity(new Intent(MainActivity.this,Sub4Activity.class));
    }

}
