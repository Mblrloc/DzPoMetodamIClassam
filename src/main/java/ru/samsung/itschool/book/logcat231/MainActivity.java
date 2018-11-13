package ru.samsung.itschool.book.logcat231;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    private static final String LOG_TAG = "Main_Activity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(LOG_TAG, "Creating view..");
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "View created!");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(LOG_TAG, "I hope it will work, i hope it will work to");
//Когда меню открывается впервые, Android вызывает метод onCreateOptionsMenu()
        //если нажать home button log cat, а еще появится кнопка settings...
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//если нажать которую сработает это
        Log.d(LOG_TAG, "I hope it will work");
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
