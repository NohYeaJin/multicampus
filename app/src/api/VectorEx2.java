package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		// 다형성
		List<Board> list = new Vector<Board>();
		/*
		 * list.add("A"); list.add("B"); list.add("C"); list.add("D");
		 */
		// string으로 명시해놨기 때문에 scanner 넣을 수 없다
		// list.add(new Scanner(System.in));
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		//cal.get(1);과 같음
		
		System.out.println(cal.get(Calendar.MONTH)+1);
		
		StringBuilder sb = new StringBuilder();
		sb.append(cal.get(Calendar.YEAR));
		sb.append("년 ");
		sb.append(cal.get(Calendar.MONTH)+1);
		sb.append("월");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(date));
		list.add(new Board("제목1", "내용1", "글쓴이1",sb.toString()));
		list.add(new Board("제목2", "내용2", "글쓴이2",""));
		list.add(new Board("제목3", "내용3", "글쓴이3",""));
		list.add(new Board("제목4", "내용4", "글쓴이4",""));
		list.add(new Board("제목5", "내용5", "글쓴이5",""));
		list.remove(2);
		list.remove(3);
		
		Math.random();
		Random ran = new Random();
		
		for(int i = 0;i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer+"\t"+board.date);
		}

	}
}
