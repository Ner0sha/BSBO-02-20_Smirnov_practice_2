package ru.mirea.smirnov.controllesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstsnackbar(View view)
    {
        Snackbar.make(view, "Smirnov BSBO-02-20", Snackbar.LENGTH_SHORT).show();
    }
    public void twoMyDialogFragment(View view)
    {
        MyTimeDialogFragment dialog = new MyTimeDialogFragment(MainActivity.this);
    }

    public void threeMydateDialogFragment(View view)
    {
        MyDateDialogFragment dialog = new MyDateDialogFragment(MainActivity.this);
    }

    public void fourMyProgressDialoFragment(View view)
    {
        MyProgressDialogFragment dialog = new MyProgressDialogFragment(MainActivity.this);
    }
}