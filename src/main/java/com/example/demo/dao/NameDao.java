package com.example.demo.dao;

import com.example.demo.pojo.Name;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @version 1.0
 * @description:
 * @author: bing
 * @date: 2020/3/21 18:25
 */
public interface  NameDao extends JpaRepository<Name, Integer> {
}
