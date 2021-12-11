package com.saiful.multi_module_navgraph

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.saiful.movies.MovieActivity
import com.saiful.series.SeriesActivity

class OptionsFragment : Fragment(R.layout.fragment_second) {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup(view)
    }

    private fun setup(view: View?) {
        val movieBtn = view?.findViewById<Button>(R.id.movie_btn)
        val seriesBtn = view?.findViewById<Button>(R.id.series_btn)
        movieBtn?.setOnClickListener {
            Log.d("click", "button")
            val intent = Intent(requireActivity(), MovieActivity::class.java)
            startActivity(intent)
        }
        seriesBtn?.setOnClickListener {
            val intent = Intent(requireActivity(), SeriesActivity::class.java)
            startActivity(intent)
        }
    }
}