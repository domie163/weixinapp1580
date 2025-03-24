package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuifuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuifuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuifuxinxiView;


/**
 * 回复信息
 *
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
public interface HuifuxinxiService extends IService<HuifuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuifuxinxiVO> selectListVO(Wrapper<HuifuxinxiEntity> wrapper);
   	
   	HuifuxinxiVO selectVO(@Param("ew") Wrapper<HuifuxinxiEntity> wrapper);
   	
   	List<HuifuxinxiView> selectListView(Wrapper<HuifuxinxiEntity> wrapper);
   	
   	HuifuxinxiView selectView(@Param("ew") Wrapper<HuifuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuifuxinxiEntity> wrapper);
   	

}

