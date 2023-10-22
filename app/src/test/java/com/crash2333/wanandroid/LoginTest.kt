package com.crash2333.wanandroid

import okhttp3.HttpUrl
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before

/**
 *  author : zhifeng.mo
 *  date : 2023/10/22
 *  description :
 *  https://freedium.cfd/https://medium.com/mobile-app-development-publication/android-mock-server-for-unittest-82f5bbbf0362
 */
class LoginTest {
    private var server = MockWebServer()
    @Before
    fun setup() {
        server.start(8080)
        val baseUrl: HttpUrl = server.url("/v1/")
    }

    @After
    fun tearDown() {
        server.shutdown()
    }

}