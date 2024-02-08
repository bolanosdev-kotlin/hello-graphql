package dev.bolanos.hellographql.queries

import com.expediagroup.graphql.server.operations.Query
import dev.bolanos.hellographql.output.User
import dev.bolanos.v1.common.Person
import org.springframework.stereotype.Component

@Component
class UsersQuery: Query {
    fun users(): List<User> {
         var person = Person.newBuilder().setName("carlos").setAge(30).build()
        return listOf(User(person.name, person.age))
    }
}