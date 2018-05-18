/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.Date;

/**
 *
 * @author Ethan
 */
public class Project {
    Project(){
        this.title = "";
        this.client = "";
        this.created = new Date();
    }
    
    Project(String title, String client){
        this.title = title;
        this.client = client;
        this.created = new Date();
    }
	
    protected String title;
    protected Date created;
    protected String client;
}
