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
public class QLSach implements DAO{
    ArrayList<Sach> List_Sach;
    public QLSach() {
        List_Sach = new ArrayList<>();
    }

    
    @Override
    public void Insert(Sach s) {
        List_Sach.add(s);
    }

    @Override
    public void Delete(int Vitri) {
      List_Sach.remove(Vitri);
    }

    @Override
    public void Update(int Vitri, Sach s) {
        List_Sach.set(Vitri, s);
    }

    @Override
    public ArrayList<Sach> getlist() {
        return this.List_Sach;
    }
    
}
