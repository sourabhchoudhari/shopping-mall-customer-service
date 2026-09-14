package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.entity.Mall;
import com.example.demo.entity.OrderDetails;
import com.example.demo.entity.User;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.MallRepository;
import com.example.demo.repository.OrderDetailsRepository;
import com.example.demo.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private final ItemRepository itemRepository;
    private final MallRepository mallRepository;
    private final OrderDetailsRepository orderDetailsRepository;
    private final UserRepository userRepository;

    private boolean loggedIn = false;

    public CustomerServiceImpl(
            ItemRepository itemRepository,
            MallRepository mallRepository,
            OrderDetailsRepository orderDetailsRepository,
            UserRepository userRepository) {

        this.itemRepository = itemRepository;
        this.mallRepository = mallRepository;
        this.orderDetailsRepository = orderDetailsRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Item> searchItem(String itemName) {
        return itemRepository.findByNameContainingIgnoreCase(itemName);
    }

    @Override
    public Item orderItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Mall searchMall(long id) {
        return mallRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean cancelOrder(long orderId) {

        if (orderDetailsRepository.existsById((int) orderId)) {
            orderDetailsRepository.deleteById((int) orderId);
            return true;
        }

        return false;
    }

    @Override
    public User login(User user) {

        User existingUser = userRepository.findByName(user.getName());

        if (existingUser != null &&
            existingUser.getPassword().equals(user.getPassword())) {

            loggedIn = true;
            return existingUser;
        }

        return null;
    }

    @Override
    public boolean logOut() {

        if (loggedIn) {
            loggedIn = false;
            return true;
        }

        return false;
    }
}