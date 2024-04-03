//package ActRefArray_Ej5_Gestimal;
//
//public class Gestimal {
//
//    String codigo;
//    String descripcion;
//    int precioComp;
//    int precioVent;
//    int stock;
//
//    public Gestimal(String codigo, String descripcion, int precioComp, int precioVent, int stock) {
//        this.codigo = codigo;
//        this.descripcion = descripcion;
//        this.precioComp = precioComp;
//        this.precioVent = precioVent;
//        this.stock = stock;
//    }
//
//    public void listado() {
//
//    }
//
//    public String getCodigo() {
//        return codigo;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public int getPrecioComp() {
//        return precioComp;
//    }
//
//    public int getPrecioVent() {
//        return precioVent;
//    }
//
//    public int getStock() {
//        return stock;
//    }
//
//    public void entradaDeMercancia(String codigo,Gestimal g, int cantidad) {
//        g.stock += cantidad;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }
//
//    public void salidaDeMercancia(String codigo, Gestimal g[], int cantidad) {
//        for (int i = 0; i < g.length; i++) {
//            if (g[i].getCodigo().equals(codigo)) {
//                if (cantidad > g[i].stock) {
//                    g[i].stock -= cantidad;
//                } else {
//                    System.out.println("La cantidad introducida es superior al stock existente");
//                }
//            }
//
//        }
//
//    }
//
//    @Override
//    public String toString() {
//        return "Codigo: " + this.getCodigo() + "\nDescripción: " + this.descripcion + "\nPrecio de compra: " + this.getPrecioComp() + "\nStock: " + this.getStock();
//    }
//
//}
