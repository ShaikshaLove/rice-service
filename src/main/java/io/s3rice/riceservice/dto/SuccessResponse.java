package io.s3rice.riceservice.dto;

public class SuccessResponse {

    private Message content;

    public Message getContent() {
        return content;
    }

    public SuccessResponse(Message content) {
        this.content = content;
    }

    public void setContent(Message content) {
        this.content = content;
}
}
