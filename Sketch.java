import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(194, 236, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	  stroke(89, 207, 106);
    fill(89, 207, 106);
    float grassX1 = 0;
    float grassY1 = (float) (height / 1.5);
    float grassX2 = width / 1;
    float grassY2 = height / 1;

    rect(grassX1, grassY1,
        grassX2, grassY2);

        
    stroke(252, 239, 119);
    fill(252, 239, 119);
    float sunX = random(0, width);
    background(194, 236, 255);
    float sunY = random(0, height);
    float sunSize = (float) (width / 3.6);
    float sunDistance = (float) (height / 3.3);

    ellipse(sunX, sunY,
          sunSize, sunDistance);

    
    stroke(173, 112, 66);
    fill(173, 112, 66);
    float houseX1 = (float) (width / 3.3);
    float houseY1 = height / 2;
    float houseX2 = (float) (width / 3.6);
    float houseY2 = (float) (height / 3.6);

    rect(houseX1, houseY1,
        houseX2, houseY2);

    
    stroke(61, 27, 3);
    fill(61, 27, 3);
    float roofX1 = (float) (width / 3.6);
    float roofY1 = (float) (height/1.9);
    float roofX2 = (float) (width / 2.3);
    float roofY2 = (float) (height / 2.8);
    float roofX3 = (float) (width / 1.7);
    float roofY3 = (float) (height / 1.9);

    triangle(roofX1, roofY1,
            roofX2, roofY2,
            roofX3, roofY3);


  }
  
  // define other methods down here.
}
