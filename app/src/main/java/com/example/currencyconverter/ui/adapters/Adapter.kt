package com.example.currencyconverter.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyconverter.R
import com.example.currencyconverter.databinding.CurrencyItemBinding
import com.example.currencyconverter.data.models.Currency

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    var elements: List<Currency> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    private var selectedElement = -1
    val holders: ArrayList<ViewHolder> by lazy { ArrayList(itemCount) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val binder = CurrencyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = ViewHolder(binder)
        holders.add(holder)
        return holder
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.bind(elements[position])
    }

    override fun getItemCount(): Int = elements.size

    inner class ViewHolder(private val itemBinding: CurrencyItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(element: Currency) {
            itemBinding.currencyName.text = element.name
            itemBinding.currencyName.setOnClickListener { select() }
        }

        private fun select() {
            if (selectedElement != -1) {
                holders[selectedElement].itemBinding.root.setBackgroundColor(-1)
            }
            selectedElement = adapterPosition
            itemBinding.root.setBackgroundColor(itemBinding.root.resources.getColor(R.color.purple_200))
        }


    }
}