package Day14.Board.Service;

import java.util.List;

import Day14.Board.DTO.Comment;

public interface CommentService {
	
	// 댓글 목록
	List<Comment> list();
	
	List<Comment> list(int BoardNo);
	
	// 댓글 조회
	Comment select(int commentNo);
	
	// 댓글 추가
	int insert(Comment comment);
	
	// 댓글 수정
	int update(Comment comment);
	
	// 댓글 삭제
	int delete(int commentNo); 
	
	
}
