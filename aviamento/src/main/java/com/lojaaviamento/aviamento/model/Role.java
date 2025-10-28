package com.lojaaviamento.aviamento.model;

public enum Role {
    ADMIN("Administrador"),
    USUARIO("Usuário"),
    GERENTE("Gerente");

    private final String descricao;

    Role(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
