package org.example.Inner.task1;

public class DatabaseConfig {
    private final String dbUrl;
    private final String password;
    private final String username;

    DatabaseConfig(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.dbUrl = builder.dbUrl;
    }

    static class Builder {

        private String dbUrl;
        private String password;
        private String username;

        public Builder withUrl(String dbUrl) {
            this.dbUrl = dbUrl;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public DatabaseConfig build() {
            return new DatabaseConfig(this);
        }

        @Override
        public String toString() {
            return STR."Builder{dbUrl='\{dbUrl}', password='\{password}', username='\{username}'}";
        }
    }

    @Override
    public String toString() {
        return STR."DatabaseConfig{dbUrl='\{dbUrl}', password='\{password}', username='\{username}'}";
    }
}

class Main {
    static void main() {
        DatabaseConfig dbC = new DatabaseConfig.Builder()
                .withPassword("333")
                .withUrl("/222")
                .withUsername("222")
                .build();


        DatabaseConfig.Builder dbConfigBuilder = new DatabaseConfig.Builder()
                .withUrl("/222")
                .withPassword("333")
                .withUsername("222");

        System.out.println(dbConfigBuilder);
    }
}

