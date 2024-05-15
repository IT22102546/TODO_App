package com.example.myapplication

object DataObject {
    var listdata = mutableListOf<CardInfo>()

    fun setData(title: String, priority: String) {

        listdata.add(CardInfo(title = title, priority = priority))
    }

    fun getAllData(): List<CardInfo> {
        return listdata
    }

    fun getData(pos:Int): CardInfo {
        return listdata[pos]
    }

    fun deleteData(pos:Int){
        listdata.removeAt(pos)
    }

    fun updateData(pos:Int,title:String,priority:String) {
        listdata[pos].title = title
        listdata[pos].priority = priority
    }
}
