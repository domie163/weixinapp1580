package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwupaimingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwupaimingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwupaimingView;


/**
 * 任务排名
 *
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
public interface RenwupaimingService extends IService<RenwupaimingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwupaimingVO> selectListVO(Wrapper<RenwupaimingEntity> wrapper);
   	
   	RenwupaimingVO selectVO(@Param("ew") Wrapper<RenwupaimingEntity> wrapper);
   	
   	List<RenwupaimingView> selectListView(Wrapper<RenwupaimingEntity> wrapper);
   	
   	RenwupaimingView selectView(@Param("ew") Wrapper<RenwupaimingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwupaimingEntity> wrapper);
   	

}

