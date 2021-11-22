/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo4.ciclo4.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author roll-
 */
@Data
@Entity
@Table (name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
public class usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="user_email",unique = true, length = 50, nullable = false)
    private String email;
    @Column(name="user_name",length = 80, nullable = false)
    private String name;
    @Column(name="password",length = 50, nullable = false)
    private String password;
    
    
    }
