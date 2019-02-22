package com.lancelot.spring.boot.springboot3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lancelot.spring.boot.springboot3.entity.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
