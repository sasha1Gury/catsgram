package ru.yandex.practicum.catsgram.model;

import lombok.Getter;

@Getter
public record ErrorResponse(String error) {
}
