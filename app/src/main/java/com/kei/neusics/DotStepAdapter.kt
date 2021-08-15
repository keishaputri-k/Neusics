package com.kei.neusics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kei.neusics.databinding.ItemDotStepBinding
import com.kei.neusics.model.Quiz

class DotStepAdapter : RecyclerView.Adapter<DotStepAdapter.ViewHolder>() {

    private val list = arrayListOf<Quiz>()

    fun setDot(dot: List<Quiz>) {
        list.clear()
        list.addAll(dot)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemDotStepBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(private val binding : ItemDotStepBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Quiz){
            with(binding) {
                if (item.isCurrent) dotStep.setImageResource(R.drawable.ic_state_active)
                else dotStep.setImageResource(R.drawable.ic_state_in_active)
            }
        }
    }
}