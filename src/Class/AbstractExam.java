package Class;

import java.util.ArrayList;
import java.util.Scanner;

import User.Main;

public abstract class AbstractExam {
	protected String name;
	protected ArrayList<Integer> scores = new ArrayList<Integer>();
	
	private Scanner scanner = new Scanner(System.in);
	
	public AbstractExam(String name) {
		this.name = name;
	}
	
	public void setGrade(ArrayList<Integer> scores) {
		this.scores = scores;
	}
	
	public Integer getGrade(Integer index) {
		return scores.get(index);
	}
}
