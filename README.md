# Spring Boot Warmup Exercises

Performing the most basic of Spring Boot tasks

1. Hello Ping - `PingController.java`

  * Endpoint: GET /ping → 200 body: "pong" (plain text).
  * Assess: controller wiring, simplest mapping.

2. Path & Query Params - `GreetController.java`

  * Endpoint: GET /greet/{name}?yell=true|false
  * If yell=true: return 200 body: "HELLO, {NAME}!" Else: "Hello {name}."
  * Assess: @PathVariable, @RequestParam, basic branching.

3. JSON Echo + Status - `EchoRequest.java`, `EchoResponse.java`, `EchoController.java`
  
  * Endpoint: POST /echo with JSON {"msg":"hi"} → 201 body {"length":2} and header Location: /echo/{uuid}.
  * Assess: @RequestBody, building responses, DTOs, headers
