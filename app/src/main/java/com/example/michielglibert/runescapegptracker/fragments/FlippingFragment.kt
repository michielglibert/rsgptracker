package com.example.michielglibert.runescapegptracker.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast

import com.example.michielglibert.runescapegptracker.R
import com.example.michielglibert.runescapegptracker.adapters.FlipAdapter
import com.example.michielglibert.runescapegptracker.data.DummyData
import com.example.michielglibert.runescapegptracker.models.Flip
import kotlinx.android.synthetic.main.fragment_flipping.*

class FlippingFragment : Fragment() {

    lateinit var items: List<Flip>

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v = inflater!!.inflate(R.layout.fragment_flipping, container, false)

        items = DummyData.getFlips()

        return v
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvFlips.layoutManager = LinearLayoutManager(context)
        rvFlips.adapter = FlipAdapter(items) {
            Toast.makeText(context, "Clicked ${it.name}", Toast.LENGTH_SHORT).show()
        }

        txtFlippingProfit.text = calculateProfit().toString()
    }

    fun calculateProfit(): Int {
        var sum = 0
        items.forEach { sum + it.calculateProfit() }
        return sum
    }

    /*override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            mListener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }*/
}
