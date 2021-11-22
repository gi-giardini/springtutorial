/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.rc.springtutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
*
* @author Prof. Dr. Frank J. Affonso
*/

@Entity
@Table(name = "PessoaFisica")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false, exclude = {"dataNascimento"})
@ToString(callSuper=true, includeFieldNames=true)
public class Fisica extends Pessoa {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "cpf", unique = true)
    private String cpf;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    
    public Fisica() {
    }
}