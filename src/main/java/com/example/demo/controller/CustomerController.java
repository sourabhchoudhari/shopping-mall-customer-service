package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.entity.Mall;
import com.example.demo.entity.User;
import com.example.demo.service.ICustomerService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/items")
    public List<Item> searchItem(@RequestParam String name) {
        return customerService.searchItem(name);
    }

    @PostMapping("/order")
    public Item orderItem(@RequestBody Item item) {
        return customerService.orderItem(item);
    }

    @GetMapping("/mall/{id}")
    public Mall searchMall(@PathVariable long id) {
        return customerService.searchMall(id);
    }

    @DeleteMapping("/order/{id}")
    public Boolean cancelOrder(@PathVariable long id) {
        return customerService.cancelOrder(id);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return customerService.login(user);
    }

    @PostMapping("/logout")
    public boolean logOut() {
        return customerService.logOut();
    }
    
}