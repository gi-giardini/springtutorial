/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unesp.rc.springtutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
*
* @author Prof. Dr. Frank J. Affonso
*/

@Entity
@Table(name = "PessoaJuridica")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper=true, includeFieldNames=true)
public class Juridica extends Pessoa {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "cnpj", unique = true)
    private String cnpj;
    
    public Juridica() {
    }
}