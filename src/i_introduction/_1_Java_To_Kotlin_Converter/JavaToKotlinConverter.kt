package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

fun todoTask1(collection: Collection<Int>): Nothing = TODO(
    """
        Task 1.
        Rewrite JavaCode1.task1 in Kotlin.
        In IntelliJ, you can just copy-paste the code and agree to automatically convert it to Kotlin,
        but only for this task!
    """,
    references = { JavaCode1().task1(collection) })


fun task1(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("{");
    var first: Boolean = true
    collection.forEach {
        if (!first) {
            sb.append(", ")
        }
        sb.append(it)
        first = false
    }
    sb.append("}");
    return sb.toString();
}