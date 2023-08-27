package kr.co.tj.chatservice.room.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoomEntity, String>{

	Optional<ChatRoomEntity> findByTitle(String title);

	List<ChatRoomEntity> findByEmail1ContainingOrEmail2Containing(String email1, String email2);

}
