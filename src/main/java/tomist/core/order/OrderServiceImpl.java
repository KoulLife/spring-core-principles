package tomist.core.order;

import tomist.core.discount.DiscountPolicy;
import tomist.core.discount.FixDiscountPolicy;
import tomist.core.member.Member;
import tomist.core.member.MemberRepository;
import tomist.core.member.MemberService;
import tomist.core.member.MemberServiceImpl;

public class OrderServiceImpl implements OrderService{

  private final DiscountPolicy discountPolicy;
  private final MemberRepository memberRepository;

  public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
    this.discountPolicy = discountPolicy;
    this.memberRepository = memberRepository;
  }

  @Override
  public Order createOrder(Long memberId, String itemName, int itemPrice) {
    Member member = memberRepository.findById(memberId);
    int discount = discountPolicy.discount(member, itemPrice);

    return new Order(memberId, itemName, itemPrice, discount);
  }
}
