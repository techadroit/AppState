package ss.com.appstate;

import android.app.Application;
import android.arch.lifecycle.ProcessLifecycleOwner;
import android.content.Context;

/**
 * Created by saghayam on 23-10-2017.
 */

public class App extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new LifeCycleObserver());

    }

    public static Context getAppContext() {
        return context;
    }

}
