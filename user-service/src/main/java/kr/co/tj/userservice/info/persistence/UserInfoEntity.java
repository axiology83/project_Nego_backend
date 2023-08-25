package kr.co.tj.userservice.info.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "id-uuid")
	@GenericGenerator(strategy = "uuid", name="id-uuid")
	private String id;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	private String password;
	
	private boolean google;
	
	
	@Setter	@Column(nullable = false)
	private String name;
	
	private String googleImageUrl;
	
	@Setter
	private Double longitude;
	
	@Setter
	private Double latitude;
	
	private Date createAt;
	
	@Setter
	private Date updateAt;
	
	

}

