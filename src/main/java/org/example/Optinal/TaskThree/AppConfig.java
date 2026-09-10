package org.example.Optinal.TaskThree;

import com.sun.source.tree.OpensTree;

import java.util.Optional;

public class AppConfig {
    String dbUrl;

    public AppConfig(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getRequiredDbUrl(AppConfig config) {
        return Optional.ofNullable(config).map(AppConfig::getDbUrl).orElseThrow(() -> new IllegalStateException("Database URL is not configured"));
    }
}
