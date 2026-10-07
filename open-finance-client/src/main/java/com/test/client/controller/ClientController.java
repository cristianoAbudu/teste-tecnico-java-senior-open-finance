package com.test.client.controller;

import com.test.client.model.AccountResponse;
import com.test.client.model.TransactionResponse;
import com.test.client.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final AccountService s;

    public ClientController(AccountService s) {
        this.s = s;
    }

    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<AccountResponse> account(@PathVariable String accountId) {
        return ResponseEntity.ok(s.getAccount(accountId));
    }

    @GetMapping("/accounts/{accountId}/transactions")
    public ResponseEntity<TransactionResponse> transaction(@PathVariable String accountId) {
        return ResponseEntity.ok(s.getTransaction(accountId));
    }
}