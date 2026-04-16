package com.wch.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import android.os.Bundle

class WchBroadReceiver3 : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "com.wch.broadcastreceiver.ORDERED_BROADCAST") {
            Toast.makeText(context, "自定义的广播接受者03（高优先级），接受到了有序广播事件", Toast.LENGTH_SHORT).show()

            val isTruncated = intent.getBooleanExtra("truncate", false)
            if (isTruncated) {
                abortBroadcast()
            }
        }
    }
}
