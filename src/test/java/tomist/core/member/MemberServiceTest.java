package tomist.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tomist.core.AppConfig;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
  MemberService memberService;

  @BeforeEach
  public void beforeEach(){
    AppConfig appConfig = new AppConfig();
    memberService = appConfig.memberService();
  }

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