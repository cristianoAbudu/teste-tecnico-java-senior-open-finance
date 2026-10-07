package com.test.client.model;

import java.math.BigDecimal;

public record TransactionResponse(String transactionId, String type, BigDecimal amount, String date) {
}