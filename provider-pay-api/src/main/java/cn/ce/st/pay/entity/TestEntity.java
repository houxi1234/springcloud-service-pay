package cn.ce.st.pay.entity;

/**
 * @ClassName TestEntity
 * @Descrition TODO
 * @Author houxi
 * @Date 2019/4/2 16:00
 * Version 1.0
 **/
public class TestEntity {

    private String username;

    private String password;

    public TestEntity() {
    }

    public TestEntity(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "TestEntity{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
