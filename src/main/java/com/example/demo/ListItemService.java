package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder-Klasse für ListItem mit fluenter API.
 */
@Service
public class ListItemService {
    private final List<ListItem> allItems = new ArrayList<>();

    public ListItemService() {
    }

    /*
    public static ListItem updateItem(int id, ListItem item) {
        for(ListItem itemm : allItems) {
            if(item.getId() == id) {
                return itemm;
            }
        }
    }

     */

    public List<ListItem> getAllItems() {
        return allItems;
    }

    public void addItem(ListItem item) {
        allItems.add(item);
    }


}