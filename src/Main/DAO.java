/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public interface DAO {
    public void Insert(Sach s);
    public void Delete(int Vitri);
    public void Update(int Vitri, Sach s);
    public ArrayList<Sach> getlist();
}
