package model;

import Db.Identifiable;

public class Employee extends User implements Identifiable {
    public Role role;
    public int supervisorId;

    public Employee(String name, String email) {
        super(name, email);
    }


    @Override
    public int getId() {
        return userId;
    }

    @Override
    public void setId(int id) {
       userId = id;
    }
}
