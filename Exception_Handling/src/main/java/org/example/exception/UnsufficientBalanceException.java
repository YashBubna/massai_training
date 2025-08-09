package org.example.exception;

public class UnsufficientBalanceException extends Exception {

    private String msg;

    public UnsufficientBalanceException() {
    }

    public UnsufficientBalanceException(String message) {
        super(message);
        this.msg = message;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
