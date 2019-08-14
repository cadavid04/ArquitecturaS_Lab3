/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.service;

import com.udea.dao.ClimaDAO;
import com.udea.persistencia.Clima;
import java.sql.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ITManager
 */
@WebService(serviceName = "ClimaWS")
public class ClimaWS {

    /**
     * This is a sample web service operation
     */

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresarClima")
    public String ingresarClima(@WebParam(name = "dia") Date dia, @WebParam(name = "temperatura") int temperatura, @WebParam(name = "humedad") int humedad, @WebParam(name = "nubosidad") String nubosidad, @WebParam(name = "precipitacion") double precipitacion) {
        //TODO write your implementation code here:
       Clima p = new Clima(dia, temperatura, humedad, nubosidad, precipitacion);
       ClimaDAO productoDAO = new ClimaDAO();
       productoDAO.ingresarClima(p);
       return "Producto ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarClima")
    public String buscarClima(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
      ClimaDAO climaDAO = new ClimaDAO();
        return climaDAO.consultarClima(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarClimas")
    public List<Clima>  consultarClimas() {
        //TODO write your implementation code here:
        ClimaDAO climaDAO = new ClimaDAO();
        List<Clima> listaClima = climaDAO.verClimas();
        return listaClima;
    }
}
