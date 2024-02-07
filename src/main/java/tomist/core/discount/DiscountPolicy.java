package tomist.core.discount;

import tomist.core.member.Member;

public interface DiscountPolicy {
  //할인 대상 금액을 return
  int discount(Member member, int price);
}

