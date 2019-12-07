/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;

/**
 * clase que almacena los jugadores de la partida actual
 * @author Kobem
 */
public class Players {
    
    /**
     * nombre
     */
    private String name;

    /**
     * obtiene el nombre del jugador
     * @return nombre
     */
    public String getName() {
        return name;
    }

    /**
     * asigna el nombre recibido
     * @param name nombre
     */
    public void setName(String name) {
        this.name = name;
    }
}
