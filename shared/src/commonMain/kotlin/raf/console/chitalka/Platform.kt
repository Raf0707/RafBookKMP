package raf.console.chitalka

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform