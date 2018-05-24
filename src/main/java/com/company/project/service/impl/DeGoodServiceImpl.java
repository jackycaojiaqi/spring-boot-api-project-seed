package com.company.project.service.impl;

import com.company.project.dao.DeGoodMapper;
import com.company.project.model.DeGood;
import com.company.project.service.DeGoodService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/28.
 */
@Service
@Transactional
public class DeGoodServiceImpl extends AbstractService<DeGood> implements DeGoodService {
    @Resource
    private DeGoodMapper deGoodMapper;

}
