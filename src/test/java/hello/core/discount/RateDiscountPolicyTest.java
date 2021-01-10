package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("vip는 10퍼 할인되어야함")
    void vip_o(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("vip가 아니면 할인이 되면 안된다.")
    void vip_x(){
        //given
        Member member = new Member(2L, "memberB", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        //Assertions.assertThat(discount).isEqualTo(1000);
        assertThat(discount).isEqualTo(0);
    }
}