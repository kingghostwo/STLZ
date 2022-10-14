package com.STLZ.commons;

import lombok.Data;

@Data
public class Results<T> {

    private int status;
    private String message;
    private T object;

    public Results(int status, String message, T object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    public Results() {
    }

    public Results(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public enum ResultStatus {
        SUCCESS(200), FAILED(500);

        public int status;

        private ResultStatus(int status) {
            this.status = status;
        }
    }
}
