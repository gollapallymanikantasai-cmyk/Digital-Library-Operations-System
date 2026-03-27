package com.vcube.bookmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.bookmanagement.entity.Modal;

public interface Repository extends JpaRepository<Modal, Integer> {

}
