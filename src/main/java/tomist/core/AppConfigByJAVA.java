package tomist.core;

import tomist.core.discount.DiscountPolicy;
import tomist.core.discount.RateDiscountPolicy;
import tomist.core.member.MemberRepository;
import tomist.core.member.MemberService;
import tomist.core.member.MemberServiceImpl;
import tomist.core.member.MemoryMemberRepository;
import tomist.core.order.OrderService;
import tomist.core.order.OrderServiceImpl;

//역할을 드러나게 하는 것이 중요하다.
//메서드 명으로 역할이 드러난다.
//중복 제거가 중요하다.
public class AppConfigByJAVA {
  //생성자 주입
  public MemberService memberService(){
    return new MemberServiceImpl(memberRepository());
  }

  private static MemberRepository memberRepository() {
    return new MemoryMemberRepository();
  }

  public OrderService orderService(){
    return new OrderServiceImpl(memberRepository(), discountPolicy());
  }

  public DiscountPolicy discountPolicy(){
//    return new FixDiscountPolicy();
    return new RateDiscountPolicy();
  }
}
