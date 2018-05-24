package com.company.project.service.impl;

import com.company.project.dao.DeShopMapper;
import com.company.project.model.DeShop;
import com.company.project.service.DeShopService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/19.
 */
@Service
@Transactional
public class DeShopServiceImpl extends AbstractService<DeShop> implements DeShopService {
    @Resource
    private DeShopMapper deShopMapper;

}
