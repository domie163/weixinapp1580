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


import com.dao.HuifuxinxiDao;
import com.entity.HuifuxinxiEntity;
import com.service.HuifuxinxiService;
import com.entity.vo.HuifuxinxiVO;
import com.entity.view.HuifuxinxiView;

@Service("huifuxinxiService")
public class HuifuxinxiServiceImpl extends ServiceImpl<HuifuxinxiDao, HuifuxinxiEntity> implements HuifuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuifuxinxiEntity> page = this.selectPage(
                new Query<HuifuxinxiEntity>(params).getPage(),
                new EntityWrapper<HuifuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuifuxinxiEntity> wrapper) {
		  Page<HuifuxinxiView> page =new Query<HuifuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuifuxinxiVO> selectListVO(Wrapper<HuifuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuifuxinxiVO selectVO(Wrapper<HuifuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuifuxinxiView> selectListView(Wrapper<HuifuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuifuxinxiView selectView(Wrapper<HuifuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
