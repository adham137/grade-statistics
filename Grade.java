/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adham
 */
public class Grade {
    private double point;
    private boolean passed;
    
    public Grade (double point){
        this.point = point;
        if(point>=50){
            passed = true;
        }else{
            passed = false;
        }
    }

    public double getPoint(){
        return point;
    }

    public boolean isPassed(){
        return passed;
    }
}
