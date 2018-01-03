/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author nathan
 */
public class Person {
    private String name;
    private Education degree;

    public Person(String name, Education degree) {
        this.name = name;
        this.degree = degree;
    }

    public Education getEducation() {
        return degree;
    }

    @Override
    public String toString() {
        return name +", " + degree;
    }
    
    
}