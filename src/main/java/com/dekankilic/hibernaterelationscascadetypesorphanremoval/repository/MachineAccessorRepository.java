package com.dekankilic.hibernaterelationscascadetypesorphanremoval.repository;

import com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance.discriminator.MachineAccessor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineAccessorRepository extends JpaRepository<MachineAccessor, Integer> {
}
