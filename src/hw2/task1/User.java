package hw2.task1;

import hw2.task1.Address;
import hw2.task1.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;

    private String phone;
    private String website;
    private Company company;
}

