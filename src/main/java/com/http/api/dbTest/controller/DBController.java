package com.http.api.dbTest.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @RequestMapping("/live")
    public String checkDBStatus (){
        try {
            LOGGER.info("Database Connection establish...");
            Connection connection = dataSource.getConnection();
            LOGGER.info("Database Connection established.");
            return "Well done";
        } catch (SQLException e) {
            LOGGER.debug("Database Connection issue...");
            return "Maintenance";
        }

    }
}
