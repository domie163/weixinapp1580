package com.entity.view;

import com.entity.JijifenziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 积极分子
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
@TableName("jijifenzi")
public class JijifenziView  extends JijifenziEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JijifenziView(){
	}
 
 	public JijifenziView(JijifenziEntity jijifenziEntity){
 	try {
			BeanUtils.copyProperties(this, jijifenziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
