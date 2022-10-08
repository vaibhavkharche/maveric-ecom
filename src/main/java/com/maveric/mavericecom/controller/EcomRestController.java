package com.maveric.mavericecom.controller;

import com.maveric.mavericecom.entity.Category;
import com.maveric.mavericecom.entity.User;
import com.maveric.mavericecom.service.EcomAppService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/rest")
public class EcomRestController {

    @Autowired
    private EcomAppService ecomAppService;

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = "users", description = "Returns all users")
    public ResponseEntity<Object> getAllUsers() {
        log.info("getting all users");
        return new ResponseEntity<>(ecomAppService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId) {
        return new ResponseEntity<>(ecomAppService.getUserById(userId), HttpStatus.OK);
    }

    @GetMapping("/image/{id}")
    @Operation(tags = "image", description = "Get image by id")
    public byte[] getImage(@PathVariable("id") Long imageId) {
        return ecomAppService.getImage(imageId);
    }

    @GetMapping(value = "/categories", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllCategories() {
        return new ResponseEntity<>(ecomAppService.getAllCategories(), HttpStatus.OK);
    }

    @GetMapping(value = "/category/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("id") Long categoryId) {
        return new ResponseEntity<>(ecomAppService.getCategoryById(categoryId), HttpStatus.OK);
    }

    @GetMapping(value = "/items", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllItems() {
        return new ResponseEntity<>(ecomAppService.getAllItems(), HttpStatus.OK);
    }

    @GetMapping(value = "/itemsbycateg", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getItemsByCategory(@RequestParam(name = "categoryId", required = false) Long categoryId,
                                                     @RequestParam(name = "category", required = false) String category) {
        return new ResponseEntity<>(ecomAppService.getItemsByCategoryIdOrTitle(categoryId, category), HttpStatus.OK);
    }

    @GetMapping(value = "/cmtsbyitem", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getCommentsByItemId(@RequestParam Long itemId) {
        return new ResponseEntity<>(ecomAppService.getCommetsByItemId(itemId), HttpStatus.OK);
    }

    @GetMapping(value = "/cmtsbyuser", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getCommentsByUser(@RequestParam Long userId) {
        return new ResponseEntity<>(ecomAppService.getCommentsByUser(userId), HttpStatus.OK);
    }

}
