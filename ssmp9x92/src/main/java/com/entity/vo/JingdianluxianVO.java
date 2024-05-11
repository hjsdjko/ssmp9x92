package com.entity.vo;

import com.entity.JingdianluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 景点路线
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 19:47:28
 */
public class JingdianluxianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点类型
	 */
	
	private String jingdianleixing;
		
	/**
	 * 景点地址
	 */
	
	private String jingdiandizhi;
		
	/**
	 * 路线名称
	 */
	
	private String luxianmingcheng;
		
	/**
	 * 路线图片
	 */
	
	private String luxiantupian;
		
	/**
	 * 起点
	 */
	
	private String qidian;
		
	/**
	 * 途径路段
	 */
	
	private String tujingluduan;
		
	/**
	 * 终点
	 */
	
	private String zhongdian;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：景点类型
	 */
	 
	public void setJingdianleixing(String jingdianleixing) {
		this.jingdianleixing = jingdianleixing;
	}
	
	/**
	 * 获取：景点类型
	 */
	public String getJingdianleixing() {
		return jingdianleixing;
	}
				
	
	/**
	 * 设置：景点地址
	 */
	 
	public void setJingdiandizhi(String jingdiandizhi) {
		this.jingdiandizhi = jingdiandizhi;
	}
	
	/**
	 * 获取：景点地址
	 */
	public String getJingdiandizhi() {
		return jingdiandizhi;
	}
				
	
	/**
	 * 设置：路线名称
	 */
	 
	public void setLuxianmingcheng(String luxianmingcheng) {
		this.luxianmingcheng = luxianmingcheng;
	}
	
	/**
	 * 获取：路线名称
	 */
	public String getLuxianmingcheng() {
		return luxianmingcheng;
	}
				
	
	/**
	 * 设置：路线图片
	 */
	 
	public void setLuxiantupian(String luxiantupian) {
		this.luxiantupian = luxiantupian;
	}
	
	/**
	 * 获取：路线图片
	 */
	public String getLuxiantupian() {
		return luxiantupian;
	}
				
	
	/**
	 * 设置：起点
	 */
	 
	public void setQidian(String qidian) {
		this.qidian = qidian;
	}
	
	/**
	 * 获取：起点
	 */
	public String getQidian() {
		return qidian;
	}
				
	
	/**
	 * 设置：途径路段
	 */
	 
	public void setTujingluduan(String tujingluduan) {
		this.tujingluduan = tujingluduan;
	}
	
	/**
	 * 获取：途径路段
	 */
	public String getTujingluduan() {
		return tujingluduan;
	}
				
	
	/**
	 * 设置：终点
	 */
	 
	public void setZhongdian(String zhongdian) {
		this.zhongdian = zhongdian;
	}
	
	/**
	 * 获取：终点
	 */
	public String getZhongdian() {
		return zhongdian;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
