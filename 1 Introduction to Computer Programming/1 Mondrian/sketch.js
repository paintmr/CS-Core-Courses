function setup() {
	//create a large square canvas
	createCanvas(800, 800);
}

function draw() {

	//set the fill colour to red
	fill(255, 0, 0);

	//set a thick stroke weight for the black lines
	strokeWeight(12);

	//draw the red rectangle 
	rect(100, 50, 600, 600);

	fill(255, 255, 240);
	rect(100, 50, 150, 200);

	fill(255, 255, 240);
	rect(100, 262, 150, 200);

	fill(65, 105, 225);
	rect(100, 458, 150, 190);

	fill(255, 255, 240);
	rect(250, 458, 350, 190);

	fill(255, 255, 240);
	rect(600, 458, 100, 90);

	fill(255, 215, 0);
	rect(600, 560, 100, 88);

}