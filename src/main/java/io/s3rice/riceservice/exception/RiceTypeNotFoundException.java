package io.s3rice.riceservice.exception;

public class RiceTypeNotFoundException extends RuntimeException {

    public RiceTypeNotFoundException(String message) {
        super(message);
    }

    public RiceTypeNotFoundException() {
        super();
    }
}
