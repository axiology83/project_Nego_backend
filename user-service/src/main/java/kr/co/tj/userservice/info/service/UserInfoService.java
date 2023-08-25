package kr.co.tj.userservice.info.service;


import kr.co.tj.userservice.info.dto.UserInfoDTO;

public interface UserInfoService {
	
	UserInfoDTO login(UserInfoDTO userInfoDTO);
	UserInfoDTO getUser(String email);
	UserInfoDTO insertUser(UserInfoDTO userInfoDTO);
	UserInfoDTO updateUser(UserInfoDTO userInfoDTO);
	void deleteUser(String email);
	UserInfoDTO setDate(UserInfoDTO userInfoDTO);
	
	void testinsert(UserInfoDTO userInfoDTO);
	boolean passwordValidation(String email, String password);
	
	

}
