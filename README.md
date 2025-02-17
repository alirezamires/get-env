# get-env [![](https://jitpack.io/v/alirezamires/get-env.svg)](https://jitpack.io/#alirezamires/get-env)

A lightweight Kotlin utility to retrieve environment variables with ease.

## Features

- Simple and efficient way to access environment variables.
- Provides default values when variables are not set.
- Supports type conversion (string, number, boolean, etc.).

## Installation

Add the following dependency to your `build.gradle.kts`:

```kotlin
repositories {
  mavenCentral()
  maven { url 'https://jitpack.io' }
}
dependencies {
    //...
    implementation("com.github.alirezamires:get-env:0.0.1")
}
```

## Usage

```kotlin
import env

val port: Int = env("PORT", 3000)
val isProduction: Boolean = env("NODE_ENV", "development") == "production"

println("Server running on port \$port, mode: ${if (isProduction) "Production" else "Development"}")
```

## API

### `env(key: String, defaultValue: Any): Any`

- `key` *(String)* - The name of the environment variable.
- `defaultValue` *(Any, optional)* - The default value if the variable is not set.

Returns the environment variable value or the default value.

## License

MIT License

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

## Author

Developed by [Alireza Mires](https://github.com/alirezamires).


