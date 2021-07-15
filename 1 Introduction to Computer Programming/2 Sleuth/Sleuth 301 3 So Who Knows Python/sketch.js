/*
The case of the Python Syndicate
Stage 3


Officer: 5706702
CaseNum: 301-2-81348723-5706702

Right kid let’s work out which of our ‘friends’ is connected to the syndicate.

- An object for Bones karpinski has been declared and initialised
- Modify the x and y parameters of each image command using the x and y
properties from the Bones karpinski object so the images remain at their correct
positions on the board.
- To do this you will need to combine add and subtract operators with the
relevant property for each parameter



*/

var photoBoard;
var pawelKarpinskiImage;
var linaLovelaceImage;
var bonesKarpinskiImage;
var annaKarpinskiImage;
var cecilKarpinskiImage;
var robbieKrayImage;

var bonesKarpinskiObj;




function preload() {
	photoBoard = loadImage('photoBoard.png');
	pawelKarpinskiImage = loadImage("karpinskiBros2.png");
	linaLovelaceImage = loadImage("lina.png");
	bonesKarpinskiImage = loadImage("karpinskiDog.png");
	annaKarpinskiImage = loadImage("karpinskiWoman.png");
	cecilKarpinskiImage = loadImage("karpinskiBros1.png");
	robbieKrayImage = loadImage("krayBrothers2.png");

}

function setup() {
	createCanvas(photoBoard.width, photoBoard.height);
	bonesKarpinskiObj = {
		x: 701,
		y: 40,
		image: bonesKarpinskiImage
	};
}

function draw() {
	image(photoBoard, 0, 0);

	//And update these image commands with your x and y coordinates.
	image(bonesKarpinskiObj.image, bonesKarpinskiObj.x, bonesKarpinskiObj.y);

	image(pawelKarpinskiImage, bonesKarpinskiObj.x - 586, bonesKarpinskiObj.y);
	image(linaLovelaceImage, bonesKarpinskiObj.x - 293, bonesKarpinskiObj.y);
	image(annaKarpinskiImage, bonesKarpinskiObj.x - 586, bonesKarpinskiObj.y + 269);
	image(cecilKarpinskiImage, bonesKarpinskiObj.x - 293, bonesKarpinskiObj.y + 269);
	image(robbieKrayImage, bonesKarpinskiObj.x, bonesKarpinskiObj.y + 269);

}