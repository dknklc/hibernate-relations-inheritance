package com.dekankilic.hibernaterelationscascadetypesorphanremoval.repository;

import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.singletable.PrivateMachine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivateMachineRepository extends JpaRepository<PrivateMachine, Integer> {
}
