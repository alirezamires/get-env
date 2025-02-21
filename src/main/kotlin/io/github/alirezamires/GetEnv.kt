package io.github.alirezamires
import org.slf4j.Logger
import org.slf4j.LoggerFactory

val logger:Logger = LoggerFactory.getLogger("alirezamires.get_env")
inline fun <reified T> env(
    key: String,
    default: T,
): T =
    try {
        when (T::class) {
            Int::class -> System.getenv(key).toInt()
            Double::class -> System.getenv(key).toDouble()
            String::class -> System.getenv(key).toString()
            Long::class -> System.getenv(key).toLong()
            Float::class -> System.getenv(key).toFloat()
            else -> throw Exception("Unsupported type")
        } as T
    } catch (_: NullPointerException) {
        logger.warn("Environment Key: $key Not found!")
        default
    }