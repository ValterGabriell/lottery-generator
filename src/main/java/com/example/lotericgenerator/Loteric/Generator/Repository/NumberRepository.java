package com.example.lotericgenerator.Loteric.Generator.Repository;

import com.example.lotericgenerator.Loteric.Generator.Model.RandomNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<RandomNumber, Integer> {
}
