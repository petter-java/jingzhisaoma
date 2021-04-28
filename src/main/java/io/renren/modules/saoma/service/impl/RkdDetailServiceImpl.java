package io.renren.modules.saoma.service.impl;

import io.renren.modules.saoma.entity.SaoMaEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.saoma.dao.RkdDetailDao;
import io.renren.modules.saoma.entity.RkdDetailEntity;
import io.renren.modules.saoma.service.RkdDetailService;


@Service("rkdDetailService")
public class RkdDetailServiceImpl extends ServiceImpl<RkdDetailDao, RkdDetailEntity> implements RkdDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RkdDetailEntity> page = this.page(
                new Query<RkdDetailEntity>().getPage(params),
                new QueryWrapper<RkdDetailEntity>()
        );

        return new PageUtils(page);
    }

  /*  @Override
    public List<Udf5sEntity> getudf5sList() {
        List<Udf5sEntity> udf5sEntityList = this.getBaseMapper().getudf5sList();
        *//*for (Udf5sEntity udf5sEntity : udf5sEntities) {
            System.out.println(udf5sEntity);
        }*//*
        return udf5sEntityList;
    }*/

    @Override
    public List<SaoMaEntity> findById(String udf5s) {
        List<SaoMaEntity>saoMaEntityList=this.getBaseMapper().findById(udf5s);
        return saoMaEntityList;
    }

}