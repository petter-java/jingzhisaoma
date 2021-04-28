package io.renren.modules.saoma.dao;

        import io.renren.modules.saoma.entity.RkdDetailEntity;
        import com.baomidou.mybatisplus.core.mapper.BaseMapper;
        import io.renren.modules.saoma.entity.SaoMaEntity;
        import org.apache.ibatis.annotations.Mapper;
        import org.apache.ibatis.annotations.Select;

        import java.util.List;

/**
 *
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-27 20:12:55
 */
@Mapper
public interface RkdDetailDao extends BaseMapper<RkdDetailEntity> {
    @Select("SELECT b.QTY,a.rkd_date,d.UDF7S,e.department_desc,c.part_name,c.spec,c.DEFINE7,c.DEFINE9,c.DEFINE10,CONCAT(c.DEFINE7,c.DEFINE9,c.DEFINE10),b.udf1n AS jianshu,b.udf2n AS zhishu\n" +
            "FROM rkd_detail b\n" +
            "LEFT JOIN rkd_master a ON b.rkd_no=a.rkd_no\n" +
            "LEFT JOIN part c ON b.part_no=c.part_no\n" +
            "LEFT JOIN rkdscjh_detail d ON b.UDF16S=d.ITEMID\n" +
            "LEFT JOIN department e ON a.department_no=e.DEPARTMENT_NO\n" +
            "WHERE \n" +
            "a.department_no IS NOT NULL \n" +
            "AND \n" +
            "b.udf5s=#{udf5s}\n" +
            "AND \n" +
            "a.rkd_date>2021-01-01;")
    List<SaoMaEntity> findById(String udf5s);
    /*@Select("SELECT UDF5S FROM rkd_detail")
    List<Udf5sEntity> getudf5sList();*/


}
