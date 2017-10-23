How to know my app is in foreground/background? 

This is a common question android developer ask.

There are many solution to this problem in the internet but which one to choose is a big task. 
Thanks to Google's Android architecture component which has made things easier for us. 

This demo app uses Lifecylce component to know when the app is in background and foreground.

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();    
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new LifeCycleObserver());
    }

}

public class LifeCycleObserver implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onAppCreate(){
      "The App is created"
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onForeground(){
       "The App is in foreground"
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onBackground(){
        "The App is in background"
    }
}

That is it. You don’t need to do anything else. This will notify you when the app goes in foreground or background.

You can also use other LifecycleEvent annotation like Lifecycle.Event.ON_RESUME, Lifecycle.Event.ON_PAUSE,
Lifecycle.Event.ON_DESTROY. These lifecycle will be called similar. But note that ON_DESTROY will never be invoked.

