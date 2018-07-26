package com.company.project.model;

import javax.persistence.*;

public class Order {
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_info")
    private String orderInfo;

    @Column(name = "start_place")
    private String startPlace;

    @Column(name = "end_place")
    private String endPlace;

    @Column(name = "trans_way")
    private String transWay;

    @Column(name = "client_company_name")
    private String clientCompanyName;

    @Column(name = "client_address")
    private String clientAddress;

    @Column(name = "client_phone")
    private String clientPhone;

    private String remarks;

    /**
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return order_info
     */
    public String getOrderInfo() {
        return orderInfo;
    }

    /**
     * @param orderInfo
     */
    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    /**
     * @return start_place
     */
    public String getStartPlace() {
        return startPlace;
    }

    /**
     * @param startPlace
     */
    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    /**
     * @return end_place
     */
    public String getEndPlace() {
        return endPlace;
    }

    /**
     * @param endPlace
     */
    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    /**
     * @return trans_way
     */
    public String getTransWay() {
        return transWay;
    }

    /**
     * @param transWay
     */
    public void setTransWay(String transWay) {
        this.transWay = transWay;
    }

    /**
     * @return client_company_name
     */
    public String getClientCompanyName() {
        return clientCompanyName;
    }

    /**
     * @param clientCompanyName
     */
    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    /**
     * @return client_address
     */
    public String getClientAddress() {
        return clientAddress;
    }

    /**
     * @param clientAddress
     */
    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    /**
     * @return client_phone
     */
    public String getClientPhone() {
        return clientPhone;
    }

    /**
     * @param clientPhone
     */
    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}