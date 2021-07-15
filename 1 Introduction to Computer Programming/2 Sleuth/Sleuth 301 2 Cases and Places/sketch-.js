/*
The case of the Python Syndicate
Stage 2


Officer: 5706702
CaseNum: 301-1-57445140-5706702

- Word on the street is that there is a new gang in town - The Python Syndicate.
It seems my bones were correct on this one. I need you to organise the gang
around the suspected leader Bones karpinski

- The variables for Bones karpinski have been declared and
initialised.
- Modify the x and y parameters of each image command using these two variables
so the images maintain their correct positions their correct positions on the board.
- To do this you will need to combine add and subtract operators with variables
Bones karpinski for for each parameter.
- Do not create any new variables
- Do not add any additional commands


*/

var photoBoard;
var rocky_kray_img;
var robbie_kray_img;
var pawel_karpinski_img;
var bones_karpinski_img;
var countess_hamilton_img;
var cecil_karpinski_img;


var bones_karpinski_coord_x = 115;
var bones_karpinski_coord_y = 309;

// var rocky_kray_coord_x = 115;
// var rocky_kray_coord_y = 40;

// var robbie_kray_coord_x = 408;
// var robbie_kray_coord_y = 40;

// var pawel_karpinski_coord_x = 701;
// var pawel_karpinski_coord_y = 40;

// var countess_hamilton_coord_x = 408;
// var countess_hamilton_coord_y = 309;

// var cecil_karpinski_coord_x = 701;
// var cecil_karpinski_coord_y = 309;

function preload() {
	photoBoard = loadImage('photoBoard.png');
	rocky_kray_img = loadImage("krayBrothers1.png");
	robbie_kray_img = loadImage("krayBrothers2.png");
	pawel_karpinski_img = loadImage("karpinskiBros2.png");
	bones_karpinski_img = loadImage("karpinskiDog.png");
	countess_hamilton_img = loadImage("countessHamilton.png");
	cecil_karpinski_img = loadImage("karpinskiBros1.png");

}

function setup() {
	createCanvas(photoBoard.width, photoBoard.height);
}

function draw() {
	image(photoBoard, 0, 0);

	//And update these image commands with your x and y coordinates.
	image(bones_karpinski_img, bones_karpinski_coord_x, bones_karpinski_coord_y);

	// image(rocky_kray_img, rocky_kray_coord_x, rocky_kray_coord_y);
	// image(robbie_kray_img, robbie_kray_coord_x, robbie_kray_coord_y);
	// image(pawel_karpinski_img, pawel_karpinski_coord_x, pawel_karpinski_coord_y);
	// image(countess_hamilton_img, countess_hamilton_coord_x, countess_hamilton_coord_y);
	// image(cecil_karpinski_img, cecil_karpinski_coord_x, cecil_karpinski_coord_y);

	image(rocky_kray_img, 115, 40);


}