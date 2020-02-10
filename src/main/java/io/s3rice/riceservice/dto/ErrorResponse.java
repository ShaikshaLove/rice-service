package io.s3rice.riceservice.dto;

public class ErrorResponse {
    private Message error;

    public Message getError() {
        return error;
    }

    public void setError(Message error) {
        this.error = error;
    }

    public ErrorResponse(Message error) {
        this.error = error;
    }
}
