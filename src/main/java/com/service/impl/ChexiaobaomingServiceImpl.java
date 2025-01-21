package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChexiaobaomingDao;
import com.entity.ChexiaobaomingEntity;
import com.service.ChexiaobaomingService;
import com.entity.vo.ChexiaobaomingVO;
import com.entity.view.ChexiaobaomingView;

@Service("chexiaobaomingService")
public class ChexiaobaomingServiceImpl extends ServiceImpl<ChexiaobaomingDao, ChexiaobaomingEntity> implements ChexiaobaomingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChexiaobaomingEntity> page = this.selectPage(
                new Query<ChexiaobaomingEntity>(params).getPage(),
                new EntityWrapper<ChexiaobaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChexiaobaomingEntity> wrapper) {
		  Page<ChexiaobaomingView> page =new Query<ChexiaobaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChexiaobaomingVO> selectListVO(Wrapper<ChexiaobaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChexiaobaomingVO selectVO(Wrapper<ChexiaobaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChexiaobaomingView> selectListView(Wrapper<ChexiaobaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChexiaobaomingView selectView(Wrapper<ChexiaobaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
