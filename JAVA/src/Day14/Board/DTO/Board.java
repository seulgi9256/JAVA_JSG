package Day14.Board.DTO;


public class Board extends Text{

	private int boardNo;
//	private String title;
//	private String writer;
//	private String content;
	
//	// Date : 날짜/시간을 다루는 클래스
//	private Date regDate;
//	private Date updDate;
	
	// 생성자
	public Board() {
		this("제목없음", "글쓴이없음", "내용없음");
	}
	
	public Board(String title, String writer, String content) {
		super(title, writer, content);	
	}


	public int getBoardNo() {
		return boardNo;
	}


	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
		setNo(boardNo);
	}	
	
	
}
