package com.api.albion.service;

import com.api.albion.model.ItemData;

import java.io.IOException;
import java.util.List;
public interface ItemService {


    List<ItemData> getAllItemName() throws IOException;
}
