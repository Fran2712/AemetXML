package com.fj.aplicacion7;

import com.fj.aplicacion7.Municipio.Municipio;
import com.fj.aplicacion7.Temperaturas.Prediccion;

import java.util.List;

public class PintarHTML {

    public static String getTabla(Prediccion prp){

        String tabla = "<!DOCTYPE html><html><head><meta charset='utf-8'></head><body><table border='1px'>";

        for (int i = 0; i <  prp.getDia().size(); i++) {
            tabla += "<tr>";

            if (i == 0) {
                tabla += "<td>Fecha</td>";
            } else {
                tabla += "<td>" + prp.getDia().get(i).getFecha() + "</td>";
            }

            if (i == 0) {
                tabla += "<td>Municipio</td>";
            } else {
                tabla += "<td>" + prp.getNombre()+ "</td>";
            }

            if (i == 0) {
                tabla += "<td>Provincia</td>";
            } else {
                 tabla += "<td>" + prp.getNombreProv() +
                 "</td>";
            }
            if (i == 0) {
                tabla += "<td>Minima</td>";
            } else {
                tabla += "<td>" + prp.getDia().get(i).getTemp().getTampMin() +
                        "</td>";
            }
            if (i == 0) {
                tabla += "<td>Máxima</td>";
            } else {
                tabla += "<td>" + prp.getDia().get(i).getTemp().getTampMin() +
                        "</td>";
            }

            tabla += "<tr>";
        }
        tabla += "</table></body></html>\n";

        return tabla;

    }
}

