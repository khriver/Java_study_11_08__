package Han_study._11_08__;

import Han_study._11_08__.repository.MemberRepository;
import Han_study._11_08__.repository.MemoryMemberRepository;
import Han_study._11_08__.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

}
