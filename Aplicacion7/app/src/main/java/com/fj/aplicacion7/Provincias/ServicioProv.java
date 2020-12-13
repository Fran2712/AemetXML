package com.fj.aplicacion7.Provincias;

import com.fj.aplicacion7.Provincias.ConsultaProvinciero;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicioProv {

    @GET("ovcservweb/ovcswlocalizacionrc/ovccallejero.asmx/ConsultaProvincia")
    Call<ConsultaProvinciero> listProvincias();
}
