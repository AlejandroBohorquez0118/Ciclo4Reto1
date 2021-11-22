/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo4.ciclo4.Service;

import co.usa.ciclo4.ciclo4.Modelo.usuarios;
import co.usa.ciclo4.ciclo4.Repository.crud.usuariosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Service;

/**
 *
 * @author roll-
 */
@Service
public class usuariosService {

    @Autowired
    private usuariosRepository UserRepo;

    public List<usuarios> getAll() {

        return UserRepo.getAll();
    }

    public usuarios save(usuarios user){
    
        if(user.getName() == null || user.getEmail() == null || user.getPassword() == null){
        
        return user;
        
        }else{
        
            List<usuarios> existeUser = UserRepo.getUserByNameOrEmail(user.getName(), user.getEmail());
            if(existeUser.isEmpty()){
            
            return UserRepo.save(user);
            }
            else{
            
                return user;
            
            }
            
            }
        }
    
    public boolean getUserByEmail(String email){
    
    Optional<usuarios> usuarios = UserRepo.getUserbyEmail(email);
    
    if (usuarios.isEmpty()){
    
    return false;}
    
    else{
    
    
    return true;}
    
    }
        
    public usuarios getByEmailAndPass(String email, String password){
    Optional<usuarios> existeEP = UserRepo.getUserByEmailAndPassword(email, password);
    
    if(existeEP.isPresent()){
        
        return existeEP.get();
    
    }else{
    
        return new usuarios(null, email, password,"NO DEFINIDO");
        
    }
    
    }
        
    }

