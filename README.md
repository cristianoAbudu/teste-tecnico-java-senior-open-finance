# Teste Técnico — Java Sênior | Open Finance

Tempo: 30 minutos.

## Objetivo
Completar a integração entre dois microserviços Spring Boot. A API de referência simula dois endpoints de dados do Open Finance:

- GET /open-finance/accounts/{accountId}
- GET /open-finance/accounts/{accountId}/transactions

O primeiro consumo já está implementado no cliente. Implemente somente o segundo consumo usando OpenFeign e exponha-o por um endpoint REST no cliente.

## Tarefa
No projeto `open-finance-client`:
1. Completar `OpenFinanceFeignClient` com o método para `GET /open-finance/accounts/{accountId}/transactions`, retornando `List<TransactionResponse>`;
2. Completar `ClientController` com `GET /client/accounts/{accountId}/transactions`;
3. O endpoint deve usar o Feign Client e retornar a lista recebida da API.

Não altere o projeto `open-finance-api`.

## Resultado esperado
GET http://localhost:8080/client/accounts/12345/transactions

Resposta:
[
  {"transactionId":"tx-001","type":"PIX","amount":150.00,"date":"2026-10-01"},
  {"transactionId":"tx-002","type":"DEBIT","amount":80.50,"date":"2026-10-02"},
  {"transactionId":"tx-003","type":"PIX","amount":300.00,"date":"2026-10-03"}
]

## Executar
Requisitos: Docker e Docker Compose.

`docker compose up --build`

API: http://localhost:8081/open-finance/accounts/12345
API transações: http://localhost:8081/open-finance/accounts/12345/transactions
Swagger: http://localhost:8081/swagger-ui.html
Cliente: http://localhost:8080/client/accounts/12345
Endpoint a implementar: http://localhost:8080/client/accounts/12345/transactions
