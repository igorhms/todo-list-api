package com.project.todo.constants;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PriorityType {

    LOW("baixa"),
    MEDIUM("media"),

    HIGH("alta");

    private final String descricao;

    PriorityType(String descricao) {
        this.descricao = descricao;
    }

    @JsonValue
    public String getDescricao() {
        return descricao;
    }
}
