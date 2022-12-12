package com.innotree.pilot.board;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum BoarderType {

    Notice("Notice"),
    FAQ("FAQ"),
    QNA("QNA");
    private String name;

    BoarderType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
