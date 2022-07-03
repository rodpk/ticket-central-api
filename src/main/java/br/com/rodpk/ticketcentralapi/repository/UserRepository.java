package br.com.rodpk.ticketcentralapi.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rodpk.ticketcentralapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    @Query(name = "select u from User u where u.email = :email and u.password = :pass ")
    Optional<User> findByEmailAndPassword(@Param("email") String email, @Param("pass") String password);
    
    
}
