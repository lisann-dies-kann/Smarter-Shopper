package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListItemService {

    @Autowired
    ListItemRepository repo;

    public ListItem save(ListItem listItem){
        return repo.save(listItem);
    }

    public ListItem get(Integer id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Id " + id + " nicht gefunden."));
    }
}
