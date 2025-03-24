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


import com.dao.DangyuanxinxiDao;
import com.entity.DangyuanxinxiEntity;
import com.service.DangyuanxinxiService;
import com.entity.vo.DangyuanxinxiVO;
import com.entity.view.DangyuanxinxiView;

@Service("dangyuanxinxiService")
public class DangyuanxinxiServiceImpl extends ServiceImpl<DangyuanxinxiDao, DangyuanxinxiEntity> implements DangyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangyuanxinxiEntity> page = this.selectPage(
                new Query<DangyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DangyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangyuanxinxiEntity> wrapper) {
		  Page<DangyuanxinxiView> page =new Query<DangyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangyuanxinxiVO> selectListVO(Wrapper<DangyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangyuanxinxiVO selectVO(Wrapper<DangyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangyuanxinxiView> selectListView(Wrapper<DangyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangyuanxinxiView selectView(Wrapper<DangyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
