package dev.bolanos.hellographql.queries

import com.expediagroup.graphql.server.operations.Query
import dev.bolanos.hellographql.grpc.BalanceGrpcClient
import dev.bolanos.hellographql.output.Balance
import org.springframework.stereotype.Component

@Component
class BalancesQuery(private val balanceGrpcClient: BalanceGrpcClient): Query {
    fun getBalance(): Balance {
        val balance = balanceGrpcClient.getBalance()

        if (balance != null) {
            return Balance(balance.account, balance.amount)
        }

        return Balance(-1,0)
    }
}