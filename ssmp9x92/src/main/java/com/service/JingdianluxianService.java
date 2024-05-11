package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdianluxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingdianluxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianluxianView;


/**
 * 景点路线
 *
 * @author 
 * @email 
 * @date 2021-04-25 19:47:28
 */
public interface JingdianluxianService extends IService<JingdianluxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingdianluxianVO> selectListVO(Wrapper<JingdianluxianEntity> wrapper);
   	
   	JingdianluxianVO selectVO(@Param("ew") Wrapper<JingdianluxianEntity> wrapper);
   	
   	List<JingdianluxianView> selectListView(Wrapper<JingdianluxianEntity> wrapper);
   	
   	JingdianluxianView selectView(@Param("ew") Wrapper<JingdianluxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingdianluxianEntity> wrapper);
   	
}

