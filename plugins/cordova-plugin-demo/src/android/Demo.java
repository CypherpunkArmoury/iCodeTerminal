package com.example;


import android.app.*;
import android.os.*;
import android.app.Activity;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;


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



    private void sayHello(String command, CallbackContext callbackContext) {
        StringBuffer output = new StringBuffer();
        try {
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String str = "";
            while (true) {
                str = reader.readLine();
                if (str == null) {
                    break;
                }
                output.append(str + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        callbackContext.success(output.toString());
    }


}











