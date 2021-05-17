package com.grwts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grwts.vo.StudentVo;
@Repository
public interface StudentRepository extends JpaRepository<StudentVo, Integer> {

}
