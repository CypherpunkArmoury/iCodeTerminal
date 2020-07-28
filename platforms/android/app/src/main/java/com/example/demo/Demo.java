package com.example;

import android.app.Activity;
import android.content.Context;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import org.json.JSONArray;
import org.json.JSONException;

public class Demo extends CordovaPlugin {
  private Activity activity;
  private Context context;

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
    this.context = cordova.getContext();
    this.activity = cordova.getActivity();
  }

  public boolean execute(String action, final JSONArray args, final CallbackContext callbackContext)
      throws JSONException {

    if (action.equals("say-hello")) {
      this.sayHello(args.getString(0), callbackContext);
      return true;
    }
    return false;
  }

  private void sayHello(String name, CallbackContext callbackContext){
    callbackContext.success("Hello "+ name + "!");
  }

}