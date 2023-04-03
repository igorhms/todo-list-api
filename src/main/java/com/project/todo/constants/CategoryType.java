package com.project.todo.constants;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CategoryType {
    PESSOAL("pessoal"),
    TRABALHO("trabalho");

    private final String descricao;

    CategoryType(String descricao) {
        this.descricao = descricao;
    }

    @JsonValue
    public String getDescricao() {
        return descricao;
    }
}

