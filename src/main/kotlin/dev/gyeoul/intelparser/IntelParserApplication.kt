package dev.gyeoul.intelparser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntelParserApplication

fun main(args: Array<String>) {
    runApplication<IntelParserApplication>(*args)
}
