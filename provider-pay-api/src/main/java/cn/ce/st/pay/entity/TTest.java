package cn.ce.st.pay.entity;

import java.io.Serializable;

/**
 * (TTest)实体类
 *
 * @author makejava
 * @since 2019-04-03 15:47:14
 */
public class TTest implements Serializable {
    private static final long serialVersionUID = -79234554736551977L;
    
    private Integer id;
    
    private String username;
    
    private String password;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}