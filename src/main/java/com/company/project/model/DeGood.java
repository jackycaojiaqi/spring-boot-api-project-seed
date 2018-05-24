package com.company.project.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "De_Good")
public class DeGood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "shop_id")
    private String shopId;

    @Column(name = "good_id")
    private String goodId;

    private String name;

    private BigDecimal price;

    @Column(name = "oldPrice")
    private BigDecimal oldprice;

    private String description;

    @Column(name = "sellCount")
    private Integer sellcount;

    private BigDecimal rating;

    private String info;

    private String icon;

    private String image;

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
     * @return good_id
     */
    public String getGoodId() {
        return goodId;
    }

    /**
     * @param goodId
     */
    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return oldPrice
     */
    public BigDecimal getOldprice() {
        return oldprice;
    }

    /**
     * @param oldprice
     */
    public void setOldprice(BigDecimal oldprice) {
        this.oldprice = oldprice;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return sellCount
     */
    public Integer getSellcount() {
        return sellcount;
    }

    /**
     * @param sellcount
     */
    public void setSellcount(Integer sellcount) {
        this.sellcount = sellcount;
    }

    /**
     * @return rating
     */
    public BigDecimal getRating() {
        return rating;
    }

    /**
     * @param rating
     */
    public void setRating(BigDecimal rating) {
        this.rating = rating;
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
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }
}