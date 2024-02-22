package com.example.tarefas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tarefas.databinding.TarefasItemBinding
import com.example.tarefas.modelo.Tarefas

class AdapterTarefas (private val context:Context,private val listaTarefas:MutableList<Tarefas>):RecyclerView.Adapter<AdapterTarefas.TarefasViewHolder>()
{

    private  lateinit var binding: TarefasItemBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefasViewHolder {
        binding = TarefasItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return TarefasViewHolder(binding)
    }

    // AdapterTarefas.kt

    override fun onBindViewHolder(holder: TarefasViewHolder, position: Int) {
        holder.txtTarefas.text= listaTarefas[position].getNome()
    }

    override fun getItemCount(): Int {
        return listaTarefas.size // Return the size of the list
    }



// Rest of the code remains the same


    inner class TarefasViewHolder(private val binding: TarefasItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val txtTarefas = binding.txtTarefas
    }
}