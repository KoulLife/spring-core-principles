package tomist.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
  MemberService memberService = new MemberServiceImpl();

  @Test
  void join(){
    //given
    Member member = new Member(1L, "toMist", Grade.BASIC);
    //when
    memberService.join(member);
    Member findMember = memberService.findById(1L);
    //then
    Assertions.assertThat(findMember).isEqualTo(member);
  }

}