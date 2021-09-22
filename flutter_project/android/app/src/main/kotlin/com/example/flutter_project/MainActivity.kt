package com.example.flutter_project

import android.content.Intent
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugins.GeneratedPluginRegistrant


class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GeneratedPluginRegistrant.registerWith(flutterEngine!!)

        MethodChannel(flutterEngine!!.dartExecutor.binaryMessenger, "openIonicActivity")
                .setMethodCallHandler { call, result ->
                    when (call.method) {
                        "project1" -> {
                            startActivity(Intent(context, io.ionic.starter.MainActivity::class.java))
                        }
                        "project2" -> {
                            startActivity(Intent(context, io.ionic.starter.project2.MainActivity::class.java))
                        }
                    }
                }
    }
}
