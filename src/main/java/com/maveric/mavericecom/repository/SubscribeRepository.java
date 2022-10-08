package com.maveric.mavericecom.repository;

import com.maveric.mavericecom.entity.Subscibe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscribeRepository extends JpaRepository<Subscibe, Long> {

}
