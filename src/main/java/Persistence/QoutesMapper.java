/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logic.Qoutes;

/**
 *
 * @author Alex
 */
public class QoutesMapper implements IQoutesMapper{

    @Override
    public List<Qoutes> getAllQoutes() {
        List<Qoutes> qoutes = new ArrayList();
        String sql = "SELECT * FROM qoutes";
        ResultSet rs = null;
        try{
            rs = DB.getConnection().prepareStatement(sql).executeQuery();
        } catch (SQLException e){
            e.printStackTrace();
        }
        Qoutes qoute = null;
        try{
            while(rs.next()){
                String qou = rs.getString("qoutes");
                qoute = new Qoutes(qou);
                qoutes.add(qoute);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return qoutes;
    }
    
    public static void main(String[] args) {
        IQoutesMapper test = new QoutesMapper();
        List<Qoutes> qoutes = test.getAllQoutes();
        for (Qoutes qoute : qoutes) {
            System.out.println(qoute.getQuotes());
        }
    }
    
}
