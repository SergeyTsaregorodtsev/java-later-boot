package ru.practicum.later.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository repository;

    @Override
    public List<Item> getItems(long userId) {

        return null;
    }

    @Override
    public Item addNewItem(long userId, Item item) {
        return repository.save(item);
    }

    @Override
    public void deleteItem(long userId, long itemId) {

    }
}
