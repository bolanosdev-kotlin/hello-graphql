package dev.bolanos.hellographql.grpc

import dev.bolanos.v1.common.Balance
import dev.bolanos.v1.services.BalanceCheckRequest
import dev.bolanos.v1.services.BankServiceGrpc
import io.grpc.ManagedChannelBuilder
import org.springframework.stereotype.Service

@Service
class BalanceGrpcClient {

    private val channel = ManagedChannelBuilder.forAddress("localhost", 6565)
        .usePlaintext()
        .build()
    private val bankService = BankServiceGrpc.newBlockingStub(channel)

    fun getBalance(): Balance? {
        val request = BalanceCheckRequest.newBuilder().setAccountNumber(1).build()
        return bankService.getBalance(request)
    }
}