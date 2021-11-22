/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo4.ciclo4.Repository.crud;

import co.usa.ciclo4.ciclo4.Modelo.usuarios;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author roll-
 */
public interface usuariosCrudRepository extends CrudRepository<usuarios, Integer> {
    
    
    public Optional<usuarios> findByName(String name);
    
    public Optional<usuarios> findByEmail(String email);
    
    public List<usuarios> findByNameOrEmail(String name, String email);

    public Optional<usuarios> findByEmailAndPassword(String email, String password);
}
