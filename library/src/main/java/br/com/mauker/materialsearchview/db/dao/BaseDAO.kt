package br.com.mauker.materialsearchview.db.dao

import androidx.room.*

interface BaseDAO<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(obj: T): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(objList: List<T>): List<Long>

    @Update
    fun update(obj: T): Int

    @Delete
    fun delete(obj: T): Int

}