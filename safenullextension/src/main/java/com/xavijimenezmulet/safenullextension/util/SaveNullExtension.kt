package com.xavijimenezmulet.safenullextension.util


/**
 * @author Xavier Jimenez Mulet
 * @since 27/5/22
 * @email xavijimenezmulet@gmail.com
 */

// =================================================================================================
// Integer Types
// =================================================================================================

fun Byte?.saveNull(defaultValue: Byte = -1): Byte {
    return this ?: defaultValue
}

fun Short?.saveNull(defaultValue: Short = -1): Short {
    return this ?: defaultValue
}

fun Int?.saveNull(defaultValue: Int = -1): Int {
    return this ?: defaultValue
}

fun Long?.saveNull(defaultValue: Long = -1): Long {
    return this ?: defaultValue
}

// =================================================================================================
// Floating-point types
// =================================================================================================

fun Float?.saveNull(defaultValue: Float = -1f): Float {
    return this ?: defaultValue
}

fun Double?.saveNull(defaultValue: Double = -1.0): Double {
    return this ?: defaultValue
}

// =================================================================================================
// Literal types
// =================================================================================================

fun Char?.saveNull(defaultValue: Char = Character.MIN_VALUE): Char {
    return this ?: defaultValue
}

fun String?.saveNull(defaultValue: String = ""): String {
    return this ?: defaultValue
}

// =================================================================================================
// Boolean types
// =================================================================================================

fun Boolean?.saveNull(defaultValue: Boolean = false): Boolean {
    return this ?: defaultValue
}

// =================================================================================================
// List types
// =================================================================================================

fun <T> List<T>?.saveNull(defaultValue: List<T> = arrayListOf()): List<T> {
    return this ?: defaultValue
}

fun <T> MutableList<T>?.saveMutableNull(defaultValue: MutableList<T> = arrayListOf()): MutableList<T> {
    return this ?: defaultValue
}

inline fun <reified T> Array<T>?.saveNull(defaultValue: Array<T> = arrayOf()): Array<T> {
    return this ?: defaultValue
}

