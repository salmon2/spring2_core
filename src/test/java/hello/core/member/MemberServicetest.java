package hello.core.member;

import hello.core.order.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MemberServicetest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
         AppConfig appConfig = new AppConfig();
         memberService = appConfig.memberService();
    }


    @Test
    void join(){
        //given
        Member member =  new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(member);


        //then
    }
}
