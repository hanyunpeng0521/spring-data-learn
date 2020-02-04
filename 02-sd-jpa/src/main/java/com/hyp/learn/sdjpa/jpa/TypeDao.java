package com.hyp.learn.sdjpa.jpa;

import com.hyp.learn.sdjpa.domain.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author hyp
 * Project name is spring-data-learn
 * Include in com.hyp.learn.sdjpa.jpa
 * hyp create at 20-2-4
 **/
public interface TypeDao extends JpaRepository<Type, Integer>, JpaSpecificationExecutor<Type> {

}