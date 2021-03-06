package cinema.config;

import cinema.model.Role;
import cinema.model.RoleName;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setName(RoleName.USER);
        roleService.add(userRole);

        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("1234");
        user.setRoles(Set.of(userRole));
        userService.add(user);

        User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("12345");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);

        User doubleRole = new User();
        doubleRole.setEmail("doubleRole@gmail.com");
        doubleRole.setPassword("123456");
        doubleRole.setRoles(Set.of(userRole, adminRole));
        userService.add(doubleRole);
    }

}
