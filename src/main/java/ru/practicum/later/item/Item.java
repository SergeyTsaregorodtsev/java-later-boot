package ru.practicum.later.item;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private Long userId;
    private String url;
}
