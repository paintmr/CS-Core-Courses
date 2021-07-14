/*
The case of the Python Syndicate
Stage 1

Officer: 5706702
CaseNum: 301-0-39703327-5706702

I gotta give it to you kid, you’ve made an excellent start, but now it’s time
to take things up a level. For some time I’ve suspected that there’s something
big going down in Console City.

These cases that we’ve been working are all connected somehow. I need to use
that considerable brain of yours to work it all out. Let’s start by laying out
who we know.

Place each mugshot in its designated position by doing the following:

- Create a new variable for the X and Y coordinates of each mugshot.
		- One has already been done for you.
		- Make sure you use the same style and format for the variable name.
- Find coordinates for the mugshot and initialise your variable with these
values.
- Replace the hard-coded constants in the corresponding image command so that
the mugshot appears in its designated position.

*/

var photoBoard;
var robbieKrayImage;
var pawelKarpinskiImage;
var annaKarpinskiImage;
var bonesKarpinskiImage;
var countessHamiltonImage;
var rockyKrayImage;



//declare your new variables below
var annaKarpinskiCoordinateX = 701;
var annaKarpinskiCoordinateY = 40;

var robbieKrayCoordinateX = 115;
var robbieKrayCoordinateY = 40;

var pawelKarpinskiCoordinateX = 408;
var pawelKarpinskiCoordinateY = 40;

var bonesKarpinskiCoordinateX = 115;
var bonesKarpinskiCoordinateY = 309;

var countessHamiltonCoordinateX = 408;
var countessHamiltonCoordinateY = 309;

var rockyKrayCoordinateX = 701;
var rockyKrayCoordinateY = 309;

function preload() {
	photoBoard = loadImage('photoBoard.png');
	robbieKrayImage = loadImage("krayBrothers2.png");
	pawelKarpinskiImage = loadImage("karpinskiBros2.png");
	annaKarpinskiImage = loadImage("karpinskiWoman.png");
	bonesKarpinskiImage = loadImage("karpinskiDog.png");
	countessHamiltonImage = loadImage("countessHamilton.png");
	rockyKrayImage = loadImage("krayBrothers1.png");

}

function setup() {
	createCanvas(photoBoard.width, photoBoard.height);
}

function draw() {
	image(photoBoard, 0, 0);



	//And update these image commands with your x and y coordinates.
	image(annaKarpinskiImage, annaKarpinskiCoordinateX, annaKarpinskiCoordinateY);

	image(robbieKrayImage, robbieKrayCoordinateX, robbieKrayCoordinateY);
	image(pawelKarpinskiImage, pawelKarpinskiCoordinateX, pawelKarpinskiCoordinateY);
	image(bonesKarpinskiImage, bonesKarpinskiCoordinateX, bonesKarpinskiCoordinateY);
	image(countessHamiltonImage, countessHamiltonCoordinateX, countessHamiltonCoordinateY);
	image(rockyKrayImage, rockyKrayCoordinateX, rockyKrayCoordinateY);

}