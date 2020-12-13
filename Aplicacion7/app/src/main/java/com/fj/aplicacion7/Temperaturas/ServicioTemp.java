package com.fj.aplicacion7.Temperaturas;

import com.fj.aplicacion7.Municipio.ConsultaMunicipiero;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServicioTemp {
    @GET("localidad_{xerx}.xml")
    Call<Prediccion> pedirTiempo(@Path("xerx") String p);
}
