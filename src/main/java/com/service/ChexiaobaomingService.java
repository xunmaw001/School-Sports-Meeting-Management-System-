package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChexiaobaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChexiaobaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChexiaobaomingView;


/**
 * 撤销报名
 *
 * @author 
 * @email 
 * @date 2022-05-27 13:44:48
 */
public interface ChexiaobaomingService extends IService<ChexiaobaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChexiaobaomingVO> selectListVO(Wrapper<ChexiaobaomingEntity> wrapper);
   	
   	ChexiaobaomingVO selectVO(@Param("ew") Wrapper<ChexiaobaomingEntity> wrapper);
   	
   	List<ChexiaobaomingView> selectListView(Wrapper<ChexiaobaomingEntity> wrapper);
   	
   	ChexiaobaomingView selectView(@Param("ew") Wrapper<ChexiaobaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChexiaobaomingEntity> wrapper);
   	

}

