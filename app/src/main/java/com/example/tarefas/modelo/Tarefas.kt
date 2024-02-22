package com.example.tarefas.modelo

data class Tarefas(private val tarefa: String? = null) {
    fun getNome(): String? {
        return tarefa
    }
}
