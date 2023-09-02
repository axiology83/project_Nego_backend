package kr.co.tj.sellservice.info.service;

import java.util.List;


import kr.co.tj.sellservice.info.dto.SellInfoDTO;

public interface SellInfoService {

	
	void testinsert(int trialNum, double rangeInKm);

	SellInfoDTO insert(SellInfoDTO dto);

	SellInfoDTO update(SellInfoDTO dto);
	
	SellInfoDTO findBySellId(String sellId);

	List<SellInfoDTO> findAroundAll(Double longitude, Double latitude, Double rangeInKm);
	
	List<SellInfoDTO> findByEmail(String email);
	
	SellInfoDTO reserve(String id, String buyer);

	SellInfoDTO soldout(String id, String buyer);

	SellInfoDTO onsale(String id);
	
	SellInfoDTO isReviewed(String id, boolean isReviewed);

	boolean delete(String id);

	
	

}
