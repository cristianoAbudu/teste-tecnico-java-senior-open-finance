package com.test.openfinance.service;

import com.test.openfinance.model.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OpenFinanceService {
    public Account findAccount(String id) {
        return "12345".equals(id) ? new Account("12345", "Banco Exemplo", "000123-4", "CHECKING_ACCOUNT") : null;
    }

    public List<Transaction> findTransactions(String id) {
        if (findAccount(id) == null) return List.of();
        return List.of(new Transaction("tx-001", "PIX", new BigDecimal("150.00"), "2026-10-01"), new Transaction("tx-002", "DEBIT", new BigDecimal("80.50"), "2026-10-02"), new Transaction("tx-003", "PIX", new BigDecimal("300.00"), "2026-10-03"));
    }
}