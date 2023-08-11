package Day14.Board;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Day14.Board.DTO.Board;
import Day14.Board.DTO.Comment;
import Day14.Board.DTO.Text;
import Day14.Board.Service.BoardService;
import Day14.Board.Service.BoardServiceImpl;
import Day14.Board.Service.CommentService;
import Day14.Board.Service.CommentServiceImpl;

/**
 * 게시판 프로그램
 * - 메뉴판
 * - 게시글 목록
 * - 게시글 읽기
 * - 게시글 쓰기
 * - 게시글 수정
 * - 게시글 삭제
 */
public class Main {
	
	static List<Board> boardList = new ArrayList<Board>();			// 게시글 목록
	static List<Comment> commentList = new ArrayList<Comment>();	// 댓글 목록
	static Scanner sc = new Scanner(System.in);
	// 비즈니스 로직 계층으로 전환 (Service 패키지)
	// static DataService data = new BoardDAO();					// 데이터 베이스 접근 객체 (게시글)
	// static DataService data2 = new CommentDAO();					// 데이터 베이스 접근 객체 (댓글)
	
	// 비즈니스 로직 계층의 객체를 생성
	static BoardService boardService = new BoardServiceImpl();
	static CommentService commentService = new CommentServiceImpl();
	
	/**
	 * 메뉴판
	 */
	public static void menu() {
		System.out.println("########## 게시판 ##########");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("6. 댓글 쓰기");
		System.out.println("7. 댓글 수정");
		System.out.println("8. 댓글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("########## 번호 입력 : ");
	}
	
	/**
	 * 게시글 목록
	 */
	public static void list() {
		System.out.println("##### 게시글 목록 #####");
		boardList = boardService.list();
		
		for (Text board : boardList) {
			if( board == null ) {
				System.out.println("(게시글 없음)");
				continue;
			}
			
			int boardNo = board.getNo();
			String title = board.getTitle();
			String writer = board.getWriter();
			Date regDate = board.getRegDate();
			
			System.out.println("(" + boardNo + ") \t | " + title + " \t | " + writer + " \t | " + regDate );
		}
	}
	
	/**
	 * 게시글 읽기
	 * @param boardNo
	 */
	public static void read() {
		System.out.println("##### 게시글 읽기 #####");
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		Text board = boardService.select(boardNo);
		
		String title = board.getTitle();
		String writer =  board.getWriter();
		String content = board.getContent();
		Date regDate = board.getRegDate();
		Date updDate = board.getUpdDate();
		
		System.out.println("# 글번호 : " + boardNo + " ##########################");
		System.out.println("# 제목 : " + title);
		System.out.println("# 작성자 : " + writer);
		System.out.println("# " + content);
		System.out.println("# - 등록일자 : " + regDate);
		System.out.println("# - 수정일자 : " + updDate);
		System.out.println("######################################");
		System.out.println();
		
		// 해당 글의 댓글 목록
		commentList = commentService.list(boardNo);
		
		System.out.println("----------- [댓글 목록] -----------");
		for (Comment comment : commentList) {
			if( commentList == null ) continue;
			
			int commentNo = comment.getNo();
			String commentWriter = comment.getWriter();
			String commentContent = comment.getContent();
			Date commentRegDate = comment.getRegDate();
			Date commentUpdDate = comment.getUpdDate();
			
			System.out.println("===========================================");
			System.out.println("(" + commentNo + ") - [" + commentWriter + "]");
			System.out.println("# : " + commentContent );
			System.out.println("# - 등록일자 : " + commentRegDate);
			System.out.println("# - 수정일자 : " + commentUpdDate);
			System.out.println("===========================================");
		}
	}
	
	/**
	 * 게시글 쓰기
	 */
	public static void write() {
		System.out.println("##### 게시글 쓰기 #####");
		Board board = input();
		int result = boardService.insert( board );
		
		if( result > 0 ) {
			System.out.println("게시글이 작성되었습니다.");
		} 
	}
	
	/**
	 * 게시글 수정
	 */
	public static void update() {
		System.out.println("##### 게시글 수정 #####");
		System.out.print("게시글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();

		Board board = input();
		board.setBoardNo(boardNo);
		
		int result = boardService.update(board);
		
		if( result > 0 ) {
			System.out.println("게시글이 수정되었습니다.");
		}
	}
	
	/**
	 * 게시글 삭제
	 */
	public static void delete() {
		System.out.println("##### 게시글 삭제 #####");
		
		System.out.print("게시글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();

		int result = boardService.delete(boardNo);
		if( result > 0 ) {
			System.out.println("게시글이 삭제되었습니다.");
		}
	}
	
	// 게시글 정보 입력
	public static Board input() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board(title, writer, content);
		return board;
	}
	
	/**
	 * 댓글 쓰기
	 */
	public static void commentWrite() {
		System.out.println("##### 댓글 쓰기 #####");
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Comment comment = inputComment();
		comment.setNo(boardNo);				// no <- 게시글 번호(boardNo)
		
		int result = commentService.insert(comment);
		if( result > 0 ) {
			System.out.println("댓글이 작성되었습니다.");
		}
	}
	
	// 댓글 정보 입력
	public static Comment inputComment() {
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Comment comment = new Comment(writer, content);
		return comment;
	}
	
	/**
	 * 댓글 수정
	 */
	public static void commentUpdate() {
		System.out.println("##### 댓글 수정 #####");
		System.out.print("댓글 번호 : ");
		int commentNo = sc.nextInt();
		sc.nextLine();
		
		Comment comment = inputComment();
		comment.setNo(commentNo);
		
		int result = commentService.update(comment);
		if( result > 0 ) {
			System.out.println("댓글을 수정하였습니다.");
		}
	}
	
	/**
	 * 댓글 삭제
	 */
	public static void commentDelete() {
		System.out.println("##### 댓글 삭제 #####");
		System.out.print("댓글 번호 : ");
		int commentNo = sc.nextInt();
		sc.nextLine();
		
		int result = commentService.delete(commentNo);
		if( result > 0 ) {
			System.out.println("댓글을 삭제하였습니다.");
		}
	}
	
	// 게시판 프로그램 시작
	public static void main(String[] args) {
		int menuNo = 0;			// 메뉴번호
		do {
			menu();						// 메뉴판 출력
			menuNo = sc.nextInt();		// 메뉴번호 입력
			sc.nextLine();				// 엔터를 입력버퍼에서 제거
			
			// 프로그램 종료
			if( menuNo == 0 ) break;
			
			// 메뉴 선택
			switch (menuNo) {
				case 1:		list();				// 게시글 목록
							break;
				case 2:		read();				// 게시글 읽기
							break;
				case 3:		write();			// 게시글 쓰기
							break;
				case 4:		update();			// 게시글 수정
							break;
				case 5:		delete();			// 게시글 삭제
							break;
				case 6:		commentWrite();		// 댓글 쓰기
							break;
				case 7:		commentUpdate();	// 댓글 수정
							break;
				case 8:		commentDelete();	// 댓글 삭제
							break;
				default:	System.out.println("(0~5) 사이의 숫자를 입력해주세요.");
							break;
			}
			
		} while (menuNo != 0);
		
		System.out.println("프로그램을 종료합니다...");
	}
}












