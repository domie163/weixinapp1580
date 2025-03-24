package com.dao;

import com.entity.JijifenziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JijifenziVO;
import com.entity.view.JijifenziView;


/**
 * 积极分子
 * 
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
public interface JijifenziDao extends BaseMapper<JijifenziEntity> {
	
	List<JijifenziVO> selectListVO(@Param("ew") Wrapper<JijifenziEntity> wrapper);
	
	JijifenziVO selectVO(@Param("ew") Wrapper<JijifenziEntity> wrapper);
	
	List<JijifenziView> selectListView(@Param("ew") Wrapper<JijifenziEntity> wrapper);

	List<JijifenziView> selectListView(Pagination page,@Param("ew") Wrapper<JijifenziEntity> wrapper);
	
	JijifenziView selectView(@Param("ew") Wrapper<JijifenziEntity> wrapper);
	

}
