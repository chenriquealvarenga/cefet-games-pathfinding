/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding;
import com.badlogic.gdx.ai.pfa.Heuristic;
import com.badlogic.gdx.math.Vector2;
import java.lang.Math;
/**
 *
 * @author carlos
 */
public class Manhattan implements Heuristic<TileNode>{
    public Manhattan(){
    }
    
    private float manhattanDistance(Vector2 v1, Vector2 v2){
       double d = Math.abs(v1.x - v2.x) + Math.abs(v1.y - v2.y);
       return (float)d;
    }
    
    @Override
    public float estimate(TileNode n, TileNode n1) { 
        return manhattanDistance(n.getPosition(),n1.getPosition())/32;
    }
}
