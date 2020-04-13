import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MyTestSuite {
    @Test
    fun myTest() {
//        foo()
        console.log("LOG")
        console.warn("warn")
        console.error("error")
        console.info("INFO")
        assertEquals(6, 6)
    }
}

//@JsModule("foo")
//external fun foo()