package com.toaslah.mytoast;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule; 
import com.facebook.react.bridge.ReactApplicationContext; 
import com.facebook.react.bridge.ReactContext; 
import com.facebook.react.bridge.ReactContextBaseJavaModule; 
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

// This module for read contact
import android.provider.ContactsContract;

import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.widget.AdapterView;


public class ToaslahModule extends ReactContextBaseJavaModule {

    private static final String DURATION_SHORT_KEY = "SHORT"; 
    private static final String DURATION_LONG_KEY = "LONG"; 
    
    public ToaslahModule(ReactApplicationContext reactContext) { 
        super(reactContext); 
    }

    @Override
    public String getName(){
        return "Toaslah";
    }

    @Override 
    public Map<String, Object> getConstants() { 
        final Map<String, Object> constants = new HashMap<>(); 
        constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT); 
        constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG); 
        
        return constants; 
    }

    @ReactMethod
    public void show(String message, int duration) {
        Toast.makeText(getReactApplicationContext(), message, duration).show();
    }
    

}