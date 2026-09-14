package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.entity.Mall;
import com.example.demo.entity.User;

import java.util.List;

public interface ICustomerService {

    List<Item> searchItem(String itemName);

    Item orderItem(Item item);

    Mall searchMall(long id);

    Boolean cancelOrder(long orderId);

    User login(User user);

    boolean logOut();
}