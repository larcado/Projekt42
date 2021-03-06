/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt42;

/**
 *
 * @author namibj
 */
public enum GegenstandsKombination {
    bla(false, Gegenstand.SCHLUESSEL_1, Gegenstand.LEICHE_1);
    Gegenstand source, target;
    final boolean TargetIsInventory;

    /**
     *
     * @param TargetIsInventory Ob diese Kombination gilt, wenn man den 
     * @param source Der Gegenstand, der bewegt wird.
     * @param target Der Gegenstand, auf den der andere draufbewegt wird.
     */
    GegenstandsKombination(boolean TargetIsInventory, Gegenstand source, Gegenstand target) {
        this.TargetIsInventory = TargetIsInventory;
        this.source = source;
        this.target = target;
    }
    
}
