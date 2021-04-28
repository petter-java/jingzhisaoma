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
@TableName("rkdscjh_detail")
public class RkdscjhDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String rkdNo;
	/**
	 * 
	 */
	private String partNo;
	/**
	 * 
	 */
	private String unit;
	/**
	 * 
	 */
	private Double qty;
	/**
	 * 
	 */
	private Double dj;
	/**
	 * 
	 */
	private Double je;
	/**
	 * 
	 */
	private Integer sn;
	/**
	 * 
	 */
	private String storageNo;
	/**
	 * 
	 */
	private Double feiyongTcTe;
	/**
	 * 
	 */
	private Double udf1n;
	/**
	 * 
	 */
	private Double udf2n;
	/**
	 * 
	 */
	private Double udf3n;
	/**
	 * 
	 */
	private Double udf4n;
	/**
	 * 
	 */
	private Double udf5n;
	/**
	 * 
	 */
	private String udf1s;
	/**
	 * 
	 */
	private String udf2s;
	/**
	 * 
	 */
	private String udf3s;
	/**
	 * 
	 */
	private String udf4s;
	/**
	 * 
	 */
	private String udf5s;
	/**
	 * 
	 */
	private String produceNo;
	/**
	 * 
	 */
	private Date produceDate;
	/**
	 * 
	 */
	private Date validDate;
	/**
	 * 
	 */
	private Integer validDay;
	/**
	 * 
	 */
	private String itemid;
	/**
	 * 
	 */
	private Double unitQty;
	/**
	 * 
	 */
	private Double factor;
	/**
	 * 
	 */
	private Double unitDj;
	/**
	 * 
	 */
	private Double unitJe;
	/**
	 * 
	 */
	private Double udf6n;
	/**
	 * 
	 */
	private Double udf7n;
	/**
	 * 
	 */
	private Double udf8n;
	/**
	 * 
	 */
	private Double udf9n;
	/**
	 * 
	 */
	private Double udf10n;
	/**
	 * 
	 */
	private Double udf11n;
	/**
	 * 
	 */
	private Double udf12n;
	/**
	 * 
	 */
	private Double udf13n;
	/**
	 * 
	 */
	private Double udf14n;
	/**
	 * 
	 */
	private Double udf15n;
	/**
	 * 
	 */
	private Double udf16n;
	/**
	 * 
	 */
	private Double udf17n;
	/**
	 * 
	 */
	private Double udf18n;
	/**
	 * 
	 */
	private Double udf19n;
	/**
	 * 
	 */
	private Double udf20n;
	/**
	 * 
	 */
	private String udf6s;
	/**
	 * 
	 */
	private String udf7s;
	/**
	 * 
	 */
	private String udf8s;
	/**
	 * 
	 */
	private String udf9s;
	/**
	 * 
	 */
	private String udf10s;
	/**
	 * 
	 */
	private String udf11s;
	/**
	 * 
	 */
	private String udf12s;
	/**
	 * 
	 */
	private String udf13s;
	/**
	 * 
	 */
	private String udf14s;
	/**
	 * 
	 */
	private String udf15s;
	/**
	 * 
	 */
	private String udf16s;
	/**
	 * 
	 */
	private String udf17s;
	/**
	 * 
	 */
	private String udf18s;
	/**
	 * 
	 */
	private String udf19s;
	/**
	 * 
	 */
	private String udf20s;
	/**
	 * 
	 */
	private String tmckbz;

}
