package dao;

import entity.Emp;

public interface EmpDao {

    //add
    public void insert(Emp emp);

    //delete
    public void delete(Emp emp);

    //update
    public void update(Emp emp);

    //cha xun
    public Emp getEmpByEmpno(Integer empno);

    public Emp getEmpByEname(String ename);
}
