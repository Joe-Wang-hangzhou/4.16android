package com.wch.broadcastreceiver

import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class WchBasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wch_basic)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0, 1, 1, "发送标准广播")
        menu.add(0, 2, 2, "发送有序广播")
        menu.add(0, 3, 3, "截断的有序广播")
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            1 -> {
                val intent = Intent()
                intent.action = "com.wch.broadcastreceiver.STANDARD_BROADCAST"
                sendBroadcast(intent)
                Toast.makeText(this, "已发送标准广播", Toast.LENGTH_SHORT).show()
            }
            2 -> {
                val intent = Intent()
                intent.action = "com.wch.broadcastreceiver.ORDERED_BROADCAST"
                sendOrderedBroadcast(intent, null)
                Toast.makeText(this, "已发送有序广播", Toast.LENGTH_SHORT).show()
            }
            3 -> {
                val intent = Intent()
                intent.action = "com.wch.broadcastreceiver.ORDERED_BROADCAST"
                intent.putExtra("truncate", true)
                sendOrderedBroadcast(intent, null)
                Toast.makeText(this, "已发送截断的有序广播", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}
