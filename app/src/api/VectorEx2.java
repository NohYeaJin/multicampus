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
		// ������
		List<Board> list = new Vector<Board>();
		/*
		 * list.add("A"); list.add("B"); list.add("C"); list.add("D");
		 */
		// string���� ����س��� ������ scanner ���� �� ����
		// list.add(new Scanner(System.in));
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		//cal.get(1);�� ����
		
		System.out.println(cal.get(Calendar.MONTH)+1);
		
		StringBuilder sb = new StringBuilder();
		sb.append(cal.get(Calendar.YEAR));
		sb.append("�� ");
		sb.append(cal.get(Calendar.MONTH)+1);
		sb.append("��");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(date));
		list.add(new Board("����1", "����1", "�۾���1",sb.toString()));
		list.add(new Board("����2", "����2", "�۾���2",""));
		list.add(new Board("����3", "����3", "�۾���3",""));
		list.add(new Board("����4", "����4", "�۾���4",""));
		list.add(new Board("����5", "����5", "�۾���5",""));
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
