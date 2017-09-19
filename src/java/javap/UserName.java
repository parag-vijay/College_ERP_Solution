package javap;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="username.username")
public class UserName implements Serializable {
    String username;
    String password;
    String name;
    String type;
    String email;
    String verified;
    public UserName(String username, String password,String name,String type,String email,String verified) {
        this.username = username;
        this.password = password;
        this.name=name;
        this.email=email;
        this.type=type;
        this.verified=verified;
    }
    @Column(name="verified")
    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public UserName() {
    }
    @Column(name="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="username")
    @Id
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
