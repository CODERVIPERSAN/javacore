package practical_programs.p3_.dist_convertor;

public class Unit extends convertor {
    String unit;
    double value;
    public Unit(String unit,double value){
        this.unit = unit;
        this.value= value;

    }
    @Override
    double toKm() {

         
        if(unit=="m"){
            double dollar = this.value/73.68;
            return dollar;
        }else if(unit =="miles"){
            double dollar = this.value/109.38;
            return dollar;
        }
    
    return 0.0;
    
    }
    @Override
    double toM() {
         
        if(unit=="miles"){
            double dollar = this.value/73.68;
            return dollar;
        }else if(unit =="km"){
            double dollar = this.value/0.85;
            return dollar;
        
        }
    
    return 0.0;
    
    }
    @Override
    double toMiles() {
         
        if(unit=="km"){
            double dollar = this.value/73.68;
            return dollar;
        }else if(unit =="miles"){
            double dollar = this.value/0.85;
            return dollar;
        }
    
    return 0.0;
    
    }

    
}
