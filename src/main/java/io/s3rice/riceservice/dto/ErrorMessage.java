package io.s3rice.riceservice.dto;

public class ErrorMessage extends Message {

    private String type;

    public ErrorMessage(String message, int code, String type) {
        super(message, code);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public ErrorMessage() {
    }

    public void setType(String type) {
        this.type = type;
    }
}
