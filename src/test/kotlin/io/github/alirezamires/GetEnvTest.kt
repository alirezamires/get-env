import io.github.alirezamires.env
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
class GetEnvTest {
    @Test
    fun testGetEnv() {
        assertEquals(10, env("TEST_INT", 0))
        assertEquals(20.5, env("TEST_DOUBLE", 0.0), 0.0)
        assertEquals("Hello", env("TEST_STRING", "Default"))
        assertEquals(123456789L, env("TEST_LONG", 0L))
        assertEquals(3.14f, env("TEST_FLOAT", 0f), 0f)
    }
    @Test
    fun testGetEnvWithDefault() {
        assertEquals(42, env("MISSING_INT", 42))
        assertEquals(9.99, env("MISSING_DOUBLE", 9.99), 0.0)
        assertEquals("DefaultString", env("MISSING_STRING", "DefaultString"))
        assertEquals(987654321L, env("MISSING_LONG", 987654321L))
        assertEquals(1.23f, env("MISSING_FLOAT", 1.23f), 0f)
    }
}
