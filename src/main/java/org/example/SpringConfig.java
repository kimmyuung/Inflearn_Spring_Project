package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.MemberRepository;
import repository.MemoryMemberRepository;
import service.MemberService;

//@Configuration // 컴포넌트 스캔을 하지 않을 수 사용하는 방법
//// 스프링 빈 직접 등록
//public class SpringConfig {
//
//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//}
