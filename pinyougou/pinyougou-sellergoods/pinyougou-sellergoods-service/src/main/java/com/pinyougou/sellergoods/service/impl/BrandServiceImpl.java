package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import com.pinyougou.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Date:2018/11/23
 * Author:YQ.Liao
 */
@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl extends BaseServiceImpl<TbBrand> implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    public List<TbBrand> queryAll() {
        return brandMapper.queryAll();
    }


    public List<TbBrand> testPage(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        return brandMapper.selectAll();
    }
}
