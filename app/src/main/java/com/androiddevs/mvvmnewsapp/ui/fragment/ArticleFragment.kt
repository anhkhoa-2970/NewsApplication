package com.androiddevs.mvvmnewsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androiddevs.mvvmnewsapp.databinding.FragmentArticleBinding


class ArticleFragment : Fragment() {
    private var _binding : FragmentArticleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArticleBinding.inflate(inflater,container,false)
        return binding.root
    }


}