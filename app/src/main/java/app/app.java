package app;

import android.util.Log;
import android.widget.Toast;

public class app {
    public static class main {
        public static final String TAG = "Task2";
    }

    public static void log(String message){
        Log.d(main.TAG,message);
    }
    public static void toast(String message){
        Toast.makeText(Application.getContext(),message,Toast.LENGTH_LONG).show();
    }
}