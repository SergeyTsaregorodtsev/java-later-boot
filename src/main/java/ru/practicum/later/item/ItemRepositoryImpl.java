package ru.practicum.later.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Repository
public class ItemRepositoryImpl {
    private final Map<Long, Map<Long,Item>> items = new HashMap<>();
    static private long counter;

    //@Override
    public List<Item> findByUserId(long userId) {
        Map<Long,Item> userItems = items.get(userId);
        return new ArrayList<>(userItems.values());
    }

    //@Override
    public Item save(long userId, Item item) {
        item.setId(++counter);
        Map<Long,Item> userItems = items.get(userId);
        userItems.put(counter,item);
        items.put(userId,userItems);
        return item;
    }

    //@Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {
        Map<Long,Item> userItems = items.get(userId);
        userItems.remove(itemId);
        items.put(userId,userItems);
    }
}
