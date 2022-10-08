package com.maveric.mavericecom.service;

import com.maveric.mavericecom.entity.*;
import com.maveric.mavericecom.repository.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class EcomAppService {

    private UserRepository userRepository;
    private CategoryRepository categoryRepository;
    private CommentRepository commentRepository;
    private ImageRepository imageRepository;
    private ItemRepository itemRepository;
    private NotificationRepository notificationRepository;
    private SubscribeRepository subscribeRepository;

    public List<User> getAllUsers() {
        log.debug("Getting all users");
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public byte[] getImage(Long imageId) {
        log.debug("Getting image by id: {}", imageId);
        return imageRepository.findById(imageId).map(Image::getPhoto).orElse(null);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public List<Item> getItemsByCategoryIdOrTitle(Long categoryId, String categoryTitle) {
        if (categoryId != null)
            return itemRepository.findAllByCategoryId(categoryId);
        else if(StringUtils.hasText(categoryTitle))
            return itemRepository.findAllByCategoryTitle(categoryTitle);
        return Collections.emptyList();
    }

    public List<Comment> getCommetsByItemId(Long itemId) {
        return commentRepository.findAllByItemId(itemId);
    }

    public List<Comment> getCommentsByUser(Long userId) {
        return commentRepository.findAllByCommentedById(userId);
    }

}
