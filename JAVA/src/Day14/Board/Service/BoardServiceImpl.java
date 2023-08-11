package Day14.Board.Service;

import java.util.List;

import Day14.Board.DAO.BoardDAO;
import Day14.Board.DTO.Board;

public class BoardServiceImpl implements BoardService {

	private BoardDAO boardDAO = new BoardDAO();
		
	// 게시글 목록
	@Override
	public List<Board> list() {
		List<Board> boardList = (List<Board>) boardDAO.selectList();
		// ...
		return boardList;
	}

	// 게시글 조회
	@Override
	public Board select(int boardNo) {
		Board board = (Board) boardDAO.select(boardNo);
		return board;
	}

	// 게시글 추가
	@Override
	public int insert(Board board) {
		int result = boardDAO.insert(board);
		// * 비즈니스 로직 예시
		// 글 작성 성공 시, 회원에게 포인트 10점을 부여한다.
		// if(result>0) {
		// userDAO.updatePoint(10);
		// }
		return result;
	}

	// 게시글 수정
	@Override
	public int update(Board board) {
		int result = boardDAO.update(board);
		return result;
	}

	//게시글 삭제
	@Override
	public int delete(int boardNo) {
		int result = boardDAO.delete(boardNo);
		return result;
	}

}
