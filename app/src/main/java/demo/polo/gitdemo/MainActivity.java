package demo.polo.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fun1();
        fun2();
        fun3();
    }

    private void fun2() {
        Toast.makeText(getApplicationContext(), "fun2", Toast.LENGTH_SHORT).show();

    }

    private void fun3() {
        Log.d("git", "haha");
    }

    private void fun1() {

    }
}
