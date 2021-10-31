package practical_programs.p3_.currency;


public class currency extends convertor{
    String code;
    double value;
    
    public currency(String countrycode,double value){
        code = countrycode;
        this.value = value; 
    }

    @Override
    public double toDollar() {
        
        if(code=="i"){
            double dollar = this.value/73.68;
            return dollar;
        }else if(code =="e"){
            double dollar = this.value/0.85;
            return dollar;
        }else if(code =="y"){
            double dollar = this.value/109.38;
            return dollar;
        }
    
    return 0.0;
    
}
@Override
public double toInr() {
     
    if(code=="d"){
        double inr= this.value/0.014;
        return inr;
    }else if(code =="e"){
        double inr = this.value/0.012;
        return inr;
    }else if(code =="y"){
        double inr = this.value/1.48;
        return inr;
    }
return 0.0;
}
@Override
public double toYen() {
     
    if(code=="i"){
        double dollar = this.value/73.68;
        return dollar;
    }else if(code =="e"){
        double dollar = this.value/0.85;
        return dollar;
    }else if(code =="y"){
        double dollar = this.value/109.38;
        return dollar;
    }
return 0.0;
}
@Override
public double toEuro() {
     
    if(code=="i"){
        double dollar = this.value/73.68;
        return dollar;
    }else if(code =="e"){
        double dollar = this.value/0.85;
        return dollar;
    }else if(code =="y"){
        double dollar = this.value/109.38;
        return dollar;
    }
return 0.0;
}

}
        
        
    

    
    

