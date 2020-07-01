/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.dominantetraitement.logic;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Seagel
 */
@Entity
@Table(name = "DICTIONNARY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dictionnary.findAll", query = "SELECT d FROM Dictionnary d"),
    @NamedQuery(name = "Dictionnary.findByWord", query = "SELECT d FROM Dictionnary d WHERE d.word = :word"),
    @NamedQuery(name = "Dictionnary.findById", query = "SELECT d FROM Dictionnary d WHERE d.id = :id")})
public class Dictionnary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "WORD")
    private String word;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;

    public Dictionnary() {
    }

    public Dictionnary(BigDecimal id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dictionnary)) {
            return false;
        }
        Dictionnary other = (Dictionnary) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cesi.dominantetraitement.logic.Dictionnary[ id=" + id + " ]";
    }
    
}
