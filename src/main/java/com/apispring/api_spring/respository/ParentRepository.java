package com.apispring.api_spring.respository;

import com.apispring.api_spring.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ParentRepository  extends JpaRepository<Parent, String> {
    @Query("select p from Parent p where p.student.studentId = ?1")
    Parent findParentByChildId(String childId);

    @Query("select p from Parent p where p.parentId =?1")
    Optional<Parent> findById(String idParent);

    Parent findParentByAccount_Username(String userName);
}
