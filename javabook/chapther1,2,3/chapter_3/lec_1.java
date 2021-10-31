

public class lec_1 {
    public static void main(String[] args) {
        Light dis= new Light();
        dis.days = 1000;
        long dis_light = dis.distance_light(dis.days);
        System.out.println( dis_light+"distance travalled in"+dis.days);
    
    }
    }




class Light {
    
    int lightspeed = 18600;

    long days;
    long distance;

    //define the method that returns the distance of light

    long distance_light(long days){

        long second = days*60*60*24;
        return lightspeed*second;

    }



}

