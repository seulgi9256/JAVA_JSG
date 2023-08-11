package Day14.Board.DAO;

public interface DataService {
	
	Text[] selectList();
	
	Text[] selectList(int boardNo);
	
	Text select(int no);
	
	int insert(Text text);
	
	int update(Text text);
	
	int delete(int no);

}
