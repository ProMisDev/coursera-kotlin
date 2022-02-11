package coursera

open class A2(open val value: String) {
    init {
        value.length
    }
}

class B(override val value: String) : A2(value)

fun main(args: Array<String>) {
    B("a")
}
