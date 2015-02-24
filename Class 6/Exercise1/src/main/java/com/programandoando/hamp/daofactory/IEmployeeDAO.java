

package com.programandoando.hamp.daofactory;


public interface IEmployeeDAO {
    public void add(Employee emp)throws Exception;

    public void update(Employee emp)throws Exception;

    public void delete(int id)throws Exception ;

    public Employee findById(int id) throws Exception;

    public Employee[] getAllEmployees()throws Exception ;

}
