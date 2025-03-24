package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanxinxiView;


/**
 * 党员信息
 *
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
public interface DangyuanxinxiService extends IService<DangyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuanxinxiVO> selectListVO(Wrapper<DangyuanxinxiEntity> wrapper);
   	
   	DangyuanxinxiVO selectVO(@Param("ew") Wrapper<DangyuanxinxiEntity> wrapper);
   	
   	List<DangyuanxinxiView> selectListView(Wrapper<DangyuanxinxiEntity> wrapper);
   	
   	DangyuanxinxiView selectView(@Param("ew") Wrapper<DangyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuanxinxiEntity> wrapper);
   	

}

