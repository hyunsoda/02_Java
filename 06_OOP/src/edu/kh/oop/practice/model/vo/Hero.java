package edu.kh.oop.practice.model.vo;

public class Hero {
	// 속성
	// 필드 == 멤버변수
	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private int exp;
	
	
	
	// 기능
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	/*
	 *  - attack(exp) : nick + "은/는 공격을 했다!" 출력 후 전달받은 경험치를 현재 경험치에 누적
	 *  누적 경험치가 500을 넘으면 레벨 1 업 하기
	 *  레벨이 올랐다는 문구 출력 + 현재 레벨 표시
	 * */
	
	public void attack(int exp) {
		System.out.println(nickName + "은/는 공격을 했다!");
		this.exp += exp;
		// this.exp -> 필드에 있는 exp
		System.out.println("현재 경험치는 : " + this.exp);
		if(this.exp>500) {
			level++;
			System.out.println("레벨업! :" + level);
		}
		
	}
	
	/*
	 * magicJump : 점프할 때마다 nickName + "의 점프!"출력, 동시에 mp가 -10씩 감소됨
	 * 단 현재 mp가 0이라면 "더 이상 매직 점프를 할 수 없어요!" 출력
	 * */
	
	public void magicJump() {
		
		if(mp<=0) {
			System.out.println("더 이상 매직 점프할 수 없어요!");
		}else {
			System.out.println(nickName + "의 점프!");
			mp -=10;
			System.out.println(mp);
		}
		
	}
	
}
