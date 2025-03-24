package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JijifenziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JijifenziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JijifenziView;


/**
 * 积极分子
 *
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
public interface JijifenziService extends IService<JijifenziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JijifenziVO> selectListVO(Wrapper<JijifenziEntity> wrapper);
   	
   	JijifenziVO selectVO(@Param("ew") Wrapper<JijifenziEntity> wrapper);
   	
   	List<JijifenziView> selectListView(Wrapper<JijifenziEntity> wrapper);
   	
   	JijifenziView selectView(@Param("ew") Wrapper<JijifenziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JijifenziEntity> wrapper);
   	

}

