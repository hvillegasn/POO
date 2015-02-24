package com.programandoando.hamp.daofactory;


import com.programandoando.hamp.singleton.Conexion;
import java.sql.*;
import java.util.ArrayList;


public class EmployeeDAOImpl implements IEmployeeDAO{
    

    
    private Connection con = null;

    
    EmployeeDAOImpl() throws ClassNotFoundException {
        con=Conexion.getInstance();
    }

    
    @Override
    public void add(Employee emp) throws Exception  {
        try (Statement stmt = con.createStatement()) {
            String query = "INSERT INTO EMPLOYEE VALUES (" + emp.getId() + ","
                    + "'" + emp.getFirstName() + "'," + "'" + emp.getLastName() + "',"
                    + "'" + emp.getBirthDate() + "'," + emp.getSalary() + ")";
            if (stmt.executeUpdate(query) != 1) {
                throw new Exception("Error adding employee");
            }
        } catch (SQLException se) {    
            throw new Exception("Error adding employee in DAO", se);
        }
    }

    
    @Override
    public void update(Employee emp) throws Exception{
        try (Statement stmt = con.createStatement()) {
            String query = "UPDATE EMPLOYEE "
                    + "SET FIRSTNAME='" + emp.getFirstName() + "',"
                    + "LASTNAME='" + emp.getLastName() + "',"
                    + "BIRTHDATE='" + emp.getBirthDate() + "',"
                    + "SALARY=" + emp.getSalary()
                    + "WHERE ID=" + emp.getId();
            if (stmt.executeUpdate(query) != 1) {
                throw new Exception("Error updating employee");
            }
        } catch (SQLException se) {
            throw new Exception("Error updating employee in DAO", se);
        }
    }

    
    @Override
    public void delete(int id) throws Exception {
        Employee emp = findById(id);
        if (emp == null) {
            throw new Exception("Employee id: " + id + " does not exist to delete.");
        }
        try (Statement stmt = con.createStatement()) {
            String query = "DELETE FROM EMPLOYEE WHERE ID=" + id;
            if (stmt.executeUpdate(query) != 1) {
                throw new Exception("Error deleting employee");
            }
        } catch (SQLException se) {
    
            throw new Exception("Error deleting employee in DAO", se);
        }
    }

    
    @Override
    public Employee findById(int id) throws Exception {
        try (Statement stmt = con.createStatement()) {
            String query = "SELECT * FROM EMPLOYEE WHERE ID=" + id;
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                return null;
            }
            return (new Employee(rs.getInt("ID"), rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"), rs.getString("BIRTHDATE"),
                    rs.getDouble("SALARY")));
        } catch (SQLException se) {
    
            throw new Exception("Error finding employee in DAO", se);
        }
    }

    
    @Override
    public Employee[] getAllEmployees() throws Exception {
        try (Statement stmt = con.createStatement()) {
            String query = "SELECT * FROM EMPLOYEE";
            ResultSet rs = stmt.executeQuery(query);    
            ArrayList<Employee> emps = new ArrayList<>();            
            while (rs.next()) {
                emps.add(new Employee(rs.getInt("ID"), rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME"), rs.getString("BIRTHDATE"),
                        rs.getDouble("SALARY")));
            }
            return emps.toArray(new Employee[0]);
        } catch (SQLException se) {
            throw new Exception("Error getting all employees in DAO: " + se.getMessage(), se);
        }
    }

    public void close() {
        try {
            con.close();
        } catch (SQLException se) {
            System.out.println ("Exception closing Connection: " + se);
        }
    }

}
