package com.example.communityapp

import android.graphics.Bitmap
import android.view.View
import android.webkit.*
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import android.os.Bundle
import com.example.communityapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var webView: WebView
    private lateinit var swipeRefresh: SwipeRefreshLayout
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // تهيئة المتغيرات
        webView = binding.webView
        swipeRefresh = binding.swipeRefresh
        progressBar = binding.progressBar

        setupWebView()
        setupSwipeRefresh()
    }

    private fun setupWebView() {
        // ... باقي الكود كما هو
    }

    private fun setupSwipeRefresh() {
        swipeRefresh.setOnRefreshListener {
            webView.reload()
        }
    }
}