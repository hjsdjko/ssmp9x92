package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JingdianluxianDao;
import com.entity.JingdianluxianEntity;
import com.service.JingdianluxianService;
import com.entity.vo.JingdianluxianVO;
import com.entity.view.JingdianluxianView;

@Service("jingdianluxianService")
public class JingdianluxianServiceImpl extends ServiceImpl<JingdianluxianDao, JingdianluxianEntity> implements JingdianluxianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingdianluxianEntity> page = this.selectPage(
                new Query<JingdianluxianEntity>(params).getPage(),
                new EntityWrapper<JingdianluxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingdianluxianEntity> wrapper) {
		  Page<JingdianluxianView> page =new Query<JingdianluxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingdianluxianVO> selectListVO(Wrapper<JingdianluxianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingdianluxianVO selectVO(Wrapper<JingdianluxianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingdianluxianView> selectListView(Wrapper<JingdianluxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingdianluxianView selectView(Wrapper<JingdianluxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
