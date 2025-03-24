package com.dao;

import com.entity.RenwupaimingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwupaimingVO;
import com.entity.view.RenwupaimingView;


/**
 * 任务排名
 * 
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
public interface RenwupaimingDao extends BaseMapper<RenwupaimingEntity> {
	
	List<RenwupaimingVO> selectListVO(@Param("ew") Wrapper<RenwupaimingEntity> wrapper);
	
	RenwupaimingVO selectVO(@Param("ew") Wrapper<RenwupaimingEntity> wrapper);
	
	List<RenwupaimingView> selectListView(@Param("ew") Wrapper<RenwupaimingEntity> wrapper);

	List<RenwupaimingView> selectListView(Pagination page,@Param("ew") Wrapper<RenwupaimingEntity> wrapper);
	
	RenwupaimingView selectView(@Param("ew") Wrapper<RenwupaimingEntity> wrapper);
	

}
