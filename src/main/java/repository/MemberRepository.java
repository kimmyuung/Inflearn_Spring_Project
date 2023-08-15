package repository;

import domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByname(String name);
    // Optional => 객체를 반환하는데 1개만 반환
    List<Member> findAll();

    void clearstore();
}
