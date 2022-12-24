/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPolimorfisme;

/**
 *
 * @author muham
 */
public class Laki_Laki extends Manusia
{
    //constructor
    public Laki_Laki (double TB)
    {
        super(TB);
    }
    //Method HtBBI() merupakan method overriding dari superclass-nya
    @Override
    public double HtgBBI()
    {
        return (super.getTB()-100)*0.9;
    }
}
