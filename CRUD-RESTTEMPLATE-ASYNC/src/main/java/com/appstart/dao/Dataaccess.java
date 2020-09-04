package com.appstart.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.appstart.entity.products;

@Repository
public interface Dataaccess extends CrudRepository<products,Integer>{
@Async
CompletableFuture<products>findById(int id);
}
