package HoraMinSeg_7_6;


public class Hora {
    private int hora;
    private int min;
    private int seg;
    
    public void setHora(int hora){
        if(hora>=0 && hora<=24){
            this.hora=hora;
        }else{
            this.hora=0;
        }
    }
    public int getHora(){
        return hora;
    }
    public void setMin(int min){
        if(min>=0 && min<60){
            this.min=min;
        }else{
            this.min=0;
        }
    }
    public int getMin(){
        return min;
    }
    public void setSeg(int seg){
        if(seg>=0 && seg<60){
            this.seg=seg;
        }else{
            this.seg=0;
        }
    }
    public int getSeg(){
        return seg;
    }
    
    public void nSegundos(){
        seg++;
        if(min==60){
            hora++;
            min=0;
        } else if(seg==60){
            min++;
            seg=0;
        }
    }
}
