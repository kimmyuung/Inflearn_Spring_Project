package InFlearn_Spring_Project.repository;



import InFlearn_Spring_Project.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    //find에서 null을 반환한 경우에 대한 처리
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
