package com.liuxi.tagcloud

import android.content.Context
import android.graphics.BitmapFactory
import android.util.AttributeSet
import android.widget.ImageView
import com.liuxi.tagcloud.library.TagCloudView

/**
 *
 * @Author liuxi
 *
 * @Email xiaoxixizhizhi@gmail.com
 *
 */
class StarView:TagCloudView{
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    var b = BitmapFactory.decodeResource(resources,R.drawable.icon_heart)
    var view = ImageView(context)

    override fun resetChildren() {
        super.resetChildren()
        view.setImageBitmap(b)
        addView(view)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)
        val left: Int = (measuredWidth - view.measuredWidth) / 2
        val top: Int = (measuredHeight - view.measuredHeight) / 2
        view.layout(left, top, left + view.measuredWidth, top + view.measuredHeight)
        view.translationZ = 0f
    }
}