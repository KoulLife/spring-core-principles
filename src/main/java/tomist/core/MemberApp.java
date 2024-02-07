package tomist.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tomist.core.member.Grade;
import tomist.core.member.Member;
import tomist.core.member.MemberService;

//TEST 목적으로 사용
public class MemberApp {
  public static void main(String[] args) {
//    AppConfig appConfig = new AppConfig();
//    MemberService memberService = appConfig.memberService();
//    MemberService memberService = new MemberServiceImpl();

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

    Member member = new Member(1L, "dongik", Grade.VIP);
    memberService.join(member);

    Member result = memberService.findById(1L);

    System.out.println("member: " + member.getName());
    System.out.println("result: " + result.getName());
  }
}
