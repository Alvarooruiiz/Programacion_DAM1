package ejercicioexamenejercito_colecciones;

public class Jefe extends Personaje{
    
    private static int num=0;
    private int vExtra;
    public Jefe() {
        super("1" + num, 20);
        vExtra=Integer.parseInt(super.getCodigo())/2;
        num++;
    }

    @Override
    public String toString() {
        return "Jefe{" + "vExtra=" + vExtra + '}' + super.toString();
    }

    public int getvExtra() {
        return vExtra;
    }

    public void setvExtra(int vExtra) {
        this.vExtra = vExtra;
    }
    
}
