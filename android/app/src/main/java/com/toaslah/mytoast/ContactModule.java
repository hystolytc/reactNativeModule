package com.toaslah.mytoast;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.gson.Gson;
import com.toaslah.Injector;
import com.toaslah.models.Contact;
import com.toaslah.utils.ContactProvider;

import java.util.List;

import javax.inject.Inject;

public class ContactModule extends ReactContextBaseJavaModule {

    @Inject ContactProvider contactProvider;

    public ContactModule(ReactApplicationContext context){
        super(context);
        Injector.inject(this);
    }

    @Override
    public String getName(){
        return "Contact";
    }

    @ReactMethod
    public void show(String query, Promise promise) {
        List<Contact> contacts = contactProvider.searchContactFromPhonebook(query);
        promise.resolve((new Gson()).toJson(contacts));
    }

    
}