[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=6581702&assignment_repo_type=AssignmentRepo)
# Processing Task 3 - Creating variables

## Learning Objectives
In this task, you will learn to:
* utilize your own variables to create a more dynamic drawing
* draw objects in random locations



## Step 1 - Lesson
Acquire the learning objectives by reviewing [Processing Creating Variables](https://happycoding.io/tutorials/processing/creating-variables)

## Step 2 - Task
Demonstrate your learning objectives by:
* draw an object from a previous task, this time drawing the object in random locations using your own variables
* make the program the current time. Hint: [check the reference](https://processing.org/reference/) for useful functions! 


## Submission
1. Commit and push your code to this repository
2. Take a screenshot of your work and upload it to the Google Classroom assignment post
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
    float grassY1 = height / 1.5;
    float grassX2 = width / 1;
    float grassY2 = height / 1;

    rect(grassX1, grassY1,
        grassX2, grassY2);

        

    stroke(252, 239, 119);
    fill(252, 239, 119);
    float sunX = random(0, width);
    float sunY = random(0, height);
    float sunSize = width / 3.6;
    float sunDistance = height / 3.3;

    ellipse(sunX, sunY,
          sunSize, sunDistance);

    
    stroke(173, 112, 66);
    fill(173, 112, 66);
    float houseX1 = width / 3.3;
    float houseY1 = height / 2;
    float houseX2 = width / 3.6;
    float houseY2 = height / 3.6;

    rect(houseX1, houseY1,
        houseX2, houseY2);

    
    stroke(61, 27, 3);
    fill(61, 27, 3);
    float roofX1 = width / 3.6;
    float roofY1 = height/1.9;
    float roofX2 = width / 2.3;
    float roofY2 = height / 2.8;
    float roofX3 = width / 1.7;
    float roofY3 = height / 1.9;

    triangle(roofX1, roofY1,
            roofX2, roofY2,
            roofX3, roofY3);


  }
  
  // define other methods down here.
}
