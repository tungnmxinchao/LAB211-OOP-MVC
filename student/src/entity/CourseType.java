/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TNO
 */
public enum CourseType {
    Java, Net, c, c2;

    @Override
    public String toString() {
        switch (this) {
            case Java:
                return "Java";
            case Net:
                return ".Net";
            case c:
                return "C";
            case c2:
                return "C++";
            default:
                throw new UnsupportedOperationException();
        }
    }

}
