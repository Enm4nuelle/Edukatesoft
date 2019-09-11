package com.edukate;

public class DatosGenerales{
    public float IGV;
    public float sueldoMinimo;

    public void SetIGV(float IGV) {
        this.IGV = IGV;
    }
    public void SetSueldoMinimo(float sueldoMinimo){
        this.sueldoMinimo = sueldoMinimo;
    }

    public float GetIGV(){
        return IGV;
    }

    public float GetSueldoMinimo(){
        return sueldoMinimo;
    }
}
