/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;
/**
 *
 * @author Fabio Kraemer
 */

@Entity
public class Benutzer implements Serializable {
    @Id
    private String benutzername = "";
    private String passwort = "";
    
    private String vorname = "";
    private String nachname = "";
    
    private String strasse = "";
    private int hausnummer = 0;
    private int plz = 0;
    private String ort = "";
    private String land = "";
    
    private String email = "";
    private String telefonnummer = "";
    
    @OneToMany(mappedBy="benutzer")
    List<Nachricht> nachrichten = new ArrayList<>();
    
    @OneToMany(mappedBy="releasedBenutzer")
    List<Anzeige> releasedAnzeigen = new ArrayList<>();
    
    @ManyToMany(mappedBy="noticedBenutzer")
    List<Anzeige> noticedAnzeigen = new ArrayList<>();
    
}