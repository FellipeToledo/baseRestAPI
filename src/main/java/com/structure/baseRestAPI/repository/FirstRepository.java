package com.structure.baseRestAPI.repository;

import com.structure.baseRestAPI.entities.First;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface FirstRepository extends JpaRepository<First, Id> {

}
