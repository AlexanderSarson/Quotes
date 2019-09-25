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
import java.util.Random;
import logic.Qoutes;

/**
 *
 * @author Alex
 */
public class QoutesMapper implements IQoutesMapper{

    @Override
    public List<String> getAllQoutes() {
        String sql = "SELECT * FROM qoutes";
        ResultSet rs = null;
        try{
            rs = DB.getConnection().prepareStatement(sql).executeQuery();
        } catch (SQLException e){
            e.printStackTrace();
        }
        List<String> qoutes = new ArrayList();
        try{
            while(rs.next()){
                String qoute = rs.getString("qoutes");
                qoutes.add(qoute);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return qoutes;
    }
    
    
    
    public static void main(String[] args) {
  
    }
    
}
