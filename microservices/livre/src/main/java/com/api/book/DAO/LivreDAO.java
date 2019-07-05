package com.api.book.DAO;

import com.api.book.modele.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreDAO extends JpaRepository<Livre,Integer> {
    public List<Livre> findAll();

}
