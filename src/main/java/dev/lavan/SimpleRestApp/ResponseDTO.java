package dev.lavan.SimpleRestApp;

import org.springframework.stereotype.Component;

@Component
public class ResponseDTO {
    public ResponseDTO() {
        this.status = null;
        this.error = null;
        this.data = null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    private String error;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;



}
