fun main() {
    println(sheldon())
}

external fun eval(a: String)

fun foo(x: Int): String {
    val a = "hello"

    val b = if (x > 6) {
        1 + 1
        a + "1"
    } else {
        2+2
        a + "2"
    }

    return if (x > 5) a else "No$a"
}

fun foo2(x: Int): String {
    val a = "hello"
    foo3(x)

    return if (x > 5)
        "hello"
    else
        "Nohello"
}

fun foo3(x: Int): String {
    return if (x > 5) "hello" else "Nohello"
}

fun bar() = "bar"

class Data {
    companion object {
        init {
            println("Hello")
        }
    }
}