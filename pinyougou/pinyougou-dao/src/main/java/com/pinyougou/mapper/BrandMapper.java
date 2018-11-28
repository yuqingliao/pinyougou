package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Date:2018/11/23
 * Author:YQ.Liao
 */
public interface BrandMapper extends Mapper<TbBrand> {
    public List<TbBrand>queryAll();


    List<Map<String,Object>> selectOptionList();
}

