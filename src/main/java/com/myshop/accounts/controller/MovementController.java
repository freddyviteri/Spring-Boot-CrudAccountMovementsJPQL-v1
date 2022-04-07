package com.myshop.accounts.controller;

import com.myshop.accounts.model.Movement;
import com.myshop.accounts.service.MovementServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/movements")
@CrossOrigin(origins = "*")
public class MovementController extends BaseControllerImpl<Movement, MovementServiceImpl> {

    @GetMapping("/searchmovementbyaccount")
    public ResponseEntity<?> getMovementsByAccount(@RequestParam String filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.movementList(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
}
