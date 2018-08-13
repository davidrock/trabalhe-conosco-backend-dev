package com.davidrock.picpay.picpay.repository;

import com.davidrock.picpay.picpay.models.Users;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface IUserRep extends MongoRepository<Users, String> {

    @Override
    <S extends Users> List<S> saveAll(Iterable<S> iterable);

    @Override
    List<Users> findAll();

    @Override
    List<Users> findAll(Sort sort);

    @Override
    <S extends Users> S insert(S s);

    @Override
    <S extends Users> List<S> insert(Iterable<S> iterable);

    @Override
    <S extends Users> List<S> findAll(Example<S> example);

    @Override
    <S extends Users> List<S> findAll(Example<S> example, Sort sort);

    @Override
    Page<Users> findAll(Pageable pageable);

    @Override
    <S extends Users> S save(S s);

    @Override
    Optional<Users> findById(String s);

    @Override
    boolean existsById(String s);

    @Override
    Iterable<Users> findAllById(Iterable<String> iterable);

    @Override
    long count();

    @Override
    void deleteById(String s);

    @Override
    void delete(Users user);

    @Override
    void deleteAll(Iterable<? extends Users> iterable);

    @Override
    void deleteAll();

    @Override
    <S extends Users> Optional<S> findOne(Example<S> example);

    @Override
    <S extends Users> Page<S> findAll(Example<S> example, Pageable pageable);

    @Override
    <S extends Users> long count(Example<S> example);

    @Override
    <S extends Users> boolean exists(Example<S> example);
}


