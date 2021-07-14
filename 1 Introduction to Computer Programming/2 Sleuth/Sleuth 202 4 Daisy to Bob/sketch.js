/*

Officer: 5706702
CaseNum: 202-3-61446823-5706702

Case 202 - The case of Bob and Daisy - stage 4

Here’s the final letter from Daisy (aka. Woz). Decode it to uncover the
final details about Woz and Job’s dastardly plan.

Discover the hidden code by commenting out all text commands except
those which produce yellow filled text with red outline in RonsFont font.
Only comment out text commands - leave fill & stroke, push and pop commands uncommented.

There are many possible ways of investigating this case, but you
should use ONLY the following commands:

	// comments are all that are needed for this case.
	Do NOT add any new lines of code.

*/

var letterFont;

function preload() {
	Ballpointprint = loadFont('Ballpointprint.ttf');
	Melissa = loadFont('Melissa.otf');
	Diggity = loadFont('Diggity.ttf');
	RonsFont = loadFont('RonsFont.ttf');
}

function setup() {
	createCanvas(663, 582);
	textSize(34);
}

function draw() {
	background(255);

	fill(255, 165, 0);
	stroke(0, 0, 0);
	textFont(Ballpointprint);
	// text("we", 122, 285);
	fill(0, 255, 255);
	// text("relation", 394, 248);
	stroke(255, 0, 0);
	// text("I", 27, 138);
	// text("The", 19, 248);
	push();
	textFont(Diggity);
	// text("yours,", 126, 393);
	pop();
	textFont(RonsFont);
	// text("ed", 210, 173);
	// text("Are", 397, 173);
	stroke(0, 255, 0);
	textFont(Diggity);
	// text("continual", 359, 138);
	fill(255, 165, 0);
	stroke(0, 0, 0);
	textFont(Melissa);
	// text("me", 12, 214);
	// text("send", 502, 102);
	push();
	textFont(RonsFont);
	// text("?", 608, 248);
	// text("should", 175, 285);
	pop();
	textFont(Diggity);
	// text("away", 305, 285);
	push();
	fill(255, 192, 203);
	textFont(Ballpointprint);
	// text("more", 358, 214);
	pop();
	stroke(0, 0, 255);
	// text("Is", 317, 248);
	textFont(RonsFont);
	// text("Perhaps", 14, 285);
	fill(0, 255, 255);
	stroke(0, 0, 0);
	// text("s", 524, 138);
	fill(255, 255, 0);
	stroke(0, 255, 0);
	textFont(Melissa);
	// text("go", 275, 285);
	fill(255, 165, 0);
	stroke(255, 0, 255);
	textFont(RonsFont);
	// text("much", 278, 214);
	stroke(0, 0, 255);
	textFont(Ballpointprint);
	// text("cash.", 553, 102);
	fill(0, 255, 255);
	stroke(255, 0, 255);
	// text("If", 310, 102);
	fill(255, 192, 203);
	textFont(RonsFont);
	// text("Bob,", 170, 34);
	fill(255, 165, 0);
	textFont(Melissa);
	// text("?", 575, 214);
	fill(0, 255, 255);
	stroke(0, 0, 0);
	// text("You", 550, 138);
	// text("ecrets,", 106, 248);
	stroke(255, 0, 0);
	textFont(RonsFont);
	// text("these", 281, 138);
	fill(255, 165, 0);
	// text("Daisy", 14, 461);
	push();
	stroke(255, 0, 255);
	textFont(Diggity);
	// text("our", 345, 248);
	// text("and", 526, 285);
	pop();
	textFont(Diggity);
	// text("so", 86, 173);
	fill(255, 255, 0);
	stroke(0, 255, 0);
	textFont(RonsFont);
	// text("this", 18, 325);
	push();
	stroke(0, 0, 255);
	// text("Forever", 12, 393);
	pop();
	stroke(255, 0, 255);
	textFont(Diggity);
	// text("reak", 462, 285);
	push();
	fill(255, 192, 203);
	textFont(Ballpointprint);
	// text("avoiding", 519, 173);
	// text("rt", 140, 102);
	pop();
	textFont(Melissa);
	// text("a", 431, 285);
	fill(0, 255, 255);
	stroke(0, 0, 255);
	textFont(Diggity);
	// text("can", 449, 214);
	push();
	fill(255, 255, 0);
	stroke(0, 0, 0);
	// text("Are", 12, 102);
	pop();
	textFont(Melissa);
	// text("I", 431, 214);
	stroke(255, 0, 255);
	// text("not", 133, 214);
	stroke(0, 255, 0);
	textFont(Ballpointprint);
	// text("sometimes.", 256, 173);
	fill(255, 255, 0);
	stroke(0, 0, 255);
	textFont(Melissa);
	// text("longer", 155, 138);
	stroke(0, 0, 0);
	textFont(Ballpointprint);
	// text("for", 376, 285);
	fill(255, 192, 203);
	// text("so,", 369, 102);
	textFont(RonsFont);
	// text("all", 78, 325);
	stroke(0, 0, 255);
	textFont(Diggity);
	// text("can", 69, 138);
	// text("silence.", 236, 248);
	fill(255, 255, 0);
	stroke(255, 0, 0);
	// text("of", 177, 102);
	// 开始
	textFont(RonsFont);
	text("the", 182, 248);
	// 结束
	fill(255, 192, 203);
	textFont(Melissa);
	// text("you", 67, 102);
	push();
	fill(0, 255, 255);
	stroke(0, 0, 255);
	textFont(Ballpointprint);
	// text("My", 19, 34);
	pop();
	// text("how", 233, 214);
	fill(255, 255, 0);
	// 开始
	textFont(RonsFont);
	text("can", 443, 102);
	text("you", 460, 173);
	text("safe", 540, 248);
	// 结束
	fill(0, 255, 255);
	stroke(0, 0, 255);
	textFont(Melissa);
	// text("?", 291, 102);
	// text("ignore", 218, 138);
	push();
	fill(255, 255, 0);
	stroke(255, 0, 0);
	// 开始
	textFont(RonsFont);
	text("delay", 460, 138);
	text("take", 499, 214);
	// 结束
	pop();
	fill(255, 192, 203);
	textFont(Ballpointprint);
	// text("sort", 578, 285);
	stroke(0, 255, 0);
	textFont(Diggity);
	// text("money", 214, 102);
	// text("sure", 172, 214);
	stroke(255, 0, 0);
	textFont(RonsFont);
	// text("?", 46, 214);
	// text("out.", 120, 325);
	fill(255, 255, 0);
	// 开始
	text("I", 413, 102);
	text("guard", 122, 173);
	// 结束
	stroke(0, 0, 255);
	textFont(Ballpointprint);
	// text("ship", 477, 248);
	// text("are", 28, 173);
	// text("x", 92, 461);
	fill(255, 192, 203);
	textFont(RonsFont);
	// text("I'm", 70, 214);
	textFont(Diggity);
	// text("b", 450, 285);
	// text("no", 119, 138);
	stroke(0, 255, 0);
	textFont(Melissa);
	// text("s", 94, 248);
	textFont(Ballpointprint);
	// text("sho", 105, 102);
	// text("darling", 73, 34);



}
