package com.exercise.userprofile.repository;

import com.exercise.userprofile.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Get the user information by userId
     * @param userId
     * @return
     */
    User findByUserId(Long userId);
}
