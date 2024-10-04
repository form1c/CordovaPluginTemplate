package com.example.plugin;

import org.apache.cordova.CordovaPlugin;    // Import for the CordovaPlugin class
import org.apache.cordova.CallbackContext;  // Import for CallbackContext
import org.json.JSONArray;                  // Import for JSONArray
import org.json.JSONException;              // Import for JSONException

import android.util.Log;                    // Import for Log class
import android.widget.Toast;                // Import for Toast class

public class MyPlugin extends CordovaPlugin {
    private static final String TAG = "MyPlugin"; // Tag for log outputs

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Log.d(TAG, "execute() called with action: " + action);
        if (action.equals("showToast")) {
            String message = args.getString(0);
            Log.i(TAG, "Showing toast with message: " + message);
            this.showToast(message, callbackContext);
            return true;
        }
        Log.w(TAG, "Unknown action: " + action);
        return false;
    }

    private void showToast(final String message, final CallbackContext callbackContext) {
        Log.v(TAG, "showToast: " + message);
        Runnable runnable = new Runnable() {
            public void run() {
                // Show toast on the UI thread
                Toast.makeText(cordova.getActivity().getApplicationContext(), message, Toast.LENGTH_LONG).show();
                callbackContext.success("Toast shown: " + message);
            }
        };
        cordova.getActivity().runOnUiThread(runnable); // Execute runnable on the UI thread
    }
}
