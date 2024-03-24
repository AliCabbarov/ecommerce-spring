package com.example.ecommerse.service.user;

import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<Void> delete();

    void deleteById(Long id);
}
