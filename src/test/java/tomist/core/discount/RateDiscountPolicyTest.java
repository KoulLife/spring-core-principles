package tomist.core.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tomist.core.member.Grade;
import tomist.core.member.Member;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

  DiscountPolicy discountPolicy = new RateDiscountPolicy();

  @Test
  @DisplayName("VIP는 10프로 할인이 적용되어야 한다")
  void vip(){
    //given
    Member member = new Member(1L, "dongik", Grade.VIP);
    //when
    int discount = discountPolicy.discount(member, 10000);
    //then
    Assertions.assertThat(discount).isEqualTo(1000);
  }
}