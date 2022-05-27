# SAVE NULL EXTENSION

[![](https://jitpack.io/v/xavijimenezmulet/save_null_extension_kotlin.svg)](https://jitpack.io/#xavijimenezmulet/save_null_extension_kotlin)


This library is used to control an attribute if it comes to null, what it will do is remove that null and give it a default value. Ideal for dealing with business models where attributes can be nullable.

## Installation

Step 1. Add it in your root build.gradle at the end of repositories:

```bash
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```

Step 2. Add the dependency:

```bash
dependencies {
	implementation "com.github.xavijimenezmulet:save_null_extension_kotlin:$last_version"
}
```

## Usage

If you have a class where null attributes can come. The library helps prevent them in a single line without having to check them.
Let's add an example class:

```kotlin
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
)
```

Now we are going to show an example of an extension, for example of string:

```kotlin
fun String?.saveNull(defaultValue: String = ""): String {
    return this ?: defaultValue
}
```

If we look at the extension it controls that a string can be nullable. If the string is not nullable, it returns the attribute itself. But on the contrary, if it is nullable, it will return the default value (By default it will be empty string).
All extensions have a default value that we can modify to our liking if we want.

Now let's show an example with the "Example" class:

```kotlin
private fun initExample() {
  val example = Example()
  val text: String = example.string.saveNull("No available")
  textView.text = text
}
```

The value of "text" will always have a value. It can be the string attribute of the Example class if it is not null.
If it is, we have added a default value that says "not available" so the textView will always show a result.

## License
[APACHE LICENSE 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt)
