/*

Officer: 5706702
CaseNum: 303-2-82794210-5706702

Case 303 - The Case of the Crooked Attorney
Stage 3 - The Gates Bank

I’ve made an appointment for you at the Gates Bank to retrieve your safe deposit box from the vault.
Actually you will break into Torvalds’ one.

Crack the safe by doing the following:

	When the mouse button is pressed:
	- Make Cryptic_Locker_Comb_a equal to the value of mouseX
	- Use the 'constrain' function to prevent Cryptic_Locker_Comb_a from falling below 4 and going above 18

	When any key is pressed:
	- Decrement Cryptic_Locker_Comb_b by 3
	- Use the 'min' function to prevent Cryptic_Locker_Comb_b from going above 21

	Whilst the mouse is moving:
	- Make Cryptic_Locker_Comb_c equal to the value of mouseY
	- Use the 'constrain' function to prevent Cryptic_Locker_Comb_c from falling below 1 and going above 12

	When the mouse button is released:
	- Increment Cryptic_Locker_Comb_d by 1
	- Use the 'constrain' function to prevent Cryptic_Locker_Comb_d from falling below 5 and going above 19

	When the mouse button is pressed:
	- Make Cryptic_Locker_Comb_e equal to the value of mouseX
	- Use the 'min' function to prevent Cryptic_Locker_Comb_e from going above 78



This time you'll need to create the relevant event handlers yourself.

There are many possible ways of investigating this case, but you
should use ONLY the following commands:

	- The assignment operator aka. the equals sign !
	- mouseX, mouseY
	- Incrementing +=
	- Decrementing -=
	- min, max
	- constrain

*/

//declare the variables

var Cryptic_Locker_Comb_a;
var Cryptic_Locker_Comb_b;
var Cryptic_Locker_Comb_c;
var Cryptic_Locker_Comb_d;
var Cryptic_Locker_Comb_e;


function preload() {
	//IMAGES WILL BE LOADED HERE

}

function setup() {
	createCanvas(512, 512);

	//initialise the variables
	Cryptic_Locker_Comb_a = 0;
	Cryptic_Locker_Comb_b = 0;
	Cryptic_Locker_Comb_c = 0;
	Cryptic_Locker_Comb_d = 0;
	Cryptic_Locker_Comb_e = 0;

}

///////////////////EVENT HANDLERS///////////////////

//Create event handlers here to open the safe ...
function mousePressed() {
	Cryptic_Locker_Comb_a = mouseX;
	Cryptic_Locker_Comb_a = constrain(Cryptic_Locker_Comb_a, 4, 18);
	// console.log(Cryptic_Locker_Comb_a);

	Cryptic_Locker_Comb_e = mouseX;
	Cryptic_Locker_Comb_e = min(Cryptic_Locker_Comb_e, 78);
}

function keyPressed() {
	Cryptic_Locker_Comb_b -= 3
	Cryptic_Locker_Comb_b = min(Cryptic_Locker_Comb_b, 21)
}

function mouseMoved() {
	Cryptic_Locker_Comb_c = mouseY
	Cryptic_Locker_Comb_c = constrain(Cryptic_Locker_Comb_c, 1, 12)
}

function mouseReleased() {
	Cryptic_Locker_Comb_d += 1
	Cryptic_Locker_Comb_d = constrain(Cryptic_Locker_Comb_d, 5, 19)
}


///////////////DO NOT CHANGE CODE BELOW THIS POINT///////////////////

function draw() {

	//Draw the safe door
	background(70);
	noStroke();
	fill(29, 110, 6);
	rect(26, 26, width - 52, width - 52);

	//Draw the combination dials
	push();
	translate(120, 170);
	drawDial(140, Cryptic_Locker_Comb_a, 24);
	pop();

	push();
	translate(120, 380);
	drawDial(140, Cryptic_Locker_Comb_b, 26);
	pop();

	push();
	translate(280, 170);
	drawDial(140, Cryptic_Locker_Comb_c, 15);
	pop();

	push();
	translate(280, 380);
	drawDial(140, Cryptic_Locker_Comb_d, 25);
	pop();

	//Draw the lever
	push();
	translate(width - 125, 256);
	drawLever(Cryptic_Locker_Comb_e);
	pop();


}

function drawDial(diameter, num, maxNum) {
	//the combination lock

	var r = diameter * 0.5;
	var p = r * 0.6;

	stroke(0);
	fill(255, 255, 200);
	ellipse(0, 0, diameter, diameter);
	fill(100);
	noStroke();
	ellipse(0, 0, diameter * 0.66, diameter * 0.66);
	fill(150, 0, 0);
	triangle(
		-p * 0.4, -r - p,
		p * 0.4, -r - p,
		0, -r - p / 5
	);

	noStroke();

	push();
	var inc = 360 / maxNum;

	rotate(radians(-num * inc));
	for (var i = 0; i < maxNum; i++) {
		push();
		rotate(radians(i * inc));
		stroke(0);
		line(0, -r * 0.66, 0, -(r - 10));
		noStroke();
		fill(0);
		text(i, 0, -(r - 10));
		pop();
	}

	pop();
}

function drawLever(rot) {
	push();
	rotate(radians(-rot))
	stroke(0);
	fill(100);
	rect(-10, 0, 20, 100);
	ellipse(0, 0, 50, 50);
	ellipse(0, 100, 35, 35);
	pop();
}
