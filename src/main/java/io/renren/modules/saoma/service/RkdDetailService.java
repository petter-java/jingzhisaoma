package io.renren.modules.saoma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.saoma.entity.RkdDetailEntity;
import io.renren.modules.saoma.entity.SaoMaEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-27 20:12:55
 */
public interface RkdDetailService extends IService<RkdDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);

   /* List<Udf5sEntity> getudf5sList();*/

    List<SaoMaEntity> findById(String udf5s);
}

