package com.example.viewbindingrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindingrv.databinding.RecyclerviewItemBinding


class MainAdapter(val taskList: List<Task>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    inner class MainViewHolder(val itembinding: RecyclerviewItemBinding)
        :RecyclerView.ViewHolder(itembinding.root) {
            fun bindItem(task: Task) {
                itembinding.titleTv.text = task.title
                itembinding.timeTv.text = task.timeStamp
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task = taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
       return taskList.size
    }
}