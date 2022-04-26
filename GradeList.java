/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adham
 */
import java.util.ArrayList;
public class GradeList {
    private ArrayList<Garde> grades;
    
    public GradeList(){
        grades = new ArrayList<>();
    }
    
    public void add(double point){
        if(point>=0&&point<=100){
            grades.add(new Garde(point));
        }
    }

    public double average(){
        double sum= 0 ;
        double total = grades.size();
        for(Garde grade : grades){
            sum =sum + grade.getPoint();
        }
        double avg = 1.0*sum/total;
        return avg;
    }

    public double averagePassed(){
        double sum = 0;
        double total = 0;
        for(Garde grade : grades){
            if(grade.isPassed()==true){
                total++;
                sum = sum + grade.getPoint();
            }
        }
        double avg = 1.0*sum/total;
        return avg;
    }

    public double passPercentage(){
        int total = grades.size();
        int totalPassed = 0;
        
        for(Garde grade : grades){
            if(grade.isPassed()==true){
                totalPassed++;
            }
        }

        double perc = 100.0*totalPassed/total;
        return perc;
    }

    public String toString(){
        int five = 0 , four = 0 , three = 0 , two = 0 , one = 0 , zero = 0; 
        for(Garde grade : grades){
            if(grade.getPoint()>=90){
                five++;
            }
            else if(grade.getPoint()>=80){
                four++;
            }
            else if(grade.getPoint()>=70){
                three++;
            }
            else if(grade.getPoint()>=60){
                two++;
            }
            else if(grade.getPoint()>=50){
                one++;
            }else{
                zero++;
            }
        }
    
        return "5: "+numToStar(five)+"\n" +
        "4: "+numToStar(four)+"\n" +
        "3: "+numToStar(three)+"\n" +
        "2: "+numToStar(two)+"\n" +
        "1: "+numToStar(one)+"\n" +
        "0: "+numToStar(zero)+"\n";
    }

    public String numToStar(int num){
        String star = " ";
        
        for(int i=0; i<num; i++){
            star = star + "*";
        }
        return star;
    }
}
