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


import com.dao.WodexiaoxiDao;
import com.entity.WodexiaoxiEntity;
import com.service.WodexiaoxiService;
import com.entity.vo.WodexiaoxiVO;
import com.entity.view.WodexiaoxiView;

@Service("wodexiaoxiService")
public class WodexiaoxiServiceImpl extends ServiceImpl<WodexiaoxiDao, WodexiaoxiEntity> implements WodexiaoxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodexiaoxiEntity> page = this.selectPage(
                new Query<WodexiaoxiEntity>(params).getPage(),
                new EntityWrapper<WodexiaoxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodexiaoxiEntity> wrapper) {
		  Page<WodexiaoxiView> page =new Query<WodexiaoxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodexiaoxiVO> selectListVO(Wrapper<WodexiaoxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodexiaoxiVO selectVO(Wrapper<WodexiaoxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodexiaoxiView> selectListView(Wrapper<WodexiaoxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodexiaoxiView selectView(Wrapper<WodexiaoxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
