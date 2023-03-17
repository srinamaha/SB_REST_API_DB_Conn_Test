package com.http.api.dbTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class DBController {

    @Autowired
    DataSource dataSource;

    @RequestMapping("/live")
    public String checkDBStatus (){
        try {
            Connection connection = dataSource.getConnection();
            return "Well done";
        } catch (SQLException e) {
            return "Maintenance";
        }

    }
}
