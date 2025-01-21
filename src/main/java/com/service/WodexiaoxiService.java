package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodexiaoxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodexiaoxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodexiaoxiView;


/**
 * 我的消息
 *
 * @author 
 * @email 
 * @date 2022-05-27 13:44:48
 */
public interface WodexiaoxiService extends IService<WodexiaoxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodexiaoxiVO> selectListVO(Wrapper<WodexiaoxiEntity> wrapper);
   	
   	WodexiaoxiVO selectVO(@Param("ew") Wrapper<WodexiaoxiEntity> wrapper);
   	
   	List<WodexiaoxiView> selectListView(Wrapper<WodexiaoxiEntity> wrapper);
   	
   	WodexiaoxiView selectView(@Param("ew") Wrapper<WodexiaoxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodexiaoxiEntity> wrapper);
   	

}

