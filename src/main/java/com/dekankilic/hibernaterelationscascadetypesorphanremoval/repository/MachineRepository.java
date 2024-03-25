package com.dekankilic.hibernaterelationscascadetypesorphanremoval.repository;

import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.singletable.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<Machine, Integer> {
}
