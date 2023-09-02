package kr.co.tj.userservice.info.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import kr.co.tj.userservice.info.persistence.UserInfoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String email;
	private String password;
	private String name;
	private String googleImageUrl;

	private Double longitude;
	private Double latitude;

	private Date createAt;
	private Date updateAt;
	
	private String token;
	
	
	public static UserInfoDTO buildFrom(UserInfoRequest ureq) {
		return UserInfoDTO.builder()
				.email(ureq.getEmail())
				.name(ureq.getName())
				.password(ureq.getPassword())
				.longitude(ureq.getLongitude())
				.latitude(ureq.getLatitude())
				.build();
	}
	
	
	public UserInfoResponse toBuildUserResponse() {
		return UserInfoResponse.builder()
				.email(email)
				.name(name)
				.createAt(createAt)
				.updateAt(updateAt)
				.token(token)
				.build();
	}
	
	
	public UserInfoEntity toBuildUserEntity() {
		return UserInfoEntity.builder()
				.email(email)
				.name(name)
				.password(password)
				.createAt(createAt)
				.updateAt(updateAt)
				.build();
	}

	
	
	
	public UserInfoDTO setFrom(UserInfoEntity userInfoEntity) {
		this.email = userInfoEntity.getEmail();
		this.name = userInfoEntity.getName();
		this.createAt = userInfoEntity.getCreateAt();
		this.updateAt = userInfoEntity.getUpdateAt();

		return this;
	}


	

	
	
	public static UserInfoDTO buildFrom(UserLoginRequest userLoginRequest) {
		
		return UserInfoDTO.builder()
				.email(userLoginRequest.getEmail())
				.password(userLoginRequest.getPassword())
				.build();
	}

}
