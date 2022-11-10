/**
 *
 * @author kharileigh
 */

package com.kharileigh.componentproducer;


public class Dancer implements Performer {
    
    private String style;

    public void setStyle(String style) {
            this.style = style;
    }
    
    @Override
	public void perform() {
		System.out.println("Dancer is dancinf in " + style + " Style");

	}
    
}
