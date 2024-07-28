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
        try (Connection conn = DriverManager.getConnection(url)) {
            assertNotNull(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

