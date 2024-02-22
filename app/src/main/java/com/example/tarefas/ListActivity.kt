package com.example.tarefas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tarefas.adapter.AdapterTarefas
import com.example.tarefas.databinding.ActivityListBinding
import com.example.tarefas.modelo.Tarefas

class ListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    private lateinit var adapterTarefas: AdapterTarefas
    private  var listatarefas:MutableList<Tarefas> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val recyclerViewTarefas = binding.recycleVieww
        recyclerViewTarefas.layoutManager= LinearLayoutManager(this)
        recyclerViewTarefas.setHasFixedSize(true)
        adapterTarefas= AdapterTarefas(this,listatarefas)
        recyclerViewTarefas.adapter=adapterTarefas
        inserirTarefas()

    }

    fun inserirTarefas()
    {
        val tarefa1= Tarefas("Learn Kotlin")
        listatarefas.add(tarefa1)
        val tarefa2= Tarefas("Programming")
        listatarefas.add(tarefa2)
        val tarefa3= Tarefas("Work on google")
        listatarefas.add(tarefa3)
        val tarefa4= Tarefas("Study")
        listatarefas.add(tarefa4)
    }
}