package com.nathan.anagrama.payload.request;

public class AnagramaRequest {
    private String palavra1;
    private String palavra2;

    public String getPalavra2() {
        return palavra2;
    }

    public void setPalavra2(String palavra2) {
        this.palavra2 = palavra2;
    }

    public String getPalavra1() {
        return palavra1;
    }

    public void setPalavra1(String palavra1) {
        this.palavra1 = palavra1;
    }
}
