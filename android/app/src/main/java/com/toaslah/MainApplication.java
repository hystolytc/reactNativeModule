package com.toaslah;

import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;

import com.babisoft.ReactNativeLocalization.ReactNativeLocalizationPackage;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.toaslah.mytoast.ToaslahPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private static MainApplication instance;

    public MainApplication() {}

    public MainApplication(final Context context) {
        this();
        attachBaseContext(context);
    }

    public MainApplication(final Instrumentation instrumentation) {
        this();
        attachBaseContext(instrumentation.getTargetContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // Perform injection
        Injector.init(getRootModule(), this);

    }

    /**
     * Get root module
     * @return Object
     */
    private Object getRootModule() {
        return new RootModule();
    }

    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        protected boolean getUseDeveloperSupport() {
          return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage(),
                    new ToaslahPackage()
            );
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public static MainApplication getInstance() {
        return instance;
    }
}
