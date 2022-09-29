package com.expenser.controller;

import com.expenser.openapi.api.PetApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class PetController implements PetApi {
    @Override
    public ResponseEntity<Void> _getPet() {
        System.out.println("Hello from controller!");
        return null;
    }
}