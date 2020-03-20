package ru.vt.mobile_fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val moviesDataset: List<Movie>)
    : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(val relativeLayout: RelativeLayout)
        : RecyclerView.ViewHolder(relativeLayout)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val relativeLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_list_member,parent,false) as RelativeLayout

        return MovieViewHolder(relativeLayout)
    }

    override fun getItemCount() = moviesDataset.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val img = holder.relativeLayout.findViewById<ImageView>(R.id.img)
            .setImageResource(moviesDataset[position].poster)
        val title = holder.relativeLayout.findViewById<TextView>(R.id.title)
            .setText(moviesDataset[position].title)
        val releaseDate = holder.relativeLayout.findViewById<TextView>(R.id.release_date)
            .setText(moviesDataset[position].releaseDate.toString())
        val genres = holder.relativeLayout.findViewById<TextView>(R.id.genres_list)
            .setText(moviesDataset[position].genres.joinToString())
    }
}