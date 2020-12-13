package com.fj.aplicacion7.Temperaturas;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(strict = false)
public class Dia {

    @Attribute(name = "fecha")
    private String fecha;
    @Element(name = "temperatura")
    private Temperatura temp;



    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Temperatura getTemp() {
        return temp;
    }

    public void setTemp(Temperatura temp) {
        this.temp = temp;
    }

}
