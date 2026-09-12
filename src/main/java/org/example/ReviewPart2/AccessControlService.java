package org.example.ReviewPart2;

import java.util.*;
import java.util.stream.Collectors;

public class AccessControlService {
    static void main() {
        Role role1 = new Role("Normal", Set.of(Permission.READ));
        Role role2 = new Role("Qualifiziert", Set.of(Permission.READ, Permission.WRITE));
        Role role3 = new Role("Admin", Set.of(Permission.READ, Permission.WRITE, Permission.DELETE, Permission.ADMIN));
        Role role4 = new Role("Boss", Set.of(Permission.READ, Permission.WRITE, Permission.DELETE, Permission.ADMIN));
        User2 user = new User2(UUID.randomUUID(), "Kwin");
        user.addRole(role1);
        User2 user2 = new User2(UUID.randomUUID(), "Lanchero");
        user2.addRole(role2);
        User2 user3 = new User2(UUID.randomUUID(), "Moderta");
        user3.addRole(role3);
        User2 user4 = new User2(UUID.randomUUID(), "Minchon");
        user4.addRole(role4);

    }

    enum Permission {READ, WRITE, DELETE, ADMIN}

    record Role(String name, Set<Permission> permissions) {
    }

    static class User2 {
        UUID Id;
        String name;
        Set<Role> role = new HashSet<>();

        public User2(UUID id, String name) {
            Id = id;
            this.name = name;
        }

        public UUID getId() {
            return Id;
        }

        public String getName() {
            return name;
        }

        public Set<Role> getRole() {
            return role;
        }

        public void setId(UUID id) {
            Id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void addRole(Role roleRole) {
            if (roleRole != null)
                role.add(roleRole);
            else {
                System.out.println("Null");
            }
        }

        @Override
        public String toString() {
            return "User2{" +
                    "Id=" + Id +
                    ", name='" + name + '\'' +
                    ", role=" + role +
                    '}';
        }
    }
}