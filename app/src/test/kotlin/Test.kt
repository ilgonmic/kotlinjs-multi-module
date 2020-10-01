import kotlin.test.Test
import kotlin.test.assertTrue

class MyTestSuite {
    @Test
    fun myTest() {
        assertTrue { foo(6) == "Hello" }
    }

    @Test
    fun myTest2() {
        assertTrue { foo(4) == "Nohello" }
    }
}