/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.rc.springtutorial.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
*
* @author Prof. Dr. Frank J. Affonso
*/

@Entity(name = "Contato")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Contato implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idContato;
    
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;
    
    public Contato() {
    }
}
