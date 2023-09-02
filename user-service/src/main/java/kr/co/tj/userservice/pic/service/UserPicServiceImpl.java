package kr.co.tj.userservice.pic.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.tj.userservice.pic.dto.UserPicDTO;
import kr.co.tj.userservice.pic.persistence.UserPicEntity;
import kr.co.tj.userservice.pic.persistence.UserPicRepository;

@Service
public class UserPicServiceImpl implements UserPicService{
	
	private UserPicRepository userPicRepository;
	
	@Autowired
	public UserPicServiceImpl(UserPicRepository userPicRepository) {
		super();
		this.userPicRepository = userPicRepository;
	}

	@Override
	public String insertPic(UserPicDTO userPicDTO) {
		
		UserPicEntity userPicEntity = UserPicEntity.builder()
				.email(userPicDTO.getEmail())
				.filename(userPicDTO.getFilename())
				.picData(userPicDTO.getPicData())
				.build();
		userPicEntity = userPicRepository.save(userPicEntity);
		String email = userPicEntity.getEmail();
		
		return email;
	}

	@Override
	public String updatePic(UserPicDTO userPicDTO) {
		Optional<UserPicEntity> optional = userPicRepository.findByEmail(userPicDTO.getEmail());
		
		UserPicEntity userPicEntity;
		if(optional.isPresent()) {
			UserPicEntity orgUserPicEntity = optional.get();
			Long orgId = orgUserPicEntity.getId();
			
			userPicEntity = UserPicEntity.builder()
					.id(orgId)
					.email(userPicDTO.getEmail())
					.filename(userPicDTO.getFilename())
					.picData(userPicDTO.getPicData())
					.build();
		} else {
			userPicEntity = UserPicEntity.builder()
					.id(null)
					.email(userPicDTO.getEmail())
					.filename(userPicDTO.getFilename())
					.picData(userPicDTO.getPicData())
					.build();
		}
		
		userPicEntity = userPicRepository.save(userPicEntity);
		
		return userPicEntity.getEmail();
	}

	@Override
	public UserPicDTO findByEmail(String email) {
		
		Optional<UserPicEntity> optional = userPicRepository.findByEmail(email);
		
		if(!optional.isPresent()) {
			return null;
		}
		
		UserPicEntity userPicEntity = optional.get();
		
		UserPicDTO userPicDTO = UserPicDTO.builder()
				.id(userPicEntity.getId())
				.email(userPicEntity.getEmail())
				.filename(userPicEntity.getFilename())
				.picData(userPicEntity.getPicData())
				.build();
		return userPicDTO;
	}
	
	

}
