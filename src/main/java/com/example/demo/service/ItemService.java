package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepo;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ItemService{

  private final ItemRepo repo;

  public ItemService(ItemRepo repo) {
    this.repo = repo;
  }

  public  Item save(Item item) {
    return repo.save(item);
  }

  public void deleteById(String id) {
      repo.deleteById(id);
  }

  public Optional<Item> findById(String id) {
    return repo.findById(id);
  }

  public Iterable<Item> findAll() {
    return repo.findAll();
  }
}
