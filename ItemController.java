package com.example.godown;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemRepository repository;

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return repository.save(item);
    }

    @GetMapping
    public List<Item> getItems(@RequestParam String category) {
        return repository.findByCategory(category);
    }
}
