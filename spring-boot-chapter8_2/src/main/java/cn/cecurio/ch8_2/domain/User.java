package cn.cecurio.ch8_2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.io.Serializable;

/**
 * @author: Cecurio
 * @create: 2017-11-11 15:39
 * @desc:
 **/
@Entity
@NamedQuery(name = "User.findByName",
    query = "select name,address from User u where u.name=?1")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
