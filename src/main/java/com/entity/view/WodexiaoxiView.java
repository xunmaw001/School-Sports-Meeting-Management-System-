package com.entity.view;

import com.entity.WodexiaoxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的消息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-27 13:44:48
 */
@TableName("wodexiaoxi")
public class WodexiaoxiView  extends WodexiaoxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodexiaoxiView(){
	}
 
 	public WodexiaoxiView(WodexiaoxiEntity wodexiaoxiEntity){
 	try {
			BeanUtils.copyProperties(this, wodexiaoxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
