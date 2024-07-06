package com.example.activitylifecycletest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.activitylifecycletest.databinding.ActivityDialogBinding
import com.example.activitylifecycletest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val tag="MainActivity"
    lateinit var binding: ActivityMainBinding
    //启动Activity，第一次创建时调用，完成初始化操作，加载布局，绑定事件
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(tag,"onCreate")
        binding.startNormalActivity.setOnClickListener{
            val intent = Intent(this,NormalActivity::class.java)
            startActivity(intent)
        }

        binding.startDialogActivity.setOnClickListener{
            val intent = Intent(this,DialogActivity::class.java)
            startActivity(intent)
        }
    }
  //Activity由不可见变为可见时调用
    override fun onStart() {
        super.onStart()
        Log.d(tag,"onStart")
    }
//Activity准备好与用户交互时调用，处于运行状态
    override fun onResume() {
        super.onResume()
        Log.d(tag,"onResume")
    }
//系统准备去启动或者恢复另一个Activity时调用，处于暂停状态
    override fun onPause() {
        super.onPause()
        Log.d(tag,"onPause")
    }
//Activity完全不可见时调用
    override fun onStop() {
        super.onStop()
        Log.d(tag,"onStop")
    }
//Activity被销毁之前调用
    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"onDestroy")
    }
//Activity由停止状态变为运行状态时调用
    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"onRestart")
    }

}