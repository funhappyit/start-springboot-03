package org.zerock;



import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.zerock.domain.Member;
import org.zerock.domain.Profile;
import org.zerock.persistence.MemberRepository;
import org.zerock.persistence.ProfileRepository;

import lombok.extern.java.Log;

@SpringBootTest
@Log // Lombok의 로그를 사용할 때 이용하는 어노테이션 
@Commit //테스트 결과를 데이터 베이스에 commit하는 용도
public class ProfileTests {
	
	@Autowired
	MemberRepository memberRepo;
	
	@Autowired
	ProfileRepository profileRepo;
	/*
	 member 데이터 생성
	@Test
	public void testInsertMember() {
		
		IntStream.range(1, 101).forEach(i ->{
			Member member = new Member();
			member.setUid("user"+i);
			member.setUpw("pw"+i);
			member.setUname("사용자"+i);
			
			memberRepo.save(member);
		});

	}

	
	//특정 회원의 프로필 데이터 처리 
	@Test
	public void testInsertProfile() {
		
		Member member = new Member();
		member.setUid("user1");
		
		for(int i=1; i<5; i++) {
			Profile profile1 = new Profile();
			profile1.setFname("face"+i+".jpg");
			
			if(i == 1) {
				profile1.setCurrent(true);
			}
			profile1.setMember(member);
			profileRepo.save(profile1);
		}
		
		
		                                                                                                                 
	}
	

	@Test
	public void testFetchJoin1() {
		List<Object[]> result = memberRepo.getMemberWithProfileCount("user1");
		
		result.forEach(arr ->{
			System.out.println(Arrays.toString(arr));
		});
	}
	*/
	@Test
	public void restFetchJoin2() {
		List<Object[]> result = memberRepo.getMemberWithProfile("user1");
		
		result.forEach(arr -> System.out.println(Arrays.toString(arr)));
	}
	
	
	
}
