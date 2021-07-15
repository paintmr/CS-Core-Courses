/*
The case of the Python Syndicate
Stage 4

Officer: 5706702
CaseNum: 301-3-32192097-5706702

To really crack the Python Syndicate we need to go in deep. I want to understand
all the connections. I have the data but it’s a mess and I need you to sort it out.

Organise each syndicate member into an object. I’ve done one for you as an example.
Be sure to replicate the naming conventions for your own objects.
Use image command together with the objects you created to organise the mugshots.

- Once you have done this you can comment out or delete the old variables.

*/

var photoBoard;
var bones_karpinski_img;
var countess_hamilton_img;
var pawel_karpinski_img;
var robbie_kray_img;
var lina_lovelace_img;
var cecil_karpinski_img;

var countess_hamilton_object;


//declare your new objects below


// var bones_karpinski_coordinate_x = 115;
// var bones_karpinski_coordinate_y = 40;
// var pawel_karpinski_coordinate_x = 701;
// var pawel_karpinski_coordinate_y = 40;
// var robbie_kray_coordinate_x = 115;
// var robbie_kray_coordinate_y = 309;
// var lina_lovelace_coordinate_x = 408;
// var lina_lovelace_coordinate_y = 309;
// var cecil_karpinski_coordinate_x = 701;
// var cecil_karpinski_coordinate_y = 309;


function preload() {
	photoBoard = loadImage('photoBoard.png');
	bones_karpinski_img = loadImage("karpinskiDog.png");
	countess_hamilton_img = loadImage("countessHamilton.png");
	pawel_karpinski_img = loadImage("karpinskiBros2.png");
	robbie_kray_img = loadImage("krayBrothers2.png");
	lina_lovelace_img = loadImage("lina.png");
	cecil_karpinski_img = loadImage("karpinskiBros1.png");

}

function setup() {
	createCanvas(photoBoard.width, photoBoard.height);
	bones_karpinski_object = {
		x: 115,
		y: 40,
		image: bones_karpinski_img
	}
	countess_hamilton_object = {
		x: 408,
		y: 40,
		image: countess_hamilton_img
	};
	pawel_karpinski_object = {
		x: 701,
		y: 40,
		image: pawel_karpinski_img
	};
	robbie_kray_object = {
		x: 115,
		y: 309,
		image: robbie_kray_img
	};
	lina_lovelace_object = {
		x: 408,
		y: 309,
		image: lina_lovelace_img
	};
	cecil_karpinski_object = {
		x: 701,
		y: 309,
		image: cecil_karpinski_img
	}



	//define your new objects below
}

function draw() {
	image(photoBoard, 0, 0);

	//And update these image commands with your x and y coordinates.
	image(bones_karpinski_object.image, bones_karpinski_object.x, bones_karpinski_object.y);
	image(countess_hamilton_object.image, countess_hamilton_object.x, countess_hamilton_object.y);
	image(pawel_karpinski_object.image, pawel_karpinski_object.x, pawel_karpinski_object.y);
	image(robbie_kray_object.image, robbie_kray_object.x, robbie_kray_object.y);
	image(lina_lovelace_object.image, lina_lovelace_object.x, lina_lovelace_object.y);
	image(cecil_karpinski_object.image, cecil_karpinski_object.x, cecil_karpinski_object.y);


}