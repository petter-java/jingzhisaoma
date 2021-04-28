package io.renren.modules.saoma.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SaoMaEntity {
    /*private String udf5S;//一维码*/

    private String QTY;//重量
    private Date rkdDate;//生产日期
    private String UDF7S;//原料厂家

    private String departmentDesc;//生产班组
    private String partName;//产品名称
    private String DEFINE7;//拼接规格
    private String DEFINE9;//拼接规格
    private String DEFINE10;//拼接规格




}
