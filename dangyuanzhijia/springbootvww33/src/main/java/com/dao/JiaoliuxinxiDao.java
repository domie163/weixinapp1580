package com.dao;

import com.entity.JiaoliuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoliuxinxiVO;
import com.entity.view.JiaoliuxinxiView;


/**
 * 交流信息
 * 
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
public interface JiaoliuxinxiDao extends BaseMapper<JiaoliuxinxiEntity> {
	
	List<JiaoliuxinxiVO> selectListVO(@Param("ew") Wrapper<JiaoliuxinxiEntity> wrapper);
	
	JiaoliuxinxiVO selectVO(@Param("ew") Wrapper<JiaoliuxinxiEntity> wrapper);
	
	List<JiaoliuxinxiView> selectListView(@Param("ew") Wrapper<JiaoliuxinxiEntity> wrapper);

	List<JiaoliuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoliuxinxiEntity> wrapper);
	
	JiaoliuxinxiView selectView(@Param("ew") Wrapper<JiaoliuxinxiEntity> wrapper);
	

}
