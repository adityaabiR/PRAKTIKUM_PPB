package com.fauziyah_19104033.helloittelkompurwokerto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Halaman2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2)
    }
    override fun onStart(){
        super.onStart()
        printState("Halaman dua On Start")
    }
    override fun onResume(){
        super.onResume()
        printState("Halaman dua On Resume")
    }
    override fun onPause(){
        super.onPause()
        printState("Halaman dua On Pause")
    }
    override fun onStop(){
        super.onStop()
        printState("Halaman dua On Stop")
    }
    override fun onRestart(){
        super.onRestart()
        printState("Halaman dua On Restart")
    }
    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman dua On Destroy")
    }
    fun printState(msg: String){
        Log.d("ActivityState",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }
}