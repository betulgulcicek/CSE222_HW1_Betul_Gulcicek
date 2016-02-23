/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bir;



/**
 *
 * @author GULCICEK
 */
public class CASApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //    public ICouseAutomationSystem m_ICouseAutomationSystem;
	//public CASUserInterface m_CASUserInterface;
        CASConsoleUI casui = new CASConsoleUI();
        casui.processCommands(); 
        
    }
    
    


    
}


