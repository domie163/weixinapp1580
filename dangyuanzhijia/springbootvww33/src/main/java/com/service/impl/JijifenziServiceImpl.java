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


import com.dao.JijifenziDao;
import com.entity.JijifenziEntity;
import com.service.JijifenziService;
import com.entity.vo.JijifenziVO;
import com.entity.view.JijifenziView;

@Service("jijifenziService")
public class JijifenziServiceImpl extends ServiceImpl<JijifenziDao, JijifenziEntity> implements JijifenziService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JijifenziEntity> page = this.selectPage(
                new Query<JijifenziEntity>(params).getPage(),
                new EntityWrapper<JijifenziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JijifenziEntity> wrapper) {
		  Page<JijifenziView> page =new Query<JijifenziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JijifenziVO> selectListVO(Wrapper<JijifenziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JijifenziVO selectVO(Wrapper<JijifenziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JijifenziView> selectListView(Wrapper<JijifenziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JijifenziView selectView(Wrapper<JijifenziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
