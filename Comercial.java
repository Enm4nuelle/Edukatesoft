<<<<<<< HEAD:src/com/edukate/Comercial.java
package com.edukate;
<<<<<<< HEAD

public class Comercial extends Empleado {
    public Comercial(){}
    public Comercial(String nombre, String apellidos, String dni, int edad, String telefono, String direccion, String correo,
                     char estadoCivil, float sueldo){
    }
    @Override
    public float calcularSueldo(){}
    public void definirMeta(Vendedor vend){}
    public void definirComision(Vendedor vend){}
    public void definirBono(Vendedor vend){}
}
=======
import java.util.ArrayList;

public class Comercial extends Worker{
    private MetaMensual metaMensual;
    private ArrayList<Vendedor> vendedores;

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public MetaMensual getMetaMensual() {
        return metaMensual;
    }

    public void setMetaMensual(MetaMensual metaMensual) {
        this.metaMensual = metaMensual;
    }

    public void modificarObjetoVendedor(Vendedor vendedor){}
    public Vendedor obtenerMejorVendedor(){}
    public Vendedor obtenerPeorVendedor(){}
    public void mostrarVendedoresOrdPorVentas(){}
    public void administrarMetaMensual(){}
}
>>>>>>> 483c11c059b7b403564c5b61914671f38fddcc6c
=======
package com.edukate;
<<<<<<< HEAD

public class Comercial extends Empleado {
    public Comercial(){}
    public Comercial(String nombre, String apellidos, String dni, int edad, String telefono, String direccion, String correo,
                     char estadoCivil, float sueldo){
    }
    @Override
    public float calcularSueldo(){}
    public void definirMeta(Vendedor vend){}
    public void definirComision(Vendedor vend){}
    public void definirBono(Vendedor vend){}
}
=======
import java.util.ArrayList;

public class Comercial extends Worker{
    private MetaMensual metaMensual;
    private ArrayList<Vendedor> vendedores;

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public MetaMensual getMetaMensual() {
        return metaMensual;
    }

    public void setMetaMensual(MetaMensual metaMensual) {
        this.metaMensual = metaMensual;
    }

    public void modificarObjetoVendedor(Vendedor vendedor){}
    public Vendedor obtenerMejorVendedor(){}
    public Vendedor obtenerPeorVendedor(){}
    public void mostrarVendedoresOrdPorVentas(){}
    public void administrarMetaMensual(){}
}
>>>>>>> 483c11c059b7b403564c5b61914671f38fddcc6c
>>>>>>> 3193eedf3e04c96739197140d53f883ff6af3030:Comercial.java
