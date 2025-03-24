package com.dao;

import com.entity.HuifuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuifuxinxiVO;
import com.entity.view.HuifuxinxiView;


/**
 * 回复信息
 * 
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
public interface HuifuxinxiDao extends BaseMapper<HuifuxinxiEntity> {
	
	List<HuifuxinxiVO> selectListVO(@Param("ew") Wrapper<HuifuxinxiEntity> wrapper);
	
	HuifuxinxiVO selectVO(@Param("ew") Wrapper<HuifuxinxiEntity> wrapper);
	
	List<HuifuxinxiView> selectListView(@Param("ew") Wrapper<HuifuxinxiEntity> wrapper);

	List<HuifuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuifuxinxiEntity> wrapper);
	
	HuifuxinxiView selectView(@Param("ew") Wrapper<HuifuxinxiEntity> wrapper);
	

}
