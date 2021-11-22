/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo4.ciclo4.Web;

import co.usa.ciclo4.ciclo4.Modelo.usuarios;
import co.usa.ciclo4.ciclo4.Service.usuariosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author roll-
 */
@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class usuariosController {

    @Autowired
    private usuariosService service;

    @GetMapping("/all")
    public List<usuarios> getUsuarios() {

        return service.getAll();

    }

    @GetMapping("/{email}")
    public boolean existEmail(@PathVariable("email") String email) {

        return service.getUserByEmail(email);

    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public usuarios save(@RequestBody usuarios user){
    
    return service.save(user);
    
    }
    
    @GetMapping("/{email}/{password}")
    public usuarios existEmailPass(@PathVariable("email") String email,@PathVariable("password") String password) {

        return service.getByEmailAndPass(email,password);

    }
    
}
