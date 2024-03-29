package com.reiko.nail.repository;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.reiko.nail.dao.ShohinDao;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ShohinRepository {
	
	private final ShohinDao shohinDao;

	public int findByLastShohinCd(String color) {
		
		String lastShohinCd = shohinDao.findByLastShohinCd(color);
		
		// テーマカラー初回登録時
		if(StringUtils.isEmpty(lastShohinCd)) {
			return 0;
		} else {
			// 該当のテーマカラーで、2個目以降登録時
			String lastCd = lastShohinCd.substring(2);
			int lastNo = Integer.parseInt(lastCd);
			return lastNo;
		}
	}

}
