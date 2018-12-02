/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alaa;

import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author snow
 */
@Entity
@Table(name = "contact")
public class message {



    private int id;
     private String name;
    private String mail;
    private String message;
     java.util.Date d= new java.util.Date();
        SimpleDateFormat ft = 
      new SimpleDateFormat (" yyyy/MM/dd");
        String date=ft.format(d);
      

   
    @Column(name="date",length = 50)
   
    public String getDate() {
        return date;
    }
    

    public void setDate(String date) {
        this.date = date;
    }
 
    
    @Id
    @Column(name = "id" ,length = 30)
    @GeneratedValue(strategy = GenerationType.AUTO)
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
@Column(name = "message" ,length = 200)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
   
}
