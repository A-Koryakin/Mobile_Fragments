package ru.vt.mobile_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieListFragment (_movies: List<Movie>) : Fragment() {

    private lateinit var viewOfFragmentMovieList: View
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var movies = _movies

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        viewOfFragmentMovieList = inflater.inflate(
            R.layout.fragment_movie_list, container, false
        )
        setMovies(movies)
        return viewOfFragmentMovieList
    }

    private fun setMovies(movies: List<Movie>){
        viewManager = LinearLayoutManager(context)
        viewAdapter = MovieAdapter(movies)

        recyclerView = viewOfFragmentMovieList.findViewById<RecyclerView>(R.id.recycler_view).apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}