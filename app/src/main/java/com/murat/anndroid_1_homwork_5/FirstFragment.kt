package com.murat.anndroid_1_homwork_5

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.murat.anndroid_1_homwork_5.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding
    private var count = 0
    private var isMinus = false
    lateinit var alertDialog: AlertDialog.Builder





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPlus.setOnClickListener {
            if (isMinus)
                count--
            else count++

            binding.tvZero.text = count.toString()

            if (count == 10) {
                binding.btnPlus.text = "-1"
                isMinus = true
            }

            if (count == 0) {

                requireActivity().supportFragmentManager.beginTransaction().
                replace(R.id.frame,SecondFragment()).addToBackStack(null).commit()


                if (count == 0){
                    binding.btnPlus.text= "+1"
                    isMinus = false
                }

            }



        }
    }



    }
