package org.integration.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hxk on 2016/11/4.
 */
@Alias("User")
public class User implements Serializable {

    private static final long serialVersionUID = -6186636211920806340L;
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String address;
    private String userphone;
    private Date addDate;
    private String email;
    private Integer orderCount;
    private BigDecimal orderMount;

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getOrderMount() {
        return orderMount;
    }

    public void setOrderMount(BigDecimal orderMount) {
        this.orderMount = orderMount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    @Override
    public String toString() {
        return "User{" +
                "addDate=" + addDate +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", address='" + address + '\'' +
                ", userphone='" + userphone + '\'' +
                ", email='" + email + '\'' +
                ", orderCount=" + orderCount +
                ", orderMount=" + orderMount +
                '}';
    }
}
