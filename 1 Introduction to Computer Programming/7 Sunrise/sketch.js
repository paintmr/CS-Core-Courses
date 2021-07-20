var groundHeight;
var mountain1;
var mountain2;

var tree;

var moon;
var sun;
var darkness;

var cloud1
var cloud2

function setup() {
	createCanvas(800, 600);
	//set the groundHeight proportional to the canvas size
	groundHeight = (height / 3) * 2;

	//initalise the mountain objects with properties to help draw them to the canvas
	mountain1 = {
		x: 400,
		y: groundHeight,
		height: 320,
		width: 230
	};
	mountain2 = {
		x: 550,
		y: groundHeight,
		height: 200,
		width: 130
	};

	//initalise the tree object
	tree = {
		x: 150,
		y: groundHeight - 120,
		trunkWidth: 40,
		trunkHeight: 150,
		canopyWidth: 120,
		canopyHeight: 100
	};

	//my task 1 initalise the tree2 object 
	tree2 = {
		x: 200,
		y: groundHeight - 60,
		trunkWidth: 30,
		trunkHeight: 100,
		canopyWidth: 100,
		canopyHeight: 80
	};

	//initalise the sun 
	sun = {
		x: 150,
		y: 70,
		diameter: 80,
	};

	//TASK: intialise a moon object with an extra property for brightness 【√】
	moon = {
		x: 650,
		y: 70,
		diameter: 80,
		brightness: 0,
	};

	//set the initial darkness
	darkness = 0;

	// my task2 include a bird picture and stars
	birdImg = loadImage('/bird.png');
	starImg = loadImage('/star.png');

	// my task3 initialise clouds
	cloud1 = {
		x: 300,
		y: 100,
		width: 80,
		height: 60,
		brightness: 255
	}
	cloud2 = {
		x: 360,
		y: 100,
		width: 60,
		height: 50,
	}

}



function draw() {
	//TASK: update the values for the moon's brightness, the sun's position and the darkness.
	//You can either map this to the mouse's location (i.e. the futher left the mouse is the more daylight) or you can just change the values gradually over time.
	//鼠标在画布左边：天亮；鼠标在画布右边：天黑
	mouseX = mouseX >= width ? width : mouseX;
	moon.brightness = map(mouseX, 0, width, 0, 255)
	sun.y = map(mouseX, 0, width, moon.y, 440)
	darkness = map(mouseX, 0, width, 0, 200)
	cloud1.brightness = map(mouseX, 0, width, 255, 0)

	//draw the sky
	background(150, 200, 255);
	noStroke();

	//draw the sun
	fill(255, 255, 0);
	ellipse(sun.x, sun.y, sun.diameter);

	//draw the ground and make it green
	fill(70, 200, 0);
	rect(0, groundHeight, width, height - groundHeight);

	//draw the mountains
	fill(120);
	triangle(mountain1.x, mountain1.y,
		mountain1.x + mountain1.width, mountain1.y,
		mountain1.x + (mountain1.width / 2), mountain1.y - mountain1.height);

	triangle(mountain2.x, mountain2.y,
		mountain2.x + mountain2.width, mountain2.y,
		mountain2.x + (mountain2.width / 2), mountain2.y - mountain2.height);

	//TASK: You can draw the tree yourself 【√】
	fill(120)
	rect(tree.x, tree.y, tree.trunkWidth, tree.trunkHeight)
	fill(70, 200, 0);
	ellipse(tree.x + 20, tree.y, tree.canopyWidth, tree.canopyHeight)

	//my task 1 draw tree2
	fill(120)
	rect(tree2.x, tree2.y, tree2.trunkWidth, tree2.trunkHeight)
	fill(70, 200, 0);
	ellipse(tree2.x + 20, tree2.y, tree2.canopyWidth, tree2.canopyHeight)

	// my task2 include a bird picture
	if (darkness < 130) {
		image(birdImg, 100, tree.y, birdImg.width / 2, birdImg.height / 2)
	}

	// my task3 draw clouds
	fill(255, cloud1.brightness)
	ellipse(cloud1.x, cloud1.y, cloud1.width, cloud1.height)
	ellipse(cloud2.x, cloud2.y, cloud2.width, cloud2.height)

	//TASK: make the scene dark by drawing a rectangle that covers the whole canvas.【√】
	//Use the alpha value of fill to determine how dark to make it
	fill(120, darkness)
	rect(0, 0, width, height)

	//TASK: you'll need to draw the moon too. Make sure you use brightness to adjust the colour 【√】
	fill(255, 255, 255, moon.brightness);
	ellipse(moon.x, moon.y, moon.diameter);

	// my task2 include a star picture
	if (darkness >= 130) {
		image(starImg, mountain2.x, moon.y, starImg.width / 2, starImg.height / 2)
	}
}