package model.dao;

import db.DB;
import model.dao.impl.DepartamentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(db.DB.getConnection());
    }

    public static DepartmentDao createDepartamentDao() {
        return new DepartamentDaoJDBC(DB.getConnection());
    }

}
