package kr.co.tj.boardservice.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>{



	void deleteByEmail(String email);

	List<BoardEntity> findByEmail(String email);

	Page<BoardEntity> findByTitleContainingOrHtmlStringContaining(String keyword, String keyword2, Pageable pageable);

	Optional<BoardEntity> findBysellId(String sellid);



	

}
