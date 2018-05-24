package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.DeShopinfos;
import com.company.project.service.DeShopinfosService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/05/04.
*/

@RestController
@RequestMapping("/de/shopinfos")
public class DeShopinfosController {
    @Resource
    private DeShopinfosService deShopinfosService;


    @PostMapping("/add")
    public Result add(DeShopinfos deShopinfos) {
        deShopinfosService.save(deShopinfos);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        deShopinfosService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(DeShopinfos deShopinfos) {
        Log.e(deShopinfos.getInfo()+" "+deShopinfos.getShopId()+" "+deShopinfos.getId());
        deShopinfosService.update(deShopinfos);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        DeShopinfos deShopinfos = deShopinfosService.findById(id);
        return ResultGenerator.genSuccessResult(deShopinfos);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer size) {
        PageHelper.startPage(page, size);
        List<DeShopinfos> list = deShopinfosService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
