package com.example.warmup;

// Response DTO
public class EchoResponse {

    private int length;

    public EchoResponse(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}
