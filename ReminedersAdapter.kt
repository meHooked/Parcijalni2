package com.example.parcijalni2_28062023

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ReminedersAdapter(val items: ArrayList<Reminders>, val context: Context) : Adapter<RemindersLanguageHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RemindersLanguageHolder {
        return RemindersLanguageHolder(LayoutInflater.from(context).inflate(R.layout.reminders_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RemindersLanguageHolder, position: Int) {
        holder.tvTitle.text = items[position].title
        holder.tvDetails.text = items[position].details
    }
}

class RemindersLanguageHolder(view: View): ViewHolder(view) {
    val tvTitle: TextView = view.findViewById(R.id.tvTitle)
    val tvDetails: TextView = view.findViewById(R.id.tvDetails)

}
