package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<Board> set = new HashSet<>();
		set.add(new Board("����1", "����1", "�ۼ���1"));
		set.add(new Board("����2", "����2", "�ۼ���2"));
		set.add(new Board("����3", "����3", "�ۼ���3"));
		
		set.add(new Board("����1", "����1", "�ۼ���1"));

		System.out.println(set.size());

		Iterator<Board> iterator = set.iterator(); // �ݺ���
		while (iterator.hasNext()) { 
			Board board = iterator.next();
			System.out.println(board);
		}
		
		set.remove(new Board("����2", "����2", "�ۼ���2"));
	}
}
