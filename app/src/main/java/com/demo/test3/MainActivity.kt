package com.demo.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.test.factory.DaoFactory
import com.demo.test3.dao.SitCodeDao

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val query = DaoFactory.daoFactory.getSitCodeDao().queryBuilder().orderAsc(SitCodeDao.Properties.Code).build()
        val list: List<SitCode> = query.list()//list:获取sqlite数据库的二级列表数据可以显示在可扩展二级列表的(用ExpandableListView或者你写你有需求的就即可)

    }
}