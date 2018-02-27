/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabio Kraemer
 */

@Entity
public class Anzeige implements Serializable {
    @Id
    @GeneratedValue
    private long id = 0;
    
    private String art = "";
    private String titel = "";
    
    @Lob
    private String beschreibung = "";
    
    private Date erstellungsDatum = null;
    private Date onlineBis = null;
    
    private double preisVorstellung = 0;
    private String artDesPreises = "";
    
    private int plz = 0;
    private String ort = "";
    
    @ManyToOne
    Benutzer releasedBenutzer = null;
    
    @ManyToMany
    List<Benutzer> noticedBenutzer = new ArrayList<>();
    
    @OneToMany(mappedBy="anzeige")
    List<Foto> fotos = new ArrayList<>();
    
    @ManyToMany
    List<Kategorie> kategorien = new ArrayList<>();
}
