package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@RestController
public class ItemController {

	 @Autowired
	    private ItemService itemService;

	    @GetMapping
	    public List<Item> getAllItems() {
	        return itemService.getAllItems();
	    }

		/*
		 * @GetMapping("/{id}") public ResponseEntity<Item> getItemById(@PathVariable
		 * String id) { return itemService.getItemById(id) .map(ResponseEntity::ok)
		 * .orElse(ResponseEntity.notFound().build()); }
		 * 
		 * @PostMapping public Item createItem(@RequestBody Item item) { return
		 * itemService.createItem(item); }
		 * 
		 * @PutMapping("/{id}") public ResponseEntity<Item> updateItem(@PathVariable
		 * String id, @RequestBody Item item) { return
		 * ResponseEntity.ok(itemService.updateItem(id, item)); }
		 * 
		 * @DeleteMapping("/{id}") public ResponseEntity<Void> deleteItem(@PathVariable
		 * String id) { itemService.deleteItem(id); return
		 * ResponseEntity.noContent().build(); }
		 */
}
