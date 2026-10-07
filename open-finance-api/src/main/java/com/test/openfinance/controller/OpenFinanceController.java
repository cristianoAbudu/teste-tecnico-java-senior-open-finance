package com.test.openfinance.controller;

import com.test.openfinance.model.*;
import com.test.openfinance.service.OpenFinanceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/open-finance")
@Tag(name = "Open Finance")
public class OpenFinanceController {
    private final OpenFinanceService s;

    public OpenFinanceController(OpenFinanceService s) {
        this.s = s;
    }

    @GetMapping("/accounts/{accountId}")
    @Operation(summary = "Consulta uma conta")
    public ResponseEntity<Account> account(@PathVariable String accountId) {
        var a = s.findAccount(accountId);
        return a == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(a);
    }

    @GetMapping("/accounts/{accountId}/transactions")
    @Operation(summary = "Consulta transações da conta")
    public ResponseEntity<List<Transaction>> transactions(@PathVariable String accountId) {
        if (s.findAccount(accountId) == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(s.findTransactions(accountId));
    }
}