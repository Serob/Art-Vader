package com.google.ar.helpers;

import android.app.Activity;
import android.widget.Toast;

/**
 * Helper to manage the sample Toast. Hides the Android boilerplate code, and exposes simpler
 * methods.
 */
public final class ToastHelper {
    private int maxLines = 2;

    /** Shows a snackbar with a given message. */
    public void showMessage(Activity activity, String message) {
        Toast.makeText(activity, "Info: " + message,
                Toast.LENGTH_SHORT).show();
    }

    /**
     * Shows a Toast with a given error message. When dismissed, will finish the activity. Useful
     * for notifying errors, where no further interaction with the activity is possible.
     */
    public void showError(Activity activity, String errorMessage) {
        Toast.makeText(activity, "ERROR: " + errorMessage,
                Toast.LENGTH_LONG).show();
    }

}