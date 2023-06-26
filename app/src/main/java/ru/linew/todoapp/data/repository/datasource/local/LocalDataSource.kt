package ru.linew.todoapp.data.repository.datasource.local

import ru.linew.todoapp.data.model.TodoItemData

interface LocalDataSource {
    suspend fun getListOfTodos(): List<TodoItemData>

    suspend fun getTodoById(id: String): TodoItemData
    suspend fun addTodo(todoItem: TodoItemData)

    suspend fun addListOfTodos(todoItemList: List<TodoItemData>)

    suspend fun removeTodo(todoItem: TodoItemData)

    suspend fun updateTodo(todoItem: TodoItemData)
}