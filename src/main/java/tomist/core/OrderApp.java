package tomist.core;

import tomist.core.member.Grade;
import tomist.core.member.Member;
import tomist.core.member.MemberService;
import tomist.core.member.MemberServiceImpl;
import tomist.core.order.Order;
import tomist.core.order.OrderService;
import tomist.core.order.OrderServiceImpl;

public class OrderApp {
  public static void main(String[] args) {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();

    Long memberId = 1L;
    Member member = new Member(memberId, "MemberA", Grade.VIP);
    memberService.join(member);

    Order order = orderService.createOrder(memberId, "ItemA", 30000);

    System.out.println("order = " + order);
  }
}
