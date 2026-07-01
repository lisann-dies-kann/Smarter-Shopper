package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class Controller {

    @Autowired
    public ListItemRepository listItemRepository;

    @Autowired
    ListItemService listItemService;

    @GetMapping("/items")
    public Iterable<ListItem> einkaufsliste(ListItemRepository lp){
        return listItemService.getAllItems();
    }

    @PostMapping("/post/addItem")
    public ListItem createListItem(@RequestBody ListItem listItem){
        return listItemService.save(listItem);
    }
}
