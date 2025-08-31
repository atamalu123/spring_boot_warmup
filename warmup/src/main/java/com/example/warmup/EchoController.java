package com.example.warmup;
import java.net.URI;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Endpoint: POST /echo with JSON {"msg":"hi"} → 201 body {"length":2} and header Location: /echo/{uuid}.
@RestController
@RequestMapping("/echo")
public class EchoController {

    @PostMapping("/echo")
    public ResponseEntity<EchoResponse> echo(@RequestBody EchoRequest request) {
        String message = request.getMsg();

        int length = (message != null) ? message.length() : 0;

        String id = UUID.randomUUID().toString();
        URI location = URI.create("/echo/" + id);

        return ResponseEntity.created(location).body(new EchoResponse(length));
    }
    
}
