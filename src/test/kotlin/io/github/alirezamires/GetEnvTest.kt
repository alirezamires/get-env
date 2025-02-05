import io.github.alirezamires.GetEnv
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
class GetEnvTest {
    @Test
    fun testGetEnv() {
        assertEquals(10, GetEnv("TEST_INT", 0))
        assertEquals(20.5, GetEnv("TEST_DOUBLE", 0.0), 0.0)
        assertEquals("Hello", GetEnv("TEST_STRING", "Default"))
        assertEquals(123456789L, GetEnv("TEST_LONG", 0L))
        assertEquals(3.14f, GetEnv("TEST_FLOAT", 0f), 0f)
    }
    @Test
    fun testGetEnvWithDefault() {
        assertEquals(42, GetEnv("MISSING_INT", 42))
        assertEquals(9.99, GetEnv("MISSING_DOUBLE", 9.99), 0.0)
        assertEquals("DefaultString", GetEnv("MISSING_STRING", "DefaultString"))
        assertEquals(987654321L, GetEnv("MISSING_LONG", 987654321L))
        assertEquals(1.23f, GetEnv("MISSING_FLOAT", 1.23f), 0f)
    }
}
