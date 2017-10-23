package ss.com.appstate;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.widget.Toast;

/**
 * Created by saghayam on 18-10-2017.
 */

public class LifeCycleObserver implements LifecycleObserver {

    String TAG = "LifeCycleObserver";


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onAppCreate(){

        Toast.makeText(App.getAppContext(),"The App is created",Toast.LENGTH_LONG).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onForeground(){

        Toast.makeText(App.getAppContext(),"The App is in foreground",Toast.LENGTH_LONG).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onBackground(){
        Toast.makeText(App.getAppContext(),"The App is in background",Toast.LENGTH_LONG).show();
    }
}
