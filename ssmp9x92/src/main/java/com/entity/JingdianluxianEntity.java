package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 景点路线
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 19:47:28
 */
@TableName("jingdianluxian")
public class JingdianluxianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingdianluxianEntity() {
		
	}
	
	public JingdianluxianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 景点名称
	 */
					
	private String jingdianmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：景点名称
	 */
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
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
