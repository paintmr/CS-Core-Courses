/*

Officer: 5706702
CaseNum: 101-3-12723940-5706702

Case 101 - The Case of Lina Lovelace
Stage 4 - The Plaza Hotel

Okay this place is more Lina’s style. Now’s our chance to find out the root of all
of this. Lets see who is Lina meeting.

Identify Lina by drawing a cyan filled rectangle with a blue outline.
She’s the woman in the red dress of course.

Identify the man with the monocle smoking the cigar cyan filled
rectangle with a blue outline around him.

Identify the man reading the newspaper by drawing a green filled rectangle
with a magenta outline around him.

Identify the woman with the dog by drawing a yellow filled rectangle with a
green outline around her. Make sure you include the dog too.

The rectangles should cover the targets as accurately as possible without
including anything else.

There are many possible ways of investigating this case, but you
should use ONLY the following commands:

	rect()
	fill() Use only 255 or 0 for r,g,b values. Set alpha to 100 for some opacity.
	stroke() Use only 255 or 0 for r,g,b values.

*/

var img;

function preload() {
	img = loadImage('img.jpg');
}

function setup() {
	createCanvas(img.width, img.height);
	strokeWeight(2);
	// noFill();//辅助

}

function draw() {
	image(img, 0, 0);

	//Write your code below here ...
	stroke(0, 0, 255)
	fill(0, 255, 255)
	rect(830, 340, 200, 410)

	rect(30, 550, 210, 290)

	stroke(255, 0, 255)
	fill(0, 255, 0)
	rect(1070, 420, 200, 400)

	// a yellow filled rectangle with a
	// green outline
	stroke(0, 255, 0)
	fill(255, 255, 0)
	rect(1510, 330, 195, 415)
}
