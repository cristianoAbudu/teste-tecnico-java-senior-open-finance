package com.test.client.client;

import com.test.client.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "open-finance-api", url = "${open-finance-api.url}")
public interface OpenFinanceFeignClient {
    @GetMapping("/open-finance/accounts/{accountId}")
    AccountResponse getAccount(@PathVariable String accountId);

    @GetMapping("/open-finance/accounts/{accountId}/transactions")
    TransactionResponse getTransaction(@PathVariable String accountId);
}