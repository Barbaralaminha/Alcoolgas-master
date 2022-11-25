package com.example.alcoolgas;

public class Lista {

    private String mecanico;
    private String contato;

    public Lista(String mecanico, String contato){
        this.mecanico = mecanico;
        this.contato = contato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }
}