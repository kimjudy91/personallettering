package personal.daom.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform