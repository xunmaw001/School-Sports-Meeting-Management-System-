package com.dao;

import com.entity.WodexiaoxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodexiaoxiVO;
import com.entity.view.WodexiaoxiView;


/**
 * 我的消息
 * 
 * @author 
 * @email 
 * @date 2022-05-27 13:44:48
 */
public interface WodexiaoxiDao extends BaseMapper<WodexiaoxiEntity> {
	
	List<WodexiaoxiVO> selectListVO(@Param("ew") Wrapper<WodexiaoxiEntity> wrapper);
	
	WodexiaoxiVO selectVO(@Param("ew") Wrapper<WodexiaoxiEntity> wrapper);
	
	List<WodexiaoxiView> selectListView(@Param("ew") Wrapper<WodexiaoxiEntity> wrapper);

	List<WodexiaoxiView> selectListView(Pagination page,@Param("ew") Wrapper<WodexiaoxiEntity> wrapper);
	
	WodexiaoxiView selectView(@Param("ew") Wrapper<WodexiaoxiEntity> wrapper);
	

}
