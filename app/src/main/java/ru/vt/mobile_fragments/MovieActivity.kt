package ru.vt.mobile_fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate

class MovieActivity : AppCompatActivity() {

    lateinit var movieListFragment : MovieListFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val fragmentManager = supportFragmentManager
        movieListFragment = MovieListFragment(createHelper())
        fragmentManager.beginTransaction().add(R.id.constraint_layout, movieListFragment).commit()
    }

    private fun createHelper(): List<Movie>{
        val films = mutableListOf<Movie>()

        val labyrinthOfFaun = Movie("Лабиринт Фавна",
            LocalDate.of(2006, 11, 7),
            arrayOf("драма", "ужасы", "фэнтези", "приключения", "исторический"),
            R.drawable.favn_lab
        )

        val hatiko = Movie("Хатико",
            LocalDate.of(2008, 8, 8),
            arrayOf("драма"),
            R.drawable.hatiko
        )

        val backToTheFuture = Movie("Назад в будущее",
            LocalDate.of(1985, 7, 3),
            arrayOf("приключенческий фильм, комедия, фантастика"),
            R.drawable.back_to_the_future
        )

        val parasitians = Movie("Паразиты",
            LocalDate.of(2019, 7, 4),
            arrayOf("комедийная драма, триллер"),
            R.drawable.parasitians
        )

        val leon = Movie("Леон",
            LocalDate.of(1994, 9, 14),
            arrayOf("драма, криминальный боевик"),
            R.drawable.leon
        )

        val nonLove = Movie("Нелюбовь",
            LocalDate.of(2017, 6, 1),
            arrayOf("драма"),
            R.drawable.non_love
        )

        val taxiDriver = Movie("Таксист",
            LocalDate.of(2017, 7, 4),
            arrayOf("драма, триллер, неонуар"),
            R.drawable.taxi_driver
        )

        val holyDeerKilling = Movie("Убийство священного оленя",
            LocalDate.of(2017, 11, 16),
            arrayOf("драма, психологический триллер"),
            R.drawable.holy_deer_killing
        )

        val godfather = Movie("Крёстный отец",
            LocalDate.of(1972, 3, 14),
            arrayOf("эпическая гангстерская драма"),
            R.drawable.godfather
        )

        val kingsSpeech = Movie("Король говорит!",
            LocalDate.of(2010, 9, 6),
            arrayOf("исторический фильм"),
            R.drawable.kings_speech
        )

        films.add(labyrinthOfFaun)
        films.add(hatiko)
        films.add(backToTheFuture)
        films.add(parasitians)
        films.add(leon)
        films.add(nonLove)
        films.add(taxiDriver)
        films.add(holyDeerKilling)
        films.add(godfather)
        films.add(kingsSpeech)

        return films
    }
}
