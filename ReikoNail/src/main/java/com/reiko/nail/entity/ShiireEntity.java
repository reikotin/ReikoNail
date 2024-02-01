package com.reiko.nail.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ShiireEntity {
	
	/** 仕入ID */
	private String shiireId;
	/** 大分類名 */
	private String daiBunruiName;
	/** 小分類名 */
	private String shoBunruiName;
	/** 商品名 */
	private String itemName;
	/** 税抜額 */
	private int zeinukiGaku;
	/** 税額 */
	private int zeiGaku;
	/** 税込額 */
	private int zeikomiGaku;
	/** 仕入日 */
	private LocalDate shiireDate;
	/** 仕入先 */
	private String shiireSaki;
	/** メーカー */
	private String shiireMaker;
	/** janコード */
	private String janCd;
	/** サイズ */
	private String itemSize;
	/** 数量 */
	private int suryo;
	/** 削除フラグ */
	private String deleteFlag;
	/** 登録日 */
	private LocalDate createDate;
	/** 更新日 */
	private LocalDate updateDate;
}
