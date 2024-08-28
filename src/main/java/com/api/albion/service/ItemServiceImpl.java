package com.api.albion.service;

import com.api.albion.model.ItemData;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Value("classpath:data/items.json")
    Resource file;

    @Override
    public List<ItemData> getAllItemName() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<ItemData> t = objectMapper.readValue(file.getFile(), new TypeReference<List<ItemData>>(){});
            return t;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
