package br.com.rodpk.ticketcentralapi.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodpk.ticketcentralapi.model.User;
import br.com.rodpk.ticketcentralapi.service.UserService;
import br.com.rodpk.ticketcentralapi.to.LoginRequest;
import br.com.rodpk.ticketcentralapi.to.UserRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(service.findById(UUID.fromString(id)));
    }

    @GetMapping("")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("")
    public ResponseEntity<User> save(@RequestBody UserRequest req) {
        return ResponseEntity.ok(service.save(req));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable("id") String id, @RequestBody UserRequest req) {
        return ResponseEntity.ok(service.update(id, req));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") String id) {
        service.delete(id);
        return ResponseEntity.ok(" {"+id+"} deleted");
    }

    @GetMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest req) {
        return ResponseEntity.ok(service.login(req));
    }
}
