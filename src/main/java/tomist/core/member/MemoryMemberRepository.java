package tomist.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
  private static Map<Long, Member> store = new HashMap<>(); //동시성 문제 때문에 concurrenthashmap을 사용하는 것이 더 바람직하다.

  @Override
  public void save(Member member) {
    store.put(member.getId(), member);
  }

  @Override
  public Member findById(Long memberId) {
    return store.get(memberId);
  }
}
