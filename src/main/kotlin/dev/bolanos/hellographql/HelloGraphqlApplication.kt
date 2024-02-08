package dev.bolanos.hellographql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloGraphqlApplication

fun main(args: Array<String>) {
	runApplication<HelloGraphqlApplication>(*args)
}
