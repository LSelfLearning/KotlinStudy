package cn.kotliner.kotlin.box

import complex.box.AbsBox

/**
 * Created by benny on 5/28/17.
 */
class BoxImpl3: AbsBox() {
    override fun get(key: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val size: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun containsKey(key: Int?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsValue(value: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val entries: MutableSet<MutableMap.MutableEntry<Int, String>>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val keys: MutableSet<Int>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val values: MutableCollection<String>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun clear() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun put(key: Int?, value: String?): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun putAll(from: Map<out Int, String>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(key: Int?): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}