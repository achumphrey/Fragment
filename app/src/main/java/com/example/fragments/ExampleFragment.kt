package com.example.fragments

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ExampleFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_example, container, false)
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        Log.i(MainActivity.COMBINE_LIFECYCLE, "${MainActivity.FRAGMENT}  onAttach")
    }

    override fun onPause() {
        super.onPause()
        Log.i(MainActivity.COMBINE_LIFECYCLE, "${MainActivity.FRAGMENT}  onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.i(MainActivity.COMBINE_LIFECYCLE, "${MainActivity.FRAGMENT}  onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i(MainActivity.COMBINE_LIFECYCLE, "${MainActivity.FRAGMENT}  onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.i(MainActivity.COMBINE_LIFECYCLE, "${MainActivity.FRAGMENT}  onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(MainActivity.COMBINE_LIFECYCLE, "${MainActivity.FRAGMENT}  onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(MainActivity.COMBINE_LIFECYCLE, "${MainActivity.FRAGMENT}  onDestroyView")
    }

}