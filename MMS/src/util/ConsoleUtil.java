package util;

import java.util.Scanner;

import vo.Member;
import vo.SearchData;

public class ConsoleUtil {

	public Member getNewMember(Scanner scan) {
		Member newMember = new Member();
		System.out.println("=====새 회원 정보 등록======");
		System.out.print("회원아이디 : "); 		//조건들을 여기서 만들어서 member객체를 한번 걸러서 만들 수 있음.
		String id = scan.next();
		System.out.print("회원이름 : ");
		String name = scan.next();
		System.out.print("회원이메일 : ");
		String email = scan.next();
		System.out.print("회원주소 : ");
		String addr = scan.next();
		System.out.print("회원취미 : ");
		String hobby = scan.next();
		System.out.print("회원전화번호 : ");
		String tel = scan.next();
		System.out.print("회원나이 : ");
		int age = scan.nextInt();

		newMember.setId(id);
		newMember.setName(name);
		newMember.setEmail(email);
		newMember.setAddr(addr);
		newMember.setHobby(hobby);
		newMember.setTel(tel);
		newMember.setAge(age);
		return newMember;

	}

	public void printRegistSuccessMessage(String id) {
		System.out.println(id + "회원 등록 성공");
	}

	public void printRegistFailMessage(String id) {
		System.out.println(id + "회원 등록 실패");
	}

	public void printMemberList(Member[] memberArray) {
		if (memberArray.length == 0) {
			System.out.println("추가된 회원 정보가 없습니다.");
		} else {
			for (int i = 0; i < memberArray.length; i++) {
				System.out.println(memberArray[i]);
			}
		}

	}

	public String getId(String msgKind, Scanner scan) {
		System.out.print(msgKind + "아이디 : ");
		return scan.next();

		// 사용자가 입력한 아이드를 바로 return해 준다.
	}

	public Member getNewMember(Member oldMember, Scanner scan) {
		Member member = new Member();
		System.out.println("====새 회원 정보 수정=====");
		System.out.println("회원 아이디 : " + oldMember.getId());
		System.out.println("이전 이름 : " + oldMember.getName());
		System.out.print("새 회원 이름 : ");
		String name = scan.next();
		System.out.println("이전 이메일 : " + oldMember.getEmail());
		System.out.print("새 회원 이메일 : ");
		String email = scan.next();
		System.out.println("이전 주소 : " + oldMember.getAddr());
		System.out.print("새 회원 주소 : ");
		String addr = scan.next();
		System.out.println("이전 취미 : " + oldMember.getHobby());
		System.out.print("새 회원 취미 : ");
		String hobby = scan.next();
		System.out.println("이전 전화번호 : " + oldMember.getTel());
		System.out.println("새 회원 전화번호 : ");
		String tel = scan.next();
		System.out.println("이전 나이 : " + oldMember.getAge());
		System.out.print("새 회원 나이 :");
		int age = scan.nextInt();

		member.setId(oldMember.getId());
		member.setName(name);
		member.setEmail(email);
		member.setAddr(addr);
		member.setHobby(hobby);
		member.setTel(tel);
		member.setAge(age);

		return member;

	}

	public void printUpdateSuccessMessage(String id) {
		System.out.println(id + " 회원 정보 수정 성공");
	}

	public void printUpdateFailMessage(String id) {
		System.out.println(id + " 회원 정보 수정 실패");
	}

	public void printDeleteSuccessMessage(String id) {
		System.out.println(id + " 회원 정보 삭제 성공");
	}

	public void printDeleteFailMessage(String id) {
		System.out.println(id + " 회원 정보 삭제 실패");
	}

	public SearchData getSearchData(Scanner scan) {
		System.out.println("검색 조건을 선택하시오.");
		System.out.println("1. 아이디");
		System.out.println("2. 이름");
		System.out.println("검색 조건 : ");
		String searchCondition = scan.next(); // 검색조건 선택
		String searchValue = null; // 검색값

		if (searchCondition.equals("아이디")) {
			System.out.print("검색할 아이디 : ");
			searchValue = scan.next();
		}
		else if (searchCondition.equals("이름")) {
			System.out.print("검색할 이름 : ");
			searchValue=scan.next();
		}

		SearchData searchData = new SearchData(); // 리턴할 값이 두개이므로 리턴할 값을 속서으로 저장할 클래스 설계
		searchData.setSearchCondition(searchCondition);
		searchData.setSearchValue(searchValue);
		return searchData;

	}

	public void printSearchMember(Member member) {
		if (member == null) {
			System.out.println("검색할 결과가 없습니다.");
		} else {
			System.out.println(member.getId() + "으로 검색한 결과");
			System.out.println(member);
		}
	}

	public void printSearchMemberArray(Member[] memberArray) {
		if (memberArray == null) {
			System.out.println("이름으로 검샥한 결과가 없습니다.");

		} else {
			System.out.println("이름으로 검색한 결과 ");
			for (int i = 0; i < memberArray.length; i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
}
