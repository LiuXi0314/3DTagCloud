package com.liuxi.tagcloud

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.liuxi.tagcloud.library.TagsAdapter

/**
 *
 * @Author liuxi
 *
 * @Email xiaoxixizhizhi@gmail.com
 *
 */
class TagAdapter : TagsAdapter() {

    var array = arrayListOf<String>()

    override fun getCount(): Int {
        return array.size
    }

    override fun getView(context: Context?, position: Int, parent: ViewGroup?): View {
        var textView = LayoutInflater.from(context).inflate(R.layout.item_tag, parent, false) as TextView
        textView.text = array[position]
        return textView
    }

    override fun getItem(position: Int): Any {
        return array[position]
    }

    override fun getPopularity(position: Int): Int {
        return position%9
    }

    override fun onThemeColorChanged(view: View?, themeColor: Int, alpha: Float) {

    }

}