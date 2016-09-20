/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 *
 * @author Daniel
 */
public class HeuristicaManhattan implements Heuristic<TileNode>{

    @Override
    public float estimate(TileNode n, TileNode n1) {
         float dx = Math.abs(n1.getPosition().x - n1.getPosition().x);
         float dy = Math.abs(n1.getPosition().y - n1.getPosition().y);

        return  (dx + dy);
    }
    
}
