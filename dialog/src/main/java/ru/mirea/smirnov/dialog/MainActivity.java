package ru.mirea.smirnov.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view) {
        myDialogFragment dialogFragment = new myDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "Mirea");
    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду на пары\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Спу\"!",
                Toast.LENGTH_LONG).show();
    }
}