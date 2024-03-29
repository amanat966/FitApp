package com.example.fitapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fitapp.R
import com.example.fitapp.adapters.DayModel
import com.example.fitapp.adapters.DaysAdapter
import com.example.fitapp.databinding.ExericiseListFragmentBinding


class ExericiseListFragment : Fragment() {
    private lateinit var binding: ExericiseListFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ExericiseListFragmentBinding.inflate(inflater,container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

        @JvmStatic
        fun newInstance() = ExericiseListFragment()
    }
}