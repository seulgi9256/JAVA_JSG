package Day14.Board.Service;

import java.util.List;

import Day14.Board.DAO.CommentDAO;
import Day14.Board.DTO.Comment;

public class CommentServiceImpl implements CommentService{
	
	private CommentDAO commentDAO = new CommentDAO();

	@Override
	public List<Comment> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Comment> list(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment select(int commentNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Comment comment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Comment comment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Comment comment) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
