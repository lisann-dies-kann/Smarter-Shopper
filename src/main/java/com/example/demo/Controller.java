package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class Controller {

    @Autowired
    private ListItemService listItemService;

    @GetMapping("/items")
    public List<ListItem> showDemoItem() {
        return listItemService.getAllItems();}

    @PostMapping("/items")
    public ListItem addItem(@RequestBody ListItem item) {
        listItemService.addItem(new ListItem(item.getName()));
        System.out.println("Item added: " + listItemService.getAllItems().getLast().getName());
        return listItemService.getAllItems().getLast();
    }

    /*
    @PutMapping("/items/{id}")
    public ListItem updateItem(@PathVariable int id, @RequestBody ListItem item){
        return(ListItemService.updateItem(id, item));

    }*/
}
