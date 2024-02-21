package com.example.datahub_back.service.backDataService

import com.example.datahub_back.data.devTool.exampleColumnList
import com.example.datahub_back.dto.devTool.Column
import com.example.datahub_back.dto.devTool.Table
import org.springframework.stereotype.Service

@Service
class ColumnService {

    fun getColumnByTable(table: Table) = exampleColumnList.filter { it.table == table }

    fun getColumnById(id: Long): Column? = exampleColumnList.find { it.id == id }

    fun createColumn(column: Column): Column {
        exampleColumnList.add(column)
        return column
    }

    fun updateColumn(id: Long, updatedColumn: Column): Column? {
        val index = exampleColumnList.indexOfFirst { it.id == id }
        return if (index != -1) {
            exampleColumnList[index] = updatedColumn
            updatedColumn
        } else {
            null
        }
    }

    fun deleteColumn(id: Long): Column? {
        val column = exampleColumnList.find { it.id == id }
        if (column != null) {
            exampleColumnList.remove(column)
        }
        return column
    }
}