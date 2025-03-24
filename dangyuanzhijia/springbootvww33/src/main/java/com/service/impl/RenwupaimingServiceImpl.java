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


import com.dao.RenwupaimingDao;
import com.entity.RenwupaimingEntity;
import com.service.RenwupaimingService;
import com.entity.vo.RenwupaimingVO;
import com.entity.view.RenwupaimingView;

@Service("renwupaimingService")
public class RenwupaimingServiceImpl extends ServiceImpl<RenwupaimingDao, RenwupaimingEntity> implements RenwupaimingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwupaimingEntity> page = this.selectPage(
                new Query<RenwupaimingEntity>(params).getPage(),
                new EntityWrapper<RenwupaimingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwupaimingEntity> wrapper) {
		  Page<RenwupaimingView> page =new Query<RenwupaimingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwupaimingVO> selectListVO(Wrapper<RenwupaimingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwupaimingVO selectVO(Wrapper<RenwupaimingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwupaimingView> selectListView(Wrapper<RenwupaimingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwupaimingView selectView(Wrapper<RenwupaimingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
