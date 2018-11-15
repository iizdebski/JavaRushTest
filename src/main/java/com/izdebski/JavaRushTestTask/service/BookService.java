package com.izdebski.JavaRushTestTask.service;

import com.izdebski.JavaRushTestTask.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void delete(Book book);
    Page<Book> findAllByPage(Pageable pageable);

    Book update(Book book, Long id);

    Page<Book> search(String term, int printYear, Pageable pageable);
    Page<Book> search(String term, int printYear, boolean readAlReady, Pageable pageable);

    Book uploadFileData(Book book, MultipartFile file) throws IOException;
}