package com.example.warmup;

// Request DTO
public class EchoRequest {
    private String msg;

    // Constructors
    public EchoRequest() { }

    public EchoRequest(String msg) {
        this.msg = msg;
    }

    // Getter/setter
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
