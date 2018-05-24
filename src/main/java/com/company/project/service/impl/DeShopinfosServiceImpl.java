package com.company.project.service.impl;

import com.company.project.dao.DeShopinfosMapper;
import com.company.project.model.DeShopinfos;
import com.company.project.service.DeShopinfosService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/04.
 */
@Service
@Transactional
public class DeShopinfosServiceImpl extends AbstractService<DeShopinfos> implements DeShopinfosService {
    @Resource
    private DeShopinfosMapper deShopinfosMapper;


}
