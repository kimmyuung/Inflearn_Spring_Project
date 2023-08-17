package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.MemberService;

@Controller // 컴포넌트 스캔 방식
public class MemberController {

    //@Autowired  // 필드 자동 주입
    private MemberService memberService;

    @Autowired // 생성자 자동 주입을 많이 사용
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }


}
