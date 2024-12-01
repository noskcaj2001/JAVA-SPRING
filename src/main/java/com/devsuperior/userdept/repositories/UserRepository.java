/*Tipo que vai ter todas as operacoes basica de pesquisas, insercao, deletar, alterar*/


package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
