package com.api.book.Controller;

import com.api.book.DAO.LivreDAO;
import com.api.book.modele.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivreController {
@Autowired
    LivreDAO livreDAO;

    @RequestMapping(value="/Livres", method= RequestMethod.GET)
    public List<Livre> listeLivres() {

        return livreDAO.findAll();
    }



}
