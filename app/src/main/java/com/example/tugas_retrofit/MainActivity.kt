package com.example.tugas_retrofit

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugas_retrofit.databinding.ActivityMainBinding
import com.example.tugas_retrofit.model.Whisky
import com.example.tugas_retrofit.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvWhisky.layoutManager = LinearLayoutManager(this)
        val client = ApiClient.getInstance()
        val responseWhisky = client.getAllWhisky()
//        val whiskyList = ArrayList<String>()

        responseWhisky.enqueue(object: Callback<List<Whisky>>{
            override fun onResponse(p0: Call<List<Whisky>>, p1: Response<List<Whisky>>) {
                if (p1.isSuccessful) {
                    val whiskyList = p1.body() ?: emptyList()
                    val adapter = WhiskyAdapter(whiskyList)
                    binding.rvWhisky.adapter = adapter
                }
            }

            override fun onFailure(p0: Call<List<Whisky>>, p1: Throwable) {
                Toast.makeText(this@MainActivity, "Koneksi error", Toast.LENGTH_SHORT).show()
            }

        })
    }
}