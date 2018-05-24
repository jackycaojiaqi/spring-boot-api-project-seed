package com.company.project.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "De_ShopInfos")
public class DeShopinfos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "shop_id")
    private String shopId;

    private String info;

    @Column(name = "regTime")
    private Date regtime;

    @Column(name = "loginTime")
    private Date logintime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return shop_id
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    /**
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * @return regTime
     */
    public Date getRegtime() {
        return regtime;
    }

    /**
     * @param regtime
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    /**
     * @return loginTime
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * @param logintime
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }
}