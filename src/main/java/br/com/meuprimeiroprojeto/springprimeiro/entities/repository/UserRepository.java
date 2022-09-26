package br.com.meuprimeiroprojeto.springprimeiro.entities.repository;

import br.com.meuprimeiroprojeto.springprimeiro.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
