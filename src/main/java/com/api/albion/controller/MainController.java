package com.api.albion.controller;


import com.api.albion.model.ItemData;
import com.api.albion.service.ItemService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    private final ItemService itemService;
    public MainController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/")
    public List<String> home() throws IOException {
        List<ItemData> items =  itemService.getAllItemName();
        List<String> names = new ArrayList<>();
        for (ItemData item: items) {
            names.add(item.getUniqueName());
        }
        return names;
    }
}
