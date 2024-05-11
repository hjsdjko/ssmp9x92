package com.dao;

import com.entity.JingdianluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingdianluxianVO;
import com.entity.view.JingdianluxianView;


/**
 * 景点路线
 * 
 * @author 
 * @email 
 * @date 2021-04-25 19:47:28
 */
public interface JingdianluxianDao extends BaseMapper<JingdianluxianEntity> {
	
	List<JingdianluxianVO> selectListVO(@Param("ew") Wrapper<JingdianluxianEntity> wrapper);
	
	JingdianluxianVO selectVO(@Param("ew") Wrapper<JingdianluxianEntity> wrapper);
	
	List<JingdianluxianView> selectListView(@Param("ew") Wrapper<JingdianluxianEntity> wrapper);

	List<JingdianluxianView> selectListView(Pagination page,@Param("ew") Wrapper<JingdianluxianEntity> wrapper);
	
	JingdianluxianView selectView(@Param("ew") Wrapper<JingdianluxianEntity> wrapper);
	
}
