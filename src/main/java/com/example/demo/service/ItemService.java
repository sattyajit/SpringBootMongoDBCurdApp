package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
	 public List<Item> getAllItems() {
	        return itemRepository.findAll();
	    }

	    public Optional<Item> getItemById(String id) {
	        return itemRepository.findById(id);
	    }

	    public Item createItem(Item item) {
	        return itemRepository.save(item);
	    }

	    public Item updateItem(String id, Item item) {
	        item.setId(id);
	        return itemRepository.save(item);
	    }

	    public void deleteItem(String id) {
	        itemRepository.deleteById(id);
	    }

}
