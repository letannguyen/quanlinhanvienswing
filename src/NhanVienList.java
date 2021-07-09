/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class NhanVienList {
    ArrayList<NhanVien> nvl = new ArrayList<NhanVien>();
    public void them(NhanVien nv){
        nvl.add(nv);
    }
}
