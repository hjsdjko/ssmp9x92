package com.entity.view;

import com.entity.JingdianluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景点路线
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 19:47:28
 */
@TableName("jingdianluxian")
public class JingdianluxianView  extends JingdianluxianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingdianluxianView(){
	}
 
 	public JingdianluxianView(JingdianluxianEntity jingdianluxianEntity){
 	try {
			BeanUtils.copyProperties(this, jingdianluxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
