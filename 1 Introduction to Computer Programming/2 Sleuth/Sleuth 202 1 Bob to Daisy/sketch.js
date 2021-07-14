/*

Officer: 5706702
CaseNum: 202-0-65479078-5706702

Case 202 - The case of Bob and Daisy - stage 1

That pair of notorious criminals Woz and Jobs are up to no good again.
I’ve intercepted letters sent between them. It seems that they are
communicating through an ingenious code in which they masquerade as
besotted lovers, Daisy and Bob. I need you crack their code and determine
the details of their next heist so that we can catch them in the act.

Discover the hidden code by commenting out all text commands except
those which produce green text. Only comment out text commands.
Leave fill commands uncommented.

There are many possible ways of investigating this case, but you
should use ONLY the following commands:

	// comments are all that are needed for this case.
	Do NOT add any new lines of code.

*/

var letterFont;

function preload() {
	letterFont = loadFont('Ballpointprint.ttf');
}

function setup() {
	createCanvas(547, 602);
	textFont(letterFont);
	textSize(30);
}

function draw() {
	background(255);

	fill(255, 0, 0);
	// text("last", 474, 212);
	fill(0, 0, 255);
	// text("my", 293, 386);
	// text("my", 282, 286);
	// text("that", 117, 386);
	// text("person", 377, 181);
	// text("that", 328, 120);
	fill(0, 0, 0);
	// text("that", 363, 318);
	// text("luckiest", 285, 181);
	// text("in", 168, 120);
	fill(255, 0, 255);
	// text("were", 222, 386);
	// text("It", 349, 90);
	fill(0, 0, 255);
	// text("am", 111, 212);
	fill(0, 0, 0);
	// text("I", 91, 249);
	fill(255, 0, 0);
	// text("your", 23, 151);
	// text("be", 184, 181);
	// text("thi", 229, 249);
	// text("in", 451, 286);
	// text("moment", 273, 318);
	// text("saw", 457, 318);
	fill(255, 0, 255);
	// text("lovely", 75, 350);
	fill(0, 0, 0);
	// text("I", 89, 181);
	fill(255, 0, 255);
	// text("eyes.", 102, 286);
	// text("the", 202, 120);
	// text("darling,", 393, 249);
	fill(255, 0, 0);
	// text("lo", 448, 386);
	// 【】
	fill(0, 255, 0);
	text("April", 26, 318);
	text("first", 209, 318);
	text("chosen", 210, 212);
	// 【】
	fill(255, 0, 0);
	// text("can", 128, 249);
	// text("hose", 401, 350);
	// text("since", 363, 212);
	fill(255, 0, 255);
	// text("of", 296, 249);
	// text("the", 205, 151);
	fill(255, 0, 0);
	// text("ve.", 462, 386);
	// text("Oh", 17, 30);
	// text("y,", 189, 30);
	// text("I", 76, 90);
	// text("are", 230, 286);
	// text("alone", 100, 120);
	// text("ive", 472, 181);
	// text("seconds", 23, 386);
	// 【】
	fill(0, 255, 0);
	text("date", 24, 249);
	text("a", 167, 90);
	// 【】

	fill(0, 0, 255);
	// text("must", 126, 181);
	// text("few", 465, 350);
	fill(0, 0, 0);
	// text("is", 394, 90);
	// text("green", 21, 286);
	// text("kisses,", 137, 446);
	fill(255, 0, 255);
	// text("oice", 90, 151);
	// text("al", 456, 181);
	// text("From", 90, 318);
	// text("I", 20, 120);
	fill(0, 0, 255);
	// text("ovely", 69, 30);
	fill(255, 0, 0);
	// text("?", 315, 90);
	// text("confession", 195, 90);
	fill(0, 0, 0);
	// text("am", 57, 120);
	fill(255, 0, 0);
	// text("nk", 257, 249);
	fill(0, 0, 0);
	// text("m", 360, 151);
	// text("our", 431, 212);
	fill(255, 0, 255);
	// text("from", 329, 350);
	// text("of", 426, 151);
	fill(0, 0, 0);
	// text("face,", 151, 350);
	// text("like", 148, 151);
	// text("the", 231, 181);
	fill(255, 0, 255);
	// text("and", 84, 446);
	// text("Ever", 293, 212);
	fill(0, 0, 255);
	// text("v", 79, 151);
	// text("your", 337, 249);
	// text("Bob", 17, 506);
	fill(0, 0, 0);
	// text("your", 154, 212);
	// text("I", 74, 212);
	// text("You", 178, 286);
	// text("I", 223, 350);
	// text("one", 338, 386);
	// text("l", 64, 30);
	fill(0, 0, 255);
	// text("Dais", 140, 30);
	fill(0, 0, 0);
	// text("only", 175, 249);
	// text("you", 174, 386);
	fill(0, 0, 255);
	// text("Love", 17, 446);
	// text("I", 420, 318);
	// text("the", 467, 151);
	// text("May", 17, 90);
	// text("when", 427, 90);
	fill(255, 0, 255);
	// text("knew", 260, 350);
	// text("make", 113, 90);
	// text("t", 393, 350);
	// text("that", 17, 212);
	// text("x", 75, 506);
	fill(0, 0, 255);
	// text("sunny", 327, 286);
	// text("day", 395, 286);
	fill(0, 0, 0);
	// text("the", 155, 318);
	// text("quiet", 256, 120);
	fill(255, 0, 255);
	// text("true", 390, 386);
	// text("usic", 375, 151);
	fill(0, 0, 255);
	// text("hear", 422, 120);
	// text("blessed", 259, 151);
	// text("your", 19, 350);
	// text("harp.", 25, 181);
	// text("I", 385, 120);



}
