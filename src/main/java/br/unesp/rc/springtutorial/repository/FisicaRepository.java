/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.springtutorial.repository;

import br.unesp.rc.springtutorial.entity.Fisica;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author giova
 */
public interface FisicaRepository extends JpaRepository<Fisica, Long>{
    Fisica findByCpf(String cpf);
}
