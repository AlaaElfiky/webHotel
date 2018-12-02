/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alaa;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author snow
 */

@Entity
@Table(name = "service")
public class regist {
    private int id;
    private String name;
    private String mail;
    private String address;
    private String phone;
    private String cinema;
    private String trip;
   


    
@Id
@Column(name = "id" ,unique = true ,nullable = false)
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@Column(name = "name" ,length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Column(name = "mail" ,length = 30)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
@Column(name = "address" ,length = 30)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
@Column(name = "phone" ,length = 30)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
@Column(name = "cinema" ,length = 30)
    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }
    @Column(name = "trip" ,length = 30)
   public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }  

}