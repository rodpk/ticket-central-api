package br.com.rodpk.ticketcentralapi.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rodpk.ticketcentralapi.model.User;
import br.com.rodpk.ticketcentralapi.repository.UserRepository;
import br.com.rodpk.ticketcentralapi.to.UserRequest;

@Service
public class UserService {
    

    @Autowired
    private UserRepository repository;

    public User findById(UUID id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User save(UserRequest request) {
        return repository.save(User.of(request));
    }

    public User update(String id, UserRequest req) {
        var user = repository.findById(UUID.fromString(id)).orElseThrow(() -> new RuntimeException("not found"));
        user.setName(req.name());
        user.setEmail(req.email());
        user.setPassword(req.password());
        user.setRole(req.role());
        User savedUser = repository.save(user);
        return savedUser;
    }
}
