package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Client;
import com.company.project.service.ClientService;
import com.company.project.util.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
* Created by CodeGenerator on 2018/07/24.
*/
@RestController
@RequestMapping("/client")
public class ClientController {
    @Resource
    private ClientService clientService;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;


    @PostMapping("/addRedis")
    public Result addRedis(Client client) {
        Gson gson = new Gson();
        redisTemplate.opsForValue().set("123",gson.toJson(client),6000, TimeUnit.MINUTES);
        clientService.save(client);
        return ResultGenerator.genSuccessResult();
    }
    @PostMapping("/getRedis")
    public Result getRedis() {
        Gson gson = new Gson();
        Client client = new Client();
        String clidet_str  =   redisTemplate.opsForValue().get("123");
        client = gson.fromJson(clidet_str,Client.class);
        return ResultGenerator.genSuccessResult(client);
    }
    @PostMapping("/add")
    public Result add(Client client) {
        clientService.save(client);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        clientService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Client client) {
        clientService.update(client);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Client client = clientService.findById(id);
        return ResultGenerator.genSuccessResult(client);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(defaultValue = "") String key) {
        PageHelper.startPage(page, size);
        List<Client> list = new ArrayList<>();
        if(StringUtil.isEmptyandnull(key)){
            Condition condition = new Condition(Client.class);
            condition.createCriteria()
                    .andEqualTo("isDel",0);
            list = clientService.  findByCondition(condition);
        }else {
            Condition condition = new Condition(Client.class);
            condition.createCriteria()
                    .andCondition("is_del=0 and (client_name like '%"+key+"%' or client_country  like '%"+key+"%' or client_city  like '%"+key+"%' or client_intention  like '%"+key+"%' or client_intention_machine  like '%"+key+"%')");
            list = clientService.  findByCondition(condition);
        }

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
