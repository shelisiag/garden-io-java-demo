package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppIntegrationTest {

    @Test
    public void testDatabaseConnection() {
        String url = System.getenv("DATABASE_URL");
        System.out.println("DATABASE_URL: " + url);
        assertNotNull(url, "DATABASE_URL environment variable is not set");

        try (Connection conn = DriverManager.getConnection(url)) {
            assertNotNull(conn, "Connection should not be null");
            System.out.println("Connection established successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
