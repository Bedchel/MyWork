package org.example.ReviewPart2;

import java.util.*;
import java.util.stream.Collectors;

public class AccessControlService {
    static Map<UUID, User2> userMap = new HashMap<>();

    static void main() {
        AccessControlService accessControlService = new AccessControlService();
        Role role1 = new Role("Normal", Set.of(Permission.READ));
        Role role2 = new Role("Qualifiziert", Set.of(Permission.READ, Permission.WRITE, Permission.DELETE));
        Role role3 = new Role("Admin", Set.of(Permission.READ, Permission.WRITE, Permission.DELETE, Permission.ADMIN));
        Role role4 = new Role("Boss", Set.of(Permission.READ, Permission.WRITE, Permission.DELETE, Permission.ADMIN));
        User2 user = new User2(UUID.randomUUID(), "Kwin");
        user.addRole(role1);
        userMap.put(user.getId(), user);
        User2 user2 = new User2(UUID.randomUUID(), "Lanchero");
        user2.addRole(role2);
        userMap.put(user2.getId(), user2);
        User2 user3 = new User2(UUID.randomUUID(), "Moderta");
        user3.addRole(role3);
        userMap.put(user3.getId(), user3);
        User2 user4 = new User2(UUID.randomUUID(), "Minchon");
        user4.addRole(role4);
        user4.addRole(role3);
        userMap.put(user4.getId(), user4);

        accessControlService.assignRole(user.getId(), role2);
        System.out.println(userMap);
        accessControlService.deleteRole(user.getId(), role2);
        System.out.println(userMap);
        System.out.println(accessControlService.hasPermission(user.getId(), Permission.DELETE));

        accessControlService.checkPermission(user.getId(), Permission.READ);
        accessControlService.getUniquePermission(user4.getId());
    }

    public void assignRole(UUID userId, Role role) {
        userMap.get(userId).addRole(role);
    }

    public void deleteRole(UUID userId, Role role) {
        userMap.get(userId).removeRole(role);
    }

    public boolean hasPermission(UUID userID, Permission permission) {
        Set<Role> roleSet = userMap.get(userID).getRole();
        for (Role r : roleSet) {
            if (r.permissions().contains(permission)) {
                return true;
            }

        }
        // variant 1.1
        //return userMap.get(userID).getRole().stream().anyMatch(role -> role.permissions().contains(permission));
        return false;
    }

    public void checkPermission(UUID id, Permission permission) {
        if (!hasPermission(id, permission)) {
            throw new NoPermission("No Permission");
        }
    }

    public void getUniquePermission(UUID id) {
        System.out.println(userMap.get(id).getRole().stream().flatMap(r -> r.permissions().stream()).collect(Collectors.toSet()));
    }
}

enum Permission {READ, WRITE, DELETE, ADMIN}

record Role(String name, Set<Permission> permissions) {
}

class User2 {
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

    public void removeRole(Role roleRole) {
        if (roleRole != null)
            role.remove(roleRole);
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