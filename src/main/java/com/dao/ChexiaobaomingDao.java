package com.dao;

import com.entity.ChexiaobaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChexiaobaomingVO;
import com.entity.view.ChexiaobaomingView;


/**
 * 撤销报名
 * 
 * @author 
 * @email 
 * @date 2022-05-27 13:44:48
 */
public interface ChexiaobaomingDao extends BaseMapper<ChexiaobaomingEntity> {
	
	List<ChexiaobaomingVO> selectListVO(@Param("ew") Wrapper<ChexiaobaomingEntity> wrapper);
	
	ChexiaobaomingVO selectVO(@Param("ew") Wrapper<ChexiaobaomingEntity> wrapper);
	
	List<ChexiaobaomingView> selectListView(@Param("ew") Wrapper<ChexiaobaomingEntity> wrapper);

	List<ChexiaobaomingView> selectListView(Pagination page,@Param("ew") Wrapper<ChexiaobaomingEntity> wrapper);
	
	ChexiaobaomingView selectView(@Param("ew") Wrapper<ChexiaobaomingEntity> wrapper);
	

}
