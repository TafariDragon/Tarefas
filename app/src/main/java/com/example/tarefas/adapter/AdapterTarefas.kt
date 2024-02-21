package com.example.tarefas.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.tarefas.modelo.Tarefas

class AdapterTarefas (private val context:Context,private val listaTarefas:MutableList<Tarefas>):RecyclerView.Adapter<TarefasViewHolder>
{

    inner class TarefasViewHolder():RecyclerView.ViewHolder{
        
    }
}