package com.biblionexus.kmpwithcwprototype

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform