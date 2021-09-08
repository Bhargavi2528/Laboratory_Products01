package com.cssolution.labproduct

import android.app.Dialog
import android.content.Context
import android.view.Window
import android.widget.Toast
import androidx.annotation.StringRes
import com.cssolution.labproduct.R.*

private var dialog: Dialog? = null

fun displayToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun displayToast(context: Context, @StringRes message: Int) {
    Toast.makeText(context, context.resources.getString(message), Toast.LENGTH_SHORT).show()
}


fun showLoader(context: Context) {
    dismissLoader()
    dialog = Dialog(context, style.ProgressHUD).apply {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setCancelable(false)
        window?.setBackgroundDrawableResource(android.R.color.transparent)
        setContentView(layout.progress_hud)
        show()
    }
}

fun dismissLoader() {
    if (dialog != null && dialog!!.isShowing) {
        dialog!!.dismiss()
        dialog = null
    }
}