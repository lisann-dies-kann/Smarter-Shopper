package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/items")
    public List<ListItem> showDemoItem() {
        return List.of(
                new ListItem(),
            new ListItem(),
            new ListItem(),
            new ListItem()
        );
    }
}
