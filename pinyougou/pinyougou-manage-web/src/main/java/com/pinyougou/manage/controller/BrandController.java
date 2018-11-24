package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date:2018/11/23
 * Author:YQ.Liao
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference
    private BrandService brandService;
    @GetMapping("/findAll")
    public List<TbBrand>findAll(){
        return brandService.queryAll();
    }

    @GetMapping("/testPage")
    public List<TbBrand>testPage(Integer page, Integer rows){

        return brandService.testPage(page,rows);
    }


}
