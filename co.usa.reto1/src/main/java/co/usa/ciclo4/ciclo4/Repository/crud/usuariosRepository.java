/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo4.ciclo4.Repository.crud;

import co.usa.ciclo4.ciclo4.Modelo.usuarios;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;

/**
 *
 * @author roll-
 */
@Repository

public class usuariosRepository {

    @Autowired
    private usuariosCrudRepository userCrud;

    public List<usuarios> getAll() {

        return (List<usuarios>) userCrud.findAll();
    }

    public usuarios save(usuarios User) {

        return userCrud.save(User);
    }

    public Optional<usuarios> getUserByName(String name) {

        return userCrud.findByName(name);

    }

    public Optional<usuarios> getUserbyEmail(String email) {

        return userCrud.findByEmail(email);

    }

    public List<usuarios> getUserByNameOrEmail(String name, String email) {

        return userCrud.findByNameOrEmail(name, email);

    }
    
    public Optional<usuarios> getUserByEmailAndPassword(String email, String password) {

        return userCrud.findByEmailAndPassword(email, password);

    }
}
