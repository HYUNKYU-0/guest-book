package com.kppd.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kppd.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer>{

}
