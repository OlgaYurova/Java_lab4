
package appexample;

import java.io.Serializable;

public class RecIntegral implements Serializable{
    
    private double upLim;
    private double downLim;
    private double step;
    private double result;
    
    public RecIntegral (double downLim, double upLim, double step){
        this.upLim = upLim;
        this.downLim = downLim;
        this.step = step;
    }
    
    public RecIntegral (double downLim, double upLim, double step, double result){
        this.upLim = upLim;
        this.downLim = downLim;
        this.step = step;
        this.result = result;
    }
    
    public double getUpLim(){
        return upLim;
    }
    
    public double getDownLim(){
        return downLim;
    }
    
    public double getStep(){
        return step;
    }
    
    public double getResult(){
        return result;
    }
    
    public void setUpLim(double upLim){
        this.upLim = upLim;
    }
    
    public void setDownLim(double downLim){
        this.downLim = downLim;
    }
    
    public void setStep(double step){
        this.step = step;
    }
    
    public void setResult(double result){
        this.result = result;
    }
    
}
