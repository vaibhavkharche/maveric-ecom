package com.maveric.mavericecom.controller;

import com.maveric.mavericecom.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/ecom/rest")
public class EcomRestController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = "users", description = "Returns all users")
    public @ResponseBody ResponseEntity<Object> getItems() {
        log.info("getting all users");
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
}
