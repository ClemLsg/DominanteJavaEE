/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.dominantereception.facade;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author Seagel
 */
@WebService(name = "DominanteEndpoint")
public interface DominanteServiceEndpointInterface {
    
    @WebMethod(operationName = "sendMessageToJMS")
    @WebResult(name = "sentMessage")
    void SendMessageToJMS(@WebParam(name="decryptFile") String decryptFile,@WebParam(name="originalFile") String originalFile, @WebParam(name="filename") String filename);
}
