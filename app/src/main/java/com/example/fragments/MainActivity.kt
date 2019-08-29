package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment()
        Log.i(COMBINE_LIFECYCLE, "$ACTIVITY onCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.i(COMBINE_LIFECYCLE, "$ACTIVITY onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.i(COMBINE_LIFECYCLE, "$ACTIVITY onResume")
    }

    override fun onStart() {
        super.onStart()

        Log.i(COMBINE_LIFECYCLE, "$ACTIVITY onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i(COMBINE_LIFECYCLE, "$ACTIVITY onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(COMBINE_LIFECYCLE, "$ACTIVITY onDestroy")
    }

    fun addFragment(){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.fragment_container, ExampleFragment())
      //      .addToBackStack(null)
            .commit()
    }

    companion object{

        const val COMBINE_LIFECYCLE = "combined lifecycle"
        const val ACTIVITY = "MainActivity"
        const val FRAGMENT = "Example Fragment"
    }
}
