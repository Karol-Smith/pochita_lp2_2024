/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.ecomerce_v1.infrastructure.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 *
 * @author tpp
 */
@Table(name= "users")
@Entity
public class UserEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String firsname;
    private String lastname;
    private String email;
    private String address;
    private String cellphone;
    private String password;
    private LocalDateTime dateCreated;
    @Enumerated(EnumType.STRING)
    private TypeUser typeUser;
    public UserEntity() {
    }

    public UserEntity(Integer id, String username, String firsname, String lastname, String email, String address, String cellphone, String password, LocalDateTime dateCreated, TypeUser typeUser) {
        this.id = id;
        this.username = username;
        this.firsname = firsname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.cellphone = cellphone;
        this.password = password;
        this.dateCreated = dateCreated;
        this.typeUser = typeUser;
    }
  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }
     
            
}
