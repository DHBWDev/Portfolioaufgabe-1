/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Fabio Kraemer
 */
@Entity
public class Nachricht implements Serializable {
    @Id
    @GeneratedValue
    private long id = 0;
    
    private Benutzer vonBenutzer = new Benutzer();
    private Benutzer anBenutzer = new Benutzer();
    
    @Lob
    private String text = "";
    
    @ManyToOne
    Benutzer benutzer = null;
    
}
