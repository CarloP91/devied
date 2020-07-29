package com.example.devied.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hello {
    @JsonProperty("Testo") //trasforma la stringa in Json
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
