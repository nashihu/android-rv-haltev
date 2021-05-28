package id.moviedb

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var personGlobal : Person

    @Test
    fun addition_isCorrect() {
        lateinit var personLocalLateinit : Person
        var personLocal = Person(name = "Eko")
        println(personLocal.name)
        personGlobal = Person(name = "Global")
        println(personGlobal.name)
        println("test print")
    }

}

data class Person(var name: String)