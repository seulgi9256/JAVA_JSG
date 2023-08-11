package Day14.Board.Service;

import java.util.List;

import Day14.Board.DAO.BoardDAO;
import Day14.Board.DTO.Board;

public class BoardServiceImpl implements BoardService {

	private BoardDAO boardDAO = new BoardDAO();
			
	@Override
	public List<Board> list() {
		return null;
	}

	@Override
	public Board select(int boardNo) {
		return null;
	}

	@Override
	public int insert(Board board) {
		return 0;
	}

	@Override
	public int update(Board board) {
		return 0;
	}

	@Override
	public int delete(int boardNo) {
		return 0;
	}

}
