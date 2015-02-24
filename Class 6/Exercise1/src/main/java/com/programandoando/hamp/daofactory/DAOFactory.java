package com.programandoando.hamp.daofactory;

/*HAMP*/
public class DAOFactory {
    

    public IEmployeeDAO createEmployeeDAO() throws ClassNotFoundException {
        return new EmployeeDAOImpl();
    }

}
