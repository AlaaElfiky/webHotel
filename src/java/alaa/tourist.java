 

package alaa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 

 
 @Entity
 @Table (name = "tourism")
public class tourist implements Serializable {
     public tourist(){}
     
    private String name;
    private String nationality;
    private String address;
    private String mail;
    private String phone;
    private String password;
 
    
    
    public tourist(String name, String password,String mail,String phone,String nation,String address){
    
    this.name=name;
    this.nationality=nation;
    this.address=address;
    this.mail=mail;
    this.phone=phone;
    this.password=password;
    }
  @Column(name = "user_name",length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 @Column(name = "nationality",length = 30)
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
 @Column(name = "address",length = 30)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
     @Id
 @Column(name = "e_mail",length = 30,unique = true,nullable = false)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
 @Column(name = "phone",length = 13)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

 @Column(name = "password",nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
 
    
    
    
    
   
    }
 
