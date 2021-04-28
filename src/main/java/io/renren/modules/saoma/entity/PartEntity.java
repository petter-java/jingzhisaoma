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
@TableName("part")
public class PartEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String partNo;
	/**
	 * 
	 */
	private String partName;
	/**
	 * 
	 */
	private String partClassNo;
	/**
	 * 
	 */
	private String property;
	/**
	 * 
	 */
	private String spec;
	/**
	 * 
	 */
	private String unit;
	/**
	 * 
	 */
	private String coUnit;
	/**
	 * 
	 */
	private String substitute;
	/**
	 * 
	 */
	private String location;
	/**
	 * 
	 */
	/*private String class;*/
	/**
	 * 
	 */
	private String englishName;
	/**
	 * 
	 */
	private String englishUnit;
	/**
	 * 
	 */
	private String supplierNo;
	/**
	 * 
	 */
	private String coSupplierNo;
	/**
	 * 
	 */
	private Integer leadTime;
	/**
	 * 
	 */
	private String define1;
	/**
	 * 
	 */
	private String define2;
	/**
	 * 
	 */
	private String define3;
	/**
	 * 
	 */
	private String define4;
	/**
	 * 
	 */
	private String define5;
	/**
	 * 
	 */
	private Double purchasePrice;
	/**
	 * 
	 */
	private Double salesPrice1;
	/**
	 * 
	 */
	private Double salesPrice2;
	/**
	 * 
	 */
	private Double salesPrice3;
	/**
	 * 
	 */
	private Double salesPrice4;
	/**
	 * 
	 */
	private Double salesPrice5;
	/**
	 * 
	 */
	private Double safeStock;
	/**
	 * 
	 */
	private Double maxStock;
	/**
	 * 
	 */
	private Double minStock;
	/**
	 * 
	 */
	private String ifPici;
	/**
	 * 
	 */
	private Integer baozhiqi;
	/**
	 * 
	 */
	private Double standCost;
	/**
	 * 
	 */
	private Double jhPrice;
	/**
	 * 
	 */
	private Double jTaxRate;
	/**
	 * 
	 */
	private Double xTaxRate;
	/**
	 * 
	 */
	private String cbMethod;
	/**
	 * 
	 */
	private String xsKm;
	/**
	 * 
	 */
	private String chengbenKm;
	/**
	 * 
	 */
	private String shouruKm;
	/**
	 * 
	 */
	private String cunhuoKm;
	/**
	 * 
	 */
	private String jTaxKm;
	/**
	 * 
	 */
	private String xTaxKm;
	/**
	 * 
	 */
	private String closed;
	/**
	 * 
	 */
	private Double onso;
	/**
	 * 
	 */
	private Double onpo;
	/**
	 * 
	 */
	private Double define1n;
	/**
	 * 
	 */
	private Double define2n;
	/**
	 * 
	 */
	private Double define3n;
	/**
	 * 
	 */
	private Double define4n;
	/**
	 * 
	 */
	private Double define5n;
	/**
	 * 
	 */
	private String taxType;
	/**
	 * 
	 */
	private String define6;
	/**
	 * 
	 */
	private String define7;
	/**
	 * 
	 */
	private String define8;
	/**
	 * 
	 */
	private String define9;
	/**
	 * 
	 */
	private String define10;
	/**
	 * 
	 */
	private Double define6n;
	/**
	 * 
	 */
	private Double define7n;
	/**
	 * 
	 */
	private Double define8n;
	/**
	 * 
	 */
	private Double define9n;
	/**
	 * 
	 */
	private Double define10n;
	/**
	 * 
	 */
	private String unit2;
	/**
	 * 
	 */
	private Double factor2;
	/**
	 * 
	 */
	private String unit3;
	/**
	 * 
	 */
	private Double factor3;
	/**
	 * 
	 */
	private String unit4;
	/**
	 * 
	 */
	private Double factor4;
	/**
	 * 
	 */
	private String unit5;
	/**
	 * 
	 */
	private Double factor5;
	/**
	 * 
	 */
	private String defaultUnitIndex;
	/**
	 * 
	 */
	private Double purchasePrice2;
	/**
	 * 
	 */
	private Double purchasePrice3;
	/**
	 * 
	 */
	private Double purchasePrice4;
	/**
	 * 
	 */
	private Double purchasePrice5;
	/**
	 * 
	 */
	private Double purLastyearBizhong;
	/**
	 * 
	 */
	private String outer1s;
	/**
	 * 
	 */
	private String outer2s;
	/**
	 * 
	 */
	private String outer3s;
	/**
	 * 
	 */
	private String outer4s;
	/**
	 * 
	 */
	private String outer5s;
	/**
	 * 
	 */
	private String outer6s;
	/**
	 * 
	 */
	private String outer7s;
	/**
	 * 
	 */
	private String outer8s;
	/**
	 * 
	 */
	private String outer9s;
	/**
	 * 
	 */
	private String outer10s;
	/**
	 * 
	 */
	private Integer expSeq;

}
