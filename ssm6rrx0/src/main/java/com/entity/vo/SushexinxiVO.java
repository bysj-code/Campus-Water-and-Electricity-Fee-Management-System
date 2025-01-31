package com.entity.vo;

import com.entity.SushexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宿舍信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-21 14:16:49
 */
public class SushexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍类型
	 */
	
	private String susheleixing;
		
	/**
	 * 宿舍类别
	 */
	
	private String susheleibie;
		
	/**
	 * 宿舍名称
	 */
	
	private String sushemingcheng;
		
	/**
	 * 宿舍状态
	 */
	
	private String sushezhuangtai;
				
	
	/**
	 * 设置：宿舍类型
	 */
	 
	public void setSusheleixing(String susheleixing) {
		this.susheleixing = susheleixing;
	}
	
	/**
	 * 获取：宿舍类型
	 */
	public String getSusheleixing() {
		return susheleixing;
	}
				
	
	/**
	 * 设置：宿舍类别
	 */
	 
	public void setSusheleibie(String susheleibie) {
		this.susheleibie = susheleibie;
	}
	
	/**
	 * 获取：宿舍类别
	 */
	public String getSusheleibie() {
		return susheleibie;
	}
				
	
	/**
	 * 设置：宿舍名称
	 */
	 
	public void setSushemingcheng(String sushemingcheng) {
		this.sushemingcheng = sushemingcheng;
	}
	
	/**
	 * 获取：宿舍名称
	 */
	public String getSushemingcheng() {
		return sushemingcheng;
	}
				
	
	/**
	 * 设置：宿舍状态
	 */
	 
	public void setSushezhuangtai(String sushezhuangtai) {
		this.sushezhuangtai = sushezhuangtai;
	}
	
	/**
	 * 获取：宿舍状态
	 */
	public String getSushezhuangtai() {
		return sushezhuangtai;
	}
			
}
