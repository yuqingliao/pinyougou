package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * Date:2018/11/23
 * Author:YQ.Liao
 */
public interface BrandService {
    public List<TbBrand>queryAll();

    List<TbBrand> testPage(Integer page, Integer rows);
}
