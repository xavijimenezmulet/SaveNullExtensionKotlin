package com.xavijimenezmulet.savenullextension.domain.entity


/**
 * @author Xavier Jimenez Mulet
 * @since 27/5/22
 * @email xavijimenezmulet@gmail.com
 */
data class Example(
    val byte: Byte?,
    val short: Short?,
    val int: Int?,
    val long: Long?,
    val float: Float?,
    val double: Double?,
    val char: Char?,
    val string: String?,
    val boolean: Boolean?,
    val list: List<String>?,
    val mutableList: MutableList<String>?,
    val array: Array<String>?
) {
    constructor() : this(null,null,null,null,null,null,null,null,null,null,null,null)
}