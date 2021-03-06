/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correios.alfha;

import java.util.HashMap;

/**
 *
 * @author Rodrigo
 */
public class Bairro {

    // ATRIBUTOS
    private String nomeBairro;
    private HashMap<String, Logradouro> logradouros;

    // CONSTRUTOR
    public Bairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
        this.logradouros = new HashMap<>();
    }

    // GETTER E SETTERS
    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public HashMap<String, Logradouro> getLogradouros() {
        return logradouros;
    }

    public void setLogradouros(HashMap<String, Logradouro> logradouros) {
        this.logradouros = logradouros;
    }

    @Override
    public String toString() {
        return this.nomeBairro;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeBairro == null) ? 0 : nomeBairro.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Bairro other = (Bairro) obj;
        if (nomeBairro == null) {
            if (other.nomeBairro != null) {
                return false;
            }
        } else if (!nomeBairro.equals(other.nomeBairro)) {
            return false;
        }
        return true;
    }

}
