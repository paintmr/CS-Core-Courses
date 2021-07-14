/*
201 - The case of Judge Hopper
Stage 4 - The warehouse

Officer: 5706702
CaseNum: 201-3-21849790-5706702

As you enter the ALGOL warehouse you are struck by the most horrendous stench - it’s not the fish. Lying amongst piles of fish carcasses you find the body of Judge Hopper. Gathering yourself together, you tie a handkerchief around your nose and mouth and quickly set about recording the evidence.

Draw around the Judge’s body ...


*/

var img;

function preload() {
    img = loadImage('scene.png');
}

function setup() {
    createCanvas(img.width, img.height);
}

function draw() {

    image(img, 0, 0);
    stroke(255, 0, 0);
    strokeWeight(3);//原版
    // strokeWeight(1); //辅助
    noFill();

    // write the code to draw around the Judge's body below
    // 把鼠标的位置打印出来
    // text(mouseX, 500, 20)//辅助
    // text(mouseY, 500, 40)//辅助

    beginShape()
    vertex(647, 137)
    vertex(587, 174)
    vertex(574, 189)
    vertex(553, 180)
    vertex(512, 242)
    vertex(487, 276)
    vertex(443, 309)
    vertex(396, 280)
    vertex(326, 315)
    vertex(331, 332)
    vertex(350, 335)
    vertex(357, 320)
    vertex(391, 310)
    vertex(399, 344)
    vertex(397, 363)
    vertex(385, 372)
    vertex(392, 410)
    vertex(389, 428)
    vertex(396, 441)
    vertex(411, 461)
    vertex(432, 459)
    vertex(438, 480)
    vertex(458, 483)
    vertex(463, 475)
    vertex(502, 477)
    vertex(570, 517)
    vertex(581, 551)
    vertex(604, 548)
    vertex(598, 506)
    vertex(502, 414)
    vertex(697, 231)
    vertex(649, 223)
    vertex(662, 214)
    vertex(710, 210)
    vertex(702, 183)
    vertex(659, 175)
    vertex(647, 137)
    endShape()

    // 参考视频：making a boat using vertex() in p5.js
    // https://www.youtube.com/watch?v=bsHWzOpos1Q
}
