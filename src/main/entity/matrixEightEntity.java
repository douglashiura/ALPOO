package main.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class matrixEightEntity {
	private Integer idMatrix;
	private Integer a11;
	private Integer a12;
	private Integer a13;
	private Integer a21;
	private Integer a22;
	private Integer a23;
	private Integer a31;
	private Integer a32;
	private Integer a33;


	public matrixEightEntity() {
		super();
	}

	public matrixEightEntity(Integer a11, Integer a12, Integer a13, Integer a21, Integer a22, Integer a23,
			Integer a31, Integer a32, Integer a33) {
		
		super();
		this.a11 = a11;
		this.a12 = a12;
		this.a13 = a13;
		this.a21 = a21;
		this.a22 = a22;
		this.a23 = a23;
		this.a31 = a31;
		this.a32 = a32;
		this.a33 = a33;
	}
	
	public List<Integer> getNumbers(){
		
		List<Integer> plays = new ArrayList<Integer>();
		
		plays.add(0);
		plays.add(1);
		plays.add(2);
		plays.add(3);
		plays.add(4);
		plays.add(5);
		plays.add(6);
		plays.add(7);
		plays.add(8);
		
		Collections.shuffle(plays);
		
		return plays;
	}
	
	@Override
	public String toString() {
		return "matrixEightEntity [idMatrix=" + idMatrix + ", a11=" + a11 + ", a12=" + a12 + ", a13=" + a13 + ", a21="
				+ a21 + ", a22=" + a22 + ", a23=" + a23 + ", a31=" + a31 + ", a32=" + a32 + ", a33=" + a33 + "]";
	}


}
