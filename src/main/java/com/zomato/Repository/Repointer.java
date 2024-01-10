package com.zomato.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zomato.Entity.Entityclass;

public interface Repointer extends JpaRepository<Entityclass,Long> {

}
