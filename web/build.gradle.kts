plugins {
    kotlin("multiplatform") version "2.0.20-RC"
//    kotlin("plugin.serialization") version "2.0.20-RC"
}

kotlin {
        js(IR) {
            browser {
                commonWebpackConfig {
                    cssSupport {
                        enabled.set(true)
                    }
                }
            }
            binaries.executable()
            useEsModules()
        }
        sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:1.0.0-pre.787"))
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react")

                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")

                implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion")

//                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
//                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
            }
        }
    }
}