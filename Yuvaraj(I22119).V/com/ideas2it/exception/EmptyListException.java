package com.ideas2it.exception;

/**            
 * <p>
 * EmptyListException is a class extends Exception which is used to throw a message whenever empty list is called 
 * </p>
 *
 * @author Yuvaraj
 *
 * @version 1
 *
 * @since 2022-08-29
 */
public class EmptyListException extends Exception {
    public EmptyListException(String message) {
        super(message);
    }
}