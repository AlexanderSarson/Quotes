/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import Persistence.IQoutesMapper;
import Persistence.QoutesMapper;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Alex
 */
public class Qoutes {
    
    private List<String> qoutes;
    
    public Qoutes(){
        IQoutesMapper qoutes = new QoutesMapper();
        this.qoutes = qoutes.getAllQoutes();
    }

    public void AddQuotes(String quotes) {
        this.qoutes.add(quotes);
    }
    
    public String getRandomQoute(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(qoutes.size());
        if(randomNumber == qoutes.size()){
            randomNumber--;
        }
        return qoutes.get(randomNumber);
    }
    
}
