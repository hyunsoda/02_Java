package com.Project.baseball.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import com.Project.baseball.model.dto.BaseballPlayer;
import com.Project.baseball.model.service.BaseballPlayerService;
import com.Project.baseball.model.service.BaseballPlayerServiceImpl;

public class BaseballPlayerView {

	private BufferedReader br = null;
	private BaseballPlayerService service = null;
	
	public BaseballPlayerView() {

		try {
			service = new BaseballPlayerServiceImpl();
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayMenu() {
		int input = 0;
		do {
		System.out.println("\n================== Baseball Player List ==============");
		
		System.out.println("1. 야구선수 조회하기");
		System.out.println("2. 신인선수 등록하기");
		System.out.println("3. 프로필 수정하기");
		System.out.println("4. 선수 검색하기");
		System.out.println("5. 데뷔연도별 정렬하기");
		System.out.println("6. 팀별 정렬하기");
		System.out.println("7. 은퇴선수 삭제하기");
		System.out.println("8. 선후배 조사하기");
		System.out.println("0. 프로그램 종료");
		
		System.out.println("======================================================");
		System.out.println();
		System.out.print("٩꒰｡•◡•｡꒱۶  :  검색하실 메뉴를 선택해주세요! >> ");
		
		
		try {
			input = Integer.parseInt(br.readLine());
			System.out.println();
			switch(input) {
			case 1: selectPlayer();break;
			case 2: addNewPlayer();break;
			case 3: updatePlayer();break;
			case 4: searchPlayer();break;
			case 5: debutYearSort();break;
			case 6: sortTeam();break;
			case 7: deletePlayer();break;
			case 8 : debutFirst();break;
			case 0: System.out.println("선수 조회 프로그램을 종료합니다.");break;
			default :System.out.println("[오류] : 메뉴에 작성된 번호를 입력해주세요.");
			
			
		}
			
			
			
		}catch(NumberFormatException e) {
			
			System.out.println("====숫자만 입력해주세요====");
			input = -1;
			
		}catch(Exception e) {
			
			System.out.println("====예외 발생====");
			e.printStackTrace();
			input = -1;
			
		}
			
	
		
		
			

		}	while(input != 0);
	}

	public void selectPlayer() {
		System.out.println("\n======================[1. 야구 선수 조회하기]======================");
	
		Set<BaseballPlayer> playerList = service.selectPlayer();
		for(BaseballPlayer list : playerList) {
			System.out.printf("이름 : %s, 팀 : %3s, 나이 : %2d, 포지션 : %3s, 데뷔년도 : %d\n", list.getName(),list.getTeam(),list.getAge(), list.getPosition(),list.getDebutYear());
		}
			System.out.println("==================================================================");
			System.out.println("------------------------------------------------------------------");
			System.out.printf("		  * 총 등록된 선수 : %d명 * 	    	  		\n",playerList.size());
			System.out.println("------------------------------------------------------------------");
	
	
	}
	
	public void addNewPlayer() throws Exception{
		System.out.println("\n================[2. 신인선수 등록하기]================");
		
		
		System.out.print("이름 : ");
		String name = br.readLine();
		
		System.out.print("팀 : ");
		String team = br.readLine();
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.print("포지션 : ");
		String position = br.readLine();
		
		System.out.print("데뷔연도 : ");
		int debutYear = Integer.parseInt(br.readLine());
		
		String newName = service.addNewPlayer(name,team,age,position,debutYear);
		
		if(newName!=null ) {
			System.out.printf("****  ٩꒰｡•◡•｡꒱۶ %s선수 입단을 축하드립니다! ٩꒰｡•◡•｡꒱۶ ****",newName);
			
		}else {
			System.out.println("선수등록을 실패하였습니다");
		}
	}
	
	public void updatePlayer() throws Exception {
		System.out.println("\n================[3. 선수 프로필 수정하기]================");

		System.out.print("٩꒰｡•◡•｡꒱۶ : 수정할 선수 이름을 입력해주세요. >> ");
		String fixName = br.readLine();
		
		boolean result = false;
		Set<BaseballPlayer> playerList = service.selectPlayer();
		for(BaseballPlayer player : playerList) {
			if(fixName.equals(player.getName())) {
				System.out.print("새로운 팀 입력 : ");
				String team = br.readLine();
				
				System.out.print("새로운 포지션 입력 : ");
				String position = br.readLine();
				
				result = service.updatePlayer(fixName,team,position);
			
				}
			}
		for(BaseballPlayer player : playerList) {
				if(result) {
					System.out.printf("== %s선수의 프로필 수정이 완료되었습니다.== ",player.getName());
					System.out.println("============================================");
					break;
				}else {
					System.out.println("**[실패] 존재하는 선수가 없습니다.**");
					break;
		}
			
		}
		
		
		
	}

	public void searchPlayer() throws Exception{
		System.out.println("\n================[4. 선수 검색하기]================");
		
		System.out.print("٩꒰｡•◡•｡꒱۶ 검색할 선수의 이름을 입력해주세요 : ");
		String name = br.readLine();
		
		BaseballPlayer player = service.searchPlayer(name);
		if(player != null) {
			System.out.println(player);
		} else {
			System.out.println("해당하는 선수가 없습니다.");
		}
		
	}
		
	public void debutYearSort() {
		System.out.println("\n======================[5. 데뷔연도별 정렬하기]======================");
		
		List<BaseballPlayer> playerList = service.debutYearSort();
		Comparator<BaseballPlayer> debutYearComparator = Comparator.comparing(BaseballPlayer::getDebutYear);
		Collections.sort(playerList, debutYearComparator);
		System.out.println();
		System.out.println("٩꒰｡•◡•｡꒱۶ 입단 연도가 가장 오래된 선수는 " + playerList.get(0).getName()+ "선수입니다!");
		System.out.println();
		for(BaseballPlayer player : playerList) {
			System.out.println(player);
		}
		System.out.println("==================================================================");
	}
	
	public void sortTeam() throws Exception{
		System.out.println("\n========================[6. 팀별 정렬하기]========================");
		
		List<BaseballPlayer> playerList = service.sortTeam();
		Comparator<BaseballPlayer> teamComparator = Comparator.comparing(BaseballPlayer::getTeam);
		Collections.sort(playerList, teamComparator);
		for(BaseballPlayer player : playerList) {
			System.out.println(player);
			
		}
		System.out.println("==================================================================");
		
	}

	public void deletePlayer() throws Exception{
		System.out.println("\n================[7. 은퇴선수 삭제하기]================");
		
		System.out.print("삭제할 선수의 이름을 입력해주세요. : ");
		String rname = br.readLine();
		int num = 0;
		
		Set<BaseballPlayer> playerList = service.selectPlayer();

				num = service.deletePlayer(rname);

		if(num == 1) System.out.println(rname + "선수 수고하셨습니다.");
		else System.out.println("등록되어있지 않은 선수입니다.");
		
		
	}

	public void debutFirst() throws Exception{
		System.out.println("\n================[8. 선후배 조사하기]================");
		System.out.println("٩꒰｡•◡•｡꒱۶ : 선후배 관계를 조사할 두 선수의 이름을 입력해주세요. >> ");
		System.out.println();
		System.out.print("첫 번째 이름 : ");
		String name1 = br.readLine();
		
		System.out.print("두 번째 이름 : ");
		String name2 = br.readLine();
		
		List<BaseballPlayer> playerList = service.sortTeam();
		
		int player1 = 0;
		int player2 = 0;
		
		for(BaseballPlayer player : playerList) {
			if(name1.equals(player.getName())) {
			
			player1 = service.debutFirst(name1);
	
			} else {
				System.out.println("등록되어있지 않은 선수입니다. ");
				return;
			}
		}
		
		for(BaseballPlayer player : playerList) {
			if(name2.equals(player.getName())) {
				
				player2 = service.debutFirst(name2);
				
			}else {
				System.out.println("등록되어있지 않은 선수입니다. ");
				return;
			}
		}		
	
		Comparator<BaseballPlayer> debutYearComparator = Comparator.comparing(BaseballPlayer::getDebutYear);
		Collections.sort(playerList, debutYearComparator);

		if(player1 <player2) {
			System.out.printf("%s선수가 %s보다 선배입니다.",name1,name2);
		}else {
			System.out.printf("%s선수가 %s보다 선배입니다.",name2,name1);
		}
	};

	

}
