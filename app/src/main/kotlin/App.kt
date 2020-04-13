import kotlin.browser.window

fun main() {
//    console.log(require("my/main.css"))
//    window.asDynamic().a = require("my/main.css")
    println("Sheldon: ${sheldon()}")
}

external fun require(o: String): String

@JsExport
fun foo() = "FOO"