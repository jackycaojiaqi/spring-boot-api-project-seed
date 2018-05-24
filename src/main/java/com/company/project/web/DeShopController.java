package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.DeShop;
import com.company.project.service.DeShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;

/**
 * Created by CodeGenerator on 2018/04/19.
 */
@RestController
@RequestMapping("/de/shop")
public class DeShopController {
    @Resource
    private DeShopService deShopService;


    @ApiOperation(value = "新增店铺", notes = "根据Shop对象创建店铺")
    @PostMapping("/add")
    public Result add(DeShop deShop) {
        deShopService.save(deShop);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        deShopService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(DeShop deShop) {
        deShopService.update(deShop);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Log.i("1212121");
        Log.e("哈哈哈");
        Log.d("哈哈哈");
        DeShop deShop = deShopService.findById(id);
        return ResultGenerator.genSuccessResult(deShop);
    }

    @ApiOperation(value = "查看店铺列表", notes = "查看所有的店铺")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<DeShop> list = deShopService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
