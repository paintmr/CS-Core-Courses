function setup() {
	//create your canvas here
	createCanvas(600, 600)
}

function draw() {
	//do your drawing here
	strokeWeight(5);
	triangle(50, 50, 500, 50, 50, 190)
	fill(55, 52, 66)
	triangle(100, 312, 411, 570, 12, 523)

	fill(29, 85, 98)
	ellipse(400, 360, 150, 200)

	stroke(255, 196, 143)
	line(121, 36, 499, 267)
	stroke(237, 75, 86)
	line(21, 536, 199, 267)


	fill(255, 230, 213)
	stroke(255, 230, 213)
	ellipse(200, 160, 250, 200)

	stroke(29, 85, 98)
	rect(123, 123, 123, 123)

	strokeWeight(30);
	stroke(237, 75, 86)
	point(509, 366)
	stroke(255, 196, 143)
	point(266, 266)

	stroke(0)
	noFill();
	ellipse(300, 300, 500, 500)


}