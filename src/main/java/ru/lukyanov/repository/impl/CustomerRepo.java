package ru.lukyanov.repository.impl;

import lombok.SneakyThrows;
import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.lukyanov.entity.Customer;
import ru.lukyanov.repository.DbConnection;
import ru.lukyanov.repository.Repo;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@Repository
public class CustomerRepo implements Repo<Customer> {


    public static final String UPDATE = """
            UPDATE customer.customer
            SET login=?, password=?
            WHERE id=?
            """;

    private final DbConnection dbConnection;

    public CustomerRepo(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    @SneakyThrows
    public Customer getById(Long id) {
        return null;


    }

    @Override
    public void update(Customer entity) {

    }

}