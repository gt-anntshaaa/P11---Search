package com.chirikualii.materidb.ui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.chirikualii.materidb.data.model.Movie
import com.chirikualii.materidb.databinding.ActivitySearchBinding
import com.chirikualii.materidb.ui.adapter.MovieListAdapter

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBinding
    private lateinit var listAdapter: MovieListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)


        listAdapter = MovieListAdapter()
        binding.rvMovie.adapter = listAdapter

        listAdapter.addItem(
            listOf(
                Movie(
                    movieId = "1",
                    title = "abc",
                    imagePoster = "pict",
                    backdrop = "ka",
                    overview = "123",
                    bookmark = 1,
                    releaseDate = "12"
                ),
                Movie(
                    movieId = "2",
                    title = "ab",
                    imagePoster = "pic",
                    backdrop = "ka",
                    overview = "123",
                    bookmark = 1,
                    releaseDate = "12"
                ),
                Movie(
                    movieId = "3",
                    title = "abcd",
                    imagePoster = "ict",
                    backdrop = "ka",
                    overview = "123",
                    bookmark = 1,
                    releaseDate = "12"
                )
            )
        )
        binding.etSearch.doOnTextChanged { text, _, _, _ ->

        }
    }
}