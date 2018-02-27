/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fabio Kraemer
 */

@Entity
public class Kategorie implements Serializable{
    @Id
    private int slug = 0;
    private String name = "";
    
    @ManyToMany(mappedBy="kategorien")
    List<Anzeige> anzeigen = new ArrayList<>();
    
    @OneToMany
    List<Kategorie> kategorien = new ArrayList<>();
}
