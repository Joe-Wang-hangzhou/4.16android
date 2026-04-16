package com.wch.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class WchBroadReceiver1 : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "com.wch.broadcastreceiver.STANDARD_BROADCAST") {
            Toast.makeText(context, "自定义的广播接受者01，接受到了标准广播事件", Toast.LENGTH_SHORT).show()
        }
    }
}
