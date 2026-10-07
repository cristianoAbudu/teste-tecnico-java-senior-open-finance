package com.test.client.service;

import com.test.client.client.OpenFinanceFeignClient;
import com.test.client.model.AccountResponse;
import com.test.client.model.TransactionResponse;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final OpenFinanceFeignClient c;

    public AccountService(OpenFinanceFeignClient c) {
        this.c = c;
    }

    public AccountResponse getAccount(String id) {
        return c.getAccount(id);
    }

    public TransactionResponse getTransaction(String id) {
        return c.getTransaction(id);
    }
}