package com.test.openfinance.model;

import java.math.BigDecimal;

public record Transaction(String transactionId, String type, BigDecimal amount, String date) {
}