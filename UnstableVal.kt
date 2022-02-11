package coursera

private var fooInternal = 0
val foo: Int
    get() = fooInternal++

fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}
