package io.renren.modules.saoma.controller;

import java.util.List;

import io.renren.modules.saoma.entity.SaoMaEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.saoma.service.RkdDetailService;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-27 20:12:55
 */
@RestController
@RequestMapping("/app")
public class RkdDetailController {
    @Autowired
    private RkdDetailService rkdDetailService;

    /**
     * 信息
     */
    @RequestMapping("/info")
    @ApiOperation("saoma")
    public R info(String udf5s){


        System.out.println(udf5s);


        List<SaoMaEntity> saoMaEntityList = rkdDetailService.findById(udf5s);
        /*List<Udf5sEntity> udf5sEntityList = rkdDetailService.getudf5sList();*/



     /*   for (Udf5sEntity udf5sEntity : udf5sEntityLists) {
            System.out.println(udf5sEntity.getUdf5S());
            if (!((udf5sEntity.getUdf5S()).equals(udf5s))){
                return R.error("产品信息不存在，请重新扫码或联系管理员");
            }
        }
*/
     if (saoMaEntityList.isEmpty()){
         return R.error("产品信息不存在，请重新扫码");
     }


        return R.ok().put("data", saoMaEntityList);
    }



}
