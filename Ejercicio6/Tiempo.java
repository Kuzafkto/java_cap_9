package Ejercicio6;

public class Tiempo {
    private int hours=0;
    private int minutes=0;
    private int seconds=0;

    public Tiempo(){
        this.hours=0;
        this.minutes=0;
        this.seconds=0;
    }
    public Tiempo(int h){
        this.hours=h;
        this.minutes=0;
        this.seconds=0;

    }
    public Tiempo(int h,int m){
        this.hours=h;
        this.minutes=m;
        while(this.minutes>=60){
            this.minutes-=60;
            this.hours++;
        }
        this.seconds=0;
        
    }
    public Tiempo(int h,int m,int s){
        this.hours=h;
        this.minutes=m;
        this.seconds=s;
        while(this.seconds>=60){
            this.seconds-=60;
            this.minutes++;
        }
        while(this.minutes>=60){
            this.minutes-=60;
            this.hours++;
        }
    }
    @Override
    public String toString(){
        return this.hours+"h "+this.minutes+"m "+this.seconds+"s.";
    }

    public int getHour(){
        return this.hours;
    }
    public int getMinute(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }

    public void suma(int h,int m,int s){
        this.seconds+=s;
        while(this.seconds>=60){
            this.seconds-=60;
            this.minutes++;
        }
        this.minutes+=m;
        while(this.minutes>=60){
            this.minutes-=60;
            this.hours++;
        }
        this.hours+=h;
    }
    public void suma(int m,int s){
        this.seconds+=s;
        while(this.seconds>=60){
            this.seconds-=60;
            this.minutes++;
        }
        this.minutes+=m;
        while(this.minutes>=60){
            this.minutes-=60;
            this.hours++;
        }
    }
    public void suma(int s){
        this.seconds+=s;
        while(this.seconds>=60){
            this.seconds-=60;
            this.minutes++;
        }
        while(this.minutes>=60){
            this.minutes-=60;
            this.hours++;
        }
    }

    public void resta(int h, int m,int s){
        while(s>=60){
            s-=60;
            m++;
        }
        while(m>=60){
            m-=60;
            h++;
        }
        if(this.hours-h<0){
            this.hours=0;
        }else{
            this.hours-=h;
        }
        if(this.minutes-m<0){
            if(this.hours>0){
                this.hours--;
                this.minutes=(60-(m-this.minutes));
            }else{
                this.minutes=0;
            }
        }else{
            this.minutes-=m;
        }
        if(this.seconds-s<0){
            if(this.minutes>0){
                this.minutes--;
                this.seconds=(60-(s-this.seconds));
            }else{
                this.seconds=0;
            }
        }else{
            this.seconds-=s;
        }
    }

    public void resta(int m, int s){
        while(s>=60){
            s-=60;
            m++;
        }
        while(m>=60){
            m-=60;
            if(this.hours>0){
                this.hours--;
            }else{
                this.minutes=0;
                break;
            }
            
        }
        if(this.minutes-m<0){
            if(this.hours>0){
                this.hours--;
                this.minutes=(60-(m-this.minutes));
            }else{
                this.minutes=0;
            }
        }else{
            this.minutes-=m;
        }
        if(this.seconds-s<0){
            if(this.minutes>0){
                this.minutes--;
                this.seconds=(60-(s-this.seconds));
            }else{
                this.seconds=0;
            }
        }else{
            this.seconds-=s;
        }
    }

    /*EDICION DEL PROFESOR CON ENUNCIADO DIFERENTE */
}
