package io.renren.modules.saoma.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-27 21:50:37
 */
@Data
@TableName("rkd_master")
public class RkdMasterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String rkdNo;
	/**
	 * 
	 */
	private String examinerNo;
	/**
	 * 
	 */
	private String listerNo;
	/**
	 * 
	 */
	private String remarks;
	/**
	 * 
	 */
	private String rkClass;
	/**
	 * 
	 */
	private Date rkdDate;
	/**
	 * 
	 */
	private String departmentNo;
	/**
	 * 
	 */
	private String yewuyuanNo;
	/**
	 * 
	 */
	private String manualRkdNo;
	/**
	 * 
	 */
	private String clientNo;
	/**
	 * 
	 */
	private String examined;
	/**
	 * 
	 */
	private String rkdType;
	/**
	 * 
	 */
	private String remarks2;
	/**
	 * 
	 */
	private Date dateRemarks;
	/**
	 * 
	 */
	private String sourceBillNo;
	/**
	 * 
	 */
	private Integer prnModelNo;
	/**
	 * 
	 */
	private Integer dispModelNo;
	/**
	 * 
	 */
	private Date lDate;
	/**
	 * 
	 */
	private Integer expSeq;
	/**
	 * 
	 */
	private String class1No;

}
