package com.andreas.fiedler.example.telefon_register.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.andreas.fiedler.example.telefon_register.data.Adress
import com.andreas.fiedler.example.telefon_register.databinding.ListItemBinding

class ItemAdapter {
    class ItemAdapter(
        private val dataset: List<Adress>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

        /**
         * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
         */
        inner class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

        /**
         * hier werden neue ViewHolder erstellt
         */
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ItemViewHolder(binding)
        }

        /**
         * damit der LayoutManager weiß, wie lang die Liste ist
         */
        override fun getItemCount(): Int {
            return dataset.size
        }

        /**
         * hier findet der Recyclingprozess statt
         * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
         */
        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

            val item = dataset[position]

            holder.binding.nameTV.text = item.name
            holder.binding.phoneTV.text = item.number
            holder.binding.cityTV.text = item.city

            holder.binding.adressCV.setOnClickListener{
                var navcontroller = holder.binding.root.findNavController()
               // navcontroller.navigate(ListFragmentDirection.actionListFragmentToDetailFragment(position.toString()))
            }
        }




    }
}