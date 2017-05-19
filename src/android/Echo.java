package org.apache.cordova;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class Echo extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("say")) {
            String message = args.getString(0);
            this.say(message, callbackContext);
            return true;
        }
        return false;
    }

    private void say(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success("Hi " + message + ". I'm from Java.");
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
