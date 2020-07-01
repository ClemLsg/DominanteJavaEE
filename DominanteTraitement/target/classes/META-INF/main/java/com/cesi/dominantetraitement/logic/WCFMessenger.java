/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.dominantetraitement.logic;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelibrary.MSG;
import org.datacontract.schemas._2004._07.wcfservicelibrary.ObjectFactory;
import org.tempuri.IService1;
import org.tempuri.Service1;

/**
 *
 * @author Seagel
 */
@Stateless
@LocalBean
public class WCFMessenger {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void sendMessage(String[] data){
        Service1 srv = new Service1();
        IService1 isrv;
        
        isrv = srv.getBasicHttpBindingIService1();
        
        MSG msg = new MSG();
        
        ObjectFactory objectFactory = new ObjectFactory();
        com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory arrayFactory = new com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory();
        
        JAXBElement<String> tokenApp = objectFactory.createMSGTokenApp("testToken");
        JAXBElement<String> operationName = objectFactory.createMSGOperationName("javaReturn");
        JAXBElement<String> operationVersion = objectFactory.createMSGOperationVersion("v1.0");
        JAXBElement<String> appVersion = objectFactory.createMSGAppVersion("v1.0");
        ArrayOfanyType array = new ArrayOfanyType();
        array.getAnyType().add(data[0]);
        array.getAnyType().add(data[1]);
        array.getAnyType().add(data[2]);
        array.getAnyType().add(data[3]);
        array.getAnyType().add(data[4]);
        JAXBElement<ArrayOfanyType> dataToSend = objectFactory.createMSGData(array);
        
        msg.setTokenApp(tokenApp);
        msg.setOperationName(operationName);
        msg.setOperationVersion(operationVersion);
        msg.setAppVersion(appVersion);
        msg.setData(dataToSend);
        
        isrv.msg(msg);
    }
}
