package com.company.project.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "De_Shop")
public class DeShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "shop_description")
    private String shopDescription;

    @Column(name = "shop_deliveryTime")
    private Integer shopDeliverytime;

    @Column(name = "shop_score")
    private BigDecimal shopScore;

    @Column(name = "shop_serviceScore")
    private BigDecimal shopServicescore;

    @Column(name = "shop_foodScore")
    private BigDecimal shopFoodscore;

    @Column(name = "shop_rankRate")
    private BigDecimal shopRankrate;

    @Column(name = "shop_minPrice")
    private BigDecimal shopMinprice;

    @Column(name = "shop_deliveryPrice")
    private BigDecimal shopDeliveryprice;

    @Column(name = "shop_ratingCount")
    private Integer shopRatingcount;

    @Column(name = "shop_sellCount")
    private Integer shopSellcount;

    @Column(name = "shop_bulletin")
    private String shopBulletin;

    @Column(name = "shop_avatar")
    private String shopAvatar;

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
     * @return shop_name
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * @return shop_description
     */
    public String getShopDescription() {
        return shopDescription;
    }

    /**
     * @param shopDescription
     */
    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    /**
     * @return shop_deliveryTime
     */
    public Integer getShopDeliverytime() {
        return shopDeliverytime;
    }

    /**
     * @param shopDeliverytime
     */
    public void setShopDeliverytime(Integer shopDeliverytime) {
        this.shopDeliverytime = shopDeliverytime;
    }

    /**
     * @return shop_score
     */
    public BigDecimal getShopScore() {
        return shopScore;
    }

    /**
     * @param shopScore
     */
    public void setShopScore(BigDecimal shopScore) {
        this.shopScore = shopScore;
    }

    /**
     * @return shop_serviceScore
     */
    public BigDecimal getShopServicescore() {
        return shopServicescore;
    }

    /**
     * @param shopServicescore
     */
    public void setShopServicescore(BigDecimal shopServicescore) {
        this.shopServicescore = shopServicescore;
    }

    /**
     * @return shop_foodScore
     */
    public BigDecimal getShopFoodscore() {
        return shopFoodscore;
    }

    /**
     * @param shopFoodscore
     */
    public void setShopFoodscore(BigDecimal shopFoodscore) {
        this.shopFoodscore = shopFoodscore;
    }

    /**
     * @return shop_rankRate
     */
    public BigDecimal getShopRankrate() {
        return shopRankrate;
    }

    /**
     * @param shopRankrate
     */
    public void setShopRankrate(BigDecimal shopRankrate) {
        this.shopRankrate = shopRankrate;
    }

    /**
     * @return shop_minPrice
     */
    public BigDecimal getShopMinprice() {
        return shopMinprice;
    }

    /**
     * @param shopMinprice
     */
    public void setShopMinprice(BigDecimal shopMinprice) {
        this.shopMinprice = shopMinprice;
    }

    /**
     * @return shop_deliveryPrice
     */
    public BigDecimal getShopDeliveryprice() {
        return shopDeliveryprice;
    }

    /**
     * @param shopDeliveryprice
     */
    public void setShopDeliveryprice(BigDecimal shopDeliveryprice) {
        this.shopDeliveryprice = shopDeliveryprice;
    }

    /**
     * @return shop_ratingCount
     */
    public Integer getShopRatingcount() {
        return shopRatingcount;
    }

    /**
     * @param shopRatingcount
     */
    public void setShopRatingcount(Integer shopRatingcount) {
        this.shopRatingcount = shopRatingcount;
    }

    /**
     * @return shop_sellCount
     */
    public Integer getShopSellcount() {
        return shopSellcount;
    }

    /**
     * @param shopSellcount
     */
    public void setShopSellcount(Integer shopSellcount) {
        this.shopSellcount = shopSellcount;
    }

    /**
     * @return shop_bulletin
     */
    public String getShopBulletin() {
        return shopBulletin;
    }

    /**
     * @param shopBulletin
     */
    public void setShopBulletin(String shopBulletin) {
        this.shopBulletin = shopBulletin;
    }

    /**
     * @return shop_avatar
     */
    public String getShopAvatar() {
        return shopAvatar;
    }

    /**
     * @param shopAvatar
     */
    public void setShopAvatar(String shopAvatar) {
        this.shopAvatar = shopAvatar;
    }
}