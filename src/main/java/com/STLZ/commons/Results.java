package com.STLZ.commons;

import lombok.Data;

@Data
public class Results<T> {

    private int status;
    private String message;
    private T object;

    public enum ResultStatus {
        SUCCESS(200), FAILED(500);

        public int status;

        private ResultStatus(int status) {
            this.status = status;
        }
    }
}
