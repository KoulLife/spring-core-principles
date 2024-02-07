package tomist.core;

import tomist.core.member.Grade;
import tomist.core.member.Member;
import tomist.core.member.MemberService;

//TEST 목적으로 사용
public class MemberApp {
  public static void main(String[] args) {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
//    MemberService memberService = new MemberServiceImpl();

    Member member = new Member(1L, "dongik", Grade.VIP);
    memberService.join(member);

    Member result = memberService.findById(1L);

    System.out.println("member: " + member.getName());
    System.out.println("result: " + result.getName());
  }
}
