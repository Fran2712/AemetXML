package com.fj.aplicacion7.Municipio;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServicioMuni {
    @GET("ConsultaMunicipio")
    Call<ConsultaMunicipiero> pedirMunicipio(@Query(value="Provincia") String p, @Query(value="Municipio") String o );
}

